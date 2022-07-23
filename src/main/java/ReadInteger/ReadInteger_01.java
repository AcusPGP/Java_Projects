package ReadInteger;

import java.util.Scanner;

public class ReadInteger_01 {
    public static void main(String[] args) {
        while (true) {
            System.out.println(" ");
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = sc.nextInt();
            read(num);
        }
    }

    static void num(int digit) {
        if (digit == 0) {
            System.out.print(" Không ");
        } else if (digit == 1) {
            System.out.print(" Một ");
        } else if (digit == 2) {
            System.out.print(" Hai ");
        } else if (digit == 3) {
            System.out.print(" Ba ");
        } else if (digit == 4) {
            System.out.print(" Bốn ");
        } else if (digit == 5) {
            System.out.print(" Nam ");
        } else if (digit == 6) {
            System.out.print(" Sáu ");
        } else if (digit == 7) {
            System.out.print(" Bảy ");
        } else if (digit == 8) {
            System.out.print(" Tám ");
        } else if (digit == 9) {
            System.out.print(" Chín ");
        }
    }

    static int count(int t) {
        int c = 0;
        while (t != 0) {
            t /= 10;
            c++;
        }
        return c;
    }

    static void read(int t) {
        int reverse = 0;
        while (t != 0) {
            reverse = reverse * 10 + t % 10;
            t /= 10;
        }
        int count = count(reverse);
        while (reverse != 0) {
            num(reverse % 10);
            if (count == 6) {
                System.out.print(" Trăm ");
            }
            if (count == 5) {
                System.out.print(" Mươi ");
            }
            if (count == 4) {
                System.out.print(" Ngàn ");
            }
            if (count == 3) {
                System.out.print(" Trăm ");
            }
            if (count == 2) {
                System.out.print(" Mươi ");
            }
            count--;
            reverse /= 10;
        }
    }

}
