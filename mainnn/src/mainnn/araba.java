/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainnn;

/**
 *
 * @author canat
 */
public class araba {
    public String marka;
    public int silindir_hacmi;
    public int vergi_hesapla(int sHacmi){
        silindir_hacmi=sHacmi;
        int vergi=0;
        if(sHacmi<=1300)vergi=1200;
        else if(sHacmi<=1600)vergi=1500;
          else if(sHacmi<=1800)vergi=2000;
          else if(sHacmi<=2000)vergi=2300;
          else if(sHacmi<=2500)vergi=3000;
          else if(sHacmi<=3000)vergi=3750;
          else if(sHacmi<=3500)vergi=5700;
          else if(sHacmi<=4000)vergi=8900;
          else if(sHacmi>4000)vergi=15000;
        
        return vergi;
    }
    
}
