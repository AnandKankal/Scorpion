package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class JdbcDemo {
	Connection con;
	@Value("${JdbcDemo.url}")
	private String url;
	@Value("${JdbcDemo.username}")
	private String username;
	@Value("${JdbcDemo.password}")
	private String password;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	void displayInfo()
	{
		System.out.println("Url:"+url+" username:"+username+" Password:"+password);
	}
	
	@PostConstruct
	public void getDBConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Get DB Connection called");
	}
	@PreDestroy
	public void destroy() throws Exception
	{
		System.out.println("Destroy called");
		con.close();
	}
	public void getJdbcConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Successfull.."+con);
		Statement st = con.createStatement();
		String query = "SELECT * FROM student_tbl";
		boolean rs2 = st.execute(query);//RT-boolean
		ResultSet rset = st.getResultSet();
		
		while (rset.next()) 
		{
			System.out.println("Name:"+rset.getString("sname")+" Age:"+rset.getString("sage"));
		}
		con.close();
	}
}
