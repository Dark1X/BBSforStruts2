package com.sccc.biz;

import com.sccc.entity.Reg;
import com.sccc.entity.User;

public interface IUserManeger {
	public boolean Userlogin(User user);//登录接口
	public boolean Userregister(Reg reginfo);//注册接口
	
	

}
