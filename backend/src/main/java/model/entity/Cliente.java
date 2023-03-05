package model.entity;

import java.util.Objects;

public class Cliente {
	
	private int idCliente;
	private String nome;
	private String statusCliente;
	private String codigoCliente;
	
	public Cliente(int idCliente, String nome, String statusCliente, String codigoCliente) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.statusCliente = statusCliente;
		this.codigoCliente = codigoCliente;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
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
				+ ", codigoCliente=" + codigoCliente + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoCliente, idCliente, nome, statusCliente);
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
		return Objects.equals(codigoCliente, other.codigoCliente) && idCliente == other.idCliente
				&& Objects.equals(nome, other.nome) && Objects.equals(statusCliente, other.statusCliente);
	}
	
}
