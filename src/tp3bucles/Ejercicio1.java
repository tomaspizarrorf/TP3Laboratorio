package tp3bucles;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        int multiplicado;
        int multiplicador;
        int resultado = 0;

        multiplicado = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero del que desea ver las tablas"));
        for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
            resultado = multiplicado * multiplicador;
             System.out.println(resultado);

        }

       
    }

}
