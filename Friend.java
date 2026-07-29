package splitwiseapp;

public class Friend {
    private static int lastId = 0;
    private final int id;
    private String name;

    public Friend(String name) {
        lastId++;
        this.id = lastId;
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}


