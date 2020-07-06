package BD_DemoVonglapWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class vonglapwhile {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String password = sc.nextLine();
    while (!password.equals("vung oi mo ra")) {
        System.out.println("khong dung! Moi ban nhap lai mat khau");
        password = sc.nextLine();
    }
}
}

