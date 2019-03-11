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
    //System.out.println(R);
    int C = Integer.parseInt(text.next());
    //System.out.println(C);
    int E = Integer.parseInt(text.next());
    //System.out.println(E);
    int N = Integer.parseInt(text.next());
    //System.out.println(N);
    int[][] lake = new int[R][C];
    for (int i = 0; i < R; i++) {
      for (int i2 = 0; i2 < C; i2++) {
        lake[i][i2] = Integer.parseInt(text.next());
        //System.out.print(lake[i][i2] + " ");
      }
    }
    //Done filling.
    //Time to receive the digging instructions, corresponding to i.
    for (int i = 0; i < N; i++) {
      int R_s = Integer.parseInt(text.next());
      int C_s = Integer.parseInt(text.next());
      int D_s = Integer.parseInt(text.next());
      int newLow = 0;
      //This set of for loops should just find the newLow.
      for (int rowModifier = 0; rowModifier < 3; rowModifier++) {
        for (int colModifier = 0; colModifier < 3; colModifier++) {
          int checkRow = rowModifier + R_s - 1;
          int checkCol = colModifier + C_s - 1;
          if (checkRow < R && checkCol < C) {
            //System.out.println(lake[checkRow][checkCol] + " ");
            int current = lake[checkRow][checkCol];
            if (current > newLow) {
              newLow = current;
            }
            //System.out.println(lake[checkRow][checkCol] + "\n");
          }
        }
      }
        newLow -= D_s;
        //Doing the same thing again, except this time the lake will be set to the newLow or the current lake value.
        for (int rowModifier = 0; rowModifier < 3; rowModifier++) {
          for (int colModifier = 0; colModifier < 3; colModifier++) {
            int checkRow = rowModifier + R_s - 1;
            int checkCol = colModifier + C_s - 1;
            if (checkRow < R && checkCol < C) {
              lake[checkRow][checkCol] = Math.min(newLow, lake[checkRow][checkCol]);
            }
          }
        }
      }
      int aggregateElevation = 0;
      for (int r = 0; r < R; r++) {
        for (int c = 0; c < C; c++) {
          if (lake[r][c] < E) aggregateElevation += (E - lake[r][c]);
        }
      }
    return aggregateElevation * 72 * 72;
  }
  public static int silver(String filename) {
    return -1;
  }
}
