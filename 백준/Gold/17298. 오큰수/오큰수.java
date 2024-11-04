import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] A = new int[N]; 
		int[] ans = new int[N]; 
		String[] str = bf.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		
		Stack<Integer> myStack = new Stack<>();
		myStack.push(0);
		
		for(int i = 1; i < N; i++) {
			while(!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
				ans[myStack.pop()] = A[i];
			}
			myStack.push(i);
		}
        
		while(!myStack.empty()) {
			ans[myStack.pop()] = -1;
		}
        
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < N; i++) {
			bw.write(ans[i] + " ");
		}
        
		bw.write("\n");
		bw.flush();
	}

}
