/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Ivana
 */
/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import java.sql.*;

public class DatabaseConnect {

    Connection connection;
    Statement statement;
    String SQL;
    String url;
    String username;
    String password;
    

    public DatabaseConnect(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public Connection koneksiDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Menggunakan driver terbaru
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return connection;
    }

    public Connection closeKoneksi() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return connection;
    }

    public ResultSet eksekusiQuery(String sql) {
        koneksiDatabase();
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return resultSet;
    }

    public String eksekusiUpdate(String sql) {
        koneksiDatabase();
        String result = "";
        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println(sql);
        } catch (SQLException ex) {
            result = ex.toString();
        }
        return result;
    }

    public ResultSet querySelectAll(String namaTabel) {
        SQL = "SELECT * FROM " + namaTabel;
        return this.eksekusiQuery(SQL);
    }

    public ResultSet querySelectAll(String namaTabel, String kondisi) {
        SQL = "SELECT * FROM " + namaTabel + " WHERE " + kondisi;
        return this.eksekusiQuery(SQL);
    }

    public ResultSet querySelect(String[] namaKolom, String namaTabel) {
        int i;
        SQL = "SELECT ";
        for (i = 0; i <= namaKolom.length - 1; i++) {
            SQL += namaKolom[i];
            if (i < namaKolom.length - 1) {
                SQL += ",";
            }
        }
        SQL += " FROM " + namaTabel;
        return this.eksekusiQuery(SQL);
    }

    public ResultSet querySelect(String[] namaKolom, String namaTabel, String kondisi) {
        int i;
        SQL = "SELECT ";
        for (i = 0; i <= namaKolom.length - 1; i++) {
            SQL += namaKolom[i];
            if (i < namaKolom.length - 1) {
                SQL += ",";
            }
        }
        SQL += " FROM " + namaTabel + " WHERE " + kondisi;
        return this.eksekusiQuery(SQL);
    }

    public String queryInsert(String namaTabel, String[] isiTabel) {
        int i;
        SQL = "INSERT INTO " + namaTabel + " VALUES(";
        for (i = 0; i <= isiTabel.length - 1; i++) {
            SQL += "'" + isiTabel[i] + "'";
            if (i < isiTabel.length - 1) {
                SQL += ",";
            }
        }
        SQL += ")";
        return this.eksekusiUpdate(SQL);
    }

    public String queryInsert(String namaTabel, String[] namaKolom, String[] isiTabel) {
        int i;
        SQL = "INSERT INTO " + namaTabel + "(";
        for (i = 0; i <= namaKolom.length - 1; i++) {
            SQL += namaKolom[i];
            if (i < namaKolom.length - 1) {
                SQL += ",";
            }
        }
        SQL += ") VALUES(";
        for (i = 0; i <= isiTabel.length - 1; i++) {
            SQL += "'" + isiTabel[i] + "'";
            if (i < isiTabel.length - 1) {
                SQL += ",";
            }
        }
        SQL += ")";
        return this.eksekusiUpdate(SQL);
    }

    public String queryUpdate(String namaTabel, String[] namaKolom, String[] isiTabel, String kondisi) {
        int i;
        SQL = "UPDATE " + namaTabel + " SET ";
        for (i = 0; i <= namaKolom.length - 1; i++) {
            SQL += namaKolom[i] + "='" + isiTabel[i] + "'";
            if (i < namaKolom.length - 1) {
                SQL += ",";
            }
        }
        SQL += " WHERE " + kondisi;
        return this.eksekusiUpdate(SQL);
    }

    public String queryDelete(String namaTabel) {
        SQL = "DELETE FROM " + namaTabel;
        return this.eksekusiUpdate(SQL);
    }

    public String queryDelete(String namaTabel, String kondisi) {
        SQL = "DELETE FROM " + namaTabel + " WHERE " + kondisi;
        return this.eksekusiUpdate(SQL);
    }
}
