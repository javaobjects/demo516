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
	}

}
