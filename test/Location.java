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
public class Location implements ISystemeAlerte{
    private String nomclient;
    private int idloc;
    private film filmLoué;
    private DateLocation datelocation;
    
    public Location(int idloc,String nomclient ,film filmLoué,DateLocation datelocation )
    {
        this.idloc=idloc;
        this.nomclient=nomclient;
        this.filmLoué=filmLoué;
        this.datelocation=datelocation;
    }
    
    public int notrejoursretard(){
        return (this.filmLoué.getduréemaxlocation()-this.datelocation.ecartenjour(datelocation));
    }
    
    public String getDescription(){
        return "id="+this.idloc+" le nom du client "+this.nomclient+" le titre "+this.filmLoué.getTitre()
                +" la duréé maximale de location est "+this.filmLoué.getduréemaxlocation();
    }
}
