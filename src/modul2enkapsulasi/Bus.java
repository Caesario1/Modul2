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
public class Bus {

    /**
     * @param args the command line arguments
     */
  
      public class Bus2 {

   private int penumpang;
   private int maxPenumpang;
    //Konstruktor kelas bus
   public Bus2(int maxPenumpang) {
     this.maxPenumpang = maxPenumpang;
     penumpang = 0;
   }
   //method mutator untuk menambahkan penumpang
   public void addpenumpang(int penumpang) {
       int temp ;
       temp = this.penumpang+penumpang;
       if (temp >= maxPenumpang) {
           System.out.println("Penumpang meleihi kuota");
       }else {
           this.penumpang = temp;
       }
     
    }

  
}
}
