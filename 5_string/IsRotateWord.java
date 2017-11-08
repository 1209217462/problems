/**
 * Created by rayfay-nb-001 on 2017/11/7.
 */
//page 247
public class IsRotateWord {
    public static boolean isRotate(String str1,String str2){
        if (str1.length()!=str2.length()){
            return false;
        }

        str1=str1+str1;
//        return str1.contains(str2);//两种方式
       return str1.indexOf(str2)!=-1;//这个复杂度为 O(N)

    }


    public static void main(String[] args) {
        String a1="1234",a2="3412";//true
        String b1="abc",b2="acb";//false
        System.out.println(isRotate(a1,a2));
        System.out.println(isRotate(b1,b2));
    }

}
