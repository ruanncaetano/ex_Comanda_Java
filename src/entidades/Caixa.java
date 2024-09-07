package entidades;

import java.util.ArrayList;
import java.util.List;

public class Caixa {

    private List<Comanda> controle= new ArrayList<>();

    public Comanda NovaComa(String NomeCli,int Cod)
    {
        Comanda c=new Comanda(NomeCli,Cod);
        controle.add(c);
        return c;
    }
    public Comanda getComanda(int idCom)
    {
        for (Comanda c: controle)
        {
            if(c.getIdCom()==idCom)
            {
                return c;
            }
        }
        return null;
    }
    public double pagar(int idCom,double valor)
    {
        Comanda c = getComanda(idCom);
        if(valor == c.Tot())
        {
            return 0.0;
        }
        else
        {
            return valor-c.Tot(); // troco
        }
    }

    public StringBuilder mostraBonito(int idCom)
    {

        Comanda c= getComanda(idCom);
        String t= c.teste().toString();
        StringBuilder m = new StringBuilder(
                "Codigo: "+c.getIdCom() +"\n"+
                "Nome do Cliente: "+c.getCli()+"\n"+
                        "Valor Total: "+c.Tot()+"\n"
        );
        return m;
    }
}
