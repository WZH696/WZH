import java.util.Arrays;
import java.util.Scanner;

public class u4 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int min[]=new int[n];
		int max[]=new int[n];
		int t[]=new int[n];
		for(int p=0;p<n;p++)
			min[p]=in.nextInt();
		for(int q=0;q<n;q++) {
			max[q]=in.nextInt();
			t[q]=max[q];
		}
		Arrays.sort(t);
		int k=t[n-1];
		int MAX=0;
		for(int i=0;i<=k;i++) {
			int b=0;
			for(int j=0;j<n;j++) {
				if(min[j]<=i&&max[j]>=i)
					b++;
			}
			if(b>MAX)
				MAX=b;
		}
		System.out.println(MAX);
	}
}
