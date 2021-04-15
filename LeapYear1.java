import java.util.Scanner;

public class LeapYear1{
	public static void main(String[] args){
		
		Scanner	sc	=	new	Scanner(System.in);
		int	t	=	sc.nextInt();
		boolean leap	=	false;
		
		while(t --> 0){
			
			int y = sc.nextInt();
		   if(y > 9999 || y < 1000){
				System.err.println("inappropriate year");
				} else	{
					
					if(y % 4 == 0){
			
			      	if(y % 100 == 0){
				
							if(y % 400 == 0)
								leap = true;
									else 
									leap = false;
			  						}
									
								else leap = true;
								}
								
							else leap = false;
						
				if(leap){
				System.out.println("leap year");
				}else{
				System.out.println("not a leap year");
				}
			}
		}
	}
}