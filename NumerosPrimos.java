package numerosprimos;

/**
 *
 * @author sAfOrAs //el nombre del autor iría aquí
 */
public class NumerosPrimos {

    /*Listar los numeros según el numero de digitos indicado
    Considero solo hasta numeros menores a 100000 (5 digitos), por el hecho de 
    que buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
     */
    
    public static boolean primo = false;

    public static void main(String arg[]){ /*Hacemos clic en Source > Format para 
    que el programa formatee el código y lo ordene automáticamente*/ 
        int numDigitos; //no es necesario inicializarlos a 0
        int nDigitos; //parte de la segunda palabra en mayúscula
        int nImaginario; 
        int divisionEntera;
        
        numDigitos = Integer.parseInt(arg[0]);
        
        if (numDigitos <= 0) {
            System.out.println("Ingrese como parámetro un número de dígitos "
                    + "correcto (mayor que 0): ");
        }
        for (nImaginario = 1; nImaginario <= 99999; nImaginario++) {
            divisionEntera = nImaginario;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            nDigitos = contador;

            if (nDigitos == numDigitos) {
                if (nImaginario < 4) {
                    primo = true;
                } else {
                    if (nImaginario % 2 == 0) {
                        primo = false;
                    } else {
                        int contador1 = 0;
                        int nImaginario1 = 1;
                        int limite = (nImaginario - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (nImaginario1 <= limite) {
                            if (nImaginario % nImaginario1 == 0) {
                                contador1++;
                            }
                            nImaginario1 += 2;
                            if (contador1 == 2) {
                                nImaginario1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            primo = true;
                        }
                    }
                }

                if (primo == true) {
                    System.out.println(nImaginario);
                }
            }
        }
    }

}
