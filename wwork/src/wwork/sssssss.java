package wwork;

public class sssssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence="Welcome to java";
        System.out.println(reverseByWords(sentence));
    }
    public static String reverseByWords(String sentence){
        String[] s=sentence.split(" ");
        String out="";
        for (int i=s.length-1;i>=0;i--){
            out+=s[i]+" ";
        }
        return out;
	}

}
