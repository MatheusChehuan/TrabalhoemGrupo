package br.com.serratec.dto;

import java.time.LocalDate;

import br.com.serratec.entity.Vendedor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class LancamentoVendasRequestDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate data;
	private Double valor;
	private Vendedor Vendedor;
	private String nomevendedor;
	
	public LancamentoVendasRequestDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public LancamentoVendasRequestDTO(Long id, LocalDate data, Double valor, br.com.serratec.entity.Vendedor vendedor) {
		super();
		this.id = id;
		this.data = data;
		this.valor = valor;
		this.nomevendedor = vendedor.getNome();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Vendedor getVendedor() {
		return Vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		Vendedor = vendedor;
	}
	
	

}
