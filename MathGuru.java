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
				System.out.println("the input is wrong, please select model again");
				
			}
			System.out.println("Do you want to calculate somenumber else? Please input"+" yes"+ " or "+"no");
			Scanner scanner_1 = new Scanner(System.in);
			String s=scanner_1.nextLine();
			if(s.toLowerCase().equals("yes")){
				isRunning=true;
			}else{
				isRunning=false;
			}
		} catch(Exception e) {
			
		}
	}
	}


}
