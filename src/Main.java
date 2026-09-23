import java.util.ArrayList;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("==============================");
                System.out.println("       MEU AGENTE");
                System.out.println("==============================");

                System.out.print("Digite o nome do seu agente: ");
                String nome = scanner.nextLine();

                System.out.print("Qual será o objetivo do agente? ");
                String objetivo = scanner.nextLine();

                System.out.print("Qual é o seu perfil? ");
                String perfil = scanner.nextLine();

                Agente agente = new Agente (nome, objetivo, perfil);

                ArrayList<Tarefa> tarefas = new ArrayList<>();

                int opcao;

                do {

                    System.out.println("\n==============================");
                    System.out.println("Olá! Eu sou " + agente.getNome());
                    System.out.println("==============================");

                    System.out.println("1 - Conversar com o agente");
                    System.out.println("2 - Adicionar tarefa");
                    System.out.println("3 - Ver tarefas");
                    System.out.println("4 - Ver perfil do agente");
                    System.out.println("0 - Sair");

                    System.out.print("\nEscolha uma opção: ");
                    opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {

                        case 1:

                            System.out.print("\nVocê: ");
                            String mensagem = scanner.nextLine();

                            agente.responder(mensagem);

                            break;

                        case 2:

                            System.out.print("\nDigite a tarefa: ");
                            String descricao = scanner.nextLine();

                            System.out.print("Digite a prioridade (Alta/Média/Baixa): ");
                            String prioridade = scanner.nextLine();

                            Tarefa tarefa = new Tarefa(descricao, prioridade);

                            tarefas.add(tarefa);

                            System.out.println("\nTarefa adicionada com sucesso!");

                            break;

                        case 3:

                            System.out.println("\n===== MINHAS TAREFAS =====");

                            if (tarefas.isEmpty()) {
                                System.out.println("Nenhuma tarefa cadastrada.");
                            } else {

                                for (int i = 0; i < tarefas.size(); i++) {

                                    System.out.print((i + 1) + " - ");
                                    tarefas.get(i).mostrarTarefa();
                                }
                            }

                            break;

                        case 4:

                            agente.apresentar();

                            break;

                        case 0:

                            System.out.println("\nAté logo!");

                            break;

                        default:

                            System.out.println("\nOpção inválida!");

                    }


                } while (opcao != 0);

                scanner.close();
            }
        }