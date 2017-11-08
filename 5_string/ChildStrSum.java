

/**
 * Created by rayfay-nb-001 on 2017/11/6.
 */
//page 243
//字符串中数字子串求和  a1b2c10 返回13  ,a1b-2c10返回9
public class ChildStrSum {
    public static int numSum(String str){
        boolean isMinusNum=false;
        int sum=0,tmp=0;
        for (char c:str.toCharArray()) {
            if (c=='-'){
                System.out.print(tmp+" ");
                sum+=tmp;
                tmp=0;
                isMinusNum=!isMinusNum;
            }
            else if (('0'<=c &&c<='9')){
                //注意 : (int)'0' == 48
                //tmp=tmp*10+(int)c;
                tmp=tmp*10+ Integer.parseInt(String.valueOf(c));
                if (isMinusNum){
                    tmp=-1*tmp;
                    isMinusNum=false;
                }
            }
            else {
                System.out.print(tmp+" ");
                sum+=tmp;
                tmp=0;
                isMinusNum=false;
            }
        }
        System.out.print(tmp);
        //加上末尾的数字
        sum+=tmp;
        return sum;
    }

    public static void main(String[] args) {
        String s1="a1b2c3"; //6
        String s2="a1b-2c10"; //9
        String s3="a1b--2c10";//13
        String s4="a-1b--2c--d6e";//7
        System.out.println("    result:"+numSum(s1));
        System.out.println("    result:"+numSum(s2));
        System.out.println("    result:"+numSum(s3));
        System.out.println("    result:"+numSum(s4));

    }
}
