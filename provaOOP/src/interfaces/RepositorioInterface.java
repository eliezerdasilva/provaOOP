package interfaces;

import java.util.List;

public interface RepositorioInterface {
    
    public void salvar();
    public void excluir();
    public List<Object> listarTodos();
}
