/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liste;

/**
 *
 * @author canat
 */
public class ogrenci {
    String isim;
    int yas;
    boolean mezunMu;
    char cinsiyet;
    static int mevcut=0;
    
    public ogrenci(String a){
        isim=a;
        mevcut++;
        System.out.println(isim+"eklendi.Sımıf mevcudu"+mevcut);
    }
}
