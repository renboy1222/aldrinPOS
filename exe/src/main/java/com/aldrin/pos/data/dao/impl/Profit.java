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
public class Profit extends DBConnection {

    private UserAccount userAccount;
    private String currentDate;
    private Float profit;
    private Integer transaction;

    public ArrayList<Profit> selectProfit() {
        ArrayList<Profit> list = new ArrayList<>();
        try {
            String query = " SELECT \n"
                    + "    ALDRIN.USER_ACCOUNT.FIRSTNAME, \n"
                    + "    ALDRIN.USER_ACCOUNT.SURNAME, \n"
                    + "    SUM(ALDRIN.STOCK_IN_ENTRY.PRICE_SELLING-ALDRIN.STOCK_IN_ENTRY.PRICE_BUYING) AS PROFIT,\n"
                    + "    USER_ACCOUNT.ID,\n"
                    + "    COUNT(DISTINCT INVOICE_ENTRY.INVOICE_ID) AS TRANSACTIONS\n"
                    + "    \n"
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
                    + "    (ALDRIN.STOCK_IN_ENTRY.UNIT_ID = ALDRIN.UNIT.ID)   GROUP BY ALDRIN.USER_ACCOUNT.FIRSTNAME,  ALDRIN.USER_ACCOUNT.SURNAME,USER_ACCOUNT.ID  ORDER BY   ALDRIN.USER_ACCOUNT.SURNAME ASC ";
            getDBConn();
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Profit us = new Profit();
                UserAccount userAccount = new UserAccount();
                userAccount.setId(rs.getLong("ID"));
                userAccount.setFirstname(rs.getString("FIRSTNAME"));
                userAccount.setSurname(rs.getString("SURNAME"));
                Float profit = rs.getFloat("PROFIT");
                Integer trans = rs.getInt("TRANSACTIONS");

                us.setUserAccount(userAccount);
                us.setProfit(profit);
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

    public ArrayList<Profit> selectProfitWithParam(Long start,Long end) {
        ArrayList<Profit> list = new ArrayList<>();
        try {
            String query = " SELECT \n"
                    + "    ALDRIN.USER_ACCOUNT.FIRSTNAME, \n"
                    + "    ALDRIN.USER_ACCOUNT.SURNAME, \n"
                    + "    SUM(ALDRIN.STOCK_IN_ENTRY.PRICE_SELLING-ALDRIN.STOCK_IN_ENTRY.PRICE_BUYING) AS PROFIT,\n"
                    + "    USER_ACCOUNT.ID,\n"
                    + "    COUNT(DISTINCT INVOICE_ENTRY.INVOICE_ID)  AS TRANSACTIONS\n"
                    + "    \n"
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
                    + "    (ALDRIN.STOCK_IN_ENTRY.UNIT_ID = ALDRIN.UNIT.ID) WHERE INVOICE_ENTRY.INVOICE_ID >=" + start + " AND INVOICE_ENTRY.INVOICE_ID <=" + end + "  GROUP BY ALDRIN.USER_ACCOUNT.FIRSTNAME,  ALDRIN.USER_ACCOUNT.SURNAME,USER_ACCOUNT.ID  ORDER BY   ALDRIN.USER_ACCOUNT.SURNAME ASC ";
            getDBConn();
            Statement st = getCon().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Profit us = new Profit();
                UserAccount userAccount = new UserAccount();
                userAccount.setId(rs.getLong("ID"));
                userAccount.setFirstname(rs.getString("FIRSTNAME"));
                userAccount.setSurname(rs.getString("SURNAME"));
                Float profit = rs.getFloat("PROFIT");
                Integer trans = rs.getInt("TRANSACTIONS");

                us.setUserAccount(userAccount);
                us.setProfit(profit);
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
