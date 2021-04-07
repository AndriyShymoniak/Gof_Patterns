package structural.adapter;

public class DatabaseImpl implements Database {
    @Override
    public void insert() {
        System.out.println("Insert row in database");
    }

    @Override
    public void update() {
        System.out.println("Update row in database");
    }

    @Override
    public void select() {
        System.out.println("Select row in database");
    }

    @Override
    public void remove() {
        System.out.println("Remove row from database");
    }
}
