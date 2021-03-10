package com.ivanajenjo.hashing;

import java.io.UnsupportedEncodingException;
import java.math.*;
import java.security.*;
import java.util.Base64;

public class MD5JavaHash {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String password = "Programacion";
        byte[] bytesOfMessage = password.getBytes("UTF-8");

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(bytesOfMessage);
        BigInteger bigInt = new BigInteger(1,digest);
        String hashtext = bigInt.toString(16);
        System.out.println(hashtext);
    }
}
