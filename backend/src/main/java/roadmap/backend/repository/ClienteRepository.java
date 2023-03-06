package roadmap.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import roadmap.backend.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
