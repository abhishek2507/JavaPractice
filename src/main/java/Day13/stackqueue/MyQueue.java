package Day13.stackqueue;

class MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    MyQueue()
    {
        front=0;
        rear=0;
    }

    //Function to push an element x in a queue.
    void push(int x)
    {
        if (this.rear == 100004) {
            return;
        }
        arr[this.rear++]=x;
    }

    //Function to pop an element from queue and return that element.
    int pop()
    {
        if(rear == front){
            return -1;
        }
        int value = arr[this.front++];
        return value;
    }
}