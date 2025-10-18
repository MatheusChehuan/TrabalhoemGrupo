package br.com.serratec.controller;

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

import br.com.serratec.entity.VendedorProfissional;
import br.com.serratec.service.VendedorProfissionalService;

@RestController
@RequestMapping("/vendedorprofissional")
public class VendedorProfissionalController {
	@Autowired
	private VendedorProfissionalService service;
	
	@GetMapping("{id}")
	public ResponseEntity<VendedorProfissional> buscar(@PathVariable Long id){
		VendedorProfissional VendedorProfissional = service.buscar(id);
		if (VendedorProfissional != null) {
			return ResponseEntity.ok(VendedorProfissional);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public VendedorProfissional inserir(@RequestBody VendedorProfissional vendedor) {
		return service.inserir(vendedor);
	}
}
