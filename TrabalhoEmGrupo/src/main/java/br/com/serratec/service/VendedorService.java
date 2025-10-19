package br.com.serratec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.dto.VendedorRequestDTO;
import br.com.serratec.dto.VendedorResponseDTO;
import br.com.serratec.entity.Vendedor;
import br.com.serratec.entity.VendedorAutonomo;
import br.com.serratec.entity.VendedorProfissional;
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
	
	public VendedorResponseDTO inserir(VendedorRequestDTO dto ) throws IllegalArgumentException {
		
		String tipo = dto.getTipo();
		if (tipo == null) {
			throw new IllegalArgumentException("Tipo de vendedor não informado");
		}
		Vendedor vendedor;
		tipo = tipo.trim().toUpperCase();
		
		
		switch (tipo) {
		case "AUTONOMO":
			var aut = new VendedorAutonomo();
			aut.setNome(dto.getNome());
	        aut.setEmail(dto.getEmail());
	        aut.setSalario(dto.getSalario());
	        aut.setComissao(dto.getComissao() != null ? dto.getComissao() : 0.0);
	        vendedor = aut;
			break;
			
		case "PROFISSIONAL":
			var prof = new VendedorProfissional();
			prof.setNome(dto.getNome());
            prof.setEmail(dto.getEmail());
            prof.setSalario(dto.getSalario());
            if ((dto.getCnpj().isEmpty())) {
                throw new IllegalArgumentException("CNPJ é obrigatório para vendedor profissional");
            }
            prof.setCnpj(dto.getCnpj());
            vendedor = prof;
            break;
            
			default: throw new IllegalArgumentException("Tipo de vendedor inválido: " + dto.getTipo()
            + ". Use AUTONOMO ou PROFISSIONAL");
		}
		//salvo no banco
		repository.save(vendedor);
		var VendedorResponse = new VendedorResponseDTO(vendedor.getNome(),vendedor.getEmail(),dto.getTipo());
		//retorna um usuario, e transforma em response dto
		return VendedorResponse;
	}
}
