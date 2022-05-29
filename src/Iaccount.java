public interface Iaccount {
    void withdraw(double value);
    void Deposit(double value);
    void Transfer(double value,Account destinyAccount);

    void PrintInfo();


}
