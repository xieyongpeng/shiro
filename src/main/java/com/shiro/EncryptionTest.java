package com.shiro;

import java.security.Key;

import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authc.credential.PasswordMatcher;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.codec.CodecSupport;
import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.AesCipherService;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.DefaultHashService;
import org.apache.shiro.crypto.hash.HashRequest;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.crypto.hash.format.DefaultHashFormatFactory;
import org.apache.shiro.crypto.hash.format.Shiro1CryptFormat;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.SimpleByteSource;

public class EncryptionTest {
	public static void main(String[] args) {
//		String str="123";
//		String base64Encoded = Base64.encodeToString(str.getBytes());
//		String str2 = Base64.decodeToString(base64Encoded);  
//		System.out.println(base64Encoded);
		
//		String str = "hello";  
//		String base64Encoded = Hex.encodeToString(str.getBytes());  
//		String str2 = new String(Hex.decode(base64Encoded.getBytes())); 
		
//		String str="你好的所发生的发生";
//		String base64Encoded = Base64.encodeToString(CodecSupport.toBytes(str, "UTF-8"));
//		String str2 = CodecSupport.toString(Base64.decode(base64Encoded), "UTF-8"); 
//		System.out.println("base64Encoded  "+base64Encoded);
//		System.out.println("str2  "+str2);
		
//		String str = "hello";  
//		String salt = "123";  
//		String sha1 = new Sha256Hash(str, salt).toString();
//		System.out.println(sha1);
		
//		DefaultHashService hashService = new DefaultHashService(); //默认算法SHA-512  
//		hashService.setHashAlgorithmName("MD5");  //可以改变成不同的加密算法（不设定默认使用SHA-512 加密算法）
//		hashService.setPrivateSalt(new SimpleByteSource("123")); //私盐，默认无  
//		hashService.setGeneratePublicSalt(true);//是否生成公盐，默认false  
//		hashService.setRandomNumberGenerator(new SecureRandomNumberGenerator());//用于生成公盐。默认就这个  
//		hashService.setHashIterations(1); //生成Hash值的迭代次数  
//		  
//		HashRequest request = new HashRequest.Builder()  
//		            .setAlgorithmName("SHA-512").setSource(ByteSource.Util.bytes("hello"))  
//		            .setSalt(ByteSource.Util.bytes("123")).setIterations(2).build();  
//		String hex = hashService.computeHash(request).toHex();
//		System.out.println(hex);
		//fd2b413d4f8c465db16d51ce3e8dc18e
		//c942f011ced5f36de066dd2d948538cb
		
//		SecureRandomNumberGenerator randomNumberGenerator =  
//			     new SecureRandomNumberGenerator();  
//			randomNumberGenerator.setSeed("123".getBytes());  
//			String hex = randomNumberGenerator.nextBytes().toHex(); 
//			System.out.println(hex);
		
//		AesCipherService aesCipherService = new AesCipherService();  
//		aesCipherService.setKeySize(128); //设置key长度  
//		//生成key  
//		Key key = aesCipherService.generateNewKey();  
//		String text = "hello";  
//		//加密  
//		String encrptText =   
//		aesCipherService.encrypt(text.getBytes(), key.getEncoded()).toHex();  
//		System.out.println(encrptText);
//		System.out.println(aesCipherService.encrypt(text.getBytes(), key.getEncoded()));
//		//解密  
//		String text2 =  
//		 new String(aesCipherService.decrypt(Hex.decode(encrptText), key.getEncoded()).getBytes());  
//		System.out.println(text2);
		  
//		PasswordMatcher matcher = new PasswordMatcher();
//		DefaultPasswordService defaultPasswordService = new DefaultPasswordService();
//		DefaultHashService hashService = new DefaultHashService();
//        hashService.setHashAlgorithmName("SHA-512");
//        defaultPasswordService.setHashService(hashService);
//        
//		Shiro1CryptFormat format = new Shiro1CryptFormat();
//		DefaultHashFormatFactory factory = new DefaultHashFormatFactory();
//		defaultPasswordService.setHashFormat(format);
//		defaultPasswordService.setHashFormatFactory(factory);
//		matcher.setPasswordService(defaultPasswordService);
//		String password =defaultPasswordService.encryptPassword("123");	
//		System.out.println(password);

		String algorithmName = "md5";  
		String username = "liu";  
		String password = "123";  
		String salt1 = username;  
		String salt2 = new SecureRandomNumberGenerator().nextBytes().toHex();  
		System.out.println(salt2);
		int hashIterations = 2;  
		//cf37685b2692738b8d1f51dc58e3096e 
		SimpleHash hash = new SimpleHash(algorithmName, password, salt1 + salt2, hashIterations);  
		String encodedPassword = hash.toHex();
		System.out.println(encodedPassword);
		//f3a2f66b8f12206e50b7cae42c59981d
	}
}
