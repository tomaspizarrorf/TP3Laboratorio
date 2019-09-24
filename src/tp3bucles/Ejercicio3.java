package tp3bucles;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {

        int numero;
        int resultado = 0;
        int acumulador ;

       

        for (acumulador = 1; acumulador <= 10; acumulador++) {
             numero = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese algun numero "));
            if (numero % 2 == 0 && numero <= 10) {
                System.out.println(numero);
            }

        }

    }

}

