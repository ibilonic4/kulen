/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Kulen;
import ffos.model.Mjesto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ivor
 */
public class ObradaKulena extends Obrada<Kulen> {

      public void SetData(String broj, String datum){
    
    if(getEntitet()==null){
    Kulen k = new Kulen();
    SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
    try{
    k.setBroj(Integer.parseInt(broj));
    k.setDatum((Date)df.parse(datum));
    } catch(ParseException ex){}
        setEntitet(k);
    }else {
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
        try{
    getEntitet().setBroj(Integer.parseInt(broj));
    getEntitet().setDatum((Date)df.parse(datum));}catch(ParseException ex){}
    }
    
    
    }
    
        public List<Kulen> read(){
    return session.createQuery("from Kulen").list();
    }
    
    
    @Override
    public void kontrolaCreate() throws Exception {
    }

    @Override
    public void kontrolaUpdate() throws Exception {
    }

    @Override
    public void kontrolaDelete() throws Exception {
    }
    
}
