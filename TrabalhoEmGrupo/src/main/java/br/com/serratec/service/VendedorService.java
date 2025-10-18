package br.com.serratec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.serratec.entity.Vendedor;
import br.com.serratec.repository.VendedorRepository;

@Service
public class VendedorService {

	@Autowired
	private VendedorRepository repository;
	
	public List<Vendedor> lista(){
		return repository.findAll();
	}
	
	public Vendedor buscar(Long id) {
		Optional<Vendedor> perfil = repository.findById(id);
		return perfil.get();
	}
	
	public Vendedor inserir(Vendedor perfil) {
		return repository.save(perfil);
	}
}
