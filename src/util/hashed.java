package util;

import java.security.MessageDigest;

public class hashed {
    public static String getHash(String pass) throws Exception{
        String hashedpass;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(pass.getBytes());
        byte[] bytes = md.digest();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        hashedpass = sb.toString();
        return hashedpass;
    }
}

