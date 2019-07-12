package 字符串类;

public class Test1 {

	public static void main(String[] args) {

		//Java语言是如何管理字符串对象的？
		
		String s1 = new String();//空序列 在堆区里面开一个空间，新建一个字符串对象 
		//实例化了两个对象：
		//一个在常量池里丢了一个adfaj字符串，
		//然后在堆区里面放了一个对象
		String s2 = new String("adfaj");//2个对象
		
		String s3 = "";//一个空序列
		
		String s4 = "456";//常量池中 有了一个对象
		
		System.out.println(5+6+'A');
		System.out.println(5+6+"A");
		System.out.println(5+"A"+6);

	}
}
