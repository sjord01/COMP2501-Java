public class Main {
    public static void main(final String[] args) {
        bankAccount b1 = new bankAccount(100.00, "abc123", "gates");
        bankAccount b2 = new bankAccount(500.00, "xyz789", "woods");

        System.out.println(b1.getBalanceCad());
        b1.withdraw(5.00);
        System.out.println(b1.getAccountNumber());
        System.out.println(b1.getBalanceCad());
        System.out.println("---");
        System.out.println(b2.getBalanceCad());
        b2.deposit(23.00);
        System.out.println(b2.getMemberLastName());
        System.out.println(b2.getBalanceCad());
        System.out.println("---");
        b1.transfer(50.00, b2);
        System.out.println(b1.getBalanceCad());
        System.out.println(b2.getBalanceCad());
    }
}