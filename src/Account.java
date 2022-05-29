public abstract class Account implements Iaccount {
    private static  final int defaultAgency = 001;
    private static   int sequencial=1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client cliente;

    public Account(Client cliente) {
        this.agency = Account.defaultAgency;
        this.number = Account.sequencial++;
        this.cliente= cliente;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(){

    }
    public void Deposit(){

    }
    public void Transfer(){

    }

    @Override
    public void withdraw(double value) {
    this.balance-=value;
    }

    @Override
    public void Deposit(double value) {
    this.balance+=value;
    }

    @Override
    public void Transfer(double value, Account destinyAccount) {
    this.withdraw(value);
    destinyAccount.Deposit(value);
    }

    protected void printComumInfo() {
        System.out.println("Extrato da conta === ");
        System.out.println("TItular: "+ this.cliente.getName());
        System.out.println("Agência: "+ this.agency);
        System.out.println("Número: "+ this.number);
        System.out.println("Saldo: "+ this.balance);
    }
}

