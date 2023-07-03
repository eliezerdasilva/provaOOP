package model;

import java.sql.Timestamp;
import java.util.Date;

public class Livro {
	
	private int id;
	private int codigo;
	private String titulo;
	private String autor;
	private String genero;
	private String editora;
	private Date dataPublicacao;
	private int numeroPaginas;
	private StatusReserva statusReserva;
	private Prateleira prateleira;
	private Funcionario criadoPor;
	private Funcionario alteradoPor;
	private Timestamp criadoEm;
	private Timestamp alteradoEm;
	
	public Livro() {
		
	}

	public Livro(int id, int codigo, String titulo, String autor, String genero, String editora, Date dataPublicacao,
			int numeroPaginas, StatusReserva statusReserva, Prateleira prateleira, Funcionario criadoPor,
			Funcionario alteradoPor, Timestamp criadoEm, Timestamp alteradoEm) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
		this.numeroPaginas = numeroPaginas;
		this.statusReserva = statusReserva;
		this.prateleira = prateleira;
		this.criadoPor = criadoPor;
		this.alteradoPor = alteradoPor;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public StatusReserva getStatusReserva() {
		return statusReserva;
	}

	public void setStatusReserva(StatusReserva statusReserva) {
		this.statusReserva = statusReserva;
	}

	public Prateleira getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(Prateleira prateleira) {
		this.prateleira = prateleira;
	}

	public Funcionario getCriadoPor() {
		return criadoPor;
	}

	public void setCriadoPor(Funcionario criadoPor) {
		this.criadoPor = criadoPor;
	}

	public Funcionario getAlteradoPor() {
		return alteradoPor;
	}

	public void setAlteradoPor(Funcionario alteradoPor) {
		this.alteradoPor = alteradoPor;
	}

	public Timestamp getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Timestamp criadoEm) {
		this.criadoEm = criadoEm;
	}

	public Timestamp getAlteradoEm() {
		return alteradoEm;
	}

	public void setAlteradoEm(Timestamp alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", genero="
				+ genero + ", editora=" + editora + ", dataPublicacao=" + dataPublicacao + ", numeroPaginas="
				+ numeroPaginas + ", criadoPor=" + criadoPor + ", alteradoPor=" + alteradoPor + ", criadoEm=" + criadoEm
				+ ", alteradoEm=" + alteradoEm + "]";
	}
	
	
	
}
