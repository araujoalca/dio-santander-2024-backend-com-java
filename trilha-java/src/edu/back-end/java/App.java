public class App {
    public static void main(String[] args) throws Exception {


        System.out.println("Hello, World!");
        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        numero = - numero;
        System.out.println(numero);

        boolean cachorro = false;

        String brinquedo;
        brinquedo = cachorro ? "osso" : "arranhador";
        System.out.println(brinquedo);

        String nomeUm, nomeDois;
        nomeUm = "Maria";
        nomeDois = new String("Maria");
        System.out.printf("nomeUm == nomeDois: %s", nomeUm.equals(nomeDois));
    }
    
}
