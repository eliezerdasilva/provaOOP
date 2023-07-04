package repository;

import java.util.ArrayList;

import models.Emprestimo;

public class EmprestimoRespository {
	
	private ArrayList<Emprestimo> emprestimo;

	public EmprestimoRespository() {
	
		emprestimo =  new ArrayList<Emprestimo>();
	}
	public void cadastrar(Emprestimo emprestimoSalvar) {
		emprestimo.add(emprestimoSalvar);
	}
	public void excluir(Emprestimo emprestimoRemover) {
		emprestimo.remove(emprestimoRemover);
	}
	public void alterar(Emprestimo emprestimoAlterar) {
		Emprestimo empresti = buscarPorId(emprestimoAlterar.getId());
		if(empresti == null) {
			emprestimo.add(emprestimoAlterar);
		} else {
			empresti = emprestimoAlterar;
		}
	}
	public Emprestimo buscarPorId(int id) {
		Emprestimo emprestimoSelecionado = null;
		for (Emprestimo empresti : emprestimo) {
			if (empresti.getId() == id)
				emprestimoSelecionado = empresti;
		}

		return emprestimoSelecionado;
	}
	public ArrayList<Emprestimo> listEmprestimo(){
		return emprestimo;
	}
	
	
	

}
