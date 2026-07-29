package splitwiseapp.model;

public class Friend {
    private static int lastId = 0;
    private final int id;
    private final String name;

    public Friend(String name) {
        lastId++;
        this.id = lastId;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}


