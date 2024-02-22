/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uyg_statik;

/**
 *
 * @author canat
 */
public class Uyg_statik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      statik_ornek s1=new statik_ornek();
      statik_ornek s2=new statik_ornek();
      
      s1.atama_a(6);
      statik_ornek.atama_statik_a(5);
      s2.atama_a(10);
      s2.atama_a(7);
        System.out.println("S1 a="+s1.oku_a());
        System.out.println("S1 statik a=" + s1.oku_statik_a());
        System.out.println("S2 a= "+s2.oku_a());
        System.out.println("S2 statik a="+s2.oku_statik_a());
        
    }
    
}
