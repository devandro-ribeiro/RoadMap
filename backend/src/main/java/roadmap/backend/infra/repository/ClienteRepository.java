package roadmap.backend.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import roadmap.backend.entrypoint.ClienteController;
import roadmap.backend.infra.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
