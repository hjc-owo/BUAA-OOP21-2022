public class Music implements IMessage {
    private String name;
    private String type;

    public Music(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void print() {
        System.out.printf("--- Music Info --- \nName: %s\nType: %s\n", name, type);
    }
}

