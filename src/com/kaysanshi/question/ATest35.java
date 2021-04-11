package com.kaysanshi.question;

import java.util.Scanner;

/**
 * user:kay三石
 * time: 15:14
 * desc:请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。
 **/
public class ATest35 {
    public static void main(String[] args) {
        getChar tw = new getChar();
        System.out.println("请输入星期的第一个大写字母：");
        char ch = tw.getChar();
        switch (ch) {
            case 'M':
                System.out.println("Monday");
                break;
            case 'W':
                System.out.println("Wednesday");
                break;
            case 'F':
                System.out.println("Friday");
                break;
            case 'T': {
                System.out.println("请输入星期的第二个字母：");
                char ch2 = tw.getChar();
                if (ch2 == 'U') {
                    System.out.println("Tuesday");
                } else if (ch2 == 'H') {
                    System.out.println("Thursday");
                } else {
                    System.out.println("无此写法！");
                }
            }
            ;
            break;
            case 'S': {
                System.out.println("请输入星期的第二个字母：");
                char ch2 = tw.getChar();
                if (ch2 == 'U') {
                    System.out.println("Sunday");
                } else if (ch2 == 'A') {
                    System.out.println("Saturday");
                } else {
                    System.out.println("无此写法！");
                }
            }
            ;
            break;
            default:
                System.out.println("无此写法！");
        }
    }
    static class getChar {
        public char getChar() {
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();
            char ch = str.charAt(0);
            if (ch < 'A' || ch > 'Z') {
                System.out.println("输入错误，请重新输入");
                ch = getChar();
            }
            return ch;
        }
    }
}
