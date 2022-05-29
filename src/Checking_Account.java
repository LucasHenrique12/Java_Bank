public class Checking_Account extends Account {
    public Checking_Account(Client cliente) {
        super(cliente);
    }

    @Override
    public void PrintInfo() {
        System.out.print("=== Conta corrente ");
        super.printComumInfo();
    }
}
