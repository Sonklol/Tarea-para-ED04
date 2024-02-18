package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 2300, 695);
    }
    
    public static void operativa_cuenta(CCuenta cuenta, float cantidadRetirar, float cantidadIngresar) {
        try {
            cuenta.retirar(cantidadRetirar);
            System.out.println("Retiro exitoso de: " + cantidadRetirar);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        try {
            cuenta.ingresar(cantidadIngresar);
            System.out.println("Ingreso exitoso de: " + cantidadIngresar);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: ");
        }
    }
}
