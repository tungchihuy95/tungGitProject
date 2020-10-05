package demo_doc_ghi_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocGhiFile {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        //kiem tra xem neu file chua ton tai thi create file moi
        //phai them "throws IOException" vao sau main
        if (!file.exists()) {
            file.createNewFile();
        }

        //đọc dữ liệu từ file
        FileInputStream fileInputStream = new FileInputStream(file);//truyền đối tượng "file" vào

        //để đọc
        int doc = fileInputStream.read();//trong java, các ký tự đều có một mã code kiểu "int".

        //fileInputStream sẽ đọc từng ký tự trong file
        //Để đọc các ký tự trong file theo thứ tự từ đầu đến cuối
        //==> dùng vòng lặp cho "doc"
        while (doc != -1) { //là khi đã đọc hết, không còn gì để đọc sẽ trả về -1
            System.out.print((char)doc); //<== trong java, các ký tự đều có một mã code kiểu int, nên phải ép kiểu cho "doc" sang "char"
            //sau khi ép kiểu sang char thì sẽ hiển thị các ký tự Unicode mà chúng ta đã nhập vào

            //xong lại đọc tiếp...xong lại gán...xong lại đọc cho đến khi hết
            doc = fileInputStream.read();

        }

        //sau khi đọc xong....close!
        fileInputStream.close();

        //Ghi...
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        //Truyền một dữ liệu bất kỳ
    }
}
