/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author irulg
 */
import java.util.Scanner;
public class Kerucut {
    Scanner sc = new Scanner(System.in);
    public double phi = 3.14, r, t;
    
    public Kerucut(double r, double t){
        System.out.print("Jari jari : ");
        r =  sc.nextDouble();
        System.out.print("Tinggi    : ");
        t =  sc.nextDouble();
        this.r = r;
        this.t = t;
    }
    
    double volume(){
        double v = (1/3) * phi * r * r * t;
        return v;
    }
    
    double luasPermukaan(){
        double l = phi * r * r;
        return l;
    }
}
