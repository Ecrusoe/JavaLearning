  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author canat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      customerManager yeni= new customerManager();
      int toplam=yeni.topla(4, 7);
      System.out.println(toplam);
    }
    
}
