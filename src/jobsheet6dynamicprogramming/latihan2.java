/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6dynamicprogramming;

import java.util.Scanner;

/**
 *
 * @author Faras
 */
public class latihan2 {
    public static void main (String[] args){
        String identitas = "Luthfarras / XR5 / 19";
        System.out.println("Identitas: " + identitas);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan berat angkutan: ");
        int uang = scanner.nextInt();
        int berat[] = {7, 5, 4, 3, 2};
        int bayaran[] = {10000, 7000, 5000, 3000, 2000};
        String jenis[] = {"E", "D", "C", "B", "A"};
        int jumlah;
        int banyak;
        int harga;
        
        for(int i = 0; i < berat.length; i++){
            if(uang >= berat[i]){
                jumlah = uang/berat[i];
                banyak = jumlah*berat[i];
                uang = uang%berat[i];
                harga = jumlah*bayaran[i];
                System.out.println("Jenis Barang: " +jenis[i]);
                System.out.println("Jumlah Barang: " +jumlah);
                System.out.println("Total Bayaran: " +harga);
            }
        }
    }
}