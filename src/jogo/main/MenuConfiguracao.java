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
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha a nova dificuldade (Fácil, Médio, Difícil): ");
                    String dificuldade = sc.nextLine();
                    config.setDificuldade(dificuldade);
                    break;

                case 2:
                    System.out.println("Ativar ou desativar som? (1 para ativar, 0 para desativar): ");
                    int som = sc.nextInt();
                    config.setSomAtivado(som == 1);
                    System.out.println("Som agora está " + (config.isSomAtivado() ? "Ativado" : "Desativado"));
                    break;

                case 3:
                    System.out.print("Escolha o modo de jogo (Dia, Noite): ");
                    String modo = sc.nextLine();
                    config.setModoJogo(modo);
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

