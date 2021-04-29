package package_1.problems;

public class StringFrontBackTransform {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s ="Hello";
		System.out.println(s);
		String answer="";
	    
	    for (int i =0; i<s.length();i++)
	    {
	        char ch =s.charAt(i);
	        if (Character.isLowerCase(ch)){
	            int aposition = (int) ch -'a';
	            int zposition = 'z'- aposition;
	            char zalpha = (char) zposition;
	            answer = answer+zalpha;
	        }else
	        {
	            int aposition = (int) ch -'A';
	            int zposition = 'Z'- aposition;
	            char zalpha = (char) zposition;
	            answer = answer+zalpha;
	        }
	            
	        }
	        System.out.println(answer);

	}

}
