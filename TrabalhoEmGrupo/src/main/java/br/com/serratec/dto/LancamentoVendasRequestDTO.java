package br.com.serratec.dto;

import java.time.LocalDate;

import br.com.serratec.entity.LancamentoVendas;
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
	private Long vendedor_id;

	public LancamentoVendasRequestDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public LancamentoVendasRequestDTO(LocalDate data, Double valor, Long vendedor_id) {
		super();
		this.data = data;
		this.valor = valor;
		this.vendedor_id = vendedor_id;
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


	public Long getVendedor_id() {
		return vendedor_id;
	}

	public void setVendedor_id(Long vendedor_id) {
		this.vendedor_id = vendedor_id;
	}
	
}
