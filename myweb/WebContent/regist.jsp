<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="reg" method="post">
	<p>帳號:
	<input type="text" name="userid" value="${member.userid }"/>${member.errorUserid }
	</p>
	
	<p>密碼:
	<input type="text" name="password" value="${member.password }"/> ${member.errorPassword }
	</p>
	
	<p>密碼(請再輸入一次):
	<input type="text" name="password2" value="${member.password2 }"/>${member.errorPasswordNotMatch }
	</p>
	
	<p>E-mail:
	<input type="text" name="email" value="${member.email }"/>${member.errorEmail }
	</p>
	
	<p>匿稱:
	<input type="text" name="nickname" value="${member.nickname }"/>
	</p>
	<input type="submit" value="註冊">
	
</form>
</body>
</html>