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
public class Mjesto extends Entitet {
    
    @NotNull
    private String naziv;
    private Integer postanskiBroj;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(Integer postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    @Override
    public String toString() {
return naziv + " "+ postanskiBroj;    }
    
    
    
}
