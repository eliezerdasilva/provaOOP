package repository;

import java.util.ArrayList;

import models.Cliente;

public class ClienteRepository {


	private ArrayList<Cliente> clientes;

	public ClienteRepository() {
	
		clientes =  new ArrayList<Cliente>();
	}
	
	public void excluir(Cliente clienteRemover) {
		clientes.remove(clienteRemover);
	}
	public void salvar(Cliente clienteAlterar) {
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
	public ArrayList<Cliente> getAll(){
		return clientes;
	}
	
	
}
