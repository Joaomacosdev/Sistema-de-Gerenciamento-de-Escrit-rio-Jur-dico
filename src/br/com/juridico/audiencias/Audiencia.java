package br.com.juridico.audiencias;

import br.com.juridico.casos.Caso;

public class Audiencia {
    private static int contador = 0;
    private int id;
    private String data;
    private String local;
    private Caso caso;

    public Audiencia(String data, String local, Caso caso) {
        this.id = id;
        this.data = data;
        this.local = local;
        this.caso = caso;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public Caso getCaso() {
        return caso;
    }
}
