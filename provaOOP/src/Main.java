import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import controllers.EmprestimoController;
import controllers.LivroController;
import enums.StatusReserva;
import models.Cliente;
import models.Emprestimo;
import models.Livro;

class Main {
    public static void main(String[] args) {
    	boolean inicializacao = true;
		int opcao = 0;

		while (inicializacao) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(montarMenuPrincipal()));

			switch (opcao) {
			case 1:
				adicionariLivro();
				break;
			case 2:
				excluirLivro();
				break;
			case 3:
				
				break;
			case 4:
				cadastrarEmprestimo();
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			default:
				JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
				break;
			}
		}
    	
        
		
		
    }

	private static void excluirLivro() {
		String livroid = JOptionPane.showInputDialog("Digite o id do livro");
		LivroController livroController = new LivroController();
		livroController.excluirLivro(livroController.getById(Integer.parseInt(livroid)));
		
		JOptionPane.showMessageDialog(null, "Excluido");
	}

	private static void adicionariLivro() {
		String id = JOptionPane.showInputDialog("Digite o id do livro");
		String titulo = JOptionPane.showInputDialog("Digite o titulo  ");
		Livro livro = new Livro(Integer.valueOf(id), titulo, StatusReserva.DISPONIVEL);
		LivroController livroController = new LivroController();
		livroController.adicionarLivro(livro);
		
		JOptionPane.showMessageDialog(null, "Cadastrado");
		
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
	public static void cadastrarEmprestimo() {
		String id = JOptionPane.showInputDialog("Digite o id do emprestimo");
		String livroid = JOptionPane.showInputDialog("Digite o id do livro");
		String clienteid = JOptionPane.showInputDialog("Digite o id cliente ");
		String dataEmprestimo = JOptionPane.showInputDialog("Digite o a  dataEmprestimo");
		String dataRetorno = JOptionPane.showInputDialog("Digite a dataRetorno");
	
		Cliente cliente = new  Cliente();
		cliente.setId(Integer.valueOf(clienteid));
	
		Emprestimo emprestimo = new Emprestimo(
            Integer.valueOf(id),
             Integer.valueOf(livroid), 
             Integer.valueOf(clienteid),
             LocalDateTime.now(),
             LocalDateTime.now().plusDays(7));
		
		EmprestimoController controller = new EmprestimoController();
		controller.realizarEmprestimo(Integer.valueOf(livroid), Integer.valueOf(clienteid));
		
		JOptionPane.showMessageDialog(null, "Cadastrado");
		
	}
}