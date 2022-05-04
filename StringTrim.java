package strings;

public class StringTrim {

	public static void main(String[] args) {
		
		String S="    Amar Magar"; //we have created string by literal method
		//intern() function
		String s1=S.intern();
		System.out.println(S);
		System.out.println(s1);
		//trim removes the white spaces
		System.out.println(S.trim());
		//we will use methods starts with and ends with
		System.out.println(S.startsWith("A"));
		System.out.println(S.endsWith("ar"));
		//using the charAt() function
		System.out.println(S.charAt(5));	//it will show indexing at which your character is stored
		//length() will show the length of that string
		System.out.println(S.length());
		//valueOf() function
		int a=10;
		String s2=String.valueOf(a);
		System.out.println(s2+10);
		
	}

}
