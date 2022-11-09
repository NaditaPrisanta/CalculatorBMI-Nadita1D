/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadita1d;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Nadita1DBeraksi {
    
    public static void main(String[] args) {
        String Nama = "Nadita Prisanta";
        String Matkul = "Dasar Pemrograman";
        char kelas = 'D';
        int usia = 18;
        String Universitas = "Universitas Merdeka Malang";
            System.out.println(Nama);
            System.out.println("kelas"+1+kelas);
             System.out.println(Matkul);
            System.out.println(usia);
            System.out.println(Universitas);
           
            
        
        Scanner sc = new Scanner(System.in);
        Nadita1D Nadita1D = new Nadita1D();
        System.out.print("Input weight in kilogram: ");
        Nadita1D.weight =sc.nextDouble();
        System.out.print("Input height in meter: ");
        Nadita1D.height = sc.nextDouble();
        Nadita1D.calculateBMI();
        
    }
    
}
