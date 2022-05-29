import java.io.PrintStream;

public class Savings extends Account {
    public Savings(Client cliente) {
        super(cliente);
    }

    @Override
    public void PrintInfo() {
        System.out.print("=== Conta Poupança ");
        super.printComumInfo();
    }

}


