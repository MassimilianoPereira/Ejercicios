

public class Demo {


            public static int suma(int a, int b) {
            return a + b;

            }

            public static int resta(int a, int b){
                return a - b;
            }

            public static int multiplicacion(int a, int b){
                return a * b;
            }

            public static double division(  double a, double  b){
               if (b == 0){
                   return "No se puede dividir entre cero";}
                   else {
                       return a / b;
                   }

            }

    public static void main(String[] args) {
        System.out.println(division(3,0));
    }
}


/*

                //Calcular las operaciones basicas
                int a = 3;
                int b = 4;
                int suma = a + b;
                System.out.println(suma);
                int resta = a - b;
                System.out.println(resta);
                int multi = a * b;
                System.out.println(multi);
                double division = (double) a/b;
                System.out.println(division);


                // Calcular area de rectangulo
                int largo = 5;
                int  ancho = 3;
                int area = largo * ancho;
                System.out.println(area);


                //calcular volumen de un cilindro
                 double radio = 1.5;
                 double altura = largo;
                 double volCilindro = Math.PI * radio * radio * altura;
                 System.out.println(volCilindro);

                 // Calcular velocidad promedio
                double distancia = 15;
                double tiempo = 30;
                double velPromedio = distancia / tiempo;
                System.out.println(velPromedio);

                // Calcular energia cinetica
                double masa = 4;
                double velocidad = 15;
                double energiaCinetica = 0.5 * masa * velocidad;
                System.out.println(energiaCinetica);

                }

            }


*/


