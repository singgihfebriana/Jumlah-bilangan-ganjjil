/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyek_latihan;
import java.util.Scanner;
/**
 *
 * @author singg
 *///@menghitung bilangan ganjil
        
public class Proyek_Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        double a;
        double c=1;
        int e=0;
        int f=0;
        System.out.println("Masukan angka : ");
        a=keyboard.nextDouble();
        while (c<=a){
            double b=(c%2);
            
            if (b!=0){
                f++;
                c++;
                    
            }
           c++;
        }
     System.out.println(f+" Jumlah bilangan ganjil");
    }
    
}
