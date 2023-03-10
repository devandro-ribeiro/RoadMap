package roadmap.backend.dto;

import java.util.List;
import java.util.stream.Collectors;

import lombok.experimental.Accessors;
import roadmap.backend.infra.entity.Pedido;

@Accessors(chain = true)
public class PedidoDto {
	
	private Integer id;
	private String codigo;
	private Double valor;
	private boolean pagamento;
	private ClienteDto cliente;
	
	public PedidoDto(Integer id, String codigo, Double valor, boolean pagamento, ClienteDto cliente) {
		this.id = id;
		this.codigo = codigo;
		this.valor = valor;
		this.pagamento = pagamento;
		this.cliente = cliente;
	}
	
	public PedidoDto(Pedido pedido) {
		id = pedido.getId();
		codigo = pedido.getCodigo();
		valor = pedido.getValor();
		pagamento = pedido.isPagamento();
		cliente = pedido.getCliente();
	}
	
	public Pedido salvaPedidos() {		
		Pedido pedido = new Pedido();
		pedido.setId(this.id);
		pedido.setCliente(this.cliente);
		pedido.setCodigo(this.codigo);
		pedido.setPagamento(this.pagamento);
		pedido.setValor(this.valor);
		return pedido;				
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

	public ClienteDto getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}
	
	public static List<PedidoDto> converteLista(List<Pedido> pedido){
		return pedido.stream().map(PedidoDto::new).collect(Collectors.toList());
	}
	
}
