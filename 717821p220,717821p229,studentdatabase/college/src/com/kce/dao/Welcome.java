package com.kce.dao;
import java.sql.*;
import java.util.*;

import com.kce.service.Main;
import com.kce.util.UserException;
public class Welcome {
	 String url="jdbc:mysql://localhost:3306/welcome";
	  String user="root";
	  String password="root";
	  Scanner sc=new Scanner(System.in);
          public void Signup() throws Exception
          {
        	 
        	  Connection con=DriverManager.getConnection(url,user,password);
        	  PreparedStatement ps=con.prepareStatement("insert into login values(?,?,?,?,?,?)");
               System.out.println("Enter your name: ");
               String name=sc.nextLine();
               System.out.println("Enter your age: ");
               int age=sc.nextInt();
               if(age<15 || age >30)
               {
            	   throw new UserException("Age Not Eligible");
               }
               System.out.println("Enter your qualification: ");
               sc.nextLine();
              String qualification=sc.nextLine();
              if(!qualification.equals("12"))
              {
            	  throw new UserException("Qualication Not Eligible");
              }
              System.out.println("Enter your cutoff: ");
              int cutoff=sc.nextInt();
              if(cutoff >= 200)
              {
            	  throw new UserException("Cut off Invalid");
              }
              System.out.println("Enter your email: ");
              sc.nextLine();
              String email=sc.nextLine();
              System.out.println("Enter your password: ");
              String password=sc.nextLine();
              ps.setString(1,name);
              ps.setInt(2, age);;
              ps.setString(3, qualification);
              ps.setInt(4, cutoff);
              ps.setString(5,email);
              ps.setString(6, password);
              ps.execute();
              System.out.println("Login created Successfully!!!");
              Main.main(null);
              

               
        	  
          }
          public boolean login(String name, String pass) throws SQLException
          {
        	  Connection con=DriverManager.getConnection(url,user,password);
        	  PreparedStatement ps=con.prepareStatement("select name,password from login where name=? ");
        	  ps.setString(1,name);
        	  ResultSet rs=ps.executeQuery();
        	  while(rs.next())
        	  {
        		if(rs.getString(1).equals(name)&&rs.getString(2).equals(pass))
        		{
        			return true;
        		}
        	  }
        	  return false;
          }
          public void Add(String name, String dept, int fee) throws SQLException
          {
        	  try
        	  {
        	  Connection con=DriverManager.getConnection(url,user,password);
        	  PreparedStatement ps=con.prepareStatement("update login set dept=?, fee=? where name=?");
        	  ps.setString(1,dept);
        	  ps.setInt(2, fee);
        	  ps.setString(3,name);
        	  ps.executeUpdate();
        	  }
        	  catch(Exception e)
        	  {
        		  System.out.println(e);
        	  }
          }

}
