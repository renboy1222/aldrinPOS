/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.pos.data.dao.impl;

import com.aldrin.pos.model.UserAccount;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ALRIN B.C.
 */
@Setter
@Getter
@ToString
public class UserSales extends DBConnection {

    private UserAccount userAccount;
    private String currentDate;
    private Float sales;
    private Integer transaction;

    public ArrayList<UserSales> selectUserSales() {
        ArrayList<UserSales> list = new ArrayList<>();
        try {
            String query = "SELECT \n"
                    + "    ALDRIN.USER_ACCOUNT.FIRSTNAME, \n"
                    + "    ALDRIN.USER_ACCOUNT.SURNAME, \n"
                    + "    CURRENT_DATE , \n"
                    + "    SUM(ALDRIN.STOCK_IN_ENTRY.PRICE_SELLING) AS SALES,"
                    + "    USER_ACCOUNT.ID,\n"
                    + "    COUNT(DISTINCT INVOICE_ENTRY.INVOICE_ID) AS TRANSACTIONS \n"
                    + "\n"
                    + "FROM \n"
                    + "    ALDRIN.INVOICE \n"
                    + "INNER JOIN \n"
                    + "    ALDRIN.USER_ACCOUNT \n"
                    + "ON \n"
                    + "    ( ALDRIN.INVOICE.USER_ID = ALDRIN.USER_ACCOUNT.ID) \n"
                    + "INNER JOIN \n"
                    + "    ALDRIN.INVOICE_ENTRY \n"
                    + "ON \n"
                    + "    (ALDRIN.INVOICE.ID = ALDRIN.INVOICE_ENTRY.INVOICE_ID) \n"
                    + "INNER JOIN \n"
                    + "    ALDRIN.STOCK_IN_ENTRY \n"
                    + "ON \n"
                    + "    ( ALDRIN.INVOICE_ENTRY.STOCKIN_ENTRY_ID = ALDRIN.STOCK_IN_ENTRY.ID) \n"
                    + "INNER JOIN \n"
                    + "    ALDRIN.PRODUCT \n"
                    + "ON \n"
                    + "    (ALDRIN.STOCK_IN_ENTRY.PRODUCT_ID = ALDRIN.PRODUCT.ID) \n"
                    + "INNER JOIN \n"
                    + "    ALDRIN.UNIT \n"
                    + "ON \n"
                    + "    (ALDRIN.STOCK_IN_ENTRY.UNIT_ID = ALDRIN.UNIT.ID) GROUP BY ALDRIN.USER_ACCOUNT.FIRSTNAME,  ALDRIN.USER_ACCOUNT.SURNAME,USER_ACCOUNT.ID   ORDER BY   ALDRIN.USER_ACCOUNT.SURNAME ASC ";
            getDBConn();
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                UserSales us = new UserSales();
                UserAccount userAccount = new UserAccount();
                userAccount.setId(rs.getLong("ID"));
                userAccount.setFirstname(rs.getString("FIRSTNAME"));
                userAccount.setSurname(rs.getString("SURNAME"));
                Float sales = rs.getFloat("SALES");
                Integer trans = rs.getInt("TRANSACTIONS");

                us.setUserAccount(userAccount);
                us.setSales(sales);
                us.setTransaction(trans);
                list.add(us);
            }
            rs.close();
            st.close();
            closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public ArrayList<UserSales> selectUserSalesWithParam(Long start, Long end) {
        ArrayList<UserSales> list = new ArrayList<>();
        try {
            String query = "SELECT     ALDRIN.USER_ACCOUNT.FIRSTNAME, \n"
                    + "                        ALDRIN.USER_ACCOUNT.SURNAME, \n"
                    + "                        CURRENT_DATE , \n"
                    + "                        SUM(ALDRIN.STOCK_IN_ENTRY.PRICE_SELLING) AS SALES,\n"
                    + "                        USER_ACCOUNT.ID,\n"
                    + "                        COUNT(DISTINCT INVOICE_ENTRY.INVOICE_ID) AS TRANSACTIONS \n"
                    + "                    \n"
                    + "                    FROM \n"
                    + "                        ALDRIN.INVOICE \n"
                    + "                    INNER JOIN \n"
                    + "                        ALDRIN.USER_ACCOUNT \n"
                    + "                    ON \n"
                    + "                        ( ALDRIN.INVOICE.USER_ID = ALDRIN.USER_ACCOUNT.ID) \n"
                    + "                    INNER JOIN \n"
                    + "                        ALDRIN.INVOICE_ENTRY \n"
                    + "                    ON \n"
                    + "                        (ALDRIN.INVOICE.ID = ALDRIN.INVOICE_ENTRY.INVOICE_ID) \n"
                    + "                    INNER JOIN \n"
                    + "                        ALDRIN.STOCK_IN_ENTRY \n"
                    + "                    ON \n"
                    + "                        ( ALDRIN.INVOICE_ENTRY.STOCKIN_ENTRY_ID = ALDRIN.STOCK_IN_ENTRY.ID) \n"
                    + "                    INNER JOIN \n"
                    + "                        ALDRIN.PRODUCT \n"
                    + "                    ON \n"
                    + "                       (ALDRIN.STOCK_IN_ENTRY.PRODUCT_ID = ALDRIN.PRODUCT.ID) \n"
                    + "                    INNER JOIN \n"
                    + "                        ALDRIN.UNIT \n"
                    + "                    ON   (ALDRIN.STOCK_IN_ENTRY.UNIT_ID = ALDRIN.UNIT.ID) WHERE INVOICE.ID >=" + start + " AND INVOICE.ID <=" + end + " \n"
                    + "                    GROUP BY ALDRIN.USER_ACCOUNT.FIRSTNAME,  ALDRIN.USER_ACCOUNT.SURNAME,USER_ACCOUNT.ID   ORDER BY   ALDRIN.USER_ACCOUNT.SURNAME ASC";
            getDBConn();
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                UserSales us = new UserSales();
                UserAccount userAccount = new UserAccount();
                userAccount.setId(rs.getLong("ID"));
                userAccount.setFirstname(rs.getString("FIRSTNAME"));
                userAccount.setSurname(rs.getString("SURNAME"));
                Float sales = rs.getFloat("SALES");
                Integer trans = rs.getInt("TRANSACTIONS");

                us.setUserAccount(userAccount);
                us.setSales(sales);
                us.setTransaction(trans);
                list.add(us);
            }
            rs.close();
            st.close();
            closeConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
