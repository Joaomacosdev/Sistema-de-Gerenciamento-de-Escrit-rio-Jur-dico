import br.com.juridico.advogados.Advogado;
import br.com.juridico.audiencias.Audiencia;
import br.com.juridico.casos.Caso;
import br.com.juridico.clientes.Cliente;
import br.com.juridico.gerenciamento.GerenciamentoEscritorio;

import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciamentoEscritorio gerenciamento = new GerenciamentoEscritorio();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Adicionar Advogado");
            System.out.println("3. Adicionar Casos");
            System.out.println("4. Agendar Audiência");
            System.out.println("5. Listar Clientes");
            System.out.println("6. Listar Advogados");
            System.out.println("7. Listar Casos");
            System.out.println("8. Listar Audiências");
            System.out.println("9. Ordenar Clientes por Nome");
            System.out.println("10. Ordenar Advogados por Nome");
            System.out.println("11. Ordenar Casos por Título");
            System.out.println("12. Ordenar Casos por Status");
            System.out.println("13. Ordenar Audiências por Data");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n");

            switch (opcao){
                case 1:
                    System.out.println("Nome: ");
                    String nomeCliente = scanner.next();
                    System.out.println("Email: ");
                    String emailCliente = scanner.next();
                    System.out.println("Telefone: ");
                    String telefoneCliente = scanner.next();
                    Cliente cliente = new Cliente(nomeCliente, emailCliente, telefoneCliente);
                    gerenciamento.adicionarCliente(cliente);
                    System.out.println("Cliente cadastrado com sucesso");
                    break;
                case 2:
                    System.out.println("Nome: ");
                    String nomeAdvogado = scanner.next();
                    System.out.println("Número OAB");
                    int numeroOAB = scanner.nextInt();
                    System.out.println("Especialidade: ");
                    String especialidade = scanner.next();
                    Advogado advogado = new Advogado(nomeAdvogado, numeroOAB, especialidade);
                    gerenciamento.adicionarAdvogado(advogado);
                    System.out.println("Advogado cadastrado com sucesso");
                    break;
                case 3:
                    System.out.println("Titulo do caso: ");
                    String tituloCaso = scanner.next();
                    System.out.println("Descrição do caso");
                    String descricaoCaso = scanner.next();
                    System.out.println("Status do caso");
                    String status = scanner.next();
                    System.out.println("ID do cliente: ");
                    int idClienteCaso = scanner.nextInt();
                    Cliente clienteCaso = gerenciamento.getClientes().get(idClienteCaso);
                    System.out.println("ID do advogados: ");
                    int idAdvogado = scanner.nextInt();
                    Advogado advogadoCaso = gerenciamento.getAdvogados().get(idAdvogado);
                    if(clienteCaso != null && advogadoCaso != null){
                     Caso caso = new Caso(tituloCaso, descricaoCaso, status, clienteCaso, advogadoCaso);
                     gerenciamento.registrarCaso(caso);
                        System.out.println("Caso registrado com sucesso");
                    } else {
                        if(clienteCaso == null){
                            System.out.println("Cliente não econtrado!");
                        }
                        if(advogadoCaso == null){
                            System.out.println("Advogado não econtrado!");
                        }
                    }

                case 4:
                    System.out.print("Data (timestamp): ");
                    String  dataTimestamp = scanner.next();
                    System.out.println("Local da audiência");
                    String local = scanner.nextLine();
                    System.out.print("ID do Caso: ");
                    int idCasoAudiencia = scanner.nextInt();
                    Caso casoAudiencia = gerenciamento.getCasos().get(idCasoAudiencia);
                    if(casoAudiencia != null){
                        Audiencia audiencia = new Audiencia(dataTimestamp, local, casoAudiencia);
                        gerenciamento.agendarAudiencia(audiencia);
                        System.out.println("Cado registrado com sucesso");
                    } else {
                        System.out.println("Não há caso registrado");
                    }
                    break;
                case 5:
                    System.out.println("Clientes: ");
                    gerenciamento.listarClientes();
                    break;
                case 6:
                    System.out.println("Advogados ");
                    gerenciamento.listarAdvogados();
                    break;
                case 7:
                    System.out.println("Casos: ");
                    gerenciamento.listarCasos();
                    break;
                case 8:
                    System.out.println("Audiências");
                    gerenciamento.listarAudiencias();
                    break;
                case 9:
                    System.out.println("Clientes ordenados por nome");
                    gerenciamento.ordenarClientePorNome();
                    break;
                case 10:
                    System.out.println("Advogados ordenados por especialidade");
                    gerenciamento.ordenarAdvogadosPorEspecialidade();
                    break;
                case 11:
                    System.out.println("Casos ordenados por titulo");
                    gerenciamento.ordenarCasosPorTitulo();
                    break;
                case 12:
                    System.out.println("Casos ordenados por Status");
                    gerenciamento.ordenarCasosPorStatus();
                    break;
                case 13:
                    System.out.println("Audiência ordenada por data");
                    gerenciamento.ordenarAudienciaPorData();
                    break;

            }
        } while (opcao != 0);

        scanner.close();
    }
}