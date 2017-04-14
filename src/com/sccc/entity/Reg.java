package com.sccc.entity;

public class Reg {
	

	    private int id;
		private String username;
		private String passwd;
		private String jieshao;
		private String zhuren;
		private String email;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
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
		public Reg(String username,String passwd,String jieshao,String zhuren,String email){
			this.username = username;
			this.passwd = passwd;
			this.jieshao = jieshao;
			this.zhuren = zhuren;
			this.email = email;
		}
		public Reg(){
 
		}



}
