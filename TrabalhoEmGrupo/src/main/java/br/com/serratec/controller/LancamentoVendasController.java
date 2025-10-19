package br.com.serratec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.dto.LancamentoVendasRequestDTO;
import br.com.serratec.dto.LancamentoVendasResponseDTO;
import br.com.serratec.service.LancamentoVendasService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoVendasController {

    @Autowired
    private LancamentoVendasService service;
    
    @GetMapping
	public List<LancamentoVendasResponseDTO> listar(){
		return service.listar();
	}
	

    @PostMapping
    public LancamentoVendasResponseDTO inserir(@RequestBody @Valid LancamentoVendasRequestDTO lv) {
        return service.inserir(lv);
    }
}