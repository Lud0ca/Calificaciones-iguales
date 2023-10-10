import java.util.Scanner;

public class calificaciones {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float calificacion, primero,segundo,tercero, numero;
        System.out.println("Dame la primera calificacion");
        primero=sc.nextFloat();
        System.out.println("Dame la segunda calificacion");
        segundo=sc.nextFloat();
        System.out.println("Dame la tercera calificacion");
        tercero=sc.nextFloat();

        if (primero>=segundo&&primero>=tercero){
            System.out.println("tu calififcacion semestral es: "+primero);
        } else if (segundo>=primero&&segundo>=tercero) {
            System.out.println("tu calififcacion semestral es: "+segundo);
        } else if (tercero>=primero&&tercero>=segundo) {
            System.out.println("tu calificacion semestral es: "+tercero);
        }
    }
}