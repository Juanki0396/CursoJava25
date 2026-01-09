package ud4;

import java.util.ArrayList;

public class IntroCollections {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(23);
        System.out.println("Tamaño: " + arr.size());
        arr.remove(1);
        arr.removeLast();
        arr.add(33);
        for(Integer i : arr){
            System.out.println(i);
        }
        Integer n = arr.get(0);
        System.out.println("n=" + n);
        arr.add(3);
        arr.add(3);
        arr.add(7);
         for(Integer i : arr){
            System.out.println(i);
        }
        int idx = arr.indexOf(33);
        if (idx != -1){
            System.out.println("Encontrado");
        }
        else {
            System.out.println("No encontrado");
        }
    }
    
}
