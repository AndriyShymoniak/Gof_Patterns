package structural.adapter;

/**
 * Якщо імплементувати Java Application, то можна використовувати адаптер в 2
 * сторони
 * JavaApplication app = new JavaApplicationImpl()
 * Adapter adapter = new Adapter(app);
 */
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
