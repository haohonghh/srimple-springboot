package com.boot.srimplespringboot.methods;

import java.security.Key;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

//import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * 这种算法是在DES算法的基础上发展出来的，类似于三重DES。
 * 发展IDEA也是因为感到DES具有密钥太短等缺点。
 * IDEA的密钥为128位，这么长的密钥在今后若干年内应该是安全的。
 * 在实际项目中用到的很少了解即可。
 */
public class IDEADemo {
	/*public static void main(String args[]) {
		bcIDEA();
	}
	public static void bcIDEA() {
	    String src = "www.xttblog.com security idea";
	    try {
	        Security.addProvider(new BouncyCastleProvider());
	         
	        //生成key
	        KeyGenerator keyGenerator = KeyGenerator.getInstance("IDEA");
	        keyGenerator.init(128);
	        SecretKey secretKey = keyGenerator.generateKey();
	        byte[] keyBytes = secretKey.getEncoded();
	         
	        //转换密钥
	        Key key = new SecretKeySpec(keyBytes, "IDEA");
	         
	        //加密
	        Cipher cipher = Cipher.getInstance("IDEA/ECB/ISO10126Padding");
	        cipher.init(Cipher.ENCRYPT_MODE, key);
	        byte[] result = cipher.doFinal(src.getBytes());
	        System.out.println("bc idea encrypt : " + Base64.encodeBase64String(result));
	         
	        //解密
	        cipher.init(Cipher.DECRYPT_MODE, key);
	        result = cipher.doFinal(result);
	        System.out.println("bc idea decrypt : " + new String(result));
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}*/
}