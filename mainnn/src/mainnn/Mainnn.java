/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainnn;
import java.util.*;
public class Mainnn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      araba oto=new araba();
      oto.marka="Seat";
      oto.silindir_hacmi=1000;
        System.out.println(oto.vergi_hesapla(oto.silindir_hacmi));
           
        
        Scanner konsol =new Scanner(System.in);
        araba oto2=new araba();
        System.out.println("Arabanın markası");
        oto2.marka=konsol.next();
        System.out.println("Arabanın silindir hacmi:");
        oto2.silindir_hacmi=konsol.nextInt();
        System.out.println();
        
    }
    
}
