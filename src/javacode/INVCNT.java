package javacode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class INVCNT {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int i, n, t;
		long a[];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	    
		t = Integer.parseInt(in.readLine());
		
		while (t-- > 0) {
			in.readLine();
			n = Integer.parseInt(in.readLine());
			a = new long[n];
			for (i=0; i<n;i++)
				a[i]=Integer.parseInt(in.readLine());
			
			out.println(sortWithInversion(a, 0, (a.length-1)));
		}
		out.flush();
	}
	
	public static long sortWithInversion(long arr[], int start, int end) {
		long invCount = 0;
		if (start < end) {
			int mid = start + (end-start) / 2;
			long invLeft = sortWithInversion(arr, start, mid);
			long invRight = sortWithInversion(arr, mid+1, end);
			
			invCount = mergeWithInversion(arr, start, mid, end) + invLeft + invRight;
		}
		
		return invCount;
	}
	
	public static long mergeWithInversion(long arr[], int start, int mid, int end) {
		int i, j, k, invCount = 0;
		long temp[] = new long[arr.length];
	
	    i = start;
	    j = mid+1;
	    k = start;
		
	    while ((i <= mid) && (j <= end)) {
	    	if (arr[i] <= arr[j]) {
	    		temp[k++] = arr[i++];
	    	} else {
	    		temp[k++] = arr[j++];
	    		invCount += (mid - i) + 1;
	    	}
	    }
	      
	    while (i <= mid)
	    	temp[k++] = arr[i++];
	      
	    while (j <= end)
	    	temp[k++] = arr[j++];
	      
	    for (i=start; i <= end; i++)
		   arr[i] = temp[i];
	      
	    return invCount;
	}
}
