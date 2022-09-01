package hworke21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {

        FileWriter writer=new FileWriter("ABV text.txt");
        int f = 97;
        for (int i =65; i <91 ; i++) {
            writer.write(i);
            writer.write(f);
            writer.write("\n");
            f++;
        }
        for (int i =48; i <58 ; i++) {
            writer.write(i);
            writer.write("\n");
        }
            writer.close();
            read("ABV text.txt");
        }
        public  static void read(String fileName) throws IOException {

            FileReader reader = new FileReader("ABV text.txt");
            Scanner scanner = new Scanner(reader);
            int num=1;
            while (scanner.hasNext()) {
                System.out.println(num+":"+scanner.nextLine());
                num++;
            }
            reader.close();

        }
    }

