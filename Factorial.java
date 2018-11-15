package factorial;

public class Factorial {

    /*Hacemos clic en Source > Format para que el programa formatee el código y 
    lo ordene automáticamente*/
    public static void main(String[] args) {

        int j = 8;//le damos un valor inicial a la variable al declarla
        int f;
        int i;
        /*se mueve esta variable al mismo sitio que el resto para 
        tenerlas en orden*/

        if (j == 0) {
            f = 1;
        } else {
            f = 1;
            for (i = j; i >= 1; i--) {
                f = f * i;
            }
        }

        System.out.println(f);

    }

}
