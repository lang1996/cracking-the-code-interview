import java.util.*;

public class isUnique{
	public static void main(String[] args){
		String input = args[0];
		boolean[] characters = new boolean[127];
		for(int i = 0;i < input.length();i++){
			if(characters[(int) input.charAt(i)]) {
				System.out.println("NOT UNIQUE");
				return;
			}
			characters[(int) input.charAt(i)] = true;	
		}
		System.out.println("UNIQUE");
		return;
	}
}
