import java.util.Scanner;
import java.io.*;

public class Example {
  public static void main(String[] args) throws IOException {

    File file = new File("swift.txt");
    Scanner input = new Scanner(file);

    int count = 0;
    while (input.hasNext()) {
      String word  = input.next();
      System.out.println(word);
      count = count + 1;
    }
    System.out.println("Word count: " + count);
  }
}
