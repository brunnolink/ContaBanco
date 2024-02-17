import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int confirmacaoDeposito;
        System.out.println("Por favor, digite o nome do titular:");
        contaBancaria.titular = scanner.nextLine();
        System.out.println("Por favor, digite o número da agência:");
        contaBancaria.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        contaBancaria.numero = scanner.nextInt();
        
        
        
        

        System.out.println("Olá " + contaBancaria.titular + ", obrigado por criar uma conta em nosso banco, sua agência é: [" + contaBancaria.agencia + "], conta: [" + contaBancaria.numero + "] e seu saldo é de: R$" + contaBancaria.saldo);
        
        System.out.println("Gostaria de depositar um valor? Digite 1 para sim e 2 para não");
        confirmacaoDeposito = scanner.nextInt();

        if (confirmacaoDeposito == 1) {
        
        System.out.println("Quanto você gostaria de depositar?");
        
        contaBancaria.deposito = scanner.nextDouble();
        contaBancaria.saldo = contaBancaria.saldo + contaBancaria.deposito;
        System.out.println("Seu saldo é de: R$" + contaBancaria.saldo + "Já disponível para saque.");
        } else {
            System.out.println("Obrigado e tenha um ótimo dia.");
        }
        
    }
}
