package ud4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercises {

    public static void ejercicio5(){
        List<Integer> lista = new ArrayList<>(List.of(1, -3, 4 ,6, -3 ,10));

        System.out.println(lista);

        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if(i<0){
                it.remove();
            }
        }
        System.out.println(lista);

    }

    public static void ejercicio7(){
        List<String> lista = new ArrayList<>(List.of("java", "java", "perro", "gato", "perro", "java"));
        Map<String, Integer> contador = new HashMap<>();

        for(String palabra : lista){
            Integer rep = contador.getOrDefault(palabra, 0);
            contador.put(palabra, rep + 1);
        }

        System.out.println(contador);
    }

    public static void ejercicio9(){
        Map<Integer, String> registro = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Boolean working = true;
        while (working) {
            System.out.println("Desea añadir(1), buscar un producto(2), salir(3): ");
            Integer action = sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 1:
                    System.out.println("Introduce código");
                    Integer code = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce nombre de producto");
                    String prod = sc.nextLine();
                    registro.put(code, prod);
                    break;
                case 2:
                    System.out.println("Introduce código");
                    Integer codProducto = sc.nextInt();
                    sc.nextLine();
                    System.out.printf("El producto asocidado al código %d es %s\n", codProducto, registro.getOrDefault(codProducto, "NO EXISTE"));
                    break;
                case 3:
                    working = false;
                    break;
            }
            
        }
    }

    public static void main(String[] args) {
        ejercicio9();
    }
    
}
