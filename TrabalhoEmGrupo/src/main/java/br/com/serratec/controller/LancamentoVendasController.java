package br.com.serratec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.entity.LancamentoVendas;
import br.com.serratec.service.LancamentoVendasService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoVendasController {

    @Autowired
    private LancamentoVendasService service;
    

    @GetMapping("{id}")
	public ResponseEntity<LancamentoVendas> buscar(@PathVariable Long id){
		LancamentoVendas LancamentoVendas = service.buscar(id);
		if (LancamentoVendas != null) {
			return ResponseEntity.ok(LancamentoVendas);
		}
		return ResponseEntity.notFound().build();
	}

    @PostMapping
    public LancamentoVendas inserir(@RequestBody @Valid LancamentoVendas LV) {
        return service.inserir(LV);
    }
}