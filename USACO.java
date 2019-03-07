import java.util.*;
import java.io.*;
public class USACO {
  public static void main(String[] args) {

  }
  public static int bronze(String filename) throws FileNotFoundException {
    File in = new File(filename);
    Scanner text = new Scanner(in);
    //Filling the lake with the text file information.
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
    //Done filling.
    //Time to receive the digging instructions, corresponding to i.
    for (int i = 0; i < N; i++) {
      int R_s = Integer.parseInt(text.next());
      int C_s = Integer.parseInt(text.next());
      int D_s = Integer.parseInt(text.next());
    }
    return -1;
  }
  public static int silver(String filename) {
    return -1;
  }
}
