<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>
<meta charset="UTF-8" />
<title>Pagina principal</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>

	<nav class="navbar navbar-inverse navbar-static-top"></nav>

	<div class="panel panel-default">
		<div class="panel-heading">
			<div class="clearfix">
				<h1 class="panel-title impacta-titulo-panel"><b>Página principal</b></h1><br><br>
				<a class="col-sm-2" href="/usuario">Usúario</a><br><br>
				<a class="col-sm-2" href="/cadastrodespesa">Nova Despesa</a><br><br>
				<a class="col-sm-2" href="/listagem">Listagem de Despesas</a><br><br>
			</div>
		</div>



		<div class="panel-body">


		</div>

	</div>
	<script src="/js/jquery-3.1.1.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/despesa.js"></script>

</body>
</html>