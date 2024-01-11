public class Main {
    public static void main(final String[] args)
    {
        final bankAccount b1;
        final bankAccount b2;

        final Date date1;
        final Date date2;

        final Name name1;
        final Name name2;

        final Student student1;
        final Student student2;

        b1 = new bankAccount(100.00, "abc123", "gates");
        b2 = new bankAccount(500.00, "xyz789", "woods");

        date1       = new Date(1975, 12, 30);
        name1       = new Name("Tiger", "Woods");
        student1    = new Student(name1, "A00123456", date1, true);

        date2       = new Date(1955, 10, 28);
        name2       = new Name("Bill", "Gates");
        student2    = new Student(name2, "A00987654", date2, false);

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

        System.out.println("---");

        System.out.println(student1.getName().getFullName() + " (" + student1.getName().getInitials()
                            + ") (st # " + student1.getStudentNumber() + ") was born on "
                            + student1.getDateOfBirth().getYyMmDd() + ". The student has "
                            + (student1.isGraduated() ? "graduated." : "not graduated."));
        System.out.println(student2.getName().getFullName() + " (" + student2.getName().getInitials()
                            + ") (st # " + student2.getStudentNumber() + ") was born on "
                            + student2.getDateOfBirth().getYyMmDd() + ". The student has "
                            + (student2.isGraduated() ? "graduated." : "not graduated."));
    }
}