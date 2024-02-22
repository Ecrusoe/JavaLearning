/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uyg_kalıtım;

/**
 *
 * @author canat
 */
import java.util.*;
public class Uyg_kalıtım {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //   kedi k1=new hayvan();  // «hayvan», kedi sınıfına dönüşemez!!!
        kedi k1=new kedi();     
        hayvan k2=new kedi();
        kanarya ka1=new kanarya();
        kaplan k3=new kaplan();
        Scanner klavye=new Scanner(System.in);
        System.out.println("hayvanat bahçesi:");
        String yer=klavye.next();
        k3.konum_ata(yer);
        k3.besle();   //kedi sınıfının fonksiyonu
        System.out.println("ismi:");
        String ad=klavye.next();
        k3.isim_ata(ad, yer);  // «hayvan» sınıfının fonksiyonu
        k3.isim_oku();

    }
    
}
