package Quiz01;
// package Quiz01;
class ArrayManager{
    int capacity;
    int size;
    int[] arr;
    
    ArrayManager(int capacity){
        this.capacity = capacity;
        this.size = 0;
        arr = new int[capacity];
    }
    
    void insert(int value){
        if(size < capacity){
            arr[size] = value;
            size++;
        } else {
            System.out.println("The length of Array is Full..");
        }
    }
    void delete(int indexNumber){
        if(indexNumber < 0 || indexNumber >= size){
            System.out.println("Index is invalid");
            return;
        }
        if(size == 0){
            System.out.println("Array is Empty");
            return;
        }
        for(int i = indexNumber; i < size - 1; i++){
            arr[i] = arr[i+1];
        }
        size--;
    }

        void display(){
            for(int i = 0; i < size; i++){
                System.out.print(arr[i] + " , ");
            }
            System.out.println("");
        }

        void sort(){ // O(n square)
            for(int i = 0; i < size - 1; i++){

                for(int j = 0; j < size - i - 1; j++){

                    if(arr[j] > arr[j + 1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }

                }
            }
        }
}
public class ArrayManage {


    public static void main(String[] args){
        ArrayManager AM = new ArrayManager(100);
        // Insert the number in last
        AM.insert(80);
        AM.insert(88);
        AM.insert(90);
        AM.insert(70);
        AM.insert(66);
        System.out.print("Marks After insertion : ");
        AM.display();
        //Delete the value by the refer of index number
        AM.delete(1); // the value deleted of index number 1
        //Display the array
        System.out.print("Array after Deletion at Index 1: ");
        AM.display(); // Display 80 , 90 , 70 , 66 ,     //because 88 is deleted with the index 1
        //Sort the existing Array 
        AM.sort();
        //Display the Array
        System.out.print("After Sorted Array : ");
        AM.display(); //Display 66 , 70 , 80 , 90 , //Array is Sorted :
    }
}