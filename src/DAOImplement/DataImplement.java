import Model.DataMobil;

public interface DataImplement {
    public void insert(DataMobil dm);
    public void update(DataMobil dm);
    public void delete(DataMobil dm);
    public List<DataMobil> getAll();
}
