package com.spe.breadcrumbs.web;

/* Copyright © 2017 Oracle and/or its affiliates. All rights reserved. */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import oracle.jdbc.pool.OracleDataSource;

public class DBConnection {

    public Connection connection;

    public Connection getConnection() {
        String dbName = "breadcrumbsData";
        String username = "root";
        String password = "Breadcrumbs1!";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://129.213.29.31:3306/breadcrumbsData",username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


//    private static final String URL = "jdbc:oracle:thin:@";
//    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
//    //Environment Variable Cloud
//    public static final Optional<String> DBAAS_USERNAME = Optional.ofNullable(System.getenv("DBAAS_USER_NAME"));
//    public static final Optional<String> DBAAS_PASSWORD = Optional.ofNullable(System.getenv("DBAAS_USER_PASSWORD"));
//    public static final Optional<String> DBAAS_DEFAULT_CONNECT_DESCRIPTOR = Optional.ofNullable(System.getenv("DBAAS_DEFAULT_CONNECT_DESCRIPTOR"));
//
//    //Local settings
//    public static final String LOCAL_USERNAME = "oracleusr";
//    public static final String LOCAL_PASSWORD = "oracle";
//    public static final String LOCAL_DEFAULT_CONNECT_DESCRIPTOR = "localhost:129.213.29.31:3306/breadcrumbsData";
//
//    private static Connection connection = null;
//    private static DBConnection instance = null;
//
//    private DBConnection() {
//        try {
//            Class.forName(DRIVER).newInstance();
//        } catch (Exception sqle) {
//            sqle.getMessage();
//        }
//    }
//
//    public static DBConnection getInstance() {
//        if (connection == null) {
//            instance = new DBConnection();
//        }
//        return instance;
//    }
//
//    public Connection getConnection() {
//        if (connection == null) {
//            try {
//                OracleDataSource ods = new OracleDataSource();
//                ods.setURL(URL + DBAAS_DEFAULT_CONNECT_DESCRIPTOR.orElse(LOCAL_DEFAULT_CONNECT_DESCRIPTOR));
//                ods.setUser(DBAAS_USERNAME.orElse(LOCAL_USERNAME));
//                ods.setPassword(DBAAS_PASSWORD.orElse(LOCAL_PASSWORD));
//                connection = ods.getConnection();
//            } catch (SQLException e) {
//                e.getMessage();
//            }
//        }
//        return connection;
//    }
}
