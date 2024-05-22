package com.question;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ExistingDButil {
	
	public static List<question> validate(String scode,String paperID){
		
		ArrayList<question> qt = new ArrayList<>();
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/exam";
		String user = "root";
		String password = "PASSWORD";
		
		//validate
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql = "select * from questions where PaperID='"+paperID+"'and SubjectCode='"+scode+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				int QID = rs.getInt("QID");
				String PaperID = rs.getString("PaperID");
				String SubjectCode = rs.getString("SubjectCode");
				String Question = rs.getString("Question");
				String Option1 = rs.getString("Option1");
				String Option2 = rs.getString("Option2");
				String Option3 = rs.getString("Option3");
				String Option4 = rs.getString("Option4");
				String Answer = rs.getString("Answer");
				
				question q = new question(QID,PaperID,SubjectCode,Question,Option1,Option2,Option3,Option4,Answer);
				qt.add(q);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		  
		return qt;
	}
	
	

	public static boolean insert(String paperid,String scd, String question, String option1, String option2, String option3,
			String option4, String answer) {

		boolean isSuccess = false;
		
		//create database connection

		String url = "jdbc:mysql://localhost:3306/exam?useSSL=false";
		String user = "root";
		String password = "PASSWORD";
		
		try {
           Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql="insert into questions values(0,'"+paperid+"','"+scd+"','"+question+"','"+option1+"','"+option2+"', '"+option3+"','"+option4+"','"+answer+"')";
			int rs=stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
	public static boolean updateQuestion(String qid,String pid,String sid,String question,String option1,String option2,String option3,String option4,String answer) {
		boolean isSuccess = false;
		int convertedID = Integer.parseInt(qid);
		//create database connection

		String url = "jdbc:mysql://localhost:3306/exam?useSSL=false";
		String user = "root";
		String password = "PASSWORD";
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement();
				String sql="update questions set PaperID='"+pid+"',SubjectCode='"+sid+"',Question='"+question+"',Option1='"+option1+"', Option2='"+option2+"',Option3='"+option3+"',Option4='"+option4+"',Answer='"+answer+"'"+"where QID='"+convertedID+"'";
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSuccess = true;
				}else {
					isSuccess = false;
				}
				
				
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
	public static List<question> getUpdate(String qId){
		
		int convertedID = Integer.parseInt(qId);
		
		ArrayList<question> qt = new ArrayList<>();
		
		//create database connection

		String url = "jdbc:mysql://localhost:3306/exam?useSSL=false";
		String user = "root";
		String password = "PASSWORD";
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
						
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql="select * from questions where QID= '"+convertedID+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int qid = rs.getInt(1);
				String pid = rs.getString(2);
				String sid = rs.getString(3);
				String question = rs.getString(4);
				String option1 = rs.getString(5);
				String option2 = rs.getString(6);
				String option3 = rs.getString(7);
				String option4 = rs.getString(8);
				String answer = rs.getString(9);
				
				question q = new question(qid,pid,sid,question,option1,option2,option3,option4,answer);
				qt.add(q); 
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return qt;
	}
	
	public static boolean deleteQuestion(String qid) {
		boolean isSuccess = false;
		int convId = Integer.parseInt(qid);
		
		//create database connection

				String url = "jdbc:mysql://localhost:3306/exam?useSSL=false";
				String user = "root";
				String password = "PASSWORD";
						
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
								
					Connection con = DriverManager.getConnection(url, user, password);
					Statement stmt = con.createStatement();
					String sql = "delete from questions where QID='"+convId+"' ";
					int rs = stmt.executeUpdate(sql);
					
					if(rs > 0) {
						isSuccess = true;
					}else {
						isSuccess = false;
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
		
		return isSuccess;
		
	}

}
