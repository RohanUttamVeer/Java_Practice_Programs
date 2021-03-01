import java.io.DataInputStream;
class Read{                      //reading data from keyboard
	public static void main(String args[]){
		DataInputStream in = new DataInputStream(System.in);
		int ni = 0;
		float fi = 0.0f;
		try{
			System.out.println("Enter an Integer : ");
			ni = Integer.parseInt(in.readLine());
			System.out.println("Enter float Number : ");
			fi = Float.valueOf(in.readLine()).floatValue();
			
			System.out.println(" Int Number : "+ni);
			System.out.println(" Float Number : "+fi);
		
		}
		catch(Exception e) {
		}
	}
} 


