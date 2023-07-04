package models;

import enums.StatusReserva;

public class Livro {
	
	private int id;
	private String titulo;
	private StatusReserva statusReserva;
	
	

	public Livro() {
		super();
	}

	public Livro(int id,String titulo, StatusReserva statusReserva) {
		super();
		this.id = id;
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public StatusReserva getStatusReserva() {
		return statusReserva;
	}

	public void setStatusReserva(StatusReserva newStatus) {
		this.statusReserva = newStatus;
	}


}
