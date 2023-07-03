package models;

public class Cliente {
    
    private int id;
    private String nome;

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
