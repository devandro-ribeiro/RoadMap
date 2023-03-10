package roadmap.backend.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import roadmap.backend.infra.entity.Cliente;
import roadmap.backend.infra.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	private Cliente cliente;
	
	public void salvarCliente() {
		
		if (cliente.getCodigo() != null && cliente.getId() != null && cliente.getNome() != null && cliente.getStatus() != null)
			repository.save(cliente);
	}
	
}
