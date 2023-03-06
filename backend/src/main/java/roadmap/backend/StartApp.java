package roadmap.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import roadmap.backend.model.entity.Cliente;
import roadmap.backend.model.entity.Pedido;
import roadmap.backend.repository.ClienteRepository;
import roadmap.backend.repository.PedidoRepository;

@Component
public class StartApp implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository repository;
	@Autowired
	private PedidoRepository repositoryPedido;
	
	@Override
	public void run(String... args) throws Exception {
		//Insercoes setadas na mao para fins de testes
		Cliente cliente = new Cliente();
		cliente.setCodigoCliente("JE312");
		cliente.setNome("Maria");
		cliente.setStatusCliente("A");
		repository.save(cliente);
		
		for (Cliente string : repository.findAll()) {
			System.out.println(string.getCodigoCliente()+" "+string.getNome()+" "+string.getStatusCliente());
		}
		
		Pedido pedido = new Pedido();
		pedido.setCodigoPedido("#1234");
		pedido.setValorPedido(1587.0);
		pedido.setPagamento(true);
		repositoryPedido.save(pedido);
		
		for (Pedido string : repositoryPedido.findAll()) {
			System.out.println(string.getCodigoPedido()+" "+string.getValorPedido()+" "+string.isPagamento());
		}
	}

}
