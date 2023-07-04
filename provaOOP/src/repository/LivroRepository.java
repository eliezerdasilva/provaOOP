package repository;

import java.util.ArrayList;

import models.Livro;

public class LivroRepository {

	private ArrayList<Livro> livros;

	public LivroRepository() {
	
		livros =  new ArrayList<Livro>();
	}
	public void cadastrar(Livro livroSalvar) {
		livros.add(livroSalvar);
	}
	public void excluir(Livro livroRemover) {
		livros.remove(livroRemover);
	}
	public void alterar(Livro livroAlterar) {
		Livro livro = buscarPorId(livroAlterar.getId());
		if(livro == null) {
			livros.add(livroAlterar);
		} else {
			livro = livroAlterar;
		}
	}
	public Livro buscarPorId(int id) {
		Livro livroSelecionado = null;
		for (Livro cli : livros) {
			if (cli.getId() == id)
				livroSelecionado = cli;
		}

		return livroSelecionado;
	}
	public ArrayList<Livro> listCliente(){
		return livros;
	}
}
