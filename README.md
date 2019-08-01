# 114-Java-Object.md

+ Object介绍及方法
    + Object类是所有类的超类， Object是Java语言中唯一一个没有父类的类。
    + 一个类可以不是Object类的直接子类，但一定是Object类的子类，Java中的每一个类都是从Object扩展来的。
    + 在Object类中定义的方法，在所有类中都可以使用。
    + public boolean equals(Object obj) 
        + 比较两个对象引用的值是否相等（比较哈希地址）
    + public int hashCode()
        + 返回十进制整数，唯一标识一个对象
    + public String toString()
        + 返回  类名@hashcode
+ Object类常用方法        
    + public boolean equals(Object obj)： 比较两个对象引用的值是否相等（比较地址）。指出调用该方法的对象是否与obj对象相等。即地址是否相等。
    + public int hashCode()：该方法返回对象的哈希码，哈希码是一个代表对象的十六进制整数，比作对象的身份证号。在程序运行期间，每次调用同一个对象的hashCode()返回的哈希码必定相同，但是多次执行同一个程序，程序的一次执行和下一次执行期间同一个对象的哈希码不一定相同。实际上默认的哈希码是将对象的内存地址通过某种转换得到的，所以不同对象会有不同的哈希码。
    + public String toString()：返回  类名@hashcode ；事实上返回这样的字符串没有什么实际的意义。一般子类都会覆盖该方法，让它返回有意义的文本。
+ 通常，子类会覆盖equals( )，改变它的含义，所以有的类中equals( )是比较地址，有的类中该方法就不比较地址，具体的，就看子类新定义的该方法的规定。看看包装类中的equals()方法？
+ 在java中有个规定：如果equals( )返回两个对象是相等的，那这两个对象上调用hashCode( )返回的整数必须相等。否则在使用Hash类型集合时就会产生错误。
+ 所以在我们覆盖equals( )方法同时，还要记得覆盖hashCode( ）方法。需要说明，如果equals( )返回两个对象不等，它们的hashCode( )也可以返回相同的整数。但是最好让它们的hashCode( )返回不同的整数，这有利于提高Hash类型集合的性能。
+ 重写equals方法时，一定要重写hashcode（）方法吗？
    + 先说说hashcode的调用的条件。 如果你想往map里面放一个类作为map的键值，这个类又是你自己设计的，或者这个类不是你写的但是你修改了这个类的equals方法，这个时候，你就要注意重写hashcode方法。 这样 当你往map里放值得时候，系统会调用这个对象的.hashcode()方法来生成相应的hash值，来映射相应的对象。 如果同一个类的两个对象的属性值相等，那么他们的hashcode一定相等吗 这个要看你具体如何实现你的hashcode，如果你希望他们的值一样hashcode也一样，你就可以这样实现。 但是hashcode的实现，一般要满足几个特征，比如 自反性，传递性什么的。 

**示例代码1**

```
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
```
```
package Object类介绍;

public class Student {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
}
```
**示例代码2**

```
package Object类介绍;

public class Student {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	//source -----> Override/Implement Methods
	@Override
	public int hashCode() {
//		return super.hashCode();
		return 123;
	}
}
```
```
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
```

#### 拓展知识

[Date类为什么重写hashCode方法](https://www.cnblogs.com/Model-frog/p/5638014.html)


**以就就是我关于 *Java-Java API*  知识点的整理与总结的全部内容，[另附源码](https://github.com/javaobjects/demo515)**

==================================================================
#### 分割线
==================================================================

**博主为咯学编程：父母不同意学编程，现已断绝关系;恋人不同意学编程，现已分手;亲戚不同意学编程，现已断绝来往;老板不同意学编程,现已失业三十年。。。。。。如果此博文有帮到你欢迎打赏，金额不限。。。**

![](images/pay.png)