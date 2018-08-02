package WorkTest;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试concat()方法、StringBuffer.append()方法、+""（加空串）的方法效率〉
 *
 * @author FuJianXin
 * @create 2018/7/11
 * @since 1.0.0
 */

public class TestForConcat {

    public static void main(String[] args){
        System.out.print(method());
    }


    private static String method(){
        int i = 1;
        StringBuffer sb = new StringBuffer();
        for (int a = 0; a < 10;a++){
            sb.append(i+"; ");
           // sb.append("; ");
        }
        System.out.print(sb.length());
        return sb.substring(0,sb.length());

    }
}
