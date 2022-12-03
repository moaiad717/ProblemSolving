import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//  Build a stack that perform pop / peek/ push , and have a getMin method that return the min value in the stack with O(1) complexity
public class MinStacks {


    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(88);
        myStack.push(5);
        myStack.push(4);
        myStack.push(2);
        myStack.push(8);
        myStack.push(1);

        System.out.println(myStack.getMin());

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.getMin());
    }


    static class MyStack{
        List<Integer> myValues;
        Integer myMin;
        Stack<Integer> minValues = new Stack<>();
        public MyStack() {
            this.myValues = new ArrayList<>();
        }

        public void push (Integer val){
            if (myValues.size()==0) {
                myMin = val;
                minValues.push(val);
            }
            else if (val<=myMin){
                myMin= val;
                minValues.push(val);
            }
            this.myValues.add(val);
        }

        public void pop() {
            if (!this.myValues.isEmpty()){
                Integer val = this.myValues.remove(this.myValues.size() - 1);
                if (val == minValues.peek())
                    myMin= minValues.pop();
            }
        }

        public Integer peek() {
            if (!this.myValues.isEmpty())
                return this.myValues.get(this.myValues.size() - 1);
            else
                return null;
        }

        public Integer getMin(){
            if (!minValues.isEmpty())
                    return minValues.peek();
            return null;
        }
    }


}
