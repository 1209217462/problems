import java.util.Stack;

/**
 * Created by rayfay-nb-001 on 2017/11/4.
 */
//page 5
//两个栈组成队列
public class TwoStackQueue {
    private Stack<Integer> stackPop;
    private Stack<Integer> stackPush;

    public TwoStackQueue(){
        stackPop=new Stack<>();
        stackPush=new Stack<>();
    }

    public void add(Integer newNum){
        stackPush.push(newNum);
    }

    public Integer poll(){
        if (stackPop.isEmpty() && stackPush.isEmpty()){
            throw new RuntimeException("Queue is empty !");
        }
        else if (stackPop.isEmpty()){
            pushToPop();
        }
        return stackPop.pop();
    }

    public Integer peek(){
        if (stackPop.isEmpty() && stackPush.isEmpty()){
            throw new RuntimeException("Queue is empty !");
        }
        else if (stackPop.isEmpty()){
            pushToPop();
        }
        return stackPop.peek();
    }

    public void pushToPop(){
        while(!stackPush.empty()){
            stackPop.push(stackPush.pop());
        }
    }
}
