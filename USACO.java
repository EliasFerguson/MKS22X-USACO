import java.util.*;
import java.io.*;
public class USACO {
  public static void main(String[] args) {
    try{
      //bronze("makelake.1.in");
      silver("ctravel.1.in");
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
  public static int silver(String filename) throws FileNotFoundException {
    File in = new File(filename);
    Scanner text = new Scanner(in);
    int N = Integer.parseInt(text.next());
    int M = Integer.parseInt(text.next());
    int T = Integer.parseInt(text.next());
    char field[][] = new char[N][M];
    for (int r = 0; r < N; r++) {
      String curr = text.nextLine();
      for (int c = 0; c < M; c++) {
        field[r][c] = curr.charAt(c);
        //System.out.println(field[r][c]);
      }
    }
    int R1 = Integer.parseInt(text.next());
    int C1 = Integer.parseInt(text.next());
    int R2 = Integer.parseInt(text.next());
    int C2 = Integer.parseInt(text.next());
    int[][] nums = toNums(field);
    int[][] moves = { {1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    return -1;
  }
  public static boolean validMove(int[][] field, int r, int c) {
    return (r >= 0 && c >= 0 && r < field.length && c < field.length) && int[r][c] > -1;
  }
  public static int[][] toNums(char[][] in) {
    int[][] output = new int[in.length][in[0].length];
    for (int r = 0; r < in.length; r++) {
      for (int c = 0; c < in[0].length; c++) {
        if (in[r][c] == '*') output[r][c] = -1;
      }
    }
    return output;
  }
}
