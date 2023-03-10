package roadmap.backend.infra.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import roadmap.backend.dto.ClienteDto;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false)
	private String codigo;
	
	@Column(nullable = false)
	private Double valor;
	
	@Column(nullable = false)
	private boolean pagamento;

	@ManyToOne
	@JoinColumn(name = "idCliente")
	private ClienteDto cliente;
	
	public ClienteDto getCliente() {
		return cliente;
	}
	
	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public boolean isPagamento() {
		return pagamento;
	}
	
	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}

}
