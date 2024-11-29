package jogo.main;

public class Jogo {
    public static void main(String[] args) {
        // Antes de iniciar o jogo, mostramos o menu de configuração
        MenuConfiguracao.mostrarMenu();

        // Agora podemos usar as configurações definidas no Singleton

        Configuracao config = Configuracao.getInstance();
        System.out.println("\nConfigurações finais do jogo:");
        System.out.println("Dificuldade: " + config.getDificuldade());
        System.out.println("Som " + (config.isSomAtivado() ? "Ativado" : "Desativado"));
        System.out.println("Modo jogo " + config.getModoJogo());
    }
}
