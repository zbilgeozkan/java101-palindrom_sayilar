import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int x) {
        int temp = x, reverseNum = 0, lastNum;
        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp /= 10;
        }
        return reverseNum == x;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sorgulanmak istenilen sayıyı giriniz: ");
        int num = input.nextInt();
        System.out.println(isPalindrom(num));
    }
}