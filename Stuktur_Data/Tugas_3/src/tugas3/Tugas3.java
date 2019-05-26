/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Bayu
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nama : Dwi Bayu Putra Pamungkas");
        System.out.println("NIM : E1E117028\n");
        
        hp samsung = new hp();
        samsung.telepon();
        samsung.sms();
        samsung.internet();
        
        System.out.println("\nMesin : "+samsung.mesin);
        System.out.println("Casing : "+samsung.casing);
        System.out.println("Kartu SIM : "+samsung.kartuSim);
    }
    
}
