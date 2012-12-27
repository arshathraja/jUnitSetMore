
public class String_Funcitons {

	
	public static void main(String[] args) {
	
		String str= "The ranges have started heres";
		
		String str1= "The ranges have started heres";
		//String is a inbuilt class
		System.out.println("Lenght is :"+str.length());
		
		System.out.println("Index 5 is :"+str.charAt(5));
		
		System.out.println("Index of s is in the first position:"+str.indexOf('s'));
		
		System.out.println("Index of s is second position:"+str.indexOf('s',10));
		
		System.out.println("String equals :"+str.equals(str1));
		
		System.out.println("Puilling out the string :" +str.subSequence(10, 28));
		
		String tem[] = str.split("have");
		
		for(int i=0;i<tem.length; i++)
			
		
		
		System.out.print(tem[i]);
		
		//converting data types
		
		
		String x="123";
		int i=Integer.parseInt(x);
		System.out.println(x);
		
		int j=100;
		
		String y= String.valueOf(j);
		System.out.println(j);
		
	boolean b =	Boolean.valueOf("true");
	
	}

}
