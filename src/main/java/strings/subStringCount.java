package main.java.strings;

import java.util.ArrayList;
import java.util.List;

public class subStringCount {
	
	public static void main(String args[]){
		String s="ababaa";
		String t="aba";
		System.out.println(maxRounds(s,t));
		
	}

	private static void maxRounds1(String s, String t) {
		
		int count = 0;
		while(!s.equals(s.replaceFirst(t, ""))) {

			System.out.println("O:"+s);
			s = s.replaceFirst(t, "");
			System.out.println("N:"+s);
			count++;
		}
		System.out.println(count);
	}
	
	public static int maxRounds(String s, String t) {
		int ans = round(s, t, 0);
		System.out.println(ans);
		return ans;
	}
	
	public static List<Integer> findAllIndex(String s, String t) {
		int index = s.indexOf(t);
		List<Integer> ans = new ArrayList<Integer>();
		while(index >= 0) {
		   ans.add(index);
		   index = s.indexOf(t, index+1);
		}
		System.out.println("Indexes for " + s+": " + ans.toString());
		return ans;
	}
	
	static String replaceFirstFrom(String str, int from, String regex, String replacement)
	{
	    String prefix = str.substring(0, from);
	    String rest = str.substring(from);
	    rest = rest.replaceFirst(regex, replacement);
	    System.out.println("replaceFirstFrom: " + prefix+rest);
	    return prefix+rest;
	}
	
	public static int round(String s, String t, int count) {
		List<Integer> indexs = findAllIndex(s,t);
		int roundCount = count;
		
		for(int i : indexs) {
			System.out.println("Round Cnt:" + roundCount + ", s:" + s + ", t:" + t + ", i:" + i);
			roundCount = Math.max(roundCount, round(replaceFirstFrom(s, i, t, ""), t, count + 1));
			System.out.println("AC:" + roundCount + ", s:" + s + ", t:" + t + ", i:" + i);
		}
		
		return roundCount;
	}
}
