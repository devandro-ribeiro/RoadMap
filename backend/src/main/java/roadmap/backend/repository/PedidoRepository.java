package roadmap.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import roadmap.backend.model.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
