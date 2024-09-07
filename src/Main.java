import entidades.*;

import javax.swing.*;
import javax.swing.text.html.parser.Parser;


public class Main {
    public static void main(String[] args) {
        int[] IdComanda=new int[10];
        Produto[] estoque=new Produto[5];
        estoque[0]=new Produto(1,"Coca cola 300ml",4.5,90,Tipo.BEBIDA);
        estoque[1]=new Produto(2,"Suco limão",6.5,10,Tipo.BEBIDA);
        estoque[2]=new Produto(3,"Quibe",8.0,10,Tipo.SALGADO);
        estoque[3]=new Produto(4,"Coxinha",4.50,15,Tipo.SALGADO);
        estoque[4]=new Produto(5,"Brigadeiro",2.75,35,Tipo.DOCE);

        Caixa caixa=new Caixa();
        JOptionPane.showMessageDialog(null,"Iten e Caixa pré-Instanciados");
        if(JOptionPane.showConfirmDialog(null,"Nova Comanda","Caixa",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {

            Comanda comanda1=caixa.NovaComa(JOptionPane.showInputDialog("Nome do Cliente"),Integer.parseInt(JOptionPane.showInputDialog("Codigo da Comanda")));
            while (JOptionPane.showConfirmDialog(null,"Novo Produto","Produtos",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                Produto pAux = (Produto) JOptionPane.showInputDialog(null, "Escolha um Produto", "Novo Produtoo",
                        JOptionPane.INFORMATION_MESSAGE, null, estoque, estoque[0]);
                comanda1.addProd(pAux, Integer.parseInt(JOptionPane.showInputDialog("Quantidade")));
            }

            JOptionPane.showMessageDialog(null,"Valor a pagar: "+comanda1.Tot(),"Total da Coamanda"
                    ,JOptionPane.INFORMATION_MESSAGE);



            // pagamento
              String[] p= new String[2];
            p[0]= new String("Cartao");
            p[1]= new String("Dinheiro");
            String op = String.valueOf(JOptionPane.showInputDialog(null,"Forma de pagamento","pagamento",
                    JOptionPane.INFORMATION_MESSAGE, null,p,p[0]));
            if(op.equals("Cartao"))
            {
                caixa.pagar(comanda1.getIdCom(), comanda1.Tot());
            }
            else
            {
                double din= Double.parseDouble( JOptionPane.showInputDialog(null,"Valor Rebido","Dinheiro"
                    ,JOptionPane.INFORMATION_MESSAGE));
                JOptionPane.showMessageDialog(null,"Troco: "+caixa.pagar(comanda1.getIdCom(),din),"Dinheiro"
                        ,JOptionPane.INFORMATION_MESSAGE);

            }

            JOptionPane.showMessageDialog(null,"=== Nota ===\n"+ caixa.mostraBonito(comanda1.getIdCom()),"Finalizar",JOptionPane.INFORMATION_MESSAGE);

        }



// Aluno: Ruan Costa Caetano da Silva
// R.A: 262319080



    }
}