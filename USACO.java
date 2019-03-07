import java.util.*;
import java.io.*;
public class USACO {
  public static void main(String[] args) {
    try{
      bronze("makelake.1.in");
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
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
        System.out.print(lake[i][i2] + " ");
      }
    }
    //Done filling.
    //Time to receive the digging instructions, corresponding to i.
  /*  for (int i = 0; i < N; i++) {
      int R_s = Integer.parseInt(text.next());
      int C_s = Integer.parseInt(text.next());
      int D_s = Integer.parseInt(text.next());
      for (int rowModifier = 0; rowModifier < 3; rowModifier++) {
        for (int colModifier = 0; colModifier < 3; colModifier++) {
          int checkRow = rowModifier + R_s;
          int checkCol = colModifier + C_s;
          lake[checkRow][checkCol] -= D_s;
        }
      }
    }
    */
    return -1;
  }
  public static int silver(String filename) {
    return -1;
  }
}
