package 字符串类;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class TestAPI {

	public static void main(String[] args) {
		// charAt
		String s = new String("agddsfsdgdgdsgsdgsdj");
		
		System.out.println(s.charAt(2));//d 索引从0开始
		
		//concat()
		System.out.println(s.concat("123"));//产生一个新的字符串：s不变agddsfsdgdgdsgsdgsdj123
		
		System.out.println(s);//agddsfsdgdgdsgsdgsdj
		
		//contains()
		System.out.println(s.contains("123"));//false
		
		//需求：判断一个文件是否是图片文件，图片文件的后缀：jpg JPG png PNG gif GIF
		String fileName = "hello.gifx";
		if(!fileName.endsWith("gif") || !fileName.endsWith("GIF")) {
			System.out.println(fileName + "不是图片格式的文件");
		}
		//equalsIgnoreCase()忽略大小写比较，常用于验证码等。。。。
		System.out.println("abc".equalsIgnoreCase("ABC"));//true
		
		//getBytes() String ------> byte[]
		//byte[]: [97, 103, 100, 100, 115, 102, 115, 100, 103, 100, 103, 100, 115, 103, 115, 100, 103, 115, 100, 106]
		System.out.println("byte[]: " + Arrays.toString(s.getBytes()));
		//使用指定的字符集给String进行编码得到对应的字节数组
//		byte[]: [97, 103, 100, 100, 115, 102, 115, 100, 103, 100, 103, 100, 115, 103, 115, 100, 103, 115, 100, 106]
		System.out.println("byte[]: " + Arrays.toString(s.getBytes(Charset.defaultCharset())));
		
		
		//byte[] ----> String
		byte[] b = s.getBytes();
		String k = null;
		try {
			k = new String(b,"utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("k: " + k);
		System.out.println("k.inexOf('a'): "+ k.indexOf('a'));
		
		//需求：找出字符串k中d的出现次数
		int count = 0;//存放找的次数
		int index = 0;//从哪里找
		while((index = k.indexOf('d',index + 1)) != -1) {
			System.out.println("index:" + index);
			index++;
			count++;//找到了，count + 1
		}
		System.out.println("count: " + count);
		System.out.println(k.length());
		String email = "abc@163.com.com";
		int firstIndex = email.indexOf('.');//从头开始数.最开始出现的下标
		int lastIndex = email.lastIndexOf('.');//从头开始数.最后出现的下标
		System.out.println("firstIndex: " + firstIndex);
		System.out.println("lastIndex: " + lastIndex);
		if(firstIndex != lastIndex) {
			System.out.println("邮箱格式不合法");
		}
		
		//replaceAll()
		String str = "我不爱你们，我恨你们，我恨死你们了!";
		str.replaceAll("恨","喜欢");
		System.out.println(str.replaceAll("恨","喜欢"));
		
		//split()
		String source = "a6b6afj6wou6kjs";
		String[] result = source.split("6");
		System.out.println(Arrays.toString(result));
		
		//substring()
		String a="asjfda;dsfaj;";
		System.out.println(a.substring(3));//fda;dsfaj;
		
		System.out.println("   a  b  ".trim());//只能去掉首尾的空格
	}
}
