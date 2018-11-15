package factorial;

public class Factorial {

    /*Hacemos clic en Source > Format para que el programa formatee el código y 
    lo ordene automáticamente*/
    public static void main(String[] args) {

        int justificacion = 8;/*le damos un valor inicial a la variable 
        al declarla*/
        int factorial;
        int nImaginario;
        /*se mueve esta variable al mismo sitio que el resto para 
        tenerlas en orden*/

        //si se cumple esta condición
        if (justificacion == 0) {
            factorial = 1; //el resultado es este
        } else { //si no se cumple
            factorial = 1;
            for (nImaginario = justificacion; nImaginario >= 1; nImaginario--) {
                factorial = factorial * nImaginario;
                /*se multiplica el
                nImaginario (8) por el factorial (1) y el se repite el bucle 8
                veces, y se va decrementado el nImaginario*/
            }
        }

        System.out.println(factorial); /*se muestra en pantalla el resultado
        de la variable factorial*/

    }

}
