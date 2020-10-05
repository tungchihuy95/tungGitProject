package demo_chi_Chau;

import java.io.*;

public class TextFile {
    //Ghi trc hoac doc trc cung dc
    //Ghi
    public void writeTextFile(String pathname) {

        try {
            FileWriter fileWriter = new FileWriter(pathname, true); // neu muon ghi noi tiep thi them append
            fileWriter.write("\t chao Tung!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readTextFile(String pathname) {
        try {
            FileReader fileReader = new FileReader(pathname);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
