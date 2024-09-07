package entidades;

import java.net.spi.InetAddressResolver;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comanda {
    private int idCom;
    private Date dataCom;
    private String Cli;
    private List<Itens> ProdConsumido= new ArrayList<>(); // instaica no construtor

    public Comanda()
    {}
    public Comanda(String NomeCli,int cod)
    {
        setIdCom(cod);
        setDataCom();
        setCli(NomeCli);
    }
    public void addProd(Produto prod,int q)
    {
        ProdConsumido.add(new Itens(prod,q));
    }
    public Itens removeProd()
    {
        Itens p = ProdConsumido.getLast();
        ProdConsumido.removeLast();
        return p;
    }
    public double Tot()
    {
        double soma=0;
        for (Itens i: ProdConsumido)
        {
            soma+=i.getPreco();
        }
        return soma;
    }
    public int getIdCom() {
        return idCom;
    }
    public void setIdCom(int idCom) {
        this.idCom = idCom;
    }
    public Date getDataCom() {
        return dataCom;
    }
    public void setDataCom() {
        dataCom = new Date();
    }

    public String getCli() {
        return Cli;
    }
    public void setCli(String cli) {
        Cli = cli;
    }
    public String teste()
    {
        String t=ProdConsumido.toString();
        return t;
    }
}
