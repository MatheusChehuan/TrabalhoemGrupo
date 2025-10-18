package br.com.serratec.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.entity.Vendedor;
import br.com.serratec.entity.VendedorAutonomo;
import br.com.serratec.entity.VendedorProfissional;
import br.com.serratec.repository.VendedorAutonomoRepository;
import br.com.serratec.repository.VendedorProfissionalRepository;
import br.com.serratec.repository.VendedorRepository;

@Service
public class VendedorProfissionalService {

	@Autowired
	private VendedorProfissionalRepository repository;
	
	public VendedorProfissional buscar(Long id) {
		Optional<VendedorProfissional> vendedorprofissional = repository.findById(id);
		return vendedorprofissional.get();
	}
	
	public VendedorProfissional inserir(VendedorProfissional VendedorProfissional) {
		return repository.save(VendedorProfissional);
	}
}
