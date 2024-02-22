/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication61;

import java.awt.BorderLayout;

import java.util.Scanner;

public class JavaApplication61 {
public static double egim(int x1,int y1,int x2,int y2){
    double dy=y2-y1;
    double dx=x2-x1;
    return dy/dx;   
}
    public static void main(String[] args) {
      
    Scanner klavye=new Scanner(System.in);   
    System.out.println("A noktasının koordinatları");
    int Ax=klavye.nextInt();
    int Ay=klavye.nextInt();
     System.out.println("B noktasının koordinatları");
      int Bx=klavye.nextInt();
    int By=klavye.nextInt();
    System.out.println(egim(By, By, By, By));
    
}
    1
}
