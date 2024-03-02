package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.StudentModel;
import com.util.DBUtil;

public class HomeDao 
{
	Connection con=null;
	public StudentModel verifyLogin(int studentid)
	{
		StudentModel model=null;
		con=new DBUtil().getConnectionData();
		String qry="select * from student where studentid=?";
		try {
			PreparedStatement st=con.prepareStatement(qry);
			st.setInt(1, studentid);
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
	
	public int updateUser(StudentModel hmodel)
	{
		int x=0;
		con=new DBUtil().getConnectionData();
		String qry="update student set firstname=?, lastname=?, email=?, mobile=?, gender=?, password=? where studentid=?";
		try {
			PreparedStatement st=con.prepareStatement(qry);
			st.setString(1, hmodel.getFirstname());
			st.setString(2, hmodel.getLastname());
			st.setString(3, hmodel.getEmail());
			st.setString(4, hmodel.getMobile());
			st.setString(5, hmodel.getGender());
			st.setString(6, hmodel.getPassword());
			st.setInt(7, hmodel.getStudentid());
			
			x=st.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
	public int deleteUser(int studentid)
	{
		int x=0;
		con=new DBUtil().getConnectionData();
		String qry="delete from student where studentid=?";
		try {
			PreparedStatement st=con.prepareStatement(qry);
			st.setInt(1,studentid);
			
			x=st.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
}
