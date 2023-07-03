package model;

import java.sql.Timestamp;
import java.util.Date;

public class Funcionario extends Pessoa {

	
	private Date dataAdmissao;
	private String carteiraTrabalho;
	private Date dataDemissao;
	private Usuario usuario;
	private Funcionario criadoPor;
	private Funcionario alteradoPor;
	private Timestamp criadoEm;
	private Timestamp alteradoEm;
	
	
	public Funcionario() {
		
	}


	public Funcionario(Date dataAdmissao, String carteiraTrabalho, Date dataDemissao, Usuario usuario,
			Funcionario criadoPor, Funcionario alteradoPor, Timestamp criadoEm, Timestamp alteradoEm) {
		super();
		this.dataAdmissao = dataAdmissao;
		this.carteiraTrabalho = carteiraTrabalho;
		this.dataDemissao = dataDemissao;
		this.usuario = usuario;
		this.criadoPor = criadoPor;
		this.alteradoPor = alteradoPor;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}


	public Date getDataAdmissao() {
		return dataAdmissao;
	}


	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}


	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}


	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}


	public Date getDataDemissao() {
		return dataDemissao;
	}


	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
		return "Funcionario [dataAdmissao=" + dataAdmissao + ", carteiraTrabalho=" + carteiraTrabalho
				+ ", dataDemissao=" + dataDemissao + ", usuario=" + usuario + ", criadoPor=" + criadoPor
				+ ", alteradoPor=" + alteradoPor + ", criadoEm=" + criadoEm + ", alteradoEm=" + alteradoEm + "]";
	}
	
	
}
