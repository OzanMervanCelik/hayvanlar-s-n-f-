/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malgoritma2;

/**
 *
 * @author ASUS
 */

public class Kopek extends Hayvan{
    
    
    public void havlama(){
        System.out.println("Köpekler havlar");
    }
    private void eğitilir(){
        System.out.println("Köpekler kolay eğitilir");
    }
    public void evcillesme(){
        System.out.println("Köpekler evcilleşebilir");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Hayvan anasınıftannesneolustur=new Hayvan();
        anasınıftannesneolustur.beslenme();
        anasınıftannesneolustur.barinma();
        anasınıftannesneolustur.solunum();
        anasınıftannesneolustur.ozellikyazdir("Köpek", 4, "Var", "Hayır");
        Kopek türetilmissınıftannesneolustur=new Kopek();
        türetilmissınıftannesneolustur.havlama();
        türetilmissınıftannesneolustur.eğitilir();
        
        
        
    }
    
}
