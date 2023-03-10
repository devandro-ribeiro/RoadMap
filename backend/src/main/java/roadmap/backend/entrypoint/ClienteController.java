package roadmap.backend.entrypoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import roadmap.backend.infra.entity.Cliente;
import roadmap.backend.infra.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	// Insercoes setadas na mao para fins de testes
	
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Cliente>> getClientes(){
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());	}
	
	@GetMapping("/lista")
	public List<Cliente> getClienteAll() {
		return repository.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Cliente getClienteId(@PathVariable Integer id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/salvar")
	public Cliente salvarCliente(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}

	
}
