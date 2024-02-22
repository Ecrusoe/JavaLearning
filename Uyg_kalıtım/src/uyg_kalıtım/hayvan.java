/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uyg_kalıtım;

/**
 *
 * @author canat
 */
public class hayvan {
    
    private String isim;
    private String sahip;

    public void isim_ata(String ev_isim, String ev_sahip) {
        isim = ev_isim;
        sahip = ev_sahip;
    }

    public String isim_oku() {
        return isim;
    }
}

