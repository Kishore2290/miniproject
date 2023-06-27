package com.kce.service;
import java.util.*;

import com.kce.dao.Welcome;
import com.kce.util.UserException;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our Institutions!!!");
		System.out.println("Enter your choice: ");
		int choice=sc.nextInt();
		Welcome w=new Welcome();
		if(choice==1)
			w.Signup();
		if(choice==2)
		{
			System.out.println("Enter your Name: ");
			sc.nextLine();
      	  	String name=sc.nextLine();
      	  	System.out.println("Enter the password:");
      	  	String password=sc.nextLine();
			if(w.login(name, password))
			{
				System.out.println("Welcome!!!");
				System.out.println("Enter cutoff:");
				int cutoff=sc.nextInt();
				sc.nextLine();
				if(cutoff>=180)
				{
					System.out.println("As per your cutoff your Departments are: ");
					System.out.println("CSE");
					System.out.println("IT");
					System.out.println("ECE");
					System.out.println("MECH");
					System.out.println("CIVIL");
					System.out.println("Enter the Department: ");
					String dept=sc.nextLine();
					if(dept.equals("CSE"))
					{
						System.out.println("You have choosen CSE department");
						System.out.println("Your tuition fee for CSE department-->95000");
						System.out.println("Are you first graduate?");
						String graduate=sc.nextLine();
						if(graduate.equals("yes"))
						{
							System.out.println("Your tuition fee after removal of first graduate-->70000");
							w.Add(name, dept, 70000);
						}
						else
						{
							System.out.println("Then your fees structure remains same ");
							w.Add(name, dept, 95000);
						}
					}
					else if(dept.equals("IT"))
					{
						System.out.println("You have choosen IT department");
						System.out.println("Your tuition fee for IT department-->90000");
						System.out.println("Are you first graduate?");
						String graduate=sc.nextLine();
						
						if(graduate.equals("yes"))
						{
							System.out.println("Your tuition fee after removal of first graduate-->65000");
							w.Add(name, dept, 65000);
						}
						else
						{
							System.out.println("Then your fees structure remains same ");
							w.Add(name, dept, 90000);
						}
					}
					else if(dept.equals("ECE"))
					{
						System.out.println("You have choosen ECE department");
						System.out.println("Your tuition fee for ECE department-->85000");
						System.out.println("Are you first graduate?");
						String graduate=sc.nextLine();
						if(graduate.equals("yes"))
						{
							System.out.println("Your tuition fee after removal of first graduate-->60000");
							w.Add(name, dept, 60000);
						}
						else
						{
							System.out.println("Then your fees structure remains same ");
							w.Add(name, dept, 85000);
						}
					}
					else if(dept.equals("MECH"))
					{
						System.out.println("You have choosen MECH department");
						System.out.println("Your tuition fee for MECH department-->80000");
						System.out.println("Are you first graduate?");
						String graduate=sc.nextLine();
						if(graduate.equals("yes"))
						{
							System.out.println("Your tuition fee after removal of first graduate-->55000");
							w.Add(name, dept, 55000);
						}
						else
						{
							System.out.println("Then your fees structure remains same ");
							w.Add(name, dept, 80000);
						}
						
					}
					else if(dept.equals("CIVIL"))
					{
						System.out.println("You have choosen CIVIL department");
						System.out.println("Your tuition fee for CIVIL department-->75000");
						System.out.println("Are you first graduate?");
						
						String graduate=sc.nextLine();
						if(graduate.equals("yes"))
						{
							System.out.println("Your tuition fee after removal of first graduate-->50000");
							w.Add(name, dept, 50000);
						}
						else
						{
							System.out.println("Then your fees structure remains same ");
							w.Add(name, dept, 75000);
						}
					}
				}
				else if(cutoff>=160 && cutoff <180) 
				{
					System.out.println("As per your cutoff your Departments are: ");
					System.out.println("ECE");
					System.out.println("MECH");
					System.out.println("CIVIL");
				System.out.println("Enter the Department: ");
				String dept=sc.nextLine();
				if(dept.equals("ECE"))
				{
					System.out.println("You have choosen ECE department");
					System.out.println("Your tuition fee for ECE department-->85000");
					System.out.println("Are you first graduate?");
					
					String graduate=sc.nextLine();
					if(graduate.equals("yes"))
					{
						System.out.println("Your tuition fee after removal of first graduate-->60000");
						w.Add(name, dept, 60000);
					}
					else
					{
						System.out.println("Then your fees structure remains same ");
						w.Add(name, dept, 85000);
					}
				}
				else if(dept.equals("MECH"))
				{
					System.out.println("You have choosen MECH department");
					System.out.println("Your tuition fee for MECH department-->80000");
					System.out.println("Are you first graduate?");
					String graduate=sc.nextLine();
					if(graduate.equals("yes"))
					{
						System.out.println("Your tuition fee after removal of first graduate-->55000");
						w.Add(name, dept, 55000);
					}
					else
					{
						System.out.println("Then your fees structure remains same ");
						w.Add(name, dept, 80000);
					}
				}
				else if(dept.equals("CIVIL"))
				{
					System.out.println("You have choosen CIVIL department");
					System.out.println("Your tuition fee for CIVIL department-->75000");
					System.out.println("Are you first graduate?");
					String graduate=sc.nextLine();
					if(graduate.equals("yes"))
					{
						System.out.println("Your tuition fee after removal of first graduate-->50000");
						w.Add(name, dept, 50000);
					}
					else
					{
						System.out.println("Then your fees structure remains same ");
						w.Add(name, dept, 75000);
					}
				}
				
				}
				else if(cutoff>=140 && cutoff < 160)
				{
					System.out.println("As per your cutoff your Departments are: ");
					System.out.println("MECH");
					System.out.println("CIVIL");	
					System.out.println("Enter the Department: ");
					String dept=sc.nextLine();
					
					 if(dept.equals("MECH"))
					{
						System.out.println("You have choosen MECH department");
						System.out.println("Your tuition fee for MECH department-->80000");
						System.out.println("Are you first graduate?");
						String graduate=sc.nextLine();
						if(graduate.equals("yes"))
						{
							System.out.println("Your tuition fee after removal of first graduate-->55000");
							w.Add(name, dept, 55000);
						}
						else
						{
							System.out.println("Then your fees structure remains same ");
							w.Add(name, dept, 80000);
						}
					}
					else if(dept.equals("CIVIL"))
					{
						System.out.println("You have choosen CIVIL department");
						System.out.println("Your tuition fee for CIVIL department-->75000");
						System.out.println("Are you first graduate?");
						String graduate=sc.nextLine();
						if(graduate.equals("yes"))
						{
							System.out.println("Your tuition fee after removal of first graduate-->50000");
							w.Add(name, dept, 50000);
						}
						else
						{
							System.out.println("Then your fees structure remains same ");
							w.Add(name, dept, 75000);
						}
					}
					
				}
				else if(cutoff>=120 &&  cutoff <140)
				{
					System.out.println("As per your cutoff your Departments are: ");
					System.out.println("CIVIL");
					System.out.println("Enter the Department: ");
					String dept=sc.nextLine();
					if(dept.equals("CIVIL"))
					{
						System.out.println("You have choosen CIVIL department");
						System.out.println("Your tuition fee for CIVIL department-->75000");
						System.out.println("Are you first graduate?");
						String graduate=sc.nextLine();
						if(graduate.equals("yes"))
						{
							System.out.println("Your tuition fee after removal of first graduate-->50000");
							w.Add(name, dept, 50000);
							
						}
						else
						{
							System.out.println("Then your fees structure remains same ");
							w.Add(name, dept, 75000);
						}
					
					}
					
				}
				else if(cutoff<120)
				{
					System.out.println("You are not Eligible for this Institution!!!");
				}
				
			}
			else
			{
				throw new UserException("Password Wrong");
			}
			
			
		}
		
	
	}

}
