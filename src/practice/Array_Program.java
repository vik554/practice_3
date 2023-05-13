package practice;

public class Array_Program {
    public static void main(String[] args) {
        Array_Program s1 = new Array_Program();
        s1.printarray();
    }


    public void printarray() {
        char[] arr = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);


        }
    }
}