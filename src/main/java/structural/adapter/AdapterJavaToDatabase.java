package structural.adapter;

public class AdapterJavaToDatabase implements JavaApplication{
    private final Database database;

    public AdapterJavaToDatabase(Database database) {
        this.database = database;
    }

    @Override
    public void saveObject() {
        System.out.println("Save object method call");
        database.insert();
    }

    @Override
    public void updateObject() {
        System.out.println("Update object method call");
        database.update();
    }

    @Override
    public void deleteObject() {
        System.out.println("Delete object method call");
        database.remove();
    }

    @Override
    public void findObject() {
        System.out.println("Find object method call");
        database.select();
    }
}
