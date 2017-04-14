package com.sccc.bizImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sccc.Database.DatabaseCon;
import com.sccc.biz.IadminUser;
import com.sccc.entity.Admin;
import com.sccc.entity.User;

public class AdminUser implements IadminUser {
	private DatabaseCon conn;//数据库连接
	private PreparedStatement ps;//预处理
	private ResultSet rs;//结果集
	private Connection connection;
	
	public AdminUser(){
		this.conn = new DatabaseCon();
		this.connection = conn.getConnection();
		this.rs = null;
		this.ps = null;
	}

	@Override
	public boolean Userlogin(Admin user) {
		// 管理员登录方法
		String sql = "SELECT username,passwd FROM admin WHERE username=? and passwd=?";
		
		try {
			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPasswd());
			
			rs = ps.executeQuery(sql);
			while(rs.next()){
				
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

}
