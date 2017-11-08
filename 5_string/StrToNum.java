import org.omg.CORBA.INTERNAL;

/**
 * Created by rayfay-nb-001 on 2017/11/7.
 */
//page 248
public class StrToNum {

    public static int strToNum(String str){

        char arr[]=str.toCharArray();
        if (!isValid(arr))
            return 0;

        boolean posi=arr[0]=='-'?false:true; //是否是负数
        int minq= Integer.MIN_VALUE /10;
        int minr=Integer.MIN_VALUE %10;
        int res=0;
        int cur=0;
        for (int i=posi?0:1;i<arr.length;i++){
            cur='0'-arr[i];
            if ((res<minq) || (res==minq && cur==minr)){
                return 0;
            }
            res=res*10+cur;
        }
        //正数 绝对值==MIN_VALUE ,溢出了一位
        if (posi && res==Integer.MIN_VALUE){
            return 0;
        }
        return posi?-res:res;

    }

    public static boolean isValid(char arr[]){
        //开头不是负号或者数字
        if (arr[0]!='-' && (arr[0]>'9' || arr[0]<'0')){
            return false;
        }
        //开头负号时,后面为0
        if (arr[0]=='-' && (arr.length==1 || arr[1]==0)){
            return false;
        }
        //开头为0 ,且后面还有
        if (arr[0]=='0' && arr.length>1){
            return false;
        }

        //检查 1 到 n-1 是否全是数字
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>'9' || arr[i]<'0'){
                return false;
            }
        }
        return true;
    }
}
