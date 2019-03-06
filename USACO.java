import java.util.*;
import java.io.*;
public class USACO {
  public static void main(String[] args) {

  }
  public static int bronze(String filename) throws FileNotFoundException {
    File in = new File(filename);
    Scanner text = new Scanner(in);
    int R = Integer.parseInt(text.next());
    int C = Integer.parseInt(text.next());
    int E = Integer.parseInt(text.next());
    int N = Integer.parseInt(text.next());
    int[][] lake = new int[R][C];
    for (int i = 0; i < R; i++) {
      for (int i2 = 0; i2 < C; i2++) {
        lake[i][i2] = Integer.parseInt(text.next());
      }
    }
  }
  public static int silver(String filename) {
    return -1;
  }
}
