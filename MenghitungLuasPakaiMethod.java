import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        
        byte menu = in.nextByte();
         if( menu == 1){
            int sisi = in.nextInt();
             Persegi segiper = new Persegi(sisi);
              segiper.hasilLuas();
            
           
        }else if(menu == 2){
            int alas = in.nextInt();
            int tinggi = in.nextInt();
            if(alas <128 && tinggi <128 && alas >= 0 && tinggi >= 0){
               Segitiga seg = new Segitiga(alas,tinggi);
              seg.hasilLuas();
            }else{
                System.out.println("Input yang anda masukan tidak sesuai");
            }
           
        }else if(menu == 3){
            int jari = in.nextInt();
            if(jari < 128 && jari >= 0){
              Lingkaran ling = new Lingkaran(jari);
                ling.hasilLuas();
            }else{
                System.out.println("Input yang anda masukan tidak sesuai");
            }
            
        }else{
        System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}
    
     
  class Persegi {
    private int luas;
    private int sisi;

    Persegi(int sisi){
        this.sisi = sisi;
        this.luas = 0;
    }

    private int luasPersegi(){
        this.luas = this.sisi * this.sisi;
        return this.luas;
    }

    public void hasilLuas(){
        System.out.println(luasPersegi());
    }
}

class Segitiga {
    private int alas;
    private int tinggi;
    private double luas;

    Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.luas = 0;
    }

    private int luasSegitiga(){
        this.luas = 0.5*this.alas*this.tinggi;
        return (int)this.luas;
    }

    public void hasilLuas(){
        System.out.println(luasSegitiga());
    }

}

class Lingkaran {
    private int jari2;
    private double phi;
    private double luas;

    Lingkaran(int jari2){
        this.jari2 = jari2;
        this.phi = 3.14;
        this.luas = 0;
    }

    private int luasLingkaran(){
        if(this.jari2 % 7 == 0){
            this.luas = 22/7 * this.jari2 * this.jari2;
        }else {
            this.luas = phi * this.jari2 * this.jari2;
        }
        return (int)this.luas;
    }

    public void hasilLuas(){
        System.out.println((double)luasLingkaran());
    }
}

  

