package roadmap.backend.entrypoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import roadmap.backend.dto.PedidoDto;
import roadmap.backend.infra.entity.Pedido;
import roadmap.backend.infra.repository.PedidoRepository;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoRepository repository;
	
	@GetMapping("/listar")
	public List<PedidoDto> getPedidoAll(){
		List<Pedido> pedidos = repository.findAll();
		return PedidoDto.converteLista(pedidos);
	}
	
	@PostMapping("/salvar")
	public Pedido salvarPedido(@RequestBody PedidoDto pedido) {	
		Pedido pedidos = this.repository.save(pedido.salvaPedidos());
		return pedidos;
	}
}
