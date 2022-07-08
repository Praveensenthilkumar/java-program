package myio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class buff1 {
	public static void main(String[] arg) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				try {
					System.out.println("enter number 1");  
			        String s1;
					s1 = br.readLine();
					System.out.println("enter number 2");  
			        String s2=br.readLine();
			        int a=Integer.parseInt(s1);
			        int b=Integer.parseInt(s2);
			        System.out.println(s1+s2); 
				} catch (Exception e) {
					System.out.println("Enter Only Numbers: "+e);
				}

}
}
