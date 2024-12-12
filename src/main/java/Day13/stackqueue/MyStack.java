package Day13.stackqueue;

class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        if (top == 999) {
            return;
        }
        this.arr[++this.top] = x;
    }

    public int pop() {
        if(this.top < 0){
            return -1;
        }
        return this.arr[this.top--];
    }
}