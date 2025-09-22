package STACK;

public class Stack {
    // size of stack.
    private int arr [] = new int[100];
    private int idx = 0;


    public void push(int x){ // TC - O(1)
        arr[idx] = x;
        idx++;
    }
    public int peack(){ // TC - O(1)
        if(idx == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[idx-1];

    }
    public int pop(){ // TC - O(1)
        if(idx == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        int top = arr[idx - 1];
        arr[idx-1] = 0;
        idx--;
        return top;
    }
    public int size(){
        return idx;
    } // TC - O(1)
    public boolean isEmpty(){ // TC - O(1)
        if(idx == 0) return true;
        return  false;
    }

    public void display(){ // TC - O(N) where N is the length of elements in Stack
        for (int i = 0; i < idx; i++) {
            System.out.print(  arr[i] + " ");
        }
        System.out.println();
    }
    public boolean isStackFull(){ // TC - O(1)
        if(idx == arr.length) return true;
        return false;
    }

}
