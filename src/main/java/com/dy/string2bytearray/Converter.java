package com.dy.string2bytearray;

import org.apache.hadoop.hbase.util.Bytes;

public class Converter {

    public static void main(String[] args) {
        if (args.length == 0)
            throw new IllegalArgumentException("Need at least one parameter");
        for (String arg : args)
            System.out.println(Bytes.toHex(Bytes.toBytesBinary(arg)));
    }
}
