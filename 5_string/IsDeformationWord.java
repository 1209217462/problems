

/**
 * Created by rayfay-nb-001 on 2017/11/5.
 */
//page 242
//判断两个字符串是否互为变形词 如 123 321 231 等
public class IsDeformationWord {

    public boolean isDeformation(String str1,String str2){
        if (str1.length()!=str2.length()){
            return false;
        }
        int map[]=new int[256];

        //因为字符串长度一样, ++ 和 -- 次数一样多,所以没有负数就是完全相等的
        for (char c:str1.toCharArray()) {
            map[c]++;
        }
        for (char c:str2.toCharArray()) {
            map[c]--;
            if (map[c]<0){
                return false;
            }
        }
        return true;
    }



}


