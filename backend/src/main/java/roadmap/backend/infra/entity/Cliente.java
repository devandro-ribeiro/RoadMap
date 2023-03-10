package roadmap.backend.infra.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import roadmap.backend.dto.PedidoDto;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String status;
	
	@Column(nullable = false)
	private String codigo;
	
	@OneToMany(mappedBy = "cliente")
	private List<PedidoDto> pedidos;	
	
	public List<PedidoDto> getPedidos() {
		return pedidos;
	}
	
	public void setPedidos(List<PedidoDto> pedidos) {
		this.pedidos = pedidos;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
		
}
