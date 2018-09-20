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
public class TestSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EncapSiswa siswa = new EncapSiswa();
       siswa.setName("Julian");
       siswa.setAbsen(23);
       siswa.setAddreas("Malang");
       
        System.out.println("Name: " + siswa.getName() + " Absen : " + siswa.getAbsen() + " Addreas: " +
                siswa.getAddreas());
    }
}
       
               
