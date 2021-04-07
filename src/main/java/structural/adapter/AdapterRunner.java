package structural.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        Database db = new DatabaseImpl();
        AdapterJavaToDatabase adapter = new AdapterJavaToDatabase(db);
        adapter.saveObject();
        adapter.updateObject();
        adapter.findObject();
        adapter.deleteObject();
    }
}
