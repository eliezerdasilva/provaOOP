package model;

public class Usuario {
	
	private int id;
	private String login;
	private String senha;
	private String cargo;
	
	public Usuario() {
		
	}

	public Usuario(int id, String login, String senha, String cargo) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.cargo = cargo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", senha=" + senha + ", cargo=" + cargo + "]";
	}
	
	
}
