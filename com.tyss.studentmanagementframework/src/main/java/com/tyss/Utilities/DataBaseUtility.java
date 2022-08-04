package com.tyss.Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class DataBaseUtility {
	static Driver driverRef;
	static Connection connection;
	static ResultSet result;
	/**
	 * this method is used to connect to DB
	 * @throws SQLException
	 */
	public void connectToDB(String DBname) throws SQLException
	{
		try 
		{
		driverRef=new Driver();	
		DriverManager.registerDriver(driverRef);
		connection=DriverManager.getConnection(IConstants.DBUrl+DBname,IConstants.DBUsername,IConstants.DBPassword);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	
/**
 * this method is used to close DB connection
 */
public void closeDB()
{
	try
	{
		connection.close();
	}
	catch(Exception e)
	{
	//TODO:handle exception	
	}
}
/**
 * this method is used to execute query
 * @param query
 * @param columnNum
 * @param expectedData
 * @throws SQLException
 */
public void executeQuery(String query,int columnNum,String expectedData) throws SQLException
{
	result=connection.createStatement().executeQuery(query);
	boolean flag=false;
	while(result.next())
	{
		if(result.getString(columnNum).equals(expectedData))
		{
			flag=true;
			break;
		}
	}
}

	public void exicuteUpdate(String query) throws SQLException
	{
		int res=connection.createStatement().executeUpdate(query);
		if(res==1)
		{
			System.out.println("data is updated");
		}
		else
		{
			System.out.println("data is not uated");
		}
	}
	
	
}

