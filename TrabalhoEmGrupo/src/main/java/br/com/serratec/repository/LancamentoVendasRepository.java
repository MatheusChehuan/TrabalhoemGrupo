package br.com.serratec.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.entity.LancamentoVendas;
import br.com.serratec.entity.Vendedor;

public interface LancamentoVendasRepository extends JpaRepository<LancamentoVendas, Long> {

}
