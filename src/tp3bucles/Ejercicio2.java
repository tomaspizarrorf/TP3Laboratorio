package tp3bucles;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        int numero;
        int potencia = 2;
        int resultado;
        int i;

        for (i = 0; i <= 10; i++) {

            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero "));
            resultado = numero * numero;
            System.out.println(resultado);

        }

    }
    

}
