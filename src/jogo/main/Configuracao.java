package jogo.main;

public class Configuracao {
    private String dificuldade;
    private boolean somAtivado;
    private String modoJogo;

    // Instância única (Singleton)
    private static Configuracao instance;

    // Construtor privado para evitar instâncias fora da classe
    private Configuracao (){
        this.dificuldade = "Fácil";
        this.somAtivado = true;
        this.modoJogo = "Dia";
    }

    // Método para obter a instância única (Singleton)
    public static Configuracao getInstance(){
        if (instance == null) {
            instance = new Configuracao();
        }
        return instance;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public boolean isSomAtivado() {
        return somAtivado;
    }

    public void setSomAtivado(boolean somAtivado) {
        this.somAtivado = somAtivado;
    }

    public String getModoJogo() {
        return modoJogo;
    }

    public void setModoJogo(String modoJogo) {
        this.modoJogo = modoJogo;
    }
}

