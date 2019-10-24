package wwork;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Supriya Sadashiva";
		
		char[] c = str.toCharArray();
		int count=0;
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>=65&&c[i]<=90 || c[i]>=97&&c[i]<=122 || c[i]>=48&&c[i]<=57 || c[i]!=32 || c[i]!=',' ||c[i]!='.')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
