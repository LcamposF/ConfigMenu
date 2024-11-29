package jogo.main;

import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;

public class Som {

    public static void tocarSom(String caminhoDoArquivo) {
        try {
            // Carregar o arquivo de som como um recurso
            InputStream somStream = Som.class.getClassLoader().getResourceAsStream(caminhoDoArquivo);

            if (somStream == null) {
                throw new IllegalArgumentException("Arquivo de som não encontrado: " + caminhoDoArquivo);
            }

            // Criar o áudio a partir do stream
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(somStream);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            // Tocar o som
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
            System.out.println("Erro ao reproduzir o som: " + caminhoDoArquivo);
        }
    }
}

