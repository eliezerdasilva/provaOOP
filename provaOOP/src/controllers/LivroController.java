package controllers;

import java.util.ArrayList;
import java.util.List;

import interfaces.ControllerInterface;
import interfaces.RepositorioInterface;
import models.Cliente;
import models.Livro;

public class LivroController {
    
    private RepositorioInterface bookRepo;

    public LivroController(RepositorioInterface repo) {
        this.bookRepo = repo;
    }

    public void realizarEmprestimo(Livro livro, Cliente cliente) {

    }

    public void registrarDevolucao(Livro livro) {

    }

    public void adicionarLivro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionar'");
    }

    public void excluirLivro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    public List<Livro> listarTodos() {
        List<Livro> livros = new ArrayList<>();

        return livros;
    }

}
