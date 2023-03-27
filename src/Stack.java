public class Stack {
    int[]stack_arr;
    int top=-1;
   int  max=0;
   Stack(int size){
    max=size;
    stack_arr =new int[max];
    }
    //push
    public void push(int data){
       //stack full
        if(top==max-1){
            System.out.println("stack overflow");
            return;
        }
        top=top+1;
        stack_arr[top]=data;
    }
    //pop
    public int pop(){
       //empty
       if(top==-1){
           System.out.println("stack underflow");
           return -1;
       }
      int val =stack_arr[top];
      top=top-1;
      return val;
    }
    //peek
    public int peek(){
        //empty
        if(top==-1){
            System.out.println("stack underflow");
            return -1;
        }
        else{
            return stack_arr[top];
        }
    }

    public static void main(String[] args) {
        Stack s =new Stack(4);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println();
        s.peek();
        s.pop();
    }
}
