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
import java.util.Date;
public class DateLocation {
    private int numjourannee;
    private int annee;
    
    public DateLocation(int numjourannee,int annee){
        this.numjourannee=numjourannee;
        this.annee=annee;
        
    }
    public int ecartenjour(DateLocation d){
        return (this.numjourannee-d.numjourannee);
    }
    
    public static DateLocation aujourdhui(){
        return ;
    }
}
