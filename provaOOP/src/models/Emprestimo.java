package models;

import java.time.LocalDateTime;

public class Emprestimo {
	
	private int id;
	private int livroId;
	private int clienteId;
	private LocalDateTime dataEmprestimo;
	private LocalDateTime dataRetorno;

	public Emprestimo(int id, int livroId, int clienteId, LocalDateTime dataEmprestimo, LocalDateTime dataRetorno) {
		this.id = id;
		this.livroId = livroId;
		this.dataEmprestimo = dataEmprestimo;
		this.dataRetorno = dataRetorno;
	}

	public int getId() {
		return id;
	}

	public int getlivroId() {
		return livroId;
	}

	public LocalDateTime getDataEmprestimo() {
		return dataEmprestimo;
	}

	public LocalDateTime getDataRetorno() {
		return dataRetorno;
	}

	public int getclienteId() {
		return clienteId;
	}
	
}
