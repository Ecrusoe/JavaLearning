/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ornekler;

/**
 *
 * @author canat
 */
import java.util.*;

public class Ornekler {

    public static void main(String[] args) {
              sekil s1=new ucgen(2.4,2.1,"dik üçgen");
        s1.alan(3,4);     //hatalı!!!
        s1.taban=2.4;
        s1.yukseklik=3.2;

     ucgen s2=new ucgen(1.2,3.0,"eskenar");
s2.alan();
    
    }    }

