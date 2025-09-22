package QUEUE;

public class selfqueue {
    private int front = -1;
    private int rere = -1;
    private int arr [] = new int[100];
    private int size = 0;
    public void add(int val){ // TC -O(1)
        if(rere == arr.length){
            System.out.println("queue size is full");
            return;
        }
        if(front == -1){
            front = rere = 0;
            arr[0] = val;
        }
        else {
            arr[rere+1] = val;
            rere++;
        }
        size++;
    }
    public int remove(){ // TC -O(1)
        if(size <= 0){
            System.out.println("queue is empty");
            return -1;
        }
        front++;
        size--;
        return arr[front-1];

    }

    public int peek(){
        return arr[front];
    } 

    public boolean isEmpty(){ // TC -O(1)
        return arr.length == 0;

    }

    public void display(){ // TC -O(N) where N is the number of elements present in queue
        for (int i = front; i <= rere ; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public int getSize(){
        return size;
    } 
}
