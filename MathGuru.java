import java.util.Scanner;

public class MathGuru {
	public static void main(String[] arge){
		while(true){
		System.out.println("Please select the calculation model");
		System.out.println("Print 1 for 2^n");
		System.out.println("Print 2 for n!");
		System.out.println("Print 3 for Fibonacci sequence ");
		Scanner scanner=new Scanner(System.in);
		String x= scanner.nextLine();
		MathGuru obj=new MathGuru();
		try{
			if(x.equals("1")){
				System.out.println("Please enter the number for n in 2^n");
				int y;
				while(true){
					y=  scanner.nextInt();
					if(y>=0 && y< 20){
						break;
					}
					System.out.println("Please input number below 20 and larger than 0.");
				}
				int z=obj.selection_1(y);
				System.out.println("The result is "+z);
				
			}else if(x.equals("2")){
				System.out.println("Please enter the number for n in n!");
				int y;
				while(true){
					y=  scanner.nextInt();
					if(y>=0 && y< 20){
						break;
					}
					System.out.println("Please input number below 20 and larger than 0.");
				}
				int z=obj.selection_2(y);
				System.out.println("The result is "+z);
			}else if(x.equals("3")){
				System.out.println("Please enter the number for Fibonacci sequence");
				int y;
				while(true){
					y=  scanner.nextInt();
					if(y>=0 && y< 20){
						break;
					}
					System.out.println("Please input number below 20 and larger than 0.");
				}
				int z=obj.selection_3(y);
				System.out.println("The result is "+z);
				
			}else{
				System.out.println("the input is illegal");
			}
			System.out.println("Do you want to calculate somenumber else? Please input"+" yes"+ " or "+"no");
			Scanner scanner_1 = new Scanner(System.in);
			String s=scanner_1.nextLine();
			if(s.toLowerCase().equals("yes")){
				continue;
			}else{
				break;
			}
		} catch(Exception e) {
			System.out.println("The input is illegal");
		}
	}
	}

public int selection_1(int x){
	int n=1;
	for(int i=0;i<x;i++){
		 n=n*2;
	}
	return n;
	
}

public int selection_2(int x){
	int n=1;
	for(int i=1;i<=x;i++){
		n=n*i;

	}
	return n;
	
	
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
