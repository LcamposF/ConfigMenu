package jogo.main;

import java.util.Scanner;

public class MenuConfiguracao {

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        Configuracao config = Configuracao.getInstance(); // Obtém a instância do Singleton

        while (true) {

            if (config.isSomAtivado()) {
                new Thread(() -> Som.tocarSom("strangerthings.wav")).start();
            }

            System.out.println("======== MENU DE CONFIGURAÇÃO ========");
            System.out.println("1. Alterar Dificuldade (Atual: " + config.getDificuldade() + ")");
            System.out.println("2. Alternar Efeitos Sonoros (Atual: " + (config.isSomAtivado() ? "Ativado" : "Desativado") + ")");
            System.out.println("3. Alterar Modo de Jogo (Atual: " + config.getModoJogo() + ")");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Escolha a nova dificuldade:");
                    System.out.println("1. Fácil");
                    System.out.println("2. Médio");
                    System.out.println("3. Difícil");
                    System.out.print("Digite a opção desejada: ");

                    int escolhaDificuldade = sc.nextInt();
                    sc.nextLine();

                    switch (escolhaDificuldade) {
                        case 1:
                            config.setDificuldade("Fácil");
                            break;
                        case 2:
                            config.setDificuldade("Médio");
                            break;
                        case 3:
                            config.setDificuldade("Difícil");
                            break;
                        default:
                            System.out.println("Opção inválida. Dificuldade não alterada.");
                    }
                    break;

                case 2:
                    System.out.println("Ativar ou desativar som? (1 para ativar, 0 para desativar): ");
                    int som = sc.nextInt();
                    config.setSomAtivado(som == 1);
                    System.out.println("Som agora está " + (config.isSomAtivado() ? "Ativado" : "Desativado"));
                    break;

                case 3:

                    System.out.println("Escolha o modo de jogo:");
                    System.out.println("1. Dia");
                    System.out.println("2. Noite");
                    System.out.print("Digite a opção desejada: ");

                    int escolhaModo = sc.nextInt();
                    sc.nextLine();

                    switch (escolhaModo) {
                        case 1:
                            config.setModoJogo("Dia");
                            break;
                        case 2:
                            config.setModoJogo("Noite");
                            break;
                        default:
                            System.out.println("Opção inválida. Modo de jogo não alterado.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo... Configurações salvas!");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void main(String[] args) {
        mostrarMenu();
    }
}
