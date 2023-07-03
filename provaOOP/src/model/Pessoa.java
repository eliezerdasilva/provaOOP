package model;

import java.sql.Date;

public abstract class Pessoa {
	
	private Integer id; 
	
	private String nome; 
	
	private Long cpf;
	private String telefone;
	private String email;
	private Date dataNascimento;
	
	
	
	public Pessoa() {
	
	}

	public Pessoa(Integer id, String nome, Long cpf, String telefone, String email, Date dataNascimento) {
	
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	} 
	
	
	
	
	

}
