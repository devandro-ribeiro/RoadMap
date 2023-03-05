package model.entity;

import java.util.Objects;

public class Pedido {
	private int idPedido;
	private String codigoPedido;
	private Double valorPedido;
	private boolean pagamento;
	
	public Pedido(int idPedido, String codigoPedido, Double valorPedido, boolean pagamento) {
		super();
		this.codigoPedido = codigoPedido;
		this.valorPedido = valorPedido;
		this.pagamento = pagamento;
		this.idPedido = idPedido;
	}
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
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
