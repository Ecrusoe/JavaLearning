package uyg_erisim; 
public class erisim {
    private int private_degisken = 10;
    public int public_degisken; 

    protected void protected_metot() {
        System.out.println(“Sınıftan ve aynı paketten erişim");"
         }

   private void private_metot() {
        System.out.println("Sadece sınıftan erişim");   }
 
    public void public_metot() {
        System.out.println("Dışarıdan erişim mümkün");   }
 
    public void private_oge_erisim(int x) {
        private_degisken=x;
        System.out.println("Private değişkene erişim = " + private_degisken);
        private_metot();    //private metota erişim
    }          }
