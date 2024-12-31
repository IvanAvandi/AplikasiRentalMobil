/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Ivana
 */
public class Parameter {
    // Konfigurasi koneksi ke database lokal
    public static String HOST_DB = "jdbc:mysql://localhost:3306/rental_mobil"; // Menyambung ke localhost
    public static String USERNAME_DB = "root"; // Username default untuk MySQL
    public static String PASSWORD_DB = ""; // Password default untuk MySQL, sesuaikan jika diperlukan
    public static String USER; // Variabel untuk menyimpan username aplikasi jika diperlukan
}
