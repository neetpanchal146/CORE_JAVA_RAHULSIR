package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.StudentModel;
import com.util.DBUtil;

public class StudentDao 
{
	Connection con=null;
	public int registerStudent(StudentModel rmodel)
	{
		int x=0;
		con=new DBUtil().getConnectionData();
		String query="insert into student(firstname, lastname, email, mobile, gender, password) values(?,?,?,?,?,?)";
		try {
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, rmodel.getFirstname());
			st.setString(2, rmodel.getLastname());
			st.setString(3, rmodel.getEmail());
			st.setString(4, rmodel.getMobile());
			st.setString(5, rmodel.getGender());
			st.setString(6, rmodel.getPassword());
			
			x=st.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
	public StudentModel studentLogin(StudentModel lmodel)
	{
		StudentModel model=null;
		con=new DBUtil().getConnectionData();
		String qry="select * from student where email=? and password=?";
		try {
			PreparedStatement st=con.prepareStatement(qry);
			st.setString(1, lmodel.getEmail());
			st.setString(2, lmodel.getPassword());
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				model=new StudentModel();
				model.setStudentid(rs.getInt(1));
				model.setFirstname(rs.getString("firstname"));
				model.setLastname(rs.getString(3));
				model.setEmail(rs.getString(4));
				model.setMobile(rs.getString(5));
				model.setGender(rs.getString(6));
				model.setPassword(rs.getString("password"));
			}
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}

}
