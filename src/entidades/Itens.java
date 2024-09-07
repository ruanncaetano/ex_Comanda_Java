package entidades;

public class Itens {
    private int qntd;
    private double preco;
    private Produto p;

    // construtores
    public Itens(Produto p,int qntd)
    {
        setP(p);
        setQntd(qntd);
        setPreco(p,qntd);
    }



    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(Produto p,int qntd) {
        this.preco = qntd * p.getPreco();
    }

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }
}
