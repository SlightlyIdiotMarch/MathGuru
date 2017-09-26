import java.util.Scanner;

public class MathGuru {
	public static void main(String[] arge){
		boolean isRunning=true;
		while(isRunning){
		System.out.println("Please select the calculation model");
		System.out.println("Print 1 for 2^n");
		System.out.println("Print 2 for n!");
		System.out.println("Print 3 for Fibonacci sequence ");
		Scanner scanner=new Scanner(System.in);
		int x= scanner.nextInt();
		
		if(x==1){
			System.out.println("Please enter the number for n in 2^n");
			Scanner scanner_1=new Scanner(System.in);
			int y=  scanner_1.nextInt();
			MathGuru obj= new MathGuru();
			int z=obj.selection_1(y);
			System.out.println("The result is "+z);
			
		}else if(x==2){
			System.out.println("Please enter the number for n in n!");
			Scanner scanner_1=new Scanner(System.in);
			int y=  scanner_1.nextInt();
			MathGuru obj=new MathGuru();
			int z=obj.selection_2(y);
			System.out.println("The result is "+z);
		}else if(x==3){
			System.out.println("Please enter the number for Fibonacci sequence");
			Scanner scanner_1=new Scanner(System.in);
			int y=  scanner_1.nextInt();
			MathGuru obj=new MathGuru();
			int z=obj.selection_3(y);
			System.out.println("The result is "+z);
			
		}else{
			System.out.println("the input is wrong, please select model again");
			
		}
		System.out.println("Do you want to calculate somenumber else? Please input"+" Yes"+ " or "+" No");
		Scanner scanner_2=new Scanner(System.in);
		String s=scanner_2.nextLine();
		if(s=="Yes"){
			isRunning=false;
		}else{
			isRunning=true;
		}
	}
	}

public int selection_3(int x){
	if(x==1||x==2){
		return 1;
	}else{
	int n=0;
	int[] fib=new int[x];
	fib[0]=1;
	fib[1]=1;
	for(int i=2;i<fib.length;i++){
		fib[i]=fib[i-1]+fib[i-2];
		n=fib[i];
	}
	
	return n;
	}
}


}
