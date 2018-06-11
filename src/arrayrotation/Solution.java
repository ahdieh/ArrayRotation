/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayrotation;

/**
 *
 * @author ahdieh
 */
public class Solution {
    private int[] A;
    private int N;
    private int k;
    
    public Solution(int N, int[] array){
        A = new int[N];  
        for (int i = 0; i<N; i++){
            A[i] = array[i];
        }
        this.N = N;
    }
    
    
    public void solution(int K) {        
        // write your code in Java SE 8
        this.k = K;
        int temp1, temp2 = 0;
	for (int i = 0; i < K; i++) {
            temp1 = A[0];
            //printf("temp1 = %d, temp2 = %d\n", temp1, temp2);
            for (int j = 0; j < N; j++) { 				
                if ((j + 1)<N) {
                   temp2 = A[j + 1];
                    A[j + 1] = temp1; 
                }
                else if ((j + 1) == N) A[0] = temp2;
                else ;
                temp1 = temp2;						
            }
	}
    }
    
    void print() {
	System.out.printf("The Rotated array after %d times is: ", k);
	for (int i = 0; i < N; i++) {
		System.out.printf("%d", A[i]);
		System.out.printf(" ");
	}	
	System.out.print("\n");
}
}
