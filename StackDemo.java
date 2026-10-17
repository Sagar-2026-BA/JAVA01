//6a
interface Stack {     
    void push(int item);     
    int pop(); 
}  
    class ArrayStack implements Stack {     
        private int[] stack;     
        private int top;      
        public ArrayStack(int size) {         
        stack = new int[size];         
        top = -1;     

    }      
    public void push(int item) {         
        if (top == stack.length - 1) {             
        System.out.println("Stack Overflow");         

    } 
    else {             
        stack[++top] = item;             
        System.out.println("Pushed " + item);         

    }     
}        
    public int pop() {         
        if (top == -1) {             
        System.out.println("Stack Underflow");             
    return -1;         

    } 
    else {             
        return stack[top--];         

    }     
}
 }  
    public class StackDemo {     
        public static void main(String[] args) {         
        ArrayStack stack = new ArrayStack(5);         
        stack.push(10);         
        stack.push(20);         
    System.out.println("Popped: " + stack.pop());         
    System.out.println("Popped: " + stack.pop());     

    } 
}
