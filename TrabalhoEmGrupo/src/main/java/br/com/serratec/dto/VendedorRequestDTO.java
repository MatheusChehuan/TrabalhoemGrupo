package br.com.serratec.dto;

public class VendedorRequestDTO {
	
	private String nome;
	private String email;
	private Double salario;
	private String tipo;
	private Double comissao;
	private String cnpj;
	
	
	public VendedorRequestDTO() {
	}
	
	public VendedorRequestDTO(String nome, String email, Double salario, String tipo, Double comissao, String cnpj) {
		super();
		this.nome = nome;
		this.email = email;
		this.salario = salario;
		this.tipo = tipo;
		this.comissao = comissao;
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getComissao() {
		return comissao;
	}
	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
