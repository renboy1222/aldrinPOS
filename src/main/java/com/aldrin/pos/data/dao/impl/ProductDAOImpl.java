/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.pos.data.dao.impl;

import com.aldrin.pos.data.dao.ProductDAO;
import static com.aldrin.pos.data.dao.impl.DBConnection.closeConnection;
import static com.aldrin.pos.data.dao.impl.DBConnection.getCon;
import com.aldrin.pos.model.Category;
import com.aldrin.pos.model.Product;
import com.aldrin.pos.util.ComboBoxList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ALDRIN B. C.
 */
@Setter
@Getter
public class ProductDAOImpl extends DBConnection implements ProductDAO {

    @Override
    public void addProduct(Product product) {
        try {
            getDBConn();
            java.sql.PreparedStatement ps = getCon().prepareStatement("INSERT INTO ALDRIN.PRODUCT (ID,BARCODE,PRODUCT,CATEGORY_ID) VALUES  (?,?,?,?) ");
            ps.setLong(1, getMaxId());
            ps.setString(2, product.getBarcode());
            ps.setString(3, product.getProduct());
            ps.setLong(4, product.getCategory().getId());
            ps.execute();
            ps.close();
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateProduct(Product product) {
        try {
            getDBConn();
            java.sql.PreparedStatement ps = getCon().prepareStatement("UPDATE ALDRIN.PRODUCT SET BARCODE =?, PRODUCT =?, CATEGORY_ID =? WHERE PRODUCT.ID = ? ");
            ps.setString(1, product.getBarcode());
            ps.setString(2, product.getProduct());
            ps.setLong(3, product.getCategory().getId());
            ps.setLong(4, product.getId());
            ps.execute();
            ps.close();
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteProduct(Product product) {
        try {
            getDBConn();
            java.sql.PreparedStatement ps = getCon().prepareStatement("UPDATE ALDRIN.PRODUCT SET DELETED =? WHERE PRODUCT.ID = ? ");
            ps.setBoolean(1, true);
            ps.setLong(2, product.getId());
            ps.execute();
            ps.close();
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<ComboBoxList> list;

    @Override
    public ArrayList<Product> selectProduct() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            String query = "SELECT \n"
                    + "    ALDRIN.PRODUCT.ID, \n"
                    + "    ALDRIN.PRODUCT.CATEGORY_ID, \n"
                    + "    ALDRIN.CATEGORY.CATEGORY, \n"
                    + "    ALDRIN.PRODUCT.PRODUCT, \n"
                    + "    ALDRIN.PRODUCT.BARCODE \n"
                    + "FROM \n"
                    + "    ALDRIN.PRODUCT \n"
                    + "INNER JOIN \n"
                    + "    ALDRIN.CATEGORY \n"
                    + "ON \n"
                    + "    ( \n"
                    + "        ALDRIN.PRODUCT.CATEGORY_ID = ALDRIN.CATEGORY.ID) ORDER BY PRODUCT.PRODUCT ASC ";
            getDBConn();
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Product p = new Product();
                Category c = new Category();
                c.setId(rs.getLong("CATEGORY_ID"));
                c.setCategory(rs.getString("CATEGORY"));
                p.setCategory(c);
                p.setId(rs.getLong("ID"));
                p.setProduct(rs.getString("PRODUCT"));
                p.setBarcode(rs.getString("BARCODE"));
                list.add(p);
            }
            rs.close();
            st.close();
            closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public void comboBoxProduct() {
        this.setList(new ArrayList<ComboBoxList>());
        try {
            getDBConn();
            PreparedStatement statement;
            ResultSet rs;
            statement = getCon().prepareStatement("SELECT * FROM ALDRIN.PRODUCT WHERE PRODUCT.DELETED =FALSE  ORDER BY PRODUCT ASC ");
            rs = statement.executeQuery();
            while (rs.next()) {
                Long idl = rs.getLong("ID");
                String namel = rs.getString("PRODUCT");
                this.getList().add(new ComboBoxList(idl, namel));
            }
            rs.close();
            statement.close();
            closeConnection();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

       @Override
    public Long getMaxId() {
        Long maxId = null;
        try {
            getDBConn();
            PreparedStatement statement = getCon().prepareStatement("SELECT \n"
                    + "    MAX(PRODUCT.ID) AS ID  \n"
                    + "FROM \n"
                    + "    PRODUCT ");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Long idl = rs.getLong("ID");
                if (idl == 0) {
                    maxId = 1L;
                } else {
                    maxId = idl+1;
                }
            }
            rs.close();
            statement.close();
//            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Opss...", JOptionPane.ERROR_MESSAGE);
        }
        return maxId;
    }

}
