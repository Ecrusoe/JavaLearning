/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uyg_erisim;

/**
 *
 * @author canat
 */
public class Uyg_erisim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        erisim test = new erisim();
        // test.private_degisken=20; //private değişkene erişim yok - hatalı!!
         
        test.public_degisken = 100;
        System.out.println(test.public_degisken);
        
        test.public_metot();
        test.protected_metot();
        // test.private_metot();  //erisim sınıfında private tanımlandığı için erişim yok

        test.private_oge_erisim(24);

    
    
}
}
