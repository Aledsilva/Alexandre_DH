package com.example.desafiodh;

public class Restaurante {

    private int imagem;
    private String nome;
    private String endereco;
    private String horario;


    public Restaurante(int imagem, String nome, String endereco, String horario) {
        this.imagem = imagem;
        this.nome = nome;
        this.endereco = endereco;
        this.horario = horario;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
