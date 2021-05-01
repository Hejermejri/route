/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author hejer
 */
public class film {
    private String idFilm,titre;
    private int duréemaxlocation;
    
    
    public film(String idFilm,String titre,int duréemaxlocation){
        this.idFilm=idFilm;
        this.titre=titre;
        this.duréemaxlocation=duréemaxlocation;
    }
    
    public String getTitre(){
        return this.titre;
    }
    
    public int getduréemaxlocation(){
        return this.duréemaxlocation;
    }
}
