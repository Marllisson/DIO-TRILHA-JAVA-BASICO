import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametro1 = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametro2 = sc.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            // TODO: handle exception
            System.out.println("Parametro1 Maior que Parametro2!");
        }


    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroDois < parametroUm)
            throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número "+i);
        }
	}

}

