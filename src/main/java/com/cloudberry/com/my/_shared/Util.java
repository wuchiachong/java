package com.cloudberry.com.my._shared;

import java.util.BitSet;

public class Util{
    
	public static BitSet fromInt(int num){
        BitSet bs = new BitSet();
        for (int k = 0; k < Integer.SIZE; k++) {
            if (((num >> k) & 1) == 1) {
               try {
            	   bs.set(k);
            	}catch(IndexOutOfBoundsException iobex) {
            	   throw iobex;
               }
            }
        }
        return bs;
    }

    public static int toInt(BitSet bs) {
        int num = 0;
        try {
	        for (int k = -1; (k = bs.nextSetBit(k + 1)) != -1; ) {
	             num |= (1 << k);
	        }
        }catch(IndexOutOfBoundsException iobex) {
        	throw iobex;
        }
        return num;
    }
}
