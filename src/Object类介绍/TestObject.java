package Object类介绍;//包名都是小写，这里是特殊情况
/**
* Object类是所有类的超类， Object是Java语言中唯一一个没有父类的类。
一个类可以不是Object类的直接子类，但一定是Object类的子类，Java中的每一个类都是从Object扩展来的。
在Object类中定义的方法，在所有类中都可以使用。
public boolean equals(Object obj) 
比较两个对象引用的值是否相等（比较哈希地址）
public int hashCode()
返回十进制整数，唯一标识一个对象
public String toString()
返回  类名@hashcode

* <p>Title: TestObject</p>  
* <p>Description: </p>  
* @author xianxian 
* @date 2019年7月10日
 */
public class TestObject {

	/**
	 * 1.直接打印输出对象，默读调用toString()方法，
	 * 输出地址，如果想改变，那么可以重写该方法
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @param args
	 */
	public static void main(String[] args) {
		String s = new String("123");
		//String类重写Object类的toString()方法，返回对象的字符序列值
		/**
		 * 1.如果String对象实例化后没有正式的字符序列形式，
		 * 那么调用toString(),输出空字符序列，就是空，什么都没有
		 * 2.如果String对象为null，那么调用toString(),会抛出空指针异常
		 */
		System.out.println(s.toString());//123
		
		Object o1 = new Object();
		/**
		 * toString()：返回对象的字符串表示形式。
		 * 格式：完整的类名+@+对象内存地址的十六进制表示形式
		 */
		System.out.println("o1.toString():" + o1.toString());//o1.toString():java.lang.Object@6d06d69c
		//Integer类重写Object类的toString（）方法，返回整数对象的值
		Integer i = new Integer(123);
		System.out.println("Integer 对象的toString():" + i.toString());//Integer 对象的toString():123
//		System.out.println(new Integer("").toString());//不要这样试探，无法把空串变成整数，会抛出异常
		
		Student stu = new Student();
		stu.setId(1234);
		/**
		 * 1.我们自已定义的对象，打印输出该对象，
		 * 那么默认会调用Object类的toString()方法,
		 * 输出:stu:Object类介绍.Student@7852e922
		 * 
		 * 2.如果希望打印对象显示其属性信息，
		 * 那么可以让该对象重写toString(),
		 * 返回对象属性和值的字符串表示形式
		 */
		System.out.println("stu:" + stu);
		
		
		System.out.println("o1.hashcode():" + o1.hashCode());//o1.hashcode():1829164700
		
		System.out.println();
		
	}

}
