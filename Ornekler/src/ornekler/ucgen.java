/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ornekler;

/**
 *
 * @author canat
 */
public class ucgen extends sekil{
      String tur;
  
  public ucgen(double x, double y, String tur){
      super(x,y);        //sekil sınıfı kurucu fonksiyonu
      this.tur=tur;     // sınıfın aynı isimdeki değişken this ile belirtilir.
  }
  
  public double alan(){
      return (taban*yukseklik)/2; //sekil sınıfının özellikleri miras 					  // yoluyla kullanılabilir..
  }

    
}
