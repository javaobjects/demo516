package Object类介绍;

import java.util.Date;

public class TestHashCode {

	public static void main(String[] args) {

		Object o1 = new Object();
		
		//1.结论：Object类的hasCode方法：返回对象内存地址的十进制表示形式
		System.out.println("o1.hashCode():" + o1.hashCode());//o1.hashCode():1829164700
		/**
		 * toString()：返回对象的字符串表示形式。
		 * 格式：完整的类名+@+对象内存地址的十六进制表示形式
		 */
		System.out.println("o1.toString():" + o1.toString());//o1.toString():java.lang.Object@6d06d69c
		
		
		//2.String类重写咯hashCode方法，对哈希值做了加工处理
		String s1 = new String("123");
		System.out.println(s1.hashCode());//48690
		
		String s2 = new String("321");
		System.out.println(s2.hashCode());//50610
		
		//3.Integer类重写咯hashCode方法，返回对象的值
		Integer i = new Integer(123678);
		System.out.println(i.hashCode());//hashCode(123678) -----> 123678
		
		//4.自己定义的类可以重写hashCode方法，但是这样做没有任何意义
		Student stu = new Student();
		System.out.println(stu.hashCode());
		//5.Date类为什么重写hashCode方法
		//比较好的博客地址https://www.cnblogs.com/Model-frog/p/5638014.html
		Date d = new Date();
		System.out.println("d.hashCode():" + d.hashCode());//d.hashCode():-604836364
	}

}
