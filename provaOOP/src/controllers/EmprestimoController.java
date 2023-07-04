package controllers;

import java.util.ArrayList;
import java.util.List;

import interfaces.RepositorioInterface;
import models.Emprestimo;

public class EmprestimoController {
    
    private RepositorioInterface clienteRepo;

    public EmprestimoController(RepositorioInterface clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public void criarEmprestimo() {

    }

    public List<Emprestimo> listarTodos() {
        List<Emprestimo> emprestimos = new ArrayList<>();

        return emprestimos;
    }


}
