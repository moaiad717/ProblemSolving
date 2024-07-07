package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/min-stack/
 */
class MinStack {

    List<Integer> myValues;
    int myMin;
    Stack<Integer> minValues = new Stack<>();
    public MinStack() {
        this.myValues = new ArrayList<>();

    }

    public void push(int val) {
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
            int val = this.myValues.remove(this.myValues.size() - 1);
            if (val == minValues.peek()) {
                minValues.pop();

            if (minValues.isEmpty())
                myMin=0;
            else
                myMin= minValues.peek();
            }
        }
    }


    public int top() {
        if (!this.myValues.isEmpty())
            return this.myValues.get(this.myValues.size() - 1);
        else
            return -1;

    }

    public Integer getMin() {
        if (!minValues.isEmpty())
            return minValues.peek();
        return null;
    }
}