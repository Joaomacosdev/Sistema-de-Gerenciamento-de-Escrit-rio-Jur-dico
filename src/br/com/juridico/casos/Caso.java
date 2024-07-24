package br.com.juridico.casos;

import br.com.juridico.advogados.Advogado;
import br.com.juridico.clientes.Cliente;

public class Caso {
    private static int contador = 0;
    private int id;
    private String titulo;
    private String descricao;
    private String status;
    private Cliente cliente;
    private Advogado advogado;

    public Caso(String titulo, String descricao, String status, Cliente cliente, Advogado advogado) {
        this.id = ++contador;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.cliente = cliente;
        this.advogado = advogado;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
