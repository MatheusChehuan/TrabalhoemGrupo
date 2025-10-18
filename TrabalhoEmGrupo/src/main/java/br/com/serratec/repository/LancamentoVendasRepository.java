package br.com.serratec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.entity.LancamentoVendas;

public interface LancamentoVendasRepository extends JpaRepository<LancamentoVendas, Long> {
}
