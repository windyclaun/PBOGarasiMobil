package Controllers;
import java.util.List;

import DAO.DataMobilDAO;
import Model.DataMobil;
import Model.ModelTabelMobil;
import View.MainView;


public class DataMobilController {
    MainView frame;
    DataMobilDAO implement;
    List<DataMobil> list;

    public DataMobilController(MainView frame){
        this.frame = frame;
        implement = new DataMobilDAO();
        list = implement.getAll();
    }

    public void isiTabel(){
        list = implement.getAll();
        ModelTabelMobil mtm = new ModelTabelMobil(list);
        frame.getTabelData().setModel(mtm);
    }

    public void insert(String nama, String nomor_plat,String merk, int tahun, int harga){
        DataMobil dm = new DataMobil(nama, nomor_plat, merk, tahun, harga);
        dm.setNama(nama);
        dm.setNomor_plat(nomor_plat);
        dm.setMerk(merk);
        dm.setTahun(tahun);
        dm.setHarga(harga);
        implement.insert(dm);
    }

    public void update(String nama, String nomor_plat, String merk, int tahun, int harga){
        DataMobil dm = new DataMobil(nama, nomor_plat, merk, tahun, harga);
        implement.update(dm);
    }

    public void delete(String nomor_plat){
        DataMobil dm = new DataMobil("", nomor_plat, "", 0, 0);
        implement.delete(dm);
    }
}
