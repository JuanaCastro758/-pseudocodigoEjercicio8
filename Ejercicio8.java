import java.util.*;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        Random aleatorio=new Random();
        int cero=0, par=0,impar=0;
        String op;
        System.out.println("Ingrese S para salir");
        do{
            int x=aleatorio.nextInt(10000-0+1)+0;
            if (x % 5==0){
                cero++;
                System.out.println("  "+x);
            }
            op=scanner.nextLine();
        }while (op!="S");
    }
}

