/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author hejer
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        film f1=new film("f1","batman",4);
        DateLocation d1=new DateLocation(1,2016);
        film f2=new film("f2","rissala",3);
        DateLocation d2=new DateLocation(2,2016);
        Location L1=new Location (1,"cherif",f1,d1);
        Location L2=new Location (9,"toumi",f2,d2);
        Videotheque MyCinema=new Videotheque("MyCinema",1);
        ArrayList<Location> l=new ArrayList<Location>();
        l.add(L1);
        l.add(L2);
        MyCinema.affichetoutelocationhorsdelais();
        
        
        
    }
    
}
