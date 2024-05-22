import java.sql.*;
import java.util.*;

import Koneksi.Connector;
import Model.DataMobil;

public class DataMobilDAO {
    Connection con;
    public String nama, nomor_plat, merk;
    public int tahun, harga;

    final String select = "SELECT * FROM mobil";
    public DataMobilDAO(){
        con = Connector.connection();
    }

    public void insert(DataMobil dm) {
        PreparedStatement ps = null;
        try{
            String query = "INSERT INTO `mobil`(`nama`,`nomor_plat`,`merk`, `tahun`, `harga`) VALUES ('" + dm.getNama() + "','" + dm.getNomor_plat() + "','" + dm.getMerk() + "','" + dm.getTahun() + "','" + dm.getHarga() + "')";

            ps = con.prepareStatement(query);
            ps.executeUpdate(query);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    public void update(DataMobil dm) {
        PreparedStatement ps = null;
        try{
            String query = "UPDATE `mobil` SET `nomor_plat` = '" + dm.getNomor_plat() + "', `merk` = '" + dm.getMerk() + "', `tahun` = '" + dm.getTahun() + "', `harga` = '" + dm.getHarga() + "' WHERE `nama` = '" + dm.getNama() + "'";
            ps = con.prepareStatement(query);
            ps.executeUpdate(query);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    public void delete(DataMobil dm) {
        PreparedStatement ps = null;
        try{
            String query = "DELETE FROM `mobil` WHERE `nama` = '" + dm.getNama() + "'";
            ps = con.prepareStatement(query);
            ps.executeUpdate(query);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("finally")
    public List<DataMobil> getAll(){
        List<DataMobil> ld = null;
        try{
            ld = new ArrayList<DataMobil>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                DataMobil dm = new DataMobil(nama, nomor_plat, merk, tahun, harga);
                dm.setNama(rs.getString("nama"));
                dm.setNomor_plat(rs.getString("nomor_plat"));
                dm.setMerk(rs.getString("merk"));
                dm.setTahun(rs.getInt("tahun"));
                dm.setHarga(rs.getInt("harga"));
                ld.add(dm);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        finally{
            return ld;
        }
    }
}
