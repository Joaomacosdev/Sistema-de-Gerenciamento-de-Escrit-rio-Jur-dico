package br.com.juridico.advogados;

public class Advogado {
    private static int contador = 0;
    private int id;
    private String nome;
    private int numeroOAB;
    private String especialidade;

    public Advogado(String nome, int numeroOAB, String especialidade) {
        this.id = ++contador;
        this.nome = nome;
        this.numeroOAB = numeroOAB;
        this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroOAB() {
        return numeroOAB;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
