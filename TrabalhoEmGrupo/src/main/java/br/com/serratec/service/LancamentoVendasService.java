package br.com.serratec.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.entity.LancamentoVendas;
import br.com.serratec.repository.LancamentoVendasRepository;

@Service
public class LancamentoVendasService {


	    @Autowired
	    private LancamentoVendasRepository repository;
	    
	    
	    public LancamentoVendas buscar(Long id) {
			Optional<LancamentoVendas> LancamentoVendas = repository.findById(id);
	        return LancamentoVendas.get();
	    }

	    public LancamentoVendas inserir(LancamentoVendas LV) {
	        return repository.save(LV);
	    }
	}


