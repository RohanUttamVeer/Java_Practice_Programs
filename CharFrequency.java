import java.util.Scanner;

public class CharFrequency{
	public	static	void	main(String[] args){
	
	
	 //	 no. of occurences in a string
	//		 learn to do it without using any built-in methods
	Scanner sc = new	Scanner(System.in);
	String	a	=	sc.nextLine();
	char	ch	=	'r';
	int	f	=	0;
	
	for(int i = 0; i < a.length(); i++){
		if(ch ==	a.charAt(i)){
			++f;
		}
	}
	System.out.println(f);
	}
}