/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author canat
 */
public class UygClass1 
     { public static void main(String[] args) 
     { // 2 farklı bisiklet nesnesi oluşturma, başlangıç duruma getirme 
         bisikletb1 = new bisiklet ();
         bisikletb2 = new bisiklet ();
         // nesnelereyöntemçağır
         b1.pedal_cevrimi_degistir(50);
         b1.hizlan(10);
         b1.vites_degistir(2); 
         b1.durumu_yaz();
         b2.pedal_cevrimi_degistir(50);
         b2.hizlan(10);
         b2.vites_degistir(2);
         b2.pedal_cevrimi_degistir(40); 
         b2.hizlan(10);
         b2.vites_degistir(3);
         b2.durumu_yaz(); 
     } }

