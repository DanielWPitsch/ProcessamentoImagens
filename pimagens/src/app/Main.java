package app;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        BufferedImage imagem = ManipulaImg.abrirImagem("arara.jpeg");
        ManipulaImg.exibirImagem(imagem);

        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        for(int h=0; h<altura; h++){
            for(int w=0; w<largura; w++){
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                System.out.println(red+" "+green+ " "+blue);
            }
        }
    }
}