package roadmap.backend.model.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPedido;
	
	@Column(nullable = false)
	private String codigoPedido;
	
	@Column(nullable = false)
	private Double valorPedido;
	
	@Column(nullable = false)
	private boolean pagamento;
	
	@ManyToOne
	@JoinColumn(name = "idCliente") 
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Integer getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
	public String getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public Double getValorPedido() {
		return valorPedido;
	}
	public void setValorPedido(Double valorPedido) {
		this.valorPedido = valorPedido;
	}
	public boolean isPagamento() {
		return pagamento;
	}
	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}
	
	@Override
	public String toString() {
		return "Pedido [idPedido="+ idPedido + ", codigoPedido=" + codigoPedido + ", valorPedido=" + valorPedido + ", pagamento=" + pagamento
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoPedido, idPedido, pagamento, valorPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(codigoPedido, other.codigoPedido) && idPedido == other.idPedido
				&& pagamento == other.pagamento && Objects.equals(valorPedido, other.valorPedido);
	}
	
}
