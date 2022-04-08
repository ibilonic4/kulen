/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.model;
import com.sun.istack.NotNull;
import ffos.model.Entitet;
import javax.persistence.Entity;
/**
 *
 * @author Ivor
 */
@Entity
public class Mesar extends Entitet {
    @NotNull
    private String ime;
    private String prezime;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
return ime + " " + prezime;    }
    
    
    
}
