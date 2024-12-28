///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class koneksi {

    // URL database MySQL
    private static final String DB_URL = "jdbc:mysql://localhost/db_kepegawaian";
    
    // Membuat koneksi ke database
    public static Connection getKoneksi() {
        Connection conn = null;
        
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");     // Username MySQL
        dataSource.setPassword("");     // Password MySQL (kosong untuk default)
        dataSource.setURL(DB_URL);      // URL database
        
        try {
            conn = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, "Error saat membuat koneksi ke database", ex);
        }
        
        return conn;  // Return koneksi yang berhasil atau null jika gagal
    }
}
