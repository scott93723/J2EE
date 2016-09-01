package com.tom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Member {
	String userid;
	String password;
	String password2;
	String email;
	String errorUserid;
	String errorPassword;
	String errorPasswordNotMatch;
	String errorEmail;
	String nickname;

	public Member() {

	}

	public Member(String userid, String password, String password2, String email, String nickname) {
		super();
		this.userid = userid;
		this.password = password;
		this.password2 = password2;
		this.email = email;
		this.nickname = nickname;

	}


	public Member(String userid, String passwd) {
		this.userid = userid;
		this.password = passwd;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean validate() {
		boolean error = false;
		if (userid.length() < 4 || userid.length() > 20) {
			errorUserid = "帳號長度錯誤(4-20)";
			error = true;
		}
		if (password.length() < 6 || password.length() > 20) {
			errorPassword = "密碼長度錯誤(6-20)";
			error = true;
		}
		if (!password.equals(password2)) {
			errorPasswordNotMatch = "兩組密碼不相同";
			error = true;
		}
		if (email.indexOf("@") == -1) {
			errorEmail = "Email格式錯誤";
			error = true;
		}
		if (error) {
			return false;
		} else {
			
				String vid=null;
			try {
				Date now =new Date();
				vid=String.valueOf(now.getTime());
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://j.snpy.org/a105?user=a105&password=a105.33"
						+ "user=a105&password=a105.33&" + "useUnicode=true&characterEncoding=UTF-8");
				PreparedStatement pstmt = conn.prepareStatement
						("INSERT INTO users(userid,passwd,email,nickname,vid) VALUES(?,?,?,?,?)");
				pstmt.setString(1, userid);
				pstmt.setString(2, password);
				pstmt.setString(3, email);
				pstmt.setString(4, nickname);
				pstmt.setString(5, vid);
				int rowCount = pstmt.executeUpdate();
				System.out.println("rowCount:" + rowCount);

				conn.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return true;
		}

	}

	public String getErrorUserid() {
		return errorUserid;
	}

	public void setErrorUserid(String errorUserid) {
		this.errorUserid = errorUserid;
	}

	public String getErrorPassword() {
		return errorPassword;
	}

	public void setErrorPassword(String errorPassword) {
		this.errorPassword = errorPassword;
	}

	public String getErrorPasswordNotMatch() {
		return errorPasswordNotMatch;
	}

	public void setErrorPasswordNotMatch(String errorPasswordNotMatch) {
		this.errorPasswordNotMatch = errorPasswordNotMatch;
	}

	public String getErrorEmail() {
		return errorEmail;
	}

	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}

	public boolean login() {
		boolean logon = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager
						.getConnection("jdbc:mysql://j.snpy.org/a105?user=a105&password=a105.33");
			PreparedStatement pstmt=conn.prepareStatement(
					"select*from users where userid=? and passwd=?"
			);
			pstmt.setString(1, userid);
			pstmt.setString(2,password);
			ResultSet rs=pstmt.executeQuery();
			logon=rs.next();
			conn.close();
				
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return logon;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


}