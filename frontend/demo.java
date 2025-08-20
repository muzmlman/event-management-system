package practice;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 int input=s.nextInt();
//		 int n=0;
//		 if(input>=0) {
//		 for(int i=1;i<=input/2;i++) {
//			 if(i*i<input) {
//				 n=i;
//				 continue;
//			 }
//			 if(i*i==input) {
//				 n=i;
//				 break;				 
//			 }
//			 else {
//				 break;
//			 }
//		 }
//		 System.out.print(n);
//	}
//		 else {
//			 System.out.print("invalid");
//		 }
		 if(input<0) {
			 System.out.print("invalid");
		 }
		 else {
		int l=0;
		int r=input/2;
		int mid=0;
		while(l<=r) {
			mid=(l-r)/2;
			if(mid*mid==input) {
				break;
			}
			else if(mid*mid<input){
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		System.out.print(mid);
		 }
		 }
		
}
