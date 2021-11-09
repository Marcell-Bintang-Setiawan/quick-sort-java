import java.util.Scanner;

public class QuickSort {

  public static void sortStringArray(String[] strArray, int siZeOfArray) {
    String temp = null;

    for (int i = 0; i < siZeOfArray; i++) {
      for (int j = 1; j < siZeOfArray; j++) {
        if (strArray[j - 1].compareToIgnoreCase(strArray[j]) > 0) {
          temp = strArray[j - 1];
          strArray[j - 1] = strArray[j];
          strArray[j] = temp;

        }
      }
    }
    System.out.println("\nSesudah diurutkan :");
    for (String s : strArray) {
      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    System.out.println("Masukkan Jumlah String yang akan dituliskan : ");
    Scanner sc = new Scanner(System.in);
    int siZeOfArray = sc.nextInt();

    String[] strArray = new String[siZeOfArray];

    for (int i = 0; i < siZeOfArray; i++) {
      System.out.println("Masukkan Kata " + (i + 1) + ": ");
      strArray[i] = sc.next();
    }

    System.out.println("\nSebelum diurutkan :");
    for (String s : strArray) {
      System.out.println(s);
    }

    sortStringArray(strArray, siZeOfArray);
  }
}
