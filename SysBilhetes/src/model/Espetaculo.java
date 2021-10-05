package model;

public class Espetaculo {
	private String id_espetaculo;
	private String nome_espetaculo;
	private String descricao_espetaculo;
	private String data_espetaculo;
	private String horario_espetaculo;
	private String quantidade_bilhetes_espetaculo;
	private String preco_espetaculo;
	
	public Espetaculo() {
		super();
	}

	public Espetaculo(String id_espetaculo, String nome_espetaculo, String descricao_espetaculo, String data_espetaculo,
			String horario_espetaculo, String quantidade_bilhetes_espetaculo, String preco_espetaculo) {
		super();
		this.id_espetaculo = id_espetaculo;
		this.nome_espetaculo = nome_espetaculo;
		this.descricao_espetaculo = descricao_espetaculo;
		this.data_espetaculo = data_espetaculo;
		this.horario_espetaculo = horario_espetaculo;
		this.quantidade_bilhetes_espetaculo = quantidade_bilhetes_espetaculo;
		this.preco_espetaculo = preco_espetaculo;
	}

	public String getId_espetaculo() {
		return id_espetaculo;
	}
	
	public void setId_espetaculo(String id_espetaculo) {
		this.id_espetaculo = id_espetaculo;
	}
	
	public String getNome_espetaculo() {
		return nome_espetaculo;
	}
	
	public void setNome_espetaculo(String nome_espetaculo) {
		this.nome_espetaculo = nome_espetaculo;
	}
	
	public String getDescricao_espetaculo() {
		return descricao_espetaculo;
	}
	
	public void setDescricao_espetaculo(String descricao_espetaculo) {
		this.descricao_espetaculo = descricao_espetaculo;
	}
	
	public String getData_espetaculo() {
		return data_espetaculo;
	}
	
	public void setData_espetaculo(String data_espetaculo) {
		this.data_espetaculo = data_espetaculo;
	}
	
	public String getHorario_espetaculo() {
		return horario_espetaculo;
	}
	
	public void setHorario_espetaculo(String horario_espetaculo) {
		this.horario_espetaculo = horario_espetaculo;
	}
	
	public String getQuantidade_bilhetes_espetaculo() {
		return quantidade_bilhetes_espetaculo;
	}
	
	public void setQuantidade_bilhetes_espetaculo(String quantidade_bilhetes_espetaculo) {
		this.quantidade_bilhetes_espetaculo = quantidade_bilhetes_espetaculo;
	}
	
	public String getPreco_espetaculo() {
		return preco_espetaculo;
	}
	
	public void setPreco_espetaculo(String preco_espetaculo) {
		this.preco_espetaculo = preco_espetaculo;
	}
	
}
