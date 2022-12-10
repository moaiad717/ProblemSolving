package stack;

import java.util.Stack;

public class  SortStack  {

    public Stack<Integer> sort(Stack<Integer> s)
    {
        //add code here.

        Stack<Integer> result = new Stack<>();

        while (!s.isEmpty()){
            int temp = s.pop();

            while (!result.isEmpty() && result.peek()>temp){

                s.push(result.pop());
            }
            result.push(temp);
        }
        return result;
    }
}
