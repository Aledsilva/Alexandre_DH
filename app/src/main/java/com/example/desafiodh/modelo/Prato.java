package com.example.desafiodh.modelo;

public class Prato {

    private int imagem;
    private String prato;

    public Prato() {
    }

    public Prato(int imagem, String prato) {
        this.imagem = imagem;
        this.prato = prato;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }
}
