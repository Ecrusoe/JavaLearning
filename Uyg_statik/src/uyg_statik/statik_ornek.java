/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uyg_statik;

/**
 *
 * @author canat
 */
public class statik_ornek {
    static int statik_a;
    int a;
    static void atama_statik_a(int deger){
        statik_a=deger;
    }
    void atama_a(int deger){
        a=deger;
    }
    int oku_statik_a(){
        return statik_a;
    }
    int oku_a(){
        return a;
    }
}
