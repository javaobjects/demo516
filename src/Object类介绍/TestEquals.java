package Object类介绍;

public class TestEquals {

	public static void main(String[] args) {

		/**
		 * Object类的equals方法：
		 * 1.作用：用来比较两个对象是否相等
		 * 2.比较原理：比较两个对象的hashCode
		 */
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println("o1.equals(o2)? " + o1.equals(o2));//false
		
		o2 = o1;
		
		System.out.println("o1.equals(o2)? " + o1.equals(o2));//true 
		
		Double d = new Double(12.345);
		Double a = 12.345;
		double b = 12.345;
		
		Float c = 12.345F;
		
		System.out.println(a.equals(b));//true 类型相同，并且比较的是值
		System.out.println(a.equals(d));//true 类型相同，并且比较的是值
		System.out.println(d.equals(b));//true 类型相同，并且比较的是值
		System.out.println(a.equals(c));//false 类型不同
		System.out.println(c.equals(b));//false 类型不同
		
		Double d2 = new Double(789);
		Double d3 = new Double(789);
		System.out.println(d2.equals(d3));//true
		/**
		 * 比较两个对象是否相等：用equals 和 ==
		 * 注意：
		 * 1.equals只能用来比较对象，因为equals是方法
		 * 2.==既能用来比较对象，又能用来比较基本类型
		 * 3.由于equals方法可以重写，所以不同类型的对象调用equals方法比较用的算法不同
		 * Object类型：equals方法比较的是两个对象的地址,底层调用 hashCode方法获取对象的地址之后再做比较
		 * Double类型：equals方法比较的是值
		 * String类型：euqals方法比较的是字符串的内容
		 * 
		 */
		System.out.println(d2 == d3);//false
		System.out.println(d2);
		System.out.println(d3);
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("s1.equals(s2)? " + s1.equals(s2));
		
	}
}
