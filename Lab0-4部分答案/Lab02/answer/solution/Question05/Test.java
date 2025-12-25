public class Test {
    public static void main(String[] args) {
        IMessage[] messages = new IMessage[]{
                new Music("TunakTunakTun", "DuluDulu"),
                new Phone("Huawei 13 Pro Max", "IPhone")
        };
        for (IMessage message : messages) {
            message.print();
        }
    }
}