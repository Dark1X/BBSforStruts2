package com.sccc.bizImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sccc.Database.DatabaseCon;
import com.sccc.biz.IUserManeger;
import com.sccc.entity.Reg;
import com.sccc.entity.User;

public class UserManeger implements IUserManeger {

	private DatabaseCon conn;//数据库连接
	private PreparedStatement ps; //预处理
	private ResultSet rs;//结果集
	private Connection connection;
	
	public static Reg userinfo=null;

	public UserManeger(){
		
		this.conn = new DatabaseCon();
		this.connection = (Connection) conn.getConnection();
		this.rs = null;
		this.ps = null;
	                     }    
	@Override
	public boolean Userlogin(User user) {
		//实现宠物登录接口
	        userinfo = new Reg();
				String sql="SELECT username,passwd,jieshao,zhuren FROM pet WHERE username=? and passwd=?";
				
				try {
					ps = (PreparedStatement) connection.prepareStatement(sql);
		            ps.setString(1, user.getUsername());
		            ps.setString(2, user.getPasswd());
		           
		            rs = ps.executeQuery();
		               
		            while (rs.next()) { 
		            	userinfo.setJieshao(rs.getString("jieshao"));
		            	userinfo.setZhuren(rs.getString("zhuren"));
		            	return true;
		            	
					}
					
		            //关闭连接
					conn.closeResultSet(rs);
					conn.closeStatement(ps);
		            conn.closeConnection(connection);
		            
					
				  } catch (SQLException e) {
					
					e.printStackTrace();
				}
		 
				       return false;
	}

	@Override
	public boolean Userregister(Reg reginfo) {

		//添加用户方法
		boolean check = false;
		
		String sql = "INSERT INTO pet (username, passwd, jieshao,zhuren,email) values(?,?,?,?,?)";
		try {
			//预处理，准备向数据库插入新的用户
			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, reginfo.getUsername());
			ps.setString(2, reginfo.getPasswd());
			ps.setString(3, reginfo.getJieshao());
			ps.setString(4, reginfo.getZhuren());
			ps.setString(5, reginfo.getEmail());
			//执行查询。
			ps.executeUpdate();
			//关闭查询

			conn.closeStatement(ps);
			conn.closeConnection(connection);
			check = true;
				
		   } catch (SQLException e) {
			   
			e.printStackTrace();
			
		}
		return check;
		
	}

}
