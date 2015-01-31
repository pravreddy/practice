package com.practice.java.strings;

public class StringCat {
	public String concatStringRecursively(String[] inputStrings) {
	    return  concatinatString(inputStrings, 0);
	}
	
	private String concatinatString(String[] inputString, int index)
	{
	    if( inputString.length == 0)
	    {
	        return "";
	    } else {
	        if(index == inputString.length-1) {
	            return inputString[index];
	        } else {
	            return inputString[index] + "," + concatinatString(inputString, ++index);
	        }
	    }
	}
	
	public String concatString(String[] inputStrings) {
	    StringBuilder outString = new StringBuilder();
	    for(int i = 0; i < inputStrings.length; i++)
	    {
	        outString.append(inputStrings[i]+",");
	    }
	    String outPut = outString.substring(0,outString.length()-1);
	    return outPut;
	}

}
