/**
 * A bank account program with 'deposit', 'withdraw', and 'transfer' functionalities
 *
 * @author sam ordonez & ross
 * @version 1.0
 */

public class bankAccount
{
    private double balanceCad;

    private final String accountNumber;
    private final String lastName;

    /**
     *
     * @param balanceCad balance of bank account in CAD (canadian dollars)
     * @param accountNumber unique bank account number of person
     * @param lastName last name of the bank account owner
     */
    public bankAccount(final double balanceCad,
                       final String accountNumber,
                       final String lastName)
    {
        this.balanceCad = balanceCad;
        this.accountNumber = accountNumber;
        this.lastName = lastName;
    }

    /**
     * Withdraws money from bank account in CAD (canadian dollars)
     * @param amountCad amount of money in CAD (canadian dollars)
     */
    public void withdraw(double amountCad) {
        this.balanceCad -= amountCad;
    }

    /**
     * Deposits money into bank account in CAD (canadian dollars)
     * @param amountCad amount of money in CAD (canadian dollars)
     */
    public void deposit(double amountCad) {
        this.balanceCad += amountCad;
    }

    /**
     * Transfers
     * @param amountCad amount of money in CAD
     * @param recipientAccount account number of person receiving the transferred money in CAD (canadian dollars)
     */
    public void transfer(double amountCad, bankAccount recipientAccount) {
        recipientAccount.deposit(amountCad);
        this.withdraw(amountCad);
    }

    /**
     *
     * @return balance amount in CAD (canadian dollars)
     */
    public double getBalanceCad() {
        return balanceCad;
    }

    /**
     * @return the unique bank account number of person
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getMemberLastName() {
        return lastName;
    }
}