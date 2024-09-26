public abstract class ContaBancaria {
    // Atributos da conta bancária
    private String titular;
    private double saldo;

    // Construtor para inicializar a conta com o nome do titular e saldo inicial
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saque inválido. Verifique o valor e o saldo disponível.");
        }
    }

    // Método para verificar o saldo atual
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);    
    }
}
