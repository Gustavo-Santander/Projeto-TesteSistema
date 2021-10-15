package testesistema;

import java.util.List;


/**
 * Classe de negocio para realizar operacoes sobre clientes do banco
 * @author Gustavo Xavier
 *
 */

public class ControleDeClientes {

	// Cria lista de clientes do banco
	public List<Cliente> clientesBanco;
	
	public ControleDeClientes(List<Cliente> clientesBanco) {
		this.clientesBanco = clientesBanco;
	}
	
	/**
	 * Pesquisar por um cliente a partir do seu ID
	 * @param idCliente
	 * @return caso o cliente seja localixado retorna dados do cliente do contrario retorna null
	 */
	public Cliente pesquisarCliente(int idCliente) {

		for (Cliente cliente : clientesBanco) {
			if (cliente.getId() == idCliente)
				return cliente;
		}

		return null;
	}

	/**
	 * Adiciona um Novo Cliente
	 * @param novoCliente sao as informacoes do novo cliente que sera adicionado a lista
	 */
	public void adicionarCliente (Cliente novoCliente) {
		clientesBanco.add(novoCliente);
	}
	
	
	
	
	
	public List<Cliente> getClientesBanco() {
		return clientesBanco;
	}

}
