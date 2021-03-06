package offer;

import java.util.Stack;

/*
 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
 *
 */
public class Offer_20 {
    public static void main(String[] args) {
        Offer_20 stack =new Offer_20();
        stack.push(6);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(1);
        System.out.println(stack.min());
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
