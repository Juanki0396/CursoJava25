package ud4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class PhoneBook {
    private Map<String,String> contacts;

    public PhoneBook(){
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String number){
        this.contacts.put(name, number);
    }

    public void addContact(String name, Integer number){
        this.contacts.put(name, number.toString());
    }

    public String getNumber(String name){
        return this.contacts.getOrDefault(name, "");
    }

    public boolean isContactIn(String name){
        return this.contacts.containsKey(name);
    }

    public void printContacts(){
        for(Entry<String, String> e : this.contacts.entrySet()){
            System.out.printf("%s: %s\n", e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        boolean runProgram = true;
        Scanner sc = new Scanner(System.in);
        PhoneBook agenda = new PhoneBook();
        while (runProgram) {
            System.out.println("¿Que desea hacer?");
            System.out.println("1 - Agregar contacto");
            System.out.println("2 - Buscar contacto");
            System.out.println("3 - Imprimir la agenda");
            System.out.println("4 - Salir");
            System.out.print("Acción: ");
            Integer accion = sc.nextInt();
            sc.nextLine();
            switch (accion) {
                case 1:
                    System.out.print("Introduce nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Introduce teléfono: ");
                    String numero = sc.nextLine();
                    agenda.addContact(nombre, numero);
                    break;
                case 2:
                    System.out.print("Introduce nombre: ");
                    String n = sc.nextLine();
                    if(agenda.isContactIn(n)){
                        System.out.printf("%s: %s\n", n, agenda.getNumber(n));
                    }
                    else {
                        System.out.println("El contacto introducido no existe.");
                    }
                    break;
                case 3:
                    agenda.printContacts();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor, introduce un número que corresponda a una de las acciones listadas.");
                    break;
            }
        }
    }
}
