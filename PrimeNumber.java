
import java.util.Scanner;
public class PrimeNumber {
	public static int isPrime(int num) {
		int i ;
		for (i=2; i<=Math.round(Math.sqrt(num));++i) {
			if (num%i==0) break;
		}
		if (i<=Math.round(Math.sqrt(num))) return 0;
		else return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap N= ");;
		N = key.nextInt();
		if(isPrime(N)==1) System.out.println(N+"la 1 so nguyen to");
		else System.out.println(N+"Khong la 1 so nguyen to");
	}

}
