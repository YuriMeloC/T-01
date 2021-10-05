<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.Espetaculo" %>
<%@ page import="java.util.ArrayList" %>
<%
	ArrayList<Espetaculo> espetaculos = (ArrayList<Espetaculo>) request.getAttribute("listaEspetaculos");

%>
    
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;400&display=swap" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="styles/style.css">
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

    <div class="article">
        <div class="espetaculos">
            <div class="espetaculo1">
                <div class="descricao">
                    <div class="dados_espetaculo">
                        <div class="imagem_espetaculo"><img src="imagem_concerto.jpg" alt=""></div>
                        <div class="comprar_espetaculo">
                            <button class="comprar_espetac_1" onclick="location.href='identificaEspetac';">Comprar</button>
                        </div>
                    </div>
                    
                    <div class="nome_espetaculo">Teste</div>
                    <div class="descricao_espetaculo">Teste</div>
                </div>
            </div>

            <div class="espetaculo2">
                <div class="descricao">
                    <div class="dados_espetaculo">
                        <div class="imagem_espetaculo"><img src="imagem_concerto.jpg" alt=""></div>
                        <div class="comprar_espetaculo">
                            <button class="comprar_espetac_2" onclick="location.href='identificaEspetac';">Comprar</button>
                        </div>
                    </div>
                    
                    <div class="nome_espetaculo">Teste</div>
                    <div class="descricao_espetaculo">Teste</div>
                </div>
            </div>

            <div class="espetaculo3">
                <div class="descricao">
                    <div class="dados_espetaculo">
                        <div class="imagem_espetaculo"><img src="imagem_concerto.jpg" alt=""></div>
                        <div class="comprar_espetaculo">
                            <button class="comprar_espetac_3" onclick="location.href='identificaEspetac';">Comprar</button>
                        </div>
                    </div>
                    
                    <div class="nome_espetaculo">Teste</div>
                    <div class="descricao_espetaculo">Teste</div>
                </div>
            </div>

        </div>
    </div>  

    <div class="contact">
        <div class="content">
            <div class="left-side">
                <div class="address details">
                    <i class="fas fa-map-marker-alt"></i>
                    <div class="topic">Endereço</div>
                    <div class="text-one">Campinas, SP</div>
                </div>
                <div class="phone details">
                    <i class="fas fa-phone-alt"></i>
                    <div class="topic">Telefone</div>
                    <div class="text-one">(19) 99999-9999</div>
                </div>
                <div class="email details">
                    <i class="fas fa-envelope"></i>
                    <div class="topic">Email</div>
                    <div class="text-one">teste@teste.com.br</div>
                </div>
            </div>
            
            <div class="right-side">
                <div class="topic-text">Fale Conosco!</div>
                <p>Se você tiver alguma dúvida ou deseja entrar em contato para fazer um elogio ou reclamação, por favor preencha o formulário abaixo com suas informações. Estamos dispostos a te ajudar!<br><br>Agradecemos o contato!</p>
                <form action="#">
                    <div class="input-box">
                        <input type="text" placeholder="Insira seu nome">
                    </div>
                    <div class="input-box">
                        <input type="text" placeholder="Insira seu email">
                    </div>
                    <div class="input-box message-box">
                        <textarea placeholder="Escreva aqui sua mensagem..."></textarea>
                    </div>
                    <div class="button">
                        <input type="button" value="Enviar" onclick="location.href='index.html';">
                    </div>
                </form>
            </div>
        </div>
    </div>
    
</body>
</html>