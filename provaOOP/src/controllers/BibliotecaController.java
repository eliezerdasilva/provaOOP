package controllers;

import java.util.ArrayList;
import java.util.List;

import interfaces.RepositorioInterface;
import models.Cliente;
import models.Livro;

public class BibliotecaController {
    
    private RepositorioInterface repo;

    public BibliotecaController(RepositorioInterface repo) {
        this.repo = repo;
    }

    public void adicionarLivro() {

    }

    public void excluirLivro() {
        
    }

    public List<Livro> listarLivro() {
        List<Livro> livros = new ArrayList<>();

        return livros;
    }

    public void realizarEmprestimo(Livro livro, Cliente cliente) {

    }

    public void registrarDevolucao(Livro livro) {

    }

}
