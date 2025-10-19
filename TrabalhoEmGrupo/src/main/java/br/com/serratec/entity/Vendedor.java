package br.com.serratec.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @Email
    private String email;

    @NotNull
    @DecimalMin(value = "1518.0")
    private Double salario;

    @OneToMany(mappedBy = "vendedor")
    @JsonManagedReference
    private List<LancamentoVendas> lancamentoVendas;
    
    
    public List<LancamentoVendas> getLancamentoVendas() {
        return lancamentoVendas;
    }

    public void setLancamentoVendas(List<LancamentoVendas> lancamentoVendas) {
        this.lancamentoVendas = lancamentoVendas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

}
