package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/sys_bilhetes?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "YuriCamilo%14%11%";
	
	private Connection conectar() {
		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	//public void testaConexao() {
	//	try {
	//		Connection con = conectar();
	//		System.out.println(con);
	//		con.close();
	//	} catch (Exception e) {
	//		System.out.println(e);
	//	}
	//}
	
	/** CRUD CREATE **/
	public void inserirUsuario(Usuario usuario) {
		String sql = "insert into dbusuarios (nome_usuario, cpf_usuario, email_usuario, telefone_usuario, senha_usuario) values (?,?,?,?,?)";
		try {
			// abrir a conexão
			Connection con = conectar();

			// preparar a Query a ser executada
			PreparedStatement pst = con.prepareStatement(sql);

			// substituir os parâmetros (?) pelas variáveis
			pst.setString(1, usuario.getNome_usuario());
			pst.setString(2, usuario.getCpf_usuario());
			pst.setString(3, usuario.getEmail_usuario());
			pst.setString(4, usuario.getTelefone_usuario());
			pst.setString(5, usuario.getSenha_usuario());

			// Executar a query
			pst.executeUpdate();

			// Encerrar a conexão com o banco
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<Espetaculo> listaEspetaculos() {
		ArrayList<Espetaculo> espetaculos = new ArrayList<>();
		String read = "select * from dbespetaculos";
		
		try {
			Connection con = conectar();
			
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString(1);
				String nome = rs.getString(2);
				String descricao = rs.getString(3);
				String data = rs.getString(4);
				String horario = rs.getString(5);
				String quantidade_bilhetes = rs.getString(6);
				String preco = rs.getString(7);
				
				espetaculos.add(new Espetaculo(id, nome, descricao, data, horario, quantidade_bilhetes, preco));
			}
			
			con.close();
			return espetaculos;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public ArrayList<Usuario> listaUsuarios() {
		ArrayList<Usuario> usuarios = new ArrayList<>();
		
		String read2 = "select * from dbusuarios";
		
		try {
			
			Connection con = conectar();
			
			PreparedStatement pst = con.prepareStatement(read2);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString(1);
				String nome = rs.getString(2);
				String cpf = rs.getString(3);
				String email = rs.getString(4);
				String telefone = rs.getString(5);
				String senha = rs.getString(6);
				
				usuarios.add(new Usuario(id, nome, cpf, email, telefone, senha));
			}
			
			con.close();
			return usuarios;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void selecionarEspetaculo(Espetaculo espetaculo) {
		String read3 = "select * from dbespetaculos where id_espetaculo = ?";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read3);
			pst.setString(1, espetaculo.getId_espetaculo());
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				espetaculo.setId_espetaculo(rs.getString(1));
				espetaculo.setNome_espetaculo(rs.getString(2));
				espetaculo.setDescricao_espetaculo(rs.getString(3));
				espetaculo.setData_espetaculo(rs.getString(4));
				espetaculo.setHorario_espetaculo(rs.getString(5));
				espetaculo.setQuantidade_bilhetes_espetaculo(rs.getString(6));
				espetaculo.setPreco_espetaculo(rs.getString(7));
			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
