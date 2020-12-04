/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uts.if1.pkg10119023.muhammadfarhanr.no2;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : Program penarikan uang tabungan
 *
 */
import java.util.Scanner;
public class UTSIF110119023MUHAMMADFARHANRNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan t = new Tabungan(scan.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int ambil = scan.nextInt();
        
        System.out.println("Saldo Anda Sekarang : "+t.ambilUang(ambil));
    }

}
