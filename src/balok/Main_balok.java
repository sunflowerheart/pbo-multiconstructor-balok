/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balok;

/**
 *
 * @author yafiaryamaulana
 */
public class Main_balok {
        public static void main(String[] args) {
        Balok  balok  = new Balok(6, 5, 4);
         balok.ComputeAndSetVolume();
        System.out.print("Volume balok dengan panjang " +balok.panjang+ ", lebar " +balok.lebar+ ", dan tinggi " +balok.tinggi+ " adalah " +balok.getVolume());
    }
    
}
