import java.util.ArrayList;

public class Main {
    
    /** 
     * This is the main method that calls the created fSeqence method 
     * in order to display the nth number (defined as a parameter) in the Fibonacci sequence.
     * @param argv
     */
    public static void main(String[] argv) {
        System.out.println("The 10th term of the Fibonacci sequence is " + fSeqence(10));
    }

    
    /** 
     * This method is used to find the nth number (defined in the parameter) in the default Fibonacci sequence.
     * Returns the specific number once rest of the numbers are generated using Fibonacci sequence for finding the next number.
     * @param n     Integer given to specify what number in the sequence the method is looking for.
     * @return int  The number in the sequence specified by the "n" parameter initially.
     */
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
