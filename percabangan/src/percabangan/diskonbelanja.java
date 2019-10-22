/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author Moch Lutfi
 */
public class diskonbelanja {
    public static void main(String[] args) {
        // deklarasi variabel dan Scanner
        int belanjaan=500000;
        int diskon;
        int bayar;
            if (belanjaan > 500000) {
                diskon = 50000;
            } else if (belanjaan > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }
               //total bayarnya lhoos 
             bayar = belanjaan - diskon;
            System.out.println("Total Bayar: Rp " + bayar);
   
     
        }
}
   
