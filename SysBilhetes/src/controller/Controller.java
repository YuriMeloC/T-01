package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Espetaculo;
import model.Usuario;

@WebServlet(urlPatterns = { "/home", "/login", "/espetaculos", "/cadastro", "/insertUsuario", "/pagamento", "/insertPagamento", "identificaEspetac" })

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	DAO dao = new DAO();
	Usuario usuario = new Usuario();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/espetaculos")) {
			listaEspetaculos(request, response);
		} else if (action.equals("/home")) {
			response.sendRedirect("index.html");
		} else if (action.equals("/login")) {
			response.sendRedirect("formLogin.html");
		} else if (action.equals("/cadastro")) {
			response.sendRedirect("cadastro.html");
		} else if (action.equals("/pagamento")) {
			preparaPagamento(request, response);
		} else if (action.equals("/insertUsuario")) {
			novoUsuario(request, response);
		} else if (action.equals("/insertPagamento")) {
			novoPagamento(request, response);
		} else if (action.equals("/identificaEspetac")) {
			identificaEspetaculo(request, response);
		} else {
			response.sendRedirect("erro.html");
		}

		// dao.testaConexao();
		
	}

	// Novo usuario
	protected void novoUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("teste");
		
		//Setar as variáveis do JavaBeans
		usuario.setNome_usuario(request.getParameter("nome"));
		usuario.setCpf_usuario(request.getParameter("cpf"));
		usuario.setEmail_usuario(request.getParameter("email"));
		usuario.setTelefone_usuario(request.getParameter("telefone"));
		usuario.setSenha_usuario(request.getParameter("senha"));
		
		//Invocar o método de inserção do usuário
		dao.inserirUsuario(usuario);
		
		//Redirecionar para o documento espetaculos.html
		response.sendRedirect("espetaculos");
	}
	
	// Lista espetáculos
	protected void listaEspetaculos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Espetaculo> espetaculos = dao.listaEspetaculos();
		
		request.setAttribute("listaEspetaculos", espetaculos);
		RequestDispatcher rd = request.getRequestDispatcher("espetaculos.jsp");
		rd.forward(request, response);
	}
	
	// Lista espetáculos
	protected void preparaPagamento(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Usuario> usuario = dao.listaUsuarios();
		ArrayList<Espetaculo> espetaculos = dao.listaEspetaculos();
		
		request.setAttribute("listaUsuarios", usuario);
		request.setAttribute("listaEspetaculos", espetaculos);
		
		RequestDispatcher rd = request.getRequestDispatcher("pagamento.jsp");
		rd.forward(request, response);
	}
	
	// Identificar espetaculo selecionado para compra
	protected void identificaEspetaculo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	
	protected void novoPagamento(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
}

