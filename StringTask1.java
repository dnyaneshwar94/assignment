package string;

import java.util.Scanner;

public class StringTask1 {
	public static void main(String[] args) {
		//Accepting the string from user
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a String1");
			String str1=sc.nextLine();
			
			System.out.println("Enter a String2");
			String str2=sc.nextLine();
			
			//converting string to chararray
			char input1[]=str1.toCharArray();
			int s=0;
			//logic for replace char
			for(int i=0;i<str1.length();i++)
			{
				char c=str1.charAt(i);
				if(c=='a' || c=='A'|| c=='E'|| c=='e' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
				{
					try
					{
				input1[i]=str2.charAt(s);
				     s++;
					}
					catch (StringIndexOutOfBoundsException e)
					{
						input1[i]='_';	
					}
				}

			}
			String s1=new String(input1);
			System.out.println("Result String ="+s);
	}

}
