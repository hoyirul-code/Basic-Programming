/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number5;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class Mahasiswa {
    Scanner sc = new Scanner(System.in);
    public String nama, nim;
    public char jk;
    public double ipk;
    public double[] avg; // modified
    
    public Mahasiswa(String nama, String nim, char jk, double ipk){
        System.out.print("Masukan nama          : ");
        nama = sc.nextLine();
        nim = insertNim();
        System.out.print("Jenis kelamin(L/P)    : ");
        jk = sc.next().charAt(0);
        System.out.print("Masukan IPK           : ");
        ipk = sc.nextDouble();
        this.nama = nama;
        this.nim = nim;
        this.jk = jk;
        this.ipk = ipk;
    }
    
    // modified
    public Mahasiswa(){
        
    }
    
    final String insertNim(){
        System.out.print("Masukan nim(Number)   : ");
        String xNim = sc.nextLine();
        String yNim = validasiNim(xNim);
        return yNim;
    }
    
    final String validasiNim(String str){
        String zNim = "";
        if(str.matches("[0-9]*")){
            zNim = str;
        }else{
            System.out.println("NIM Harus Angka");
            System.exit(0);
        }
        return zNim;
    }
    
    // modified
    void simpanIPK(int n){
        avg = new double[n];
    }
    
    // modified
    void averageIPK(){
        double  sum = 0;
        int count = 0;
        for(int i = 0;i<avg.length;i++){
            sum += avg[i];
            count++;
        }
        double avgIPK = sum / count;
        System.out.println("Nilai Rata-rata IPK : " + avgIPK);
    }
}
