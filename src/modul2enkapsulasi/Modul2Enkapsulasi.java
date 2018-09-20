/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2enkapsulasi;

/**
 *
 * @author WINDOWS 10
 */
public class Modul2Enkapsulasi {

 public class Bus {

    public int penumpang;
    public int maxPenumpang;
   
    public void cetak() {
      System.out.println("Penumpang Bus sekarang adalah"+ penumpang);
      System.out.println("Penumpang maksimum seharusnya adalah"+ maxPenumpang);
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public void setMaxPenumpang(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }

    public int getPenumpang() {
        return penumpang;
    }

    public int getMaxPenumpang() {
        return maxPenumpang;
        
    }
    
}
}

