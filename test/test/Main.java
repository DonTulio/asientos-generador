/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Random;
/**
 *
 * @author DonTulio
 */
public class Main {
    static Random ran = new Random();
    public static void main(String[] args) {
        for(int i=0;i<=45;i++){
            System.out.println(ran.nextInt(4));
         }
    }
}
