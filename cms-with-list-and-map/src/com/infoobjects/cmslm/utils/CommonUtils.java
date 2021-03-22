package com.infoobjects.cmslm.utils;

public class CommonUtils {
	
	private static int i;
	
	private CommonUtils() {
		
	}

	public static int generateId() {
		return i++;
	}
}
