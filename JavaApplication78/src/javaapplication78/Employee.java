/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication78;


public class Employee {
    private String name;
    private String department;
    private int salary;

public Employee(String name,String department,int salary){

this.name=name;
this.department=department;
this.salary=salary;

}
public void showInfos(){
System.out.println("bilgiler..");
System.out.println("İsim"+this.name);
System.out.println("departman"+this.department);
System.out.println("salary "+this.salary);

}
}