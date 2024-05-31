package Aulas01;
public class TestePeloTerminal {
    public static void main(String[] args) {
        System.out.println("Oi! Fui executado pelo terminal!");
        System.out.println("Daqui a pouco vou para o GitHub!");
        String nomeCompleto;

        int numeroUm = Integer.parseInt(args[2]);
        int numeroDois = Integer.parseInt(args[3]);
        int resultado = somar(numeroUm, numeroDois);
        
        // Testando a entrada de argumentos
        if (args.length > 0) {
            System.out.println("Você digitou " + args.length + " argumentos:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argumento " + (i + 1) + ": " + args[i]);
            }

            nomeCompleto = args[0] + " " + args[1];

            System.out.printf("Oi! %s! A soma de %d e %d é %d\n", nomeCompleto, numeroUm, numeroDois, resultado);

        } else {
            System.out.println("Você nao digitou argumentos.");
        }
       
    }

    

     // Testando a classe somar
     static int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }
}
