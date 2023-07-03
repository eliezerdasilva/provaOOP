package models;

import java.util.Date;

public class Emprestimo {
	
	private int id;
	private Livro livro;
	private Cliente cliente;
	private Date dataEmprestimo;
	private Date dataRetorno;

	public Emprestimo(int id, Livro livro, Cliente cliente, Date dataEmprestimo, Date dataRetorno) {
		this.id = id;
		this.livro = livro;
		this.dataEmprestimo = dataEmprestimo;
		this.dataRetorno = dataRetorno;
	}

	public int getId() {
		return id;
	}

	public Livro getLivro() {
		return livro;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public Date getDataRetorno() {
		return dataRetorno;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
}
