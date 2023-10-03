import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        float saldo=1000;
        float   ingreso, retiro;
        while (opcion != 3) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido a su cajero confiable  pato donall\n"
                    + "1. ingresar dinero ala cuenta\n"
                    + "2.retirar dinero de la cuenta\n"
                    + "3.salir"));

            switch (opcion) {
                case 1:
                    ingreso = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad que desea agregar a la cuenta:"));
                   saldo =  (saldo + ingreso);
                    JOptionPane.showMessageDialog(null, "dinero en cuenta:" + saldo);
                    break;
                case 2:
                    retiro = Float.parseFloat(JOptionPane.showInputDialog("digitar la cantidad que desea retirar"));

                    if (retiro > saldo) {
                        JOptionPane.showInputDialog(null, "no cuenta con fondos suficientes !siga soñando¡");

                    } else {
                        saldo =  (saldo  -retiro);
                        JOptionPane.showMessageDialog(null, "dinero en cuenta" + saldo);
                    }
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "se equivoco de opcion de menu !no monte cartilla¡");
                    break;
            }


            }
        }
    }