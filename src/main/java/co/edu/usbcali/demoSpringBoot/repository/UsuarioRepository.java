package co.edu.usbcali.demoSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.usbcali.demoSpringBoot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
