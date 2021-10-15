package teste;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import testesistema.Cliente;
import testesistema.ControleDeClientes;

public class GerenciadorClientesTeste1 {
	
	@Test

	
	public void testePesquisarCliente() {
	
		Cliente cliente1 = new Cliente(1, "jose", "jose@gmail.com", true, 1234);
		
		Cliente cliente2 = new Cliente(2, "Carlos", "Carlos@gmail.com", true, 5678);
		
		//inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList();
		clientesDoBanco.add(cliente1);
		clientesDoBanco.add(cliente2);
		
		ControleDeClientes controle = new ControleDeClientes(clientesDoBanco);
		
		Cliente cliente = controle.pesquisarCliente(1);
		
		
		//notaçao de teste unitario
		
		assertThat(cliente.getId(), is(1));

	}
	
}
