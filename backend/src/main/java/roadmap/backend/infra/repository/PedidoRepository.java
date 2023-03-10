package roadmap.backend.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import roadmap.backend.infra.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
