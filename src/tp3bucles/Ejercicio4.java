package tp3bucles;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        int i;
        int numero;
        int numeroPositivo = 0;
        int numeroNeutro = 0;
        int numeroNegativo = 0;
       
               

        for (i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese algun numero "));
            if (numero == 0) {
                numeroNeutro++;
            } else if (numero > 0) {
                numeroPositivo++;
            } else {
                numeroNegativo++;
            }

        }
        System.out.println("Cant positivos = " + numeroPositivo + "Cant Neutros =  " + numeroNeutro + " Cant Negativos = " + numeroNegativo);
    }
    
}
