import java.util.Scanner;

public class OlderVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку с версией программы:");
        String str1 = scanner.nextLine();
        String[] version1 = str1.split("\\.");
        System.out.println("Введите вторую строку с версией программы:");
        String str2 = scanner.nextLine();
        String[] version2 = str2.split("\\.");
        for (int i = 0; i < 4; i++) {
            if (Integer.parseInt(version1[i]) > Integer.parseInt(version2[i])) {
                System.out.println("Старшая версия - " + str1);
                break;
            } else if (Integer.parseInt(version1[i]) < Integer.parseInt(version2[i])) {
                System.out.println("Старшая версия - " + str2);
                break;
            }
        }
    }

}
