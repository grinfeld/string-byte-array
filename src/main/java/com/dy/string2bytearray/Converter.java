package com.dy.string2bytearray;

import org.apache.hadoop.hbase.util.Bytes;

import java.nio.ByteBuffer;

public class Converter {

    public static void main(String[] args) {
        if (args.length == 0)
            throw new IllegalArgumentException("Need at least one parameter");

        for (String arg : args) {
            byte[] bytes = Bytes.toBytesBinary(arg);
            byte[] b64 = new byte[8];
            System.arraycopy(bytes, 0, b64, 0, 8);
            System.out.println("1st 8bytes (64bit) as Long -> " + ByteBuffer.wrap(b64).getLong());
            byte[] bRemain = new byte[bytes.length - 8];
            System.arraycopy(bytes, 8, bRemain, 0, bytes.length - 8);
            System.out.println("Last bytes as Long -> " + ByteBuffer.wrap(bRemain).getInt());
            System.out.println(Bytes.toHex(Bytes.toBytesBinary(arg)));
        }
    }
}
