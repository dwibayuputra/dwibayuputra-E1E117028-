
package dwibayuputra;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Dwibayuputra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nama : Dwi Bayu Putra Pamungkas");
        System.out.println("NIM : E1E1 17 028\n");
        Scanner inputUser = new Scanner(System.in);
        int[] nilai = new int[7];
        int nkecil=999;
        int ntinggi=0;
        int jml=0;
		
        for (int i=1; i<=nilai.length; i++)
        {
          System.out.print("Masukan Nilai Praktikum ke-"+i+" : ");
          nilai[i-1] = inputUser.nextInt();
		  
          if(nilai[i-1]<nkecil)
              nkecil=nilai[i-1];
		  
          if(nilai[i-1]>ntinggi)
              ntinggi=nilai[i-1];
		  
          jml+=nilai[i-1];

        }
        float rata=jml/nilai.length;
        
	System.out.println("Nilai rata-rata praktikum : "+rata);	
        System.out.println("Nilai tertinggi praktikum : "+ntinggi);
        System.out.println("Nilai terendah praktikum : "+nkecil);
        	
        for (int i=1; i<=nilai.length; i++)
        {  
          System.out.print(nilai[i-1]+" ");
        }
        System.out.println(" ");
    
    }
    
}
