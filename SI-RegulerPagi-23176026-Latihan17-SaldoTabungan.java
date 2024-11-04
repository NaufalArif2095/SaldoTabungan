/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1;
import java.text.DecimalFormat;
/*
 * @author
 * NAMA    : Naufal Arif Maulana
 * KELAS   : PBO12
 * NIM     : 23176026
 * Deskripsi Program : Program ini berisi program untuk menampilkan 
 *  Saldo tabungan
 */

public class SaldoTabungan {
    public static void main(String[] args) {
        double saldoAwal = 2500000; // Saldo awal
        double bunga = 0.15; // Bunga per bulan
        int lamaBulan = 6; // Lama menabung dalam bulan
        
        DecimalFormat df = new DecimalFormat("###,###.##");
        
        for (int i = 1; i <= lamaBulan; i++) {
            saldoAwal += saldoAwal * bunga;
            System.out.println("Saldo di bulan ke-" + i + " Rp." + df.format(saldoAwal));
        }
    }
}
