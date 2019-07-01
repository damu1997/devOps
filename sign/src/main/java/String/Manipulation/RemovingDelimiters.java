package String.Manipulation;


public class RemovingDelimiters { 
/**
 * Java program to remove extra delimiter
 * @param args
 */
	public static void main(String args[]) 
	{ 

		// Get the String into str variable
		String str = " ATMECS,Technologies,Pvt,Ltd,"; 

		char characterArr[]=str.toCharArray();
		for (int i = 0; i <characterArr.length; i++) {
			/**
			 * ',' is replaced with 'space'
			 */
			if(characterArr[i]==',') {
				characterArr[i]=' ';
			}
		}
		/**
		 * iterating char array
		 */
		for (int i = 0; i < characterArr.length; i++) {
			System.out.print(characterArr[i]);
		}
		
	} 
	
	
} 


