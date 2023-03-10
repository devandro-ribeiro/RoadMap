package roadmap.backend.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roadmap.backend.infra.entity.Pedido;
import roadmap.backend.infra.repository.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repository;
	private Pedido pedido;
	
	public void adicionaPagamento(String pagamento) {
		if(pagamento.equals("ok"))
			pedido.setPagamento(true);
		else if(pagamento.equals("pendente"))
			pedido.setPagamento(false);
		else
			System.out.println("Valor Inválido!!");
	}
	
	public void salvaPedido() {
		if(pedido.getCliente() !=null && pedido.getCodigo() !=null && pedido.getId() !=null && pedido.getValor() !=null)
			repository.save(pedido);
	}

}
