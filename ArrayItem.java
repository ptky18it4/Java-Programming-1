import java.util.Scanner;
public class ArrayItem {
	/*Nhap Mang*/
	public static void ArrayInput(int[] mang, int n) {
			Scanner keyboard = new Scanner(System.in);
			for(int i=0; i< n; ++i)
			{
				System.out.print("Nhap phan tu thu " +i+ " : ");
				mang[i]= keyboard.nextInt();
				
			}
	}
	/*In ra cac phan tu cua mang*/
	public static void ArrayOutput(int[] mang, int n) {
		for(int i =0; i <n; ++i)
		{
			System.out.println("Cac phan tu mang A["+i+"] la :" +mang[i] );
			
		}
	}
	/*Mang cac so chan*/
	public static void ArrayEven(int[] mang, int n) {
		for(int i =0; i <n; ++i)
		{
			if(mang[i] %2==0) {
			System.out.println("Cac phan tu chan cua mang A["+i+"] la :" +mang[i] );
			
		}
	}
}
	/*Ham kiem tra so nhap vao la so nguyen to*/
	public static int isPrime(int num) {
	 int i;
	 for(i=2; i<=Math.round(Math.sqrt(num ));++i){ 
			 if(num %i ==0) break;
	}
	if(i<=Math.round(Math.sqrt(num ))) return 0;
	else return 1;
}
	/*Dem cac so nguyen to trong mang*/
	public static void ArrayPrime(int[] mang, int n ) {
		int dem= 0;
		for(int i = 0; i<n;++i)
		{
			if (isPrime(mang[i])==1) {
				dem++;
				System.out.println("Cac phan tu nguyen to cua mang la A["+i+"] :"+mang[i]);
				
			}
		}
		System.out.println("Trong mang co " +dem+ " la so nguyen to :");
	}
	/*Tinh tong cac so chia het cho 5 trong mang*/
	public static void Array5Divide(int [] mang,int n) {
		int tong=0;
		for(int i=0; i<n; ++i)
		{
			if(mang[i]%5==0) {
				tong= tong+mang[i];
			}
		}	
		System.out.println("Tong cac so chia het cho 5 trong mang la :"+tong);
		
	}
	/*Xuat cac so nguyen nam tai vi tri le trong mang*/
	public static void ArrayPrimeOdd(int[] mang, int n) {
		for (int i=0; i<n; ++i) {
			if(isPrime(mang[i])==1&&i%2==1) {
				System.out.println("Cac so chinh phuong nam o vi tri le trong mang la :"+mang[i]+"tai vi tri :" +i);
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int [100];
		int n;
		System.out.print("Nhap so phan tu cua mang : ");
		Scanner keyboard = new Scanner(System.in);
		n = keyboard.nextInt();
		/*Goi ham nhap cac phan tu cua mang*/
		System.out.println("Nhap cac phan tu cua mang ");
		ArrayInput(A,n);
		/*Goi ham in cac phan tu cua mang*/
		System.out.println("Cac phan tu cua mang la : ");
		ArrayOutput(A,n);
		/*Goi ham in cac phan tu chan cua mang*/
		System.out.println("Cac phan tu chan cua mang la : ");
		ArrayEven(A,n);
		/*Goi ham dem cac phan tu nguyen to cua mang*/
		System.out.println("Dem cac phan tu nguyen to cua mang : ");
		ArrayPrime(A,n);
		/*goi ham tinh tong cac phan tu chia het cho 5 trong mang*/
		Array5Divide(A,n);
		/*goi ham xuat cac phan tu chinh phuong cua mang*/
		ArrayPrimeOdd(A,n);
	}

}
