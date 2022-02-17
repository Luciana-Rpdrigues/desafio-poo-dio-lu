package br.com.dio.desafio.dominio;

public abstract class Conteudo { // quando a classe é abstract não conseguimos estanciar o objeto conteído. Para implementar os atributos e o método CalcularXp nas classes filhas(herança)

    protected static final double XP_PADRAO = 10; //protected: Só filho acessa.static: .final: constante. double:recebe caracter grande.

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
