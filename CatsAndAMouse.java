package pack1;

import java.io.*;
import java.util.*;

public class CatsAndAMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) 
    {
        String move="";
        int xMov=z-x,yMov=z-y;
        if(xMov<0) xMov=-xMov;
        if(yMov<0) yMov=-yMov;
        if(xMov<yMov) move="Cat A";
        else if(xMov>yMov) move="Cat B";
        else move="Mouse C";
        return move;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}