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
public class LogikaTilangan {   
    public static void main(String[] args) {
        boolean SIM = true;
        boolean STNK = true;

        // cek apakah dia akan ditilang atau tidak
        if(SIM == true && STNK == false){
            System.out.println("Tidak ditilang!");
        } else {
            System.out.println("Anda ditilang!");
        }
    }
}