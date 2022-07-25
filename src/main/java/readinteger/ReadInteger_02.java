package readinteger;

import java.util.Scanner;

public class ReadInteger_02 {
    public static void main(String[] args) {
        getInput();
    }

    static void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        String a = sc.nextLine();
        read(a);
    }

    static void read(String s) {
        int t = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zero(t);
                t--;
            } else {
                num(s.charAt(i));
                count(t);
                t--;
            }
        }
    }

    static String num(char digit) {
        switch (digit) {
            case '0':
                return " Không ";
            case '1':
                System.out.print(" Một ");
                return " Một ";
            case '2':
                System.out.print(" Hai ");
                return " Hai ";
            case '3':
                System.out.print(" Ba ");
                return " Ba ";
            case '4':
                System.out.print(" Bốn ");
                return " Bốn ";
            case '5':
                System.out.print(" Năm ");
                return " Năm ";
            case '6':
                System.out.print(" Sáu ");
                return " Sáu ";
            case '7':
                System.out.print(" Bảy");
                return " Bảy ";
            case '8':
                System.out.print(" Tám ");
                return " Tám ";
            case '9':
                System.out.print(" Chín ");
                return " Chín ";
        }
        return String.valueOf(digit);
    }

    static void count(int t) {
        if (t == 6) {
            System.out.print(" Trăm ");
        }
        if (t == 5) {
            System.out.print(" Mươi ");
        }
        if (t == 4) {
            System.out.print(" Ngàn ");
        }
        if (t == 3) {
            System.out.print(" Trăm ");
        }
        if (t == 2) {
            System.out.print(" Mươi ");
        }
    }

    static void zero(int t) {
        if (t == 2) {
            System.out.print(" Linh ");
        }
        if (t == 3) {
            System.out.print(" Không Trăm ");
        }
        if (t == 5) {
            System.out.print(" Linh ");
        }
        if (t == 6) {
            System.out.print(" Không Trăm ");
        }
    }
}
