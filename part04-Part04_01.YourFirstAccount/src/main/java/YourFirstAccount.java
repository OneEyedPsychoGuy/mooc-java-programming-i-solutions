public class YourFirstAccount {
    public static void main(String[] args) {
        Account example = new Account("Example's account", 100);
        example.deposit(20);
        System.out.println(example);
    }
}