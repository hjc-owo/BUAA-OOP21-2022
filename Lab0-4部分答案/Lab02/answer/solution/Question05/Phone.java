public class Phone implements IMessage {
    private String name;
    private String type;

    public Phone(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void print() {
        System.out.printf("--- Phone Info --- \nName: %s\nType: %s\n", name, type);
    }
}
