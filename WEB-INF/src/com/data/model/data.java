package com.data.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class data {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet st=null;
	public void facalty(String name, String email, String add, String branch,
			String sslc, String puc, String ug, String pg,String sem) {
		try{
			con=dbc.connect();
			String sql="insert into register values(?,?,?,?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2, email);
			ps.setString(3, add);
			ps.setString(4,branch);
			ps.setString(5, sslc);
			ps.setString(6, puc);
			ps.setString(7, ug);
			ps.setString(8, pg);
			ps.setString(9, sem);
			ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	public void subject(String branch, String sem, String sub) {
		
		try{
			con=dbc.connect();
			String sql="insert into sub values(?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1,branch);
			ps.setString(2, sem);
			ps.setString(3, sub);
			ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void assign(String name, String branch, String sem, String sub) {

		try{
			con=dbc.connect();
			String sql="insert into assign values(?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2,branch);
			ps.setString(3, sem);
			ps.setString(4, sub);
			ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	public void editreg(String name, String branch, String sem) {
		try{
			con=dbc.connect();
			String sql="update register set branch=?,sem=? where name=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, branch);
			ps.setString(2, sem);
			ps.setString(3, name);
			ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	

}
