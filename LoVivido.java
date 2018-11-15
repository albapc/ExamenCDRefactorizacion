/*
 * Examen Refactorizacion
 * 
 */
package loVivido;

import javax.swing.JOptionPane;

public class LoVivido {

    /*Hacemos clic en Source > Format para que el programa formatee el código y 
    lo ordene automáticamente*/
    public static void main(String[] args) {
        //inicializamos las variables, cambiándolas por un nombre más claro
        String nombre;
        String edad;

        int meses;
        int dias;
        int horas;
        int anhos;

        //el usuario introduce su nombre y su edad para registrarlos
        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        //se asocia el valor de edad a años
        anhos = Integer.parseInt(edad);

        //se multiplican esos valores y se asocian del siguiente modo:
        meses = (anhos * 12);
        dias = (anhos * 365);
        horas = (dias * 24);

        /*aparecen tres cuadros emergentes que indican los meses, días y horas
        vividos por el usuario*/
        JOptionPane.showMessageDialog(null, "Meses: " + meses, "Numero de meses "
                + "vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dias, "Numero de días "
                + "vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas "
                + "vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
        
    //método para indicar la finalización del programa
        System.exit(0);

    }

}
