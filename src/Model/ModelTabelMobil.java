package Model;


import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModelTabelMobil extends AbstractTableModel{
    private List<DataMobil> list;
    public ModelTabelMobil(List<DataMobil> list){
        if (list == null) {
            this.list = new ArrayList<>();
        } else {
            this.list = list;
        }
    }

    @Override
    public int getRowCount() {
        return this.list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Nama";
            case 1:
                return "Nomor Plat";
            case 2:
                return "Merk";
            case 3:
                return "Tahun";
            case 4:
                return "Harga";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return list.get(row).getNama();
            case 1:
                return list.get(row).getNomor_plat();
            case 2:
                return list.get(row).getMerk();
            case 3:
                return list.get(row).getTahun();
            case 4:
                return list.get(row).getHarga();
            default:
                return null;
        }
    }

    
}
