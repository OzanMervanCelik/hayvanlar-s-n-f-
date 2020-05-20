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
public class Hayvan {
    private String cinsi;
    public int ayaksayisi;
    public String kuyrugasahipolma ;
    private String ucabiliyormu; 
    private int agirlik;
    
    Hayvan () {
        kuyrugasahipolma ="var";
        ayaksayisi =4;
        ucabiliyormu="hayır";
            }
    public void ozellikyazdir(String cinsi, int ayaksayisi,String kuyrugasahipolma,String ucabiliyormu){
        
        System.out.println("Cinsi:"+cinsi+"  "+"Ayak sayısı :"+ayaksayisi+"  "+"Kuyruk: "+kuyrugasahipolma+"  "+"Uçabiliyor mu: "+ucabiliyormu);
    
    }
    public void beslenme(){
        System.out.println("Hayvanlar beslenir");
    }
    
    public void barinma(){
        System.out.println("Hayvanlar Barınır");
    }
    
    
    private void boyut(){
        System.out.println("Hayvanların Boyutları vardır");
    }
    
    public void solunum(){
        System.out.println("Hayvanlar Solunum yapar");
    }
    
}
