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
public class Nadita1D {

    double height, weight, hasil;
    
    void calculateBMI(){
        hasil = weight / (height * height);
        System.out.print ("Hasil dari berat badan dan tinggi badan Nadita adalah : " + hasil);
    }
    
}
