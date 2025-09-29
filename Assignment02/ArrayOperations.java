import java.util.Arrays;
import java.util.Scanner;

class GenericArray<T> {
    private T[] elements;
    
    @SuppressWarnings("unchecked")
    public GenericArray(int size) {
        elements = (T[]) new Object[size];
    }
    
    public void add(int index, T value) {
        if (index >= 0 && index < elements.length) {
            elements[index] = value;
        }
    }
    
    public T get(int index) {
        return elements[index];
    }
    
    public void display() {
        for (T item : elements) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    
    public int find(T target) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null && elements[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
    
    public void remove(int index) {
        elements[index] = null;
    }
}

public class ArrayOperations {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = {5, 10, 15, 20, 25, 30};
        System.out.println("Original array:");
        print(numbers);
        
        int target = 20;
        int position = search(numbers, target);
        if (position != -1) {
            System.out.println("Found " + target + " at index " + position);
        } else {
            System.out.println(target + " not found");
        }
        
        int[] updated = insert(numbers, 3, 99);
        System.out.println("After inserting 99:");
        print(updated);
        
        int[] modified = delete(updated, 15);
        System.out.println("After deleting 15:");
        print(modified);
        
        sort(modified);
        System.out.println("After sorting:");
        print(modified);
        
        GenericArray<String> names = new GenericArray<>(3);
        names.add(0, "Ali");
        names.add(1, "Sara");
        names.add(2, "Zain");
        System.out.println("\nGeneric array of names:");
        names.display();
        
        int idx = names.find("Sara");
        System.out.println("Sara found at: " + idx);
        
        names.remove(1);
        System.out.println("After removing Sara:");
        names.display();
        
        sc.close();
    }
    
    public static void print(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    public static int[] insert(int[] arr, int pos, int val) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        result[pos] = val;
        for (int i = pos; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }
    
    public static int[] delete(int[] arr, int target) {
        int count = 0;
        for (int n : arr) {
            if (n == target) count++;
        }
        
        int[] result = new int[arr.length - count];
        int j = 0;
        for (int n : arr) {
            if (n != target) {
                result[j++] = n;
            }
        }
        return result;
    }
    
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }
}