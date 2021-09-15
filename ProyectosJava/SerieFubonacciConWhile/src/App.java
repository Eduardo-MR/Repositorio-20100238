import java.util.Scanner;

public class App {
    
    private static Scanner sc;
    public static void main(String[] args) throws Exception {
        int Numero, i = 0, valor1 = 0, valor2 = 1, Siguiente;
        sc = new Scanner(System.in);
        System.out.println("Ingrese cualquier valor: ");
        Numero = sc.nextInt();

        while(i< Numero){
            if(i <=1){
                Siguiente = i;
            }
            else{
                Siguiente = valor1 + valor2;
                valor1 = valor2;
                valor2 = Siguiente;
            }
            System.out.println(Siguiente);
            i++;
        }
    }
}
