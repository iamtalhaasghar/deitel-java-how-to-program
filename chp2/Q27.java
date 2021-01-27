package Chapter2;

public class Q27{
	public static void main(String []args){
		
		int length = 20;
		int height = 10;
		char ch = '\0';

		for(int i=0; i<height; i++){
			if(i%2==0){
				ch = ' ';
			}
			else{
				ch = '*';
			}

			for(int j=0; j<length; j++){
				if(ch == '*'){
					System.out.print(ch);
					ch = ' ';
				}
				else if(ch == ' '){
					System.out.print(ch);
					ch = '*';
				}

			}
			
			System.out.println();
		}

	}

}