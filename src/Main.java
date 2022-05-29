public class Main {
    public static void main(String[] args) {
        Client cliente = new Client();
        cliente.setName("Augusto");
       Account contaC = new Checking_Account(cliente);
        Account contaP = new Savings(cliente);

        contaC.PrintInfo();
        contaP.PrintInfo();


    }
}
