/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6dynamicprogramming;

/**
 *
 * @author Faras
 */
public class latihan1 {
    public static void main (String[] args){
        String identitas = "Luthfarras / XR5 / 19";
        int uang = 421300;
        int pecahan[] = new int[]{5000, 2000, 1000, 500};
        int jumlah;
        for(int i = 0; i < pecahan.length; i++){
            if(uang >= pecahan[i]){
                jumlah = uang/pecahan[i];
                uang = uang%pecahan[i];
        
                System.out.println("Pecahan " +pecahan[i]+ " sebanyak " +jumlah+ " lembar");
            }
    }
    }
}
