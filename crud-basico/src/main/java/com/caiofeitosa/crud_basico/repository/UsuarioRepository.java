package com.caiofeitosa.crud_basico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiofeitosa.crud_basico.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
