/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author Guille
 */
public class Garaxe {
    private Coche[] plzs = new Coche[4];
    
    public void entrarGaraxe(Coche c){
        for(int i=0; i<= 5;i++){
            if((plzs[i])==null){
                plzs[i]=c;
                break;
            }else if(i==5){
                JOptionPane.showMessageDialog(null,"COMPLETO");
            }
        }
    }
    
    public void sairGaraxe(Coche z){
        String mb = JOptionPane.showInputDialog("Introduce a matricula do coche que quere sair");
        int f1,f2,T;
        String mc=null;
        for(int i=0; i<=5;i++){
            mc=plzs[i].getMatricula();
            if(mc.equals(mb)){
                f1=plzs[i].getHent();
                f2=plzs[i].getHsal();
                T=f2-f1;
                factura(T,plzs[i].getMatricula());
                plzs[i]=null;
            }
        }
    }
    
    public void factura(int tiempo,String matri){
        double apagar,Reci;
        if(tiempo<=3){
            apagar = 1.5;
        }else{
            apagar = 1.5+(0.2*(tiempo-3));
        }
        Reci=Double.parseDouble(JOptionPane.showInputDialog("Ten que pagar" + apagar));
        JOptionPane.showMessageDialog( null, "FACTURA\n MATRICUAL:"+matri+"\nTEMPO:"+tiempo+" horas \nPRECIO:"+apagar+"\nCARTOS RECIBIDOS:"+Reci+"\nCARTOS DEVOLTOS:"+(Reci-apagar)+"\n \n GRAZASPOR USAR O NOSO APARCODIRO" );
    }
}
