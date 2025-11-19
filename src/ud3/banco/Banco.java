package ud3.banco;

import java.util.ArrayList;


public class Banco {
    String nombre;
    ArrayList<Cuenta> cuentas;

    public Banco(String nombre){
        this.nombre = nombre;
        this.cuentas = new ArrayList<Cuenta>();
    }

    public Cuenta añadirCuenta(String cliente){
        Cuenta c = new Cuenta(cliente);
        this.cuentas.add(c);
        return c;
    }

    public void hacerTransaccion(String cliente, double cantidad){
        for(Cuenta c: this.cuentas){
            if (c.cliente.equals(cliente)){
                try{
                    c.hacerTransaccion(cantidad);
                }
                catch(SaldoInsuficienteException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void imprimirInfo(){
        System.out.println("Banco " + this.nombre);
        System.out.println("------------------------");
        for(Cuenta c : this.cuentas){
            System.out.println(c.getInfo());
        }
    }

    public static void main(String[] args){
        Banco santander = new Banco("Santander");
        santander.añadirCuenta("Javi");
        santander.añadirCuenta("Lola");
        santander.hacerTransaccion("Javi", 200);
        santander.hacerTransaccion("Lola", 500);
        santander.imprimirInfo();
        santander.hacerTransaccion("Javi", -20);
        santander.hacerTransaccion("Lola", -2000);
        santander.imprimirInfo();
    }
    
}
