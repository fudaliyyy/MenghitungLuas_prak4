/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menghitungluas;

import java.util.Scanner;

/**
 *
 * @author Zephyrus
 */
public class MenghitungLuas {

    /**
     * @param args the command line arguments
     */
    static int menu;
    static Scanner input;
    public static void main(String[] args) {
        input = new Scanner (System.in);

        menu = input.nextInt();

        switch (menu) {
            case 1:
                Persegi persegi1 = new Persegi(input.nextInt());
                System.out.println(persegi1.hitungpersegi());
                break;
            case 2:
                Segitiga segitiga1 = new Segitiga(input.nextInt(), input.nextInt());
                System.out.println(segitiga1.hitungsegitiga());
                break;
            case 3:
                Lingkaran lingkaran1 = new Lingkaran(input.nextInt());
                System.out.println(lingkaran1.hitunglingkaran());
                break;
            default:
                System.out.print("Input yang anda masukan tidak sesuai");
                break;
        }
    }
}
class Persegi{
    int sisi;
    Persegi(int sisi){
        this.sisi = sisi;
    }
    int hitungpersegi (){
        int rumus = sisi*sisi;
        return rumus;
    }
}

class Segitiga{
    int tinggi;
    int alas;
    Segitiga(int tinggi , int alas){
        this.tinggi = tinggi;
        this.alas = alas;
    }
    int hitungsegitiga (){
        int rumus = alas*tinggi/2;
        return rumus;
    }
}

class Lingkaran{
    double jari;
    Lingkaran(double jari){
        this.jari = jari;
    }
    double hitunglingkaran (){
        int akhir;
        if (jari % 7 == 0){
            double rumus = 22/7*jari*jari;
            akhir = (int) rumus;
        }
        else {
            
            double rumus = 3.14*jari*jari;
            akhir = (int) rumus; 
        }
        return akhir;
    }
}
    

