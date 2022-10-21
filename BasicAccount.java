public class BasicAccount extends BankAccount {
    public void withdraws(double amount)
    {
        if(amount<=this.balance)
        {
            super.withdraws(amount);
        }
        else
            super.withdraws(amount+30);
        System.out.println("you withdraw more than you have so overdraft fee of 30$ has been added to your account");

    }
}
