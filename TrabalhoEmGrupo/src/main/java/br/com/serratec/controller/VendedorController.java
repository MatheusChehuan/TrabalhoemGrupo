package br.com.serratec.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.entity.Vendedor;
import br.com.serratec.service.VendedorService;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
	@Autowired
	private VendedorService service;

	@GetMapping("{id}")
	public ResponseEntity<Vendedor> buscar(@PathVariable Long id){
		Vendedor Vendedor = service.buscar(id);
		if (Vendedor != null) {
			return ResponseEntity.ok(Vendedor);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Vendedor inserir(@RequestBody Vendedor Vendedor) {
		return service.inserir(Vendedor);
	}
}
