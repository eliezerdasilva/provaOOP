package controllers;

import java.util.List;
import models.Livro;
import repository.LivroRepository;

public class LivroController {
    
    private LivroRepository bookRepo;

    
    
    public LivroController() {
		super();
	}

	public LivroController(LivroRepository repo) {
        this.bookRepo = repo;
    }

    public void adicionarLivro(Livro livro) {
        bookRepo.cadastrar(livro);
    }

    public void excluirLivro(Livro livro) {
        bookRepo.excluir(livro);
    }

    public List<Livro> listarTodos() {
        List<Livro> livros = bookRepo.getAll();
        
        return livros;
    }

    public Livro getById(int livroId) {
        return bookRepo.buscarPorId(livroId);
    }

}
