package jianzhioffer;

/**
 *〈一句话功能简述〉<br>
 *〈替换空格〉
 * 题目描述：
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为        We Are Happy.
 * 则经过替换之后的字符串为 We%20Are%20Happy。
 *
 * @author 一个鲁肃
 * @create 2018/7/26
 * @since 1.0.0
 */
public class replaceSpace {

    public String method(StringBuffer str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                str.append("  ");
            }
        }
        int oldIndex = length - 1;
        int newIndex = str.length() - 1;
        while (newIndex > oldIndex && oldIndex >= 0) {
            if (str.charAt(oldIndex) == ' ') {
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            } else {
                str.setCharAt(newIndex--, str.charAt(oldIndex));
            }
            oldIndex--;
        }
        return str.toString();
    }

}
