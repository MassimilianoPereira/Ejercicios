import java.util.Scanner;


public class Calculator{
    public static void main(String[] args){
        int num1, num2, opcion;


        Scanner teclado = new Scanner(System.in);
                System.out.print("Choose there number: ");
                System.out.print("Number 1: ");
                num1 = teclado.nextInt();
                System.out.print("Choose there other number: ");
                num2 = teclado.nextInt();


                System.out.println(" Opciones:");
                System.out.print(" Sumar: 1");
                System.out.print(" Restar: 2");
                System.out.print(" Multiplicar: 3");
                System.out.print(" Dividir: 4 ");


                    System.out.println("Write the operation that you want use: ");
                    opcion = teclado.nextInt();
                    switch (opcion){
                    case 1:
                    System.out.println("La suma es " + (num1 + num2));
                    break;
                        case  2:
                    System.out.println("La resta es " + (num1-num2));
                    break;
                        case 3:
                    System.out.println("La multiplicacion es " + (num1*num2));
                    break;
                        case 4:
                            if (num2 != 0) {
                                System.out.println("The division is " + (num1 / num2));
                            } else {
                                System.out.println("Cannot divide by zero");
                            }
                    break;
                        default:
                            System.out.println("Choose one operation please");
                }

    }

}
