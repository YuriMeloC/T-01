<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.Usuario" %>
<%@ page import="model.Espetaculo" %>
<%@ page import="java.util.ArrayList" %>
<%
	ArrayList<Usuario> usuario = (ArrayList<Usuario>) request.getAttribute("listaUsuarios");

	ArrayList<Espetaculo> espetaculo = (ArrayList<Espetaculo>) request.getAttribute("listaEspetaculos");
%>
    
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;400&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="styles/style.css">
        <script src="scripts/metodos.js"></script>
        <title>Sistema Compra Bilhetes</title>
    </head>
<body>
    <div class="navbar">
        <ul>
            <li><a href="home">Home</a></li>
            <li><a href="espetaculos">Espetáculos</a></li>
            <li><a href="login">Login</a></li>
        </ul>
    </div>

    <div class="pagamento">
        <div class="title">Dados de Pagamento</div>
        <form name="formPagamento" action="insertPagamento">
            <div class="payment-details">
                <div class="input-box">
                    <span class="details">Número do Cartão</span>
                    <input type="text" placeholder="Insira o número do Cartão" maxlength="16">
                </div>
                <div class="input-box">
                    <span class="details">Validade</span>
                    <input type="text" placeholder="Insira a validade do Cartão">
                </div>
                <div class="input-box">
                    <span class="details">CVV</span>
                    <input type="text" placeholder="Insira o CVV do Cartão">
                </div>
                <div class="input-box">
                    <span class="details">Titular do Cartão</span>
                    <input type="text" placeholder="Insira o titular do Cartão">
                </div>
                <div class="input-box">
                    <span class="details">CPF</span>
                    <input type="text" value="" readonly>
                </div>
                <div class="input-box">
                    <span class="details">Nome Espetaculo</span>
                    <input type="text" readonly>
                </div>
            </div>

            <div class="submit">
                <input type="submit" value="Finalizar Compra">
            </div>
        </form>
    </div>
</body>
</html>