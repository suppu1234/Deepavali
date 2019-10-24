package wwork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class delete {

	public static void main(String[] args) {
	
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
}
}
