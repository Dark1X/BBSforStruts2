<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
<title>Struts2论坛登录-注册</title> 
<meta name="keywords" content="struts2论坛" />
<meta name="description" content="struts2论坛" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="./View/js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="./View/js/login.js"></script>
<link href="./View/css/login2.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1><s:text name="loginPage"/><sup>soft1532</sup></h1>

<div class="login" style="margin-top:50px;">
    
    <div class="header">
        <div class="switch" id="switch">
            <a class="switch_btn_focus" id="switch_qlogin" href="javascript:void(0);" tabindex="7"><s:text name="login"/></a>
			<a class="switch_btn" id="switch_login" href="javascript:void(0);" tabindex="8"><s:text name="reg"/></a>
			<div class="switch_bottom" id="switch_bottom" style="position: absolute; width: 64px; left: 0px;">
			</div>
        </div>
    </div>    
  
    
    <div class="web_qr_login" id="web_qr_login" style="display: block; height: 235px;">    

            <!--登录-->
            <div class="web_login" id="web_login">
               
               
               <div class="login-box">
    
            
			<div class="login_form">
				<form action="<%= request.getContextPath()%>/loginAction" name="loginform" accept-charset="utf-8" id="login_form" class="loginForm" method="post"><input type="hidden" name="did" value="0"/>
               <input type="hidden" name="to" value="log"/>
                <div class="uinArea" id="uinArea">
                <label class="input-tips" for="u" key="user"><s:text name="user"/>：</label>
                <div class="inputOuter" id="uArea">
                    
                    <input type="text" id="u" name="username" class="inputstyle"/>
                </div>
                </div>
                <div class="pwdArea" id="pwdArea">
               <label class="input-tips" for="p"><s:text name="pass"/>：</label> 
               <div class="inputOuter" id="pArea">
                    
                    <input type="password" id="p" name="passwd" class="inputstyle"/>
                </div>
                </div>
               
                <div style="padding-left:50px;margin-top:20px;">
                <input type="submit" value="<s:text name="loginsub"/>" style="width:150px;" class="button_blue"/></div>
              </form>
           </div>
           
            	</div>
               
            </div>
            <!--登录end-->
  </div>

  <!--注册-->
    <div class="qlogin" id="qlogin" style="display: none; ">
   
    <div class="web_login">
    <form name="form2" id="regUser" accept-charset="utf-8"  action="<%= request.getContextPath()%>/goRegistAction" method="post">
	      <input type="hidden" name="to" value="reg"/>
		      		       <input type="hidden" name="did" value="0"/>
        <ul class="reg_form" id="reg-ul">
        		<div id="userCue" class="cue"><s:text name="regzhuyi"/></div>
                <li>
                	
                    <label for="user"  class="input-tips2"><s:text name="user"/>：</label>
                    <div class="inputOuter2">
                        <input type="text" id="user" name="user" maxlength="16" class="inputstyle2"/>
                    </div>
                    
                </li>
                <li>
                	
                    <label for="user"  class="input-tips2"><s:text name="sex"/>：</label>
                    <div class="inputOuter2">
                        <select name="moreselAge" id="addNew" maxlength="4" class="inputstyle2">   
                       <option value="1" selected><s:text name="boy"/></option>   
                       <option value="2"><s:text name="girl"/></option>   
                       </select>
                    </div>
                    
                </li>
                
                <li>
                <label for="passwd" class="input-tips2"><s:text name="pass"/>：</label>
                    <div class="inputOuter2">
                        <input type="password" id="passwd"  name="passwd" maxlength="20" class="inputstyle2"/>
                    </div>
                    
                </li>
                <li>
                <label for="passwd2" class="input-tips2"><s:text name="repass"/>：</label>
                    <div class="inputOuter2">
                        <input type="password" id="passwd2" name="" maxlength="20" class="inputstyle2" />
                    </div>
                    
                </li>
                <li>
                 <label for="qq" class="input-tips2"><s:text name="work"/>：</label>
                    <div class="inputOuter2">
                       <select name="moreselAge" id="addNew" maxlength="10" class="inputstyle2">   
                       <option value="1" selected><s:text name="work1"/></option>   
                       <option value="2"><s:text name="work2"/></option>   
                       <option value="3"><s:text name="work3"/></option>       
                       <option value="4"><s:text name="work4"/></option>   
                       </select>   
                       
                    </div>
                   
                </li>                 
                <li>
                 <label for="qq" class="input-tips2"><s:text name="mail"/>：</label>
                    <div class="inputOuter2">
                       
                        <input type="text" id="qq" name="qq" maxlength="20" class="inputstyle2"/>
                    </div>
                   
                </li>
               
                <li>
                    <div class="inputArea">
                        <input type="button" id="reg"  style="margin-top:10px;margin-left:85px;" class="button_blue" value="<s:text name="regsub"/>"/> <a href="#" class="zcxy">注册协议</a>
                    </div>
                    
                </li><div class="cl"></div>
            </ul></form>
           
    
    </div>
   
    
    </div>
    <!--注册end-->
</div>
<div class="jianyi">*推荐使用ie8或以上版本ie浏览器或Chrome内核浏览器访问本站</div>
</body></html>