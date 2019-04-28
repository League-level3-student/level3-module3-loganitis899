package _00_Text_Funkifier;

import java.util.ArrayList;

public class BackwardsString extends SpecialString { 

 
 
 
	
	
	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		
		ArrayList<String> back = new ArrayList<String>(s.length());
		for(int i=0;i<s.length();i++) {
			Character charAt = s.charAt(i);
			String charTo = charAt.toString();
			back.set(i, charTo);     
			System.out.println(back);
			
		}
		
		for(int I=back.size();I<back.size(); I--) {
		
			
			Character FinalChar = s.charAt(I);
			String findChar = FinalChar.toString();
			back.set(back.size()-I, findChar);
		}
		
		for(int P=0;P<s.length(); P++) {
			String replace = back.get(P);
			Character replac = replace.charAt(0);
			s.replace(s.charAt(P), replac);
		}
		

		return s ;
	}

}
