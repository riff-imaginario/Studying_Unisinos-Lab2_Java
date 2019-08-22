package conversoes;

public class ASCIITableTeste {

	public static void main(String[] args) {
		int numChars    = 127;
		char[] tableChars = new char[127]; 
		
		for(int i=0; i < numChars; i++)
			tableChars[i] = (char) i;
		
		for(int i=0; i < numChars; i++) {
			for(int j=i; j < i; j++) {
				System.out.print(tableChars[j]);
			}
		}
		
		/*for(char letra : tableChars) {
			System.out.println(letra);
		}*/
	}
}
