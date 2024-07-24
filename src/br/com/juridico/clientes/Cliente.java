package br.com.juridico.clientes;

public class Cliente {
    private static int contador = 0;
    private int id;
    private String nome;
    private String email;
    private String telefone;

    public Cliente(String nome, String email, String telefone) {
        this.id = ++contador;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
