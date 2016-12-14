/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;
import java.util.Date;

/**
 *
 * @author Guille
 */
public class Coche {
    private String matricula;
    private int Hent,Hsal;
    
public Coche(String matricula, int Hent, int Hsal) {
        this.matricula = matricula;
        this.Hent = Hent;
        this.Hsal = Hsal;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getHent() {
        return Hent;
    }

    public void setHent(int Hent) {
        this.Hent = Hent;
    }

    public int getHsal() {
        return Hsal;
    }

    public void setHsal(int Hsal) {
        this.Hsal = Hsal;
    }

    

  
}
