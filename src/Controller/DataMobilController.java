import java.util.List;

import Model.DataMobil;
import Model.ModelTabelMobil;
import View.Main;
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
        dm.setNama(nama);
        dm.setNomor_plat(nomor_plat);
        dm.setMerk(merk);
        dm.setTahun(tahun);
        dm.setHarga(harga);
        implement.update(dm);
    }

    public void delete(String nama){
        DataMobil dm = new DataMobil(nama, "", "", 0, 0);
        dm.setNama(nama);
        implement.delete(dm);
    }
}
