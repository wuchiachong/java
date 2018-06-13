package com.cloudberry.com.my._shared;

import java.util.BitSet;

import com.cloudberry.com.my._shared.Util;

public class Main {

	public static void main(String[] args) {
		try {
			BitSet bs = Util.fromInt(15);
			System.out.println(Util.toInt(bs));
		}catch(IndexOutOfBoundsException iobex) {
			System.out.println(iobex.getMessage());
		}
	}

}
