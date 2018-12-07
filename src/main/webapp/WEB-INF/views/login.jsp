<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>로그인 페이지</title>
<style>
* {
	maring: 0 auto;
	padding: 0 auto;
	text-align: center;
}

#back {
	margin-top: 50px;
}

input {
	text-align: left;
}
</style>
</head>
<body>
	<div id="back">
		<h1>LOGIN</h1>
		<label>ID : </label> <input type="text" value="" id="id"> <br>
		<label>Password : </label> <input type="password" value="" id="pwd">
		<button id="loginbtn">로그인</button>
	</div>
</body>
<script>
	var id = document.getElementById("id");
	var pwd = document.getElementById("pwd");
	var btn = document.getElementById("loginbtn");

	function login() {
		alert("여기 login 함수 안쪽");
		if (id.value.length > 30) {
			alert("아이디는 30자 이하 입니다.");
		} else if (pwd.value.length > 30) {
			alert("비밀번호는 30자 이하입니다.");
		} else {
			alert("난 else안쪽");
			var conf = {
				url : '/user',
				method : 'POST',
				param : JSON.stringify({
					id : id.value,
					pwd : pwd.value
				}),
				success : function(res) {
					if (res != '') {
						alert('로그인이 되었습니다.');
					} else {
						alert('로그인이 안되었습니다. 다시한번 확인해주세요.');
					}
				}
			}
			au.send(conf);
		}
	}

	btn.addEventListener("click", login);
</script>
</html>