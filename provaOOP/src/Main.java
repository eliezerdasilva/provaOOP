import java.util.List;

import javax.swing.JOptionPane;

import models.Livro;

class Main {
    public static void main(String[] args) {
    	boolean inicializacao = true;
		int opcao = 0;

		while (inicializacao) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(telaInicial()));

			switch (opcao) {
			case 1:
				//int opcao = Integer.parseInt(JOptionPane.showInputDialog(montarSubMenuFuncionarios()));
				//operacaoFuncionario(opcao, funcionarioController);
				break;
			case 2:
				// Chamar menu cliente
				break;
			case 3:
				// Chamar menu produto
				break;
			case 4:
				// Chamar menu cardapio
				break;
			case 5:
				// Chamar menu mesa
				break;
			case 6:
				// Chamar menu pedido
				break;
			case 7:
				inicializacao = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
				break;
			}
		}
    	
        
		boolean executando = true;
		int opcaoSelecionada = 0;

		while (executando) {
			opcaoSelecionada = Integer.parseInt(JOptionPane.showInputDialog(montarMenuPrincipal()));

			switch (opcaoSelecionada) {
			case 1:
				break;
			case 2:
				// Chamar menu cliente
				break;
			case 3:
				// Listar livros
				List<Livro> livros;
				break;
			case 4:
				// Chamar menu Registrar empréstimo
				break;
			case 5:
				// Chamar menu Registrar devolução
				break;
			case 6:
				executando = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
				break;
			}
		}
		
    }

	public static Object montarMenuPrincipal() {
		
		StringBuilder builder = new StringBuilder();
		builder.append(" ==================== BIBLIOTECA ==================== ");
		builder.append("\n");
		builder.append("1 - Adicionar um novo livro à biblioteca \n");
		builder.append("2 - Excluir um livro da biblioteca \n");
		builder.append("3 - Listar todos os livros da biblioteca \n");
		builder.append("4 - Realizar o empréstimo de um livro para um usuário \n");
		builder.append("5 - Registrar a devolução de um livro \n");
		builder.append("6 - Sair");

		return builder.toString();
	}
}