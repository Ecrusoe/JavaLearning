/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainn;

/**
 *
 * @author canat
 */
public class Mainn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Product product=new Product();
   product.name="Laptop";
   product.id=1;
   System.out.println(product.name);
  System.out.println(product.id); 
    ProductManager productManager=new ProductManager();
    productManager.Add(product);
    
    
    
    
            }
    
}
