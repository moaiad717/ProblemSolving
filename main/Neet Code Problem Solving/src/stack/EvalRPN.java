package stack;

import java.util.Stack;

public class EvalRPN {

    public int evalRPN(String[] tokens) {
        Stack<Integer> calculatedNums= new Stack<>();

        for (String c: tokens){

            switch (c){
                case "+":{
                    Integer a = Integer.valueOf(calculatedNums.pop());
                    Integer b = Integer.valueOf(calculatedNums.pop());
                    calculatedNums.push(b + a);
                    break;
                }

                case "-":{
                    Integer a= Integer.valueOf(calculatedNums.pop());
                    Integer b =Integer.valueOf(calculatedNums.pop());
                    calculatedNums.push(b-a);
                    break;
                }

                case "*": {
                    Integer a = Integer.valueOf(calculatedNums.pop());
                    Integer b = Integer.valueOf(calculatedNums.pop());
                    calculatedNums.push(b * a);
                    break;
                }
                case "/":{
                    Integer a= Integer.valueOf(calculatedNums.pop());
                    Integer b =Integer.valueOf(calculatedNums.pop());
                    calculatedNums.push(b/a);
                    break;
                }

                default:
                    calculatedNums.push(Integer.valueOf(c));
            }
        }
        return calculatedNums.pop();
    }

}
