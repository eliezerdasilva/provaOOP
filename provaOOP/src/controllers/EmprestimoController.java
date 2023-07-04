package controllers;

import java.time.LocalDateTime;
import java.util.List;

import enums.StatusReserva;
import models.Emprestimo;
import models.Livro;
import repository.EmprestimoRespository;
import repository.LivroRepository;

public class EmprestimoController {
    
    private EmprestimoRespository emprestimoRepo;
    private LivroRepository livroRepo;

    public EmprestimoController(EmprestimoRespository empRepo, LivroRepository livroRepo) {
        this.emprestimoRepo = empRepo;
        this.livroRepo = livroRepo;
    }

    public void realizarEmprestimo(int livroId, int clienteId) {
        Emprestimo e = new Emprestimo(listarTodos().size() + 1, livroId, clienteId, LocalDateTime.now(), LocalDateTime.now().plusDays(7));
        emprestimoRepo.cadastrar(e);

        Livro livro = livroRepo.buscarPorId(livroId);

        livro.setStatusReserva(StatusReserva.RESERVADO);

    }

    public void registrarDevolucao(Emprestimo e) {
        int livroId = e.getlivroId();

        Livro livro = livroRepo.buscarPorId(livroId);

        livro.setStatusReserva(StatusReserva.DISPONIVEL);
    }

    public List<Emprestimo> listarTodos() {
        List<Emprestimo> emprestimos = emprestimoRepo.listEmprestimo();

        return emprestimos;
    }


}
