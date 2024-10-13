import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre = "Song kang";
        String tipoDeCuenta = "Débito";
        double saldo = 50000.89;
        int opcion = 0;

        System.out.println("**************");
        System.out.println("\nNombre del Cliente:"+ nombre);
        System.out.println(" El Tipo de Cuenta es:" + tipoDeCuenta);
        System.out.println("El Saldo disponible es:"+ saldo + "$");
        System.out.println("\n**************");

        String menu = """
                **** Escriba el número de la opcion deseada ****
                1- Consultar Saldo
                2- Retirar
                3- Depositar
                5- Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion !=5 ){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Tu saldo es:" + saldo+ "$");
                    break;
                case 2:
                    System.out.println("¿cuanto deseas retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar){
                        System.out.println("tu saldo es insuficiente");
                    }else {
                        saldo = saldo - valorARetirar;
                        System.out.println("el saldo actual es:" + saldo);
                    }
                    break;
                case  3:
                    System.out.println("¿cuanto deseas depositar?:");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El Saldo Actual es de:" + saldo);
                    break;
                case 5:
                    System.out.println("vuelve pronto");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }

    }
}