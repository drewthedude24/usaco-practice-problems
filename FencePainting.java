import java.util.*;
import java.io.*;

public class FencePainting {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(new FileReader("paint.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
        int amount =0;
        int a = s.nextInt()+1;
        int b = s.nextInt();
        int c = s.nextInt()+1;
        int d = s.nextInt();
        int length = Math.max(b,d);
        boolean[] arr= new boolean[length];

        if (a > 0 || c > 0){
            for (int i = a-1; i < b; i++){
                if (arr[i] == false){
                    amount++;
                    arr[i] = true;
                }
            }
            for (int j = c-1; j < d; j++){
                if (arr[j] == false){
                    amount++;
                    arr[j] = true;
                }
            }
        }
        pw.print(amount);
        pw.close();
        s.close();

    }
}


