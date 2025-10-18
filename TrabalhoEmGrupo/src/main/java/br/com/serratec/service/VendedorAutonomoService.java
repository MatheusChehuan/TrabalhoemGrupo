package br.com.serratec.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.entity.Vendedor;
import br.com.serratec.entity.VendedorAutonomo;
import br.com.serratec.repository.VendedorAutonomoRepository;
import br.com.serratec.repository.VendedorRepository;

@Service
public class VendedorAutonomoService {

	@Autowired
	private VendedorAutonomoRepository repository;
	
	public VendedorAutonomo buscar(Long id) {
		Optional<VendedorAutonomo> va = repository.findById(id);
		return va.get();
	}
	
	
	public VendedorAutonomo inserir(VendedorAutonomo vendedor) {
		return repository.save(vendedor);
	}
}
