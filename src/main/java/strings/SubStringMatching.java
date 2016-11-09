package main.java.strings;

public class SubStringMatching {
	
	public static void main(String args[]){
		String source = "aabb";
		String pattern = "ab";
		
		System.out.println(isSubString(source, pattern)? "Pattern is a substring." : "Pattern is NOT a substring.");
	}

	private static boolean isSubString(String source, String pattern) {
		int isrc = 0;
		int ipat = 0;
		for (isrc=0; isrc<source.length(); isrc++){
			if(source.charAt(isrc) == pattern.charAt(ipat)){
				ipat++;
			}
			if(ipat == pattern.length()){
				return true;
			}
		}
		return false;
	}

}
