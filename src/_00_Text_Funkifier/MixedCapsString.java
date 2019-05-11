package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String r = "";
		
		for(int i=0;i<s.length();i++) {
			
			Character change = s.charAt(i);
			String changed = change.toString();
			
			if(i==0) {
				r+=changed.toLowerCase();	
			} else if(i%2!=0) {
			r+=changed.toUpperCase();
			} else {
				r+=s.charAt(i);
			}
		}
		return r;
	}

}
