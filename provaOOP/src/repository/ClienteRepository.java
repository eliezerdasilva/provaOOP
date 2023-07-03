package repository;

import java.util.ArrayList;

import model.Cliente;
import model.Emprestimo;

public class ClienteRepository {


	private ArrayList<Cliente> clientes;

	public ClienteRepository() {
	
		clientes =  new ArrayList<Cliente>();
	}
	public void cadastrar(Cliente clienteSalvar) {
		clientes.add(clienteSalvar);
	}
	public void excluir(Cliente clienteRemover) {
		clientes.remove(clienteRemover);
	}
	public void alterar(Cliente clienteAlterar) {
		Cliente cliente = buscarPorId(clienteAlterar.getId());
		if(cliente == null) {
			clientes.add(clienteAlterar);
		} else {
			cliente = clienteAlterar;
		}
	}
	public Cliente buscarPorId(int id) {
		Cliente clienteSelecionado = null;
		for (Cliente cli : clientes) {
			if (cli.getId() == id)
				clienteSelecionado = cli;
		}

		return clienteSelecionado;
	}
	public ArrayList<Cliente> listCliente(){
		return clientes;
	}
	
	
}
