/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balok;

/**
 *
 * @author yafiaryamaulana
 */
public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    public int volume;

     //contructor
       public Balok(int panjang, int lebar, int tinggi){
       this.panjang = panjang;
       this.lebar = lebar;
       this.tinggi = tinggi;
       }
       
public void ComputeAndSetVolume(){
          //compute volume
          int calculate_vol = this.panjang  * this.lebar * this.tinggi;
          this.volume = calculate_vol;
       }
    public int getVolume(){
        return this.volume;
    }
}    

