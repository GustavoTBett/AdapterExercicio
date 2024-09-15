package org.gustavotbett.exercicio2;

public class ClientRectangle {
    private Long width;
    private Long height;

    public ClientRectangle(Long width, Long height) {
        this.width = width;
        this.height = height;
    }

    public Long getHeight() {
        return height;
    }

    public Long getWidth() {
        return width;
    }

    public void displayRectangle() {
        System.out.println("Desenhando um retangulo de " + width + " x " + height);
    }
}
