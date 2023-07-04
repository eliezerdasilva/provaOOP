package controllers;

import java.util.List;
import models.Cliente;
import repository.ClienteRepository;

public class ClienteController {
    
    private ClienteRepository clienteRepo;
    
    

    public ClienteController() {
		super();
	}

	public ClienteController(ClienteRepository clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public void cadastrar(Cliente cliente) {
        clienteRepo.salvar(cliente);
    }

    public void alterar(Cliente cliente) {
        clienteRepo.salvar(cliente);
    }

    public void excluir(Cliente cliente) {
        clienteRepo.excluir(cliente);
    }

    public List<Cliente> listarTodos() {
        List<Cliente> clientes = clienteRepo.getAll();

        return clientes;
    }

}
