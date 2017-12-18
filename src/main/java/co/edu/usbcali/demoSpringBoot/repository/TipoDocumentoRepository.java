package co.edu.usbcali.demoSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.usbcali.demoSpringBoot.model.TipoDocumento;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Integer>{

}
