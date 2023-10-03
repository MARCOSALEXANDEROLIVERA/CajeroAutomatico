import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final int saldo_inicial =10000;
        int opcion;
        float ingreso,saldoActual,retiro;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido a su cajero confiable  pato donall\n"
        +"1. ingresar dinero ala cuenta\n"
        +"2.retirar dinero de la cuenta\n"
        +"3.salir"));
        switch(opcion){
            case 1: ingreso = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad que desea agregar a la cuenta:"));
            saldoActual = saldo_inicial+ingreso;
            JOptionPane.showMessageDialog(null,"dinero en cuenta:"+saldoActual);
            break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("digitar la cantidad que desea retirar"));

            if(retiro>saldo_inicial){
                JOptionPane.showInputDialog(null,"no cuenta con fondos suficientes !siga soñando¡");

            }
           else{
               saldoActual = saldo_inicial-retiro;
               JOptionPane.showMessageDialog(null,"dinero en cuenta"+saldoActual);
            }
            break;
           case 3:break;
            default: JOptionPane.showMessageDialog(null,"se equivoco de opcion de menu !no monte cartilla¡");break;
        }
    }
}