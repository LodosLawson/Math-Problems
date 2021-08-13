import java.util.*;

public class noone{
	public static int x = 0;
	
	public static void main(String[] args){
		System.out.println("\"If n is an integer, divide by 2,"+
		"\nif the divisor is odd, "
		+"\nmultiply by 3 and add 1.\"\n");
		while(true){
			Scanner Sc = new Scanner(System.in);
			
			try{
				System.out.print("\n\"EXIT 0\"\n\nNumber : ");
				x = Integer.parseInt(Sc.nextLine());
			}catch(Exception e){
				e.printStackTrace();
			}
			
			if(x == 0){
				System.out.println("Good Bye.");
				break;
			}else{
				while(true){
					if(x%2==0){
						x = (x/2);
						System.out.print(x+">");
						for(int i = 1; i <= x; i++){
							System.out.print("*");
						}		
						System.out.println("");
					}else{
						x = (x*3)+1;
						System.out.print(x+">");
						for(int i = 0; i <= x; i++){
							System.out.print("*");
						}
						System.out.println("");
					}
					if(x == 1){
						break;
					}
				}
			}
		}
	}
}
