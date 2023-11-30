import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int numero;
       String agencia;
       String nome;
       double saldo;

       System.out.println("Informe o Numero da conta: ");
       numero = sc.nextInt(); 

       sc.nextLine(); 
       System.out.println("Informe Seu Agencia: ");
       agencia = sc.nextLine();

       System.out.println("Informe Seu Nome: ");
       nome = sc.nextLine();

       System.out.println("Informe Seu Saldo ");
       saldo = sc.nextDouble();

       System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque"); 



        


    }
}
