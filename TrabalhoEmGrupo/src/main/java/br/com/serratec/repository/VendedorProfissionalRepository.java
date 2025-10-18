package br.com.serratec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.entity.Vendedor;
import br.com.serratec.entity.VendedorProfissional;

public interface VendedorProfissionalRepository extends JpaRepository<VendedorProfissional, Long> {
		//Optional<Perfil> findByEmail(String email);
}
