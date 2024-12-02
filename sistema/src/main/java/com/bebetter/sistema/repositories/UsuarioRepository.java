package com.bebetter.sistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bebetter.sistema.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByEmail(String email);
	
}
