package demo_chi_Chau;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class TestFile {
    public static void main(String[] args)  {
        File file = new File("src/demo_chi_Chau/test.txt");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        File file1 = new File("testfile.txt");
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
