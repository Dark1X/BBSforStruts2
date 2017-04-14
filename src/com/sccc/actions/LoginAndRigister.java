package com.sccc.actions;
import com.sccc.biz.IUserManeger;
import com.sccc.bizImpl.UserManeger;
import com.sccc.entity.Reg;
import com.sccc.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class LoginAndRigister extends ActionSupport{
	

	private String username;
	private String passwd;
	private String jieshao;
	private String zhuren;
	private String email;
	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getJieshao() {
		return jieshao;
	}

	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}

	public String getZhuren() {
		return zhuren;
	}

	public void setZhuren(String zhuren) {
		this.zhuren = zhuren;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String login()throws Exception{
		
		String user = getUsername();
		String pwd = getPasswd();
		User myuser = new User(user,pwd);
		UserManeger userinfo = new UserManeger();
		
		IUserManeger Umaeger = new UserManeger();
		
		if(Umaeger.Userlogin(myuser)){
			  //HttpServletRequest request = ServletActionContext.getRequest (); 
			  //获得值后，通过httprequest方法把用户名存起来
			  // request.setAttribute("username", myuser.getUsername()); 
			  // HttpSession session = request.getSession();//实例化一个session对象
			ActionContext ctx = ActionContext.getContext();
			 
       	     // session.setAttribute("username", myuser.getUsername());
       	     //  ctx.getApplication().put("username2", myuser.getUsername());
       	      ctx.getSession().put("username", myuser.getUsername());
       	    
     
		       return SUCCESS;
		}else{
			   return ERROR;
		}	
	}
	
	public String goRegist()throws Exception{
		return "goRegist";
	}
	
	public String regist()throws Exception{
		
		String user = getUsername();
		String pass = getPasswd();
		String jie = getJieshao();
		String zhu = getZhuren();
		String email = getEmail(); 
		Reg reginfo = new Reg(user,pass,jie,zhu,email);
		IUserManeger reg = new UserManeger();//接口new实现类
		if (reg.Userregister(reginfo)){
			
			return "regsuc";
		}else{
			return ERROR;
		}
	}	
	
	

}
