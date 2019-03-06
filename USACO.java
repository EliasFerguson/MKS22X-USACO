import java.util.*;
import java.io.*;
public class USACO {
  // VARIABLES FOR BRONZE //
  private static int R;
  private static int C;
  private static int[][] lake;

  // VARIABLES FOR SILVER //
  public static void main(String[] args) {
    try {
      readIn("makelake.1.in");
    }
    catch (Exception e) {

    }
  }
  public static void readIn(String filename) throws FileNotFoundException {
    File in = new File(filename);
    Scanner text = new Scanner(in);
    List<String> temp = new ArrayList<String>();
    while (text.hasNextLine()) {
         String line = text.nextLine();
         temp.add(line);
         System.out.println(line);
    }
    R = temp.size();
    C = temp.get(0).length();
    for (int i = 0; i < R; i++) {
      for (int i2 = 0; i2 < C; i2++) {
        lake[i][i2] = temp.get(R).charAt(C);
      }
    }
  }
  public static int bronze(String filename) {
    return -1;
  }
  public static int silver(String filename) {
    return -1;
  }
}
