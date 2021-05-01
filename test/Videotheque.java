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
import java.util.ArrayList;
public class Videotheque {
    private String nomvideotheque;
    private int numSemaineLocation;
    private ArrayList<Location> tabLocation;
    
    public Videotheque(String nomvideotheque,int numSemaineLocation)
    {
        this.nomvideotheque=nomvideotheque;
        this.numSemaineLocation=numSemaineLocation;
        this.tabLocation=new ArrayList<Location>();
    }
    public ArrayList<Location> lesLocationhorsDelais(){
        ArrayList<Location> l=new ArrayList<Location>();
        int j;
        j=tabLocation.size();
        for(int i=0;i<j;i++){
            if(this.tabLocation.get(i).notrejoursretard()>0)
                    {
                        l.add(tabLocation.get(i));
                    }
        }
        return l;
    }
    public void affichetoutelocationhorsdelais(){
        for(int i=0;i<l.size();i++){
            System.out.println();
        }
        
    } 
}
