package controllers;

import java.util.ArrayList;
import java.util.List;

import interfaces.RepositorioInterface;
import models.Cliente;

public class ClienteController {
    
    private RepositorioInterface clienteRepo;

    public ClienteController(RepositorioInterface clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public void adicionarCliente(Cliente cliente) {
        clienteRepo.salvar();
    }

    public List<Cliente> listarTodos() {
        List<Cliente> clientes = new ArrayList<>();

        return clientes;
    }

}
