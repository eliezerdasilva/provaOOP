package model;

import java.sql.Timestamp;
import java.util.Date;

public class Emprestimo {
	
	private int id;
	private Livro livro;
	private Cliente cliente;
	private Date dataEmprestimo;
	private Date dataRetorno;
	private Funcionario criadoPor;
	private Funcionario alteradoPor;
	private Timestamp criadoEm;
	private Timestamp alteradoEm;
	
	public Emprestimo() {
		
	}

	public Emprestimo(int id, Livro livro, Cliente cliente, Date dataEmprestimo, Date dataRetorno,
			Funcionario criadoPor, Funcionario alteradoPor, Timestamp criadoEm, Timestamp alteradoEm) {
		super();
		this.id = id;
		this.livro = livro;
		this.cliente = cliente;
		this.dataEmprestimo = dataEmprestimo;
		this.dataRetorno = dataRetorno;
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

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
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
		return "Emprestimo [id=" + id + ", livro=" + livro + ", cliente=" + cliente + ", dataEmprestimo="
				+ dataEmprestimo + ", dataRetorno=" + dataRetorno + ", criadoPor=" + criadoPor + ", alteradoPor="
				+ alteradoPor + ", criadoEm=" + criadoEm + ", alteradoEm=" + alteradoEm + "]";
	}
	
	

}
