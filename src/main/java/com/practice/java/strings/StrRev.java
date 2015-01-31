package com.practice.java.strings;

public class StrRev {
	public String strRev(String input)
	{
		StringBuilder sb = new StringBuilder(input);
		for(int i = 0, j = input.length()-1 ; i < j; i++, j--) {
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, temp);
		}
		return sb.toString();
	}
	
	public String strRevRec(String input)
	{
		StringBuilder sb = new StringBuilder(input);
		return strRevRec(sb, 0, input.length()-1);
	}
	
	private String strRevRec(StringBuilder input, int first, int back)
	{
		if(first >= back)
			return input.toString();
		else {
			char temp = input.charAt(first);
			input.setCharAt(first, input.charAt(back));
			input.setCharAt(back, temp);
			return strRevRec(input , first+1, back-1);
		}
	}
	
}
