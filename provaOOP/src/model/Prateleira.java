package model;

import java.sql.Timestamp;
import java.util.List;

public class Prateleira {
	
	private int id;
	private int estante;
	private String biblioteca;
	private int corredor;
	private List<Livro> listLvros;
	private Funcionario criadoPor;
	private Funcionario alteradoPor;
	private Timestamp criadoEm;
	private Timestamp alteradoEm;
	
	public Prateleira() {
		
	}

	public Prateleira(int id, int estante, String biblioteca, int corredor, List<Livro> listLvros,
			Funcionario criadoPor, Funcionario alteradoPor, Timestamp criadoEm, Timestamp alteradoEm) {
		super();
		this.id = id;
		this.estante = estante;
		this.biblioteca = biblioteca;
		this.corredor = corredor;
		this.listLvros = listLvros;
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

	public int getEstante() {
		return estante;
	}

	public void setEstante(int estante) {
		this.estante = estante;
	}

	public String getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(String biblioteca) {
		this.biblioteca = biblioteca;
	}

	public int getCorredor() {
		return corredor;
	}

	public void setCorredor(int corredor) {
		this.corredor = corredor;
	}

	public List<Livro> getListLvros() {
		return listLvros;
	}

	public void setListLvros(List<Livro> listLvros) {
		this.listLvros = listLvros;
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
		return "Prateleira [id=" + id + ", estante=" + estante + ", biblioteca=" + biblioteca + ", corredor=" + corredor
				+ ", listLvros=" + listLvros + ", criadoPor=" + criadoPor + ", alteradoPor=" + alteradoPor
				+ ", criadoEm=" + criadoEm + ", alteradoEm=" + alteradoEm + "]";
	}
	
	
}
