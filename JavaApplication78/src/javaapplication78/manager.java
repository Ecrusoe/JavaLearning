/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication78;

public class manager extends Employee{
    private int num_of_employes;
    public manager(String name , String department,int salary,int num_of_employes){
        
        super(name,department,salary);
        this.num_of_employes=num_of_employes;
        
        
    }
    public void raiseSalary(int amount){
        System.out.println("çalışanlara "+amount+" TL zam yapıldı...");
    }

    @Override
    public void showInfos() {
        super.showInfos();
    System.out.println("bilgiler..");
        System.out.println("kişi sayısı"+this.num_of_employes);

    }
    @Override
    public String toString(){
        return "manager objesi";
    }
    
    
    
    
    
    
    
}
