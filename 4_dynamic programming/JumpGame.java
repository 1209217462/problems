/**
 * Created by rayfay-nb-001 on 2017/11/6.
 */
public class JumpGame {

    public static int jump(int arr[]){
        if (arr.length==0 || arr==null){
            return 0;
        }
        int jump=0; //目前跳跃步数
        int cur=0;  //只跳jump能到的最远位置
        int next=0; //多跳一步能到的位置
        for (int i = 0; i < arr.length; i++) {
            if (cur<i){
                jump++;
                cur=next;
            }
            next=Math.max(next,i+arr[i]);
        }
        return jump;
    }

    public static void main(String[] args) {
        int arr[]={3,2,3,1,1,4}; //应返回 2
        System.out.println(jump(arr));
    }
}
