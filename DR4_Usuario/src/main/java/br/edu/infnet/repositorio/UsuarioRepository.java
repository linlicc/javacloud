package br.edu.infnet.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.infnet.dominio.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
