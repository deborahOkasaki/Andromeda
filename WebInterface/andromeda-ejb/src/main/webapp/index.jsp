<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
    	<meta http-equiv="X-UA-Compatible" content="ie=edge">
		
		<title>Andromeda</title>
		
		<link rel="stylesheet" href="css/andromeda.css">
		<link rel="stylesheet" href="css/login.css">
		
		<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
	</head>
	<body>
		<form action="/index" method="post" align="center">
	      <fieldset>
            <input class="campo" name="username" type="email" placeholder="Usuário"><br>
            <input class="campo" name="password" type="password" placeholder="Senha"><br>
            <!-- <p id="txtValida">Usuário ou senha inválidos! Tente novamente.</p> -->
            <p id="txtValida">${error}</p>
            <input id="btnEntrar" type="submit" value="Entrar">
	      </fieldset>
          
          <a ref="#" id="pCriaConta">Novo por aqui? Crie sua conta!</a>
          <a ref="#" id="pRecSenha">Recuperar senha.</a>
    	</form>
	</body>
</html>