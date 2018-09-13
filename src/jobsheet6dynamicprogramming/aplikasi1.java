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
public class aplikasi1 {
    public static void main(String[] args){
        String identitas = "Luthfarras / XR5 / 19";
        tampilJudul(identitas);
        int pecahan[] = new int[]{5000, 2000, 1000, 500};
        int n = input();
    }
    private static void tampilJudul (String identitas){
            System.out.println("Identitas: " + identitas);
        }
    private static int input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bilangan ke-: ");
        int n = scanner.nextInt();
            
        return n;
    }
}
