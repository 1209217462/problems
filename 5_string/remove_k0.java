/**
 * Created by rayfay-nb-001 on 2017/11/6.
 */
//page 245
//去掉字符串中连续的k个0
public class remove_k0 {
    public static String removeKZeros(String str,int k){
        char arr[]=str.toCharArray();
        int count=0,start=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]=='0'){
                count++;
                start=(start==-1)?i:start;
            }
            else {
                if (count==k){
                    while (count--!=0){
                        arr[start++]=0;
                    }
                }
                count=0;
                start=-1;
            }
        }
        if (count==k){
            while (count--!=0){
                arr[start++]=0;
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String s1="a00b";int k1=2; //返回  "ab"
        String s2="a0000b000";int k2=3; //返回 "a0000b"

        System.out.println(removeKZeros(s1,k1));
        System.out.println(removeKZeros(s2,k2));

    }
}
