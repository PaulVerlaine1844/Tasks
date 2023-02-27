import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        String[] number19 = {"", "один ", "два ", "три ", "четыре ", "пять ", "шесть ", "семь ", "восемь ", "девять "};
        String[] number1119 = {"", "одиннадцать ", "двенадцать ", "тринадцать ", "четрнадцать ", "пятнадцать ", "шестнадцать ", "семнадцать ", "восемнадцать ", "девятнадцать "};
        String[] number1090 = {"", "десять ", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "};
        String[] number100 = {"", "сто ", "двести ", "тристо ", "четыресто ", "пятьсот ", "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "};
        String[][] format = {{"", "один", "", ""},
                {"", "одна тысяча ", "тысячи ", "тысяч "},
                {"", "один миллион ", "миллиона ", "миллионов "},
                {"", "один миллиард ", "миллиарда ", "миллиардов "}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        long number = scanner.nextLong();
        if (number == 0) {
            System.out.println("Ноль");
            return;
        }
        StringBuilder str = new StringBuilder();
        int[] t = separate(number);
        for (int i = t.length; i > 0; i--) {
            int[] s = category(t[i - 1]);
            if (s[1] == 1 && s[2] > 0) {
                str.append(number100[s[0]]).append(number1119[s[2]]).append(format[i - 1][3]);
            } else if (s[1] != 1 && s[2] == 1) {
                str.append(number100[s[0]]).append(number1090[s[1]]).append(format[i - 1][1]);
            } else if (s[2] > 1 && s[2] < 5) {
                str.append(number100[s[0]]).append(number1090[s[1]]).append(((i == 2 && s[2] == 2) ? "две " : number19[s[2]])).append(format[i - 1][2]);
            } else if (s[0] == 0 && s[1] == 0 && s[2] == 0) {
                str.append(format[0][0]);
            } else {
                str.append(number100[s[0]]).append(number1090[s[1]]).append(number19[s[2]]).append(format[i - 1][3]);
            }
        }
        System.out.println((str.substring(0, 1).toUpperCase() + str.substring(1)));
    }

    public static int[] category(int num) { //метод разделяет трехначное число на разярды единицы, десятки, сотни
        int[] v = new int[3];
        for (int i = 2, j = 0; i >= 0; i--, j++) {
            v[i] = (num / (int) Math.pow(10, j)) % 10;
        }
        return v;
    }

    public static int[] separate(long b) { //метод разделят число по классам (единиц, тысяч и т.д.)
        int[] p = new int[((int) Math.log10(b) / 3) + 1];
        for (int j = 0; j <= ((int) Math.log10(b) / 3); j++) {
            p[j] = (int) ((b / (int) Math.pow(1000, j)) % 1000);
        }
        return p;
    }
}


