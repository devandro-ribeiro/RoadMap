package roadmap.backend;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import roadmap.backend.model.entity.Cliente;
import roadmap.backend.model.entity.Pedido;
import roadmap.backend.repository.ClienteRepository;
import roadmap.backend.repository.PedidoRepository;

@Component
public class StartApp implements CommandLineRunner {

	@Autowired
	private ClienteRepository repository;
	@Autowired
	private PedidoRepository repositoryPedido;

	@Override
	public void run(String... args) throws Exception {
		// Insercoes setadas na mao para fins de testes
		Cliente cliente = new Cliente();
		Scanner scan = new Scanner(System.in);

		System.out.println("\nCadastro de Cliente\n");

		System.out.println("Nome:");
		cliente.setNome(scan.next());

		System.out.println("Código do Cliente:");
		cliente.setCodigoCliente(scan.next());

		System.out.println("Status do Cliente:");
		cliente.setStatusCliente(scan.next());

		repository.save(cliente);

		Pedido pedido = new Pedido();
		System.out.println("\nCadastro de Pedido\n");
		System.out.println("Código do pedido:");
		pedido.setCodigoPedido(scan.next());

		System.out.println("Valor do Pedido:");
		pedido.setValorPedido(scan.nextDouble());

		System.out.println("Status do Pagamento:");
		String pagamento = scan.next();
		if (pagamento.equals("ok"))
			pedido.setPagamento(true);
		else if (pagamento.equals("pendente"))
			pedido.setPagamento(false);
		else
			System.out.println("Valor Inválido!");

		pedido.setCliente(cliente);

		repositoryPedido.save(pedido);

		for (Cliente string : repository.findAll()) {
			System.out.println(string.getCodigoCliente() + "\n" + string.getNome() + "\n" + string.getStatusCliente());
		}
		for (Pedido string : repositoryPedido.findAll()) {
			System.out.println(string.getCodigoPedido() + "\n" + string.getValorPedido() + "\n" + string.isPagamento());
		}
		
	}

}
