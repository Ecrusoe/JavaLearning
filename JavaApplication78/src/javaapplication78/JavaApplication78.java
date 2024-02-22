/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication78;

/**
 *
 * @author canat
 */
public class JavaApplication78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
/*Employee employee= new Employee("emre","bilişim",10000);
employee.showInfos();*/
manager Manager= new manager("mustafa", "bilişim", 100000,10);
/*Manager.showInfos();
Manager.raiseSalary(100);*/
        System.out.println(Manager.toString());

    }
    
}
