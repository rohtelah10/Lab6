// 2. Create a program with a logic that throws the
// ArrayIndexOutOfBoundsException while accessing elements in an array.[Hint:
// Use array and loop and try to access the element beyond the last index]


public class ajp8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 

        arrException ae = new arrException();
        ae.throwError12(arr);
    }
}

class arrException{
    public void throwError12(int[] arr){
        try {
            for (int i = 0; i < 10; i++) {
                arr[i] = 0;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array out of bound");
        }
    }
}