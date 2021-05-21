package com.test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class Employee {
	private int emp_no;
	private String firstName;
	private String gender;
	Employee(int emp_no, String firstName, String gender) {
		this.emp_no = emp_no;
		this.firstName = firstName;
		this.gender = gender;
		}
	
	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}

public class Mysqlcon {
	public static void main(String args[]) {
		List<Employee> emps = new ArrayList<>(); 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "1234"); // 데이터베이스명,유저명,비밀번호순으로
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT emp_no,first_name,gender FROM employees.employees;");
			while (rs.next())
//				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
				emps.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3)));;
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(emps.size());
		for(Employee e : emps) {
			System.out.println(e.getEmp_no() + "," +e.getFirstName()+ "," + e.getGender());
		}
	}
}