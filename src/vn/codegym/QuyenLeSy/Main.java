package vn.codegym.QuyenLeSy;

public class Main {
    public static void main(String[] args) throws Exception {
        MyStack<Integer> myStack = new MyStack<>();
        int[] arr = new int[5];

        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 0;
        arr[4] = 2;

        for (int i = 0; i < arr.length; i++){
            myStack.push(arr[i]);
        }

        int j = 0;

        while (!myStack.isEmpty())
        {
            arr[j] = myStack.pop();
            j++;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
