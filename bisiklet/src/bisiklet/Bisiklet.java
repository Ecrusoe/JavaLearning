/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bisiklet;

/**
 *
 * @author canat
 */
public class Bisiklet {

    /**
     * @param args the command line arguments
     */
    int pedal_cevrimi= 0;
    int hiz= 0; 
    int vites= 1;
    void pedal_cevrimi_degistir(int yeni_deger)
    { pedal_cevrimi= yeni_deger; }
    void vites_degistir(int yeni_deger)
    { vites= yeni_deger; }
    void hizlan(int artis)
    { hiz= hiz+ artis;   }
    void frene_bas(int azaltim) 
    { hiz= hiz-azaltim; }
    void durumu_yaz() 
    { System.out.println("pedal cevrimi:"+pedal_cevrimi+" hiz:"+hiz+"vites"+vites); }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
