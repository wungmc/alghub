/*
 * Copyright (C), 2011-2019.
 */
package com.wung.alghub.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wung 2019-11-07.
 */
public class Test {
	
	@org.junit.Test
	public void f() {
		Map<Character, Integer> letterMap = new HashMap<>();
		
		for (int i = 1; i <= 26; i++) {
			letterMap.put((char)(i + 64), i);
		}
		System.out.println(letterMap.get('B'));
	}
}
