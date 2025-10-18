package br.com.serratec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.entity.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
		//Optional<Perfil> findByEmail(String email);
}
