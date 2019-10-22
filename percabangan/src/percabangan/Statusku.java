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
public class Statusku {
  public static void main(String[] args) {
    int umur = 27;
    if (umur >= 25) {
      System.out.println("Nikah.");
    } else if (umur > 20) {
      System.out.println("Kerja.");
    }  else {
      System.out.println("Sekolah.");
    }
  }
}
