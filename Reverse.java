package guvi;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
	Scanner get=new Scanner(System.in);
	String input=get.nextLine();
	StringBuffer nn=new StringBuffer(input);
	StringBuffer output=nn.reverse();
	System.out.println(output);
	}

}
