import java.util.Stack;

/**
 * Created by rayfay-nb-001 on 2017/11/2.
 */
//page 1
//设计一个有 getMin 功能的栈  ,可以返回最小值
public class Stack_has_getMin {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    //构造方法
    public Stack_has_getMin() {
        this.stackData=new Stack<Integer>();
        this.stackMin=new Stack<Integer>();
    }
    //push
    public void push(int newNum){
        if (this.stackData.isEmpty()){
            this.stackData.push(newNum);
            this.stackMin.push(newNum);
        }
        else {
            this.stackData.push(newNum);
            if (newNum<=this.getMin()){
                this.stackMin.push(newNum);
            }
        }
    }
    //pop
    public Integer pop(){
        if (this.stackData.isEmpty()){
            throw new RuntimeException("pop():stack is empty !");
        }
        int tmp=this.stackData.pop();
        if (tmp==this.getMin()){
            this.stackMin.pop();
        }
        return tmp;
    }
    //getMin
    public Integer getMin(){
        if (this.stackMin.isEmpty()){
            throw new RuntimeException("getMin():stack is empty !");
        }
//        int min=this.stackMin.pop();
//        this.stackMin.push(min);
//        return min;

        //查看栈顶元素,但是不移除它
        return this.stackMin.peek();
    }
}
