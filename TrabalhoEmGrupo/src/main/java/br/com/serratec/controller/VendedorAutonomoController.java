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

import br.com.serratec.entity.VendedorAutonomo;
import br.com.serratec.service.VendedorAutonomoService;

@RestController
@RequestMapping("/vendedorautonomo")
public class VendedorAutonomoController {
	@Autowired
	private VendedorAutonomoService service;
	
	@GetMapping("{id}")
	public ResponseEntity<VendedorAutonomo> buscar(@PathVariable Long id){
		VendedorAutonomo VendedorAutonomo = service.buscar(id);
		if (VendedorAutonomo != null) {
			return ResponseEntity.ok(VendedorAutonomo);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public VendedorAutonomo inserir(@RequestBody VendedorAutonomo vendedor) {
		return service.inserir(vendedor);
	}
}
