/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

/**
 *  Nama     : Alfa Julianta Ginting
 *  Kelas    : PBO 11
 *  Nim      : 10116464
 */
public class Nilaimahasiswa {
    private double quis, uts, uas, na;
    private String nama, nim;
    void getIndex(double na) {
        if (na >= 80) {
            System.out.println("\nindex = A");
            System.out.println("keterangan = sangat baik");
        } else
            if (na >= 70) {
            System.out.println("\nindex = B");
            System.out.println("keterangan = baik");
        } else
            if (na >= 60) {
            System.out.println("\nindex = C");
            System.out.println("keterangan = cukup");
        } else 
            if (na >= 50) {
            System.out.println("\nindex = D ");
            System.out.println("keterangan = kurang");
        } else 
            if (na >= 0) {
            System.out.println("\nindex = E");
            System.out.println("keterangan = sangat kurang");
        }

    }

    double getNa() {
        return na = (0.2 * quis) + (0.3 * uts) + (0.5 * uas);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilaimahasiswa oNa = new Nilaimahasiswa();
        oNa.nama = "Alfa Julianta Ginting";
        oNa.nim = "10116464";

        for (int i = 1; i <= 4; i++) {
            System.out.println("nama ke-" + i + "\t" + oNa.nama);
        }

        for (int j = 8; j >= 1; j--) {
            System.out.println("nim ke-" + j + "\t" + oNa.nim + "." + j);
        }
        oNa.quis = 85;
        oNa.uts = 75;
        oNa.uas = 50;
        
        double nilai = oNa.getNa();
        System.out.println("hasil \t" + nilai);

        oNa.getIndex(nilai);
    }
    
}
