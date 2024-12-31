/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

/**
 * @author Ivana
 */
public class SetTable extends AbstractTableModel {

    private ResultSet rs;

    public SetTable(ResultSet rs) {
        this.rs = rs;
    }

    @Override
    public int getColumnCount() {
        try {
            if (rs != null) {
                return rs.getMetaData().getColumnCount();
            }
        } catch (SQLException e) {
            System.out.println("Error while getting column count: " + e.getMessage());
        }
        return 0;
    }

    @Override
    public int getRowCount() {
        try {
            if (rs != null) {
                rs.last(); // Menyebakan cursor berada di baris terakhir
                return rs.getRow(); // Mengambil jumlah baris
            }
        } catch (SQLException e) {
            System.out.println("Error while getting row count: " + e.getMessage());
        }
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            if (rs != null) {
                // Pindah ke baris yang diinginkan
                if (rs.absolute(rowIndex + 1)) {
                    return rs.getObject(columnIndex + 1); // Ambil data di kolom yang diminta
                }
            }
        } catch (SQLException e) {
            System.out.println("Error while fetching data at row " + rowIndex + ", column " + columnIndex + ": " + e.getMessage());
        }
        return null;
    }

    @Override
    public String getColumnName(int columnIndex) {
        try {
            if (rs != null) {
                return rs.getMetaData().getColumnName(columnIndex + 1); // Ambil nama kolom
            }
        } catch (SQLException e) {
            System.out.println("Error while fetching column name: " + e.getMessage());
        }
        return super.getColumnName(columnIndex);
    }
}


