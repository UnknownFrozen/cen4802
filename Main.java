import java.util.ArrayList;

public class Main {
    public static void main(String[] argv) {
        System.out.println("The 10th term of the Fibonacci sequence is " + fSeqence(10));
    }

    public static int fSeqence (int n){
        
        int answer = 0;
        int[] seqence = new int[n+1];
        seqence[0] = 0;
        seqence[1] = 1;

        for (int i = 1; i < n; i++){
            answer = seqence[i] + seqence[i-1];
            seqence[i+1] = answer;  
        }
        return seqence[n-1];
    }
}