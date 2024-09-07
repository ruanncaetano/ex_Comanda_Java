package entidades;

import java.lang.String;
public class Produto {
    private int cod;
    private String nome;
    private double preco;
    private int estoque;
    private Tipo tipo;
    // contrutores


    public Produto(int cod, String nome, double preco, int estoque, Tipo tipo) {
       setCod(cod);
       setNome(nome);
       setPreco(preco);
       setEstoque(estoque);
       setTipo(tipo);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nome;
    }
}
