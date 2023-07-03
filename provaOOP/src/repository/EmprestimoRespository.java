package repository;

import java.util.ArrayList;

import model.Emprestimo;

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
	public void alterar(ArrayList<Emprestimo> emprestimoAlterar) {
		if(emprestimo == null) {
			emprestimo.addAll(emprestimoAlterar);
		} else {
			emprestimo = emprestimoAlterar;
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
