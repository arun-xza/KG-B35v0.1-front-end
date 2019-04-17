package com.data.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbc {
	static Connection con=null;
	public static Connection connect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/knowledgegraph","root","root");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}

}
