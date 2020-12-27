package com.app.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresSqlConnection {

	private static Connection connection;

	private PostgresSqlConnection() {

	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5433/postgres?currentSchema=\"Test\"";
		String username = "postgres";
		String password = "postgres";
		connection = DriverManager.getConnection(url, username, password);
		return connection;

	}

}