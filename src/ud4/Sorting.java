package ud4;

import java.util.Random;

public class Sorting {

    public static Integer[] generateRandomArray(Integer size){
        Integer[] arr =  new Integer[size];
        Random r = new Random();
        for(Integer i = 0; i < size; i++){
            arr[i] = r.nextInt(0,100);
        }
        return arr;
    }

    public static Integer[] bubbleSort(Integer[] arrayToSort){
        for(Integer i = 0; i < arrayToSort.length ; i++){
            for(Integer j = 0; j < arrayToSort.length - i - 1; j++){
                Integer n1 = arrayToSort[j];
                Integer n2 = arrayToSort[j+1];
                if(n1 > n2){
                    arrayToSort[j] = n2;
                    arrayToSort[j+1] = n1;
                }
            }
        }
        return arrayToSort;

    }

    public static void quicksort(Integer[] arr, Integer begin, Integer end){
        if(end - begin == 1){
            return;
        }
        if(end-begin == 2){
            Integer n1 = arr[begin];
            Integer n2 = arr[end];
            if(n2 < n1){
                arr[begin] = n2;
                arr[end] = n1;
            }
            return;
        }

        Integer pivot = arr[end];
        Integer pivotPoint = begin;
        for(Integer i = begin; i < end; i++){
            Integer n = arr[i];
            if(n > pivot){
                pivotPoint = i;
            }
            if(n < pivot && i > pivotPoint){
                Integer n2 = arr[pivotPoint];
                arr[i] = n2;
                arr[pivotPoint] = n;
                pivotPoint = i;
            }
        }
        Integer nPivot = arr[pivotPoint];
        arr[end] = nPivot;
        arr[pivotPoint] = pivot;
        quicksort(arr, begin, pivotPoint - 1);
        quicksort(arr, pivotPoint + 1, end);
    }

    public static void printArray(Integer[] arr){
        System.out.print("[ ");
        for(Integer n : arr){
            System.out.printf("%d ", n);
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Integer[] arr = generateRandomArray(10);
        printArray(arr);
        quicksort(arr, 0, arr.length - 1);
        printArray(arr);
    }
    
}