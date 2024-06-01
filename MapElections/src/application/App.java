package application;

import java.util.Scanner;

import service.Process;

public class App {
    public static void main(String[] args) throws Exception {

      Scanner input = new Scanner(System.in);
      Process process = new Process();

      System.out.print("Enter file full path: ");
      String path = input.nextLine();
      process.getPath(path);

      System.out.println("");
      process.processFile();

      input.close();
    }
}
