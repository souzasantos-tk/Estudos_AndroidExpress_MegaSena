import java.util.Random;

public class Mega_Sena {

    public static void main(String[] args) {

        Random generate = new Random();

        //while (true) vai imprimir no looping infinitos numeros.
        //while (i<6) imprime i até 6.
        // i++ significa que ele aumenta em um em cada looping o valo de i.

        int i = 0;
        while(i<6) {

            int number = generate.nextInt(60);
            System.out.println(number);
            i++;

            // podemos tambem usar conceito de "for" no lugar de while.
            // for(;;) looping infinito.
            //for( int i = 0; i<6; i++){
            //  int number = generate.nextInt(60);
            //         System.out.println(number);
            // }  gerando a saida do looping.
        }
    }
}