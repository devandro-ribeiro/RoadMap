package roadmap.backend.dto;

import roadmap.backend.infra.entity.Cliente;

public class ClienteDto {
	
	private Integer id;

	public ClienteDto(Integer id) {
		this.id = id;
	}
	
	public ClienteDto(Cliente cliente) {
		id = cliente.getId();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
