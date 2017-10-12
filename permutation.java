import java.util.*;
public class permutation{
	public static void main(String[] args){
		String input1 = args[0];
		String input2 = args[1];
		int[] convert1 = new int[input1.length()];
		int[] convert2 = new int[input2.length()];
		if(input1.length() != input2.length()){
			System.out.println("NOT Same Length");
			return;
		}
		for(int i = 0; i < input1.length();i++){
			convert1[i]=(int) input1.charAt(i);
			convert2[i]=(int) input2.charAt(i);
		}
		Arrays.sort(convert1);
		Arrays.sort(convert2);
		if(Arrays.equals(convert1,convert2)){
			System.out.println("PERMUTATION");
		    return;
		}
		System.out.println("NOT PERMUTATION");
	}
}
