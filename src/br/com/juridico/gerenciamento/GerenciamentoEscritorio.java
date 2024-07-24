package br.com.juridico.gerenciamento;

import br.com.juridico.advogados.Advogado;
import br.com.juridico.audiencias.Audiencia;
import br.com.juridico.casos.Caso;
import br.com.juridico.clientes.Cliente;

import java.util.*;

public class GerenciamentoEscritorio {
    private Map<Integer, Cliente> clientes = new HashMap();
    private Map<Integer, Advogado> advogados = new HashMap<>();
    private Map<Integer, Caso> casos = new HashMap<>();
    private Map<Integer, Audiencia> audiencias = new HashMap<>();

    public GerenciamentoEscritorio() {
        this.clientes = new HashMap<>();
        this.advogados = new HashMap<>();
        this.casos = new HashMap<>();
        this.audiencias = new HashMap<>();
    }

    public Map<Integer, Cliente> getClientes() {
        return clientes;
    }

    public Map<Integer, Advogado> getAdvogados() {
        return advogados;
    }

    public Map<Integer, Caso> getCasos() {
        return casos;
    }

    public Map<Integer, Audiencia> getAudiencias() {
        return audiencias;
    }

    public void adicionarCliente(Cliente cliente){
        clientes.put(cliente.getId(), cliente);
    }

    public void adicionarAdvogado(Advogado advogado){
        advogados.put(advogado.getId(), advogado);
    }

    public void registrarCaso(Caso caso){
        casos.put(caso.getId(), caso);
    }

    public void agendarAudiencia(Audiencia audiencia){
        audiencias.put(audiencia.getId(), audiencia);
    }

    public void listarClientes(){
        if(clientes.values().isEmpty()){
            System.out.println("Não há clientes cadastrados");
        } else {
            for (Cliente cliente : clientes.values()){
                System.out.println("ID: " + cliente.getId() + ", Nome: " + cliente.getNome() + ", Email: " + cliente.getEmail() + ", Telefone: " + cliente.getTelefone());
            }
        }
    }

    public void listarAdvogados(){
        if(advogados.values().isEmpty()){
            System.out.println("Não há advogados cadastrados");
        } else {
            for(Advogado advogado : advogados.values()){
                System.out.println("ID: " + advogado.getId() + ", Nome: " + advogado.getNome() + ", Especialidade: " + advogado.getEspecialidade() + ", Numero OAB: " + advogado.getNumeroOAB());
            }
        }
    }

    public void listarCasos(){
        if (casos.values().isEmpty()){
            System.out.println("Não há casos cadastrados");
        } else {
            for (Caso caso : casos.values()){
                System.out.println("ID: " + caso.getId() + ", Cliente: " + caso.getCliente() + ", Advogado: " + caso.getAdvogado() + ", Titulo: " + caso.getTitulo() + ", Descrição: " + caso.getDescricao() + ", Status: " + caso.getStatus());
            }
        }
    }

    public void listarAudiencias(){
        if(audiencias.values().isEmpty()){
            System.out.println("Não há audiências cadastrada");
        } else {
            for(Audiencia audiencia : audiencias.values()){
                System.out.println("ID: " + audiencia.getId() + ", Data: " + audiencia.getData() + ", Local: " + audiencia.getLocal() + ", Caso: " + audiencia.getLocal());
            }
        }
    }

    public void ordenarClientePorNome(){
        List<Cliente> listarCliente = new ArrayList<>(clientes.values());
        listarCliente.sort(Comparator.comparing(Cliente::getNome));
        for(Cliente cliente : listarCliente){
            System.out.println("ID: " + cliente.getId() + ", Nome: " + cliente.getNome());
        }
    }

    public void ordenarAdvogadosPorEspecialidade(){
        List<Advogado> listarAdvogados = new ArrayList<>(advogados.values());
        listarAdvogados.sort(Comparator.comparing(Advogado::getEspecialidade));
        for(Advogado advogado : listarAdvogados){
            System.out.println("ID: " + advogado.getId() + ", Especialidade: " + advogado.getEspecialidade());
        }
    }

    public void ordenarCasosPorTitulo(){
        List<Caso> listasCasos = new ArrayList<>(casos.values());
        listasCasos.sort(Comparator.comparing(Caso::getTitulo));
        for(Caso caso : listasCasos){
            System.out.println("ID: " + caso.getId() + ", Titulo: " + caso.getTitulo());
        }
    }

    public void ordenarCasosPorStatus(){
        List<Caso> listarCasos = new ArrayList<>(casos.values());
        listarCasos.sort(Comparator.comparing(Caso::getStatus));
        for (Caso caso : listarCasos){
            System.out.println("ID: " + caso.getId() + ", Status: " + caso.getStatus());
        }
    }

    public void ordenarAudienciaPorData(){
        List<Audiencia> listarAudiencias = new ArrayList<>(audiencias.values());
        listarAudiencias.sort(Comparator.comparing(Audiencia::getData));
        for(Audiencia audiencia : listarAudiencias){
            System.out.println("ID: " + audiencia.getId() + ", Data: " + audiencia.getData());
        }
    }
}
