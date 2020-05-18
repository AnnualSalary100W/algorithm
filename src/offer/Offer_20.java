package offer;

import java.util.Stack;

public class Offer_20 {
    public static void main(String[] args) {

    }


    private Stack<Integer> stack= new Stack<>();
    private Stack<Integer> minStack =new Stack<>();
    public void push(int node) {
        if(stack.isEmpty()){
            stack.push(node);
            minStack.push(node);
            return;
        }
        int topVal=minStack.peek();
        if(node>topVal){
            minStack.push(topVal);
        }else{
            minStack.push(node);
        }

        stack.push(node);


    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
