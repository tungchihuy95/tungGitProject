package demo_chi_Chau;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextFile textFile = new TextFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap duong dan: ");
        String pathname = scanner.nextLine();
        textFile.writeTextFile(pathname);
    }
}
