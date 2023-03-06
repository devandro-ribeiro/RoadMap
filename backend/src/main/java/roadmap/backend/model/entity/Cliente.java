package roadmap.backend.model.entity;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Column(name = "nome_cliente", nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String statusCliente;
	
	@Column(nullable = false)
	private String codigoCliente;
	
	@OneToMany
	@JoinColumn(name = "idCliente")
	private List<Pedido> pedidos;
	
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStatusCliente() {
		return statusCliente;
	}
	public void setStatusCliente(String statusCliente) {
		this.statusCliente = statusCliente;
	}
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
		
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", statusCliente=" + statusCliente
				+ ", codigoCliente=" + codigoCliente + ", pedidos=" + pedidos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoCliente, idCliente, nome, pedidos, statusCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(codigoCliente, other.codigoCliente) && Objects.equals(idCliente, other.idCliente)
				&& Objects.equals(nome, other.nome) && Objects.equals(pedidos, other.pedidos)
				&& Objects.equals(statusCliente, other.statusCliente);
	}
	
}
