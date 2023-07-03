package model;

import java.sql.Timestamp;
import java.util.List;

public class Cliente {
	
	private int id;
	private int numCarteira;
	private List<Emprestimo> emprestimos;
	private boolean status;
	private Funcionario criadoPor;
	private Funcionario alteradoPor;
	private Timestamp criadoEm;
	private Timestamp alteradoEm;
	
	public Cliente() {
		
	}

	public Cliente(int id, int numCarteira, List<Emprestimo> emprestimos, boolean status, Funcionario criadoPor,
			Funcionario alteradoPor, Timestamp criadoEm, Timestamp alteradoEm) {
		super();
		this.id = id;
		this.numCarteira = numCarteira;
		this.emprestimos = emprestimos;
		this.status = status;
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

	public int getNumCarteira() {
		return numCarteira;
	}

	public void setNumCarteira(int numCarteira) {
		this.numCarteira = numCarteira;
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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
		return "Cliente [id=" + id + ", numCarteira=" + numCarteira + ", emprestimos=" + emprestimos + ", status=" + status
				+ ", criadoPor=" + criadoPor + ", alteradoPor=" + alteradoPor + ", criadoEm=" + criadoEm
				+ ", alteradoEm=" + alteradoEm + "]";
	}
	
	
}
