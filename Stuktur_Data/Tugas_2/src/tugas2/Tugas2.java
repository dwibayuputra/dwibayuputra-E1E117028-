/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author Bayu
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    static boolean data (String data, String cari){
        boolean dat1=false;
        if (data.equals(cari)){
            dat1 = true;
        }else if(data.equals(cari)){
            dat1 = true;
        }
        return dat1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner  (System.in);
        String kata;
        String []data=new String [2];
        data[0] = "BISECTION";
        data[1] = "SECANT";
        
        System.out.println("Nama : Dwi Bayu Putra Pamungkas");
        System.out.println("NIM : E1E117028\n");
        System.out.print("Masukkan Pilihan Anda ( BISECTION / SECANT ) : ");
        kata = input.next();
        
        for (int x=0; x<=1; x++){
            if (data(data[x], kata) == true){
                System.out.println("\nDATA DITEMUKAN");
                System.out.println("Kata : "+kata);
                x+=5;
            }else if(x==1){
                System.out.println("\nDATA TIDAK DITEMUKAN");
                System.out.println("Kata : "+kata);
                System.out.println("\nMasukkan  ( BISECTION / SECANT )");
            }
        }          
    }
}

