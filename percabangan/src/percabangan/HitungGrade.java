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
public class HitungGrade {
  
    public static void main(String[] args) {

        // membuat variabel dan scanner
        int nilai=100;
        String grade;
        // mengambil input
        // higung gradenya
        if ( nilai >= 90 ) {
            grade = "A";
        } else if ( nilai >= 80 ){
            grade = "B+";
        } else if ( nilai >= 70 ){
            grade = "B";
        } else if ( nilai >= 60 ){
            grade = "C+";
        } else if ( nilai >= 50 ){
            grade = "C";
        } else if ( nilai >= 40 ){
            grade = "D";
        } else {
            grade = "E";
        }

        // cetak hasilnya
        System.out.println("Grade: " + grade);
    }
  
}
