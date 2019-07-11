package Math类;

import java.util.Random;

public class TestMath类 {

	public static void main(String[] args) {
		/*
		 * Math类提供了大量用于数学运算的方法 Math类是final类，因此不能从Math类继承 Math类中的方法都是static方法，
		 * 因此不必创建Math类的对象就可以直接使用该类的方法
		 */

		System.out.println(Math.PI);

		Double d = -123.756;

		System.out.println(Math.round(d));// 123，四舍五入取整数

		System.out.println(Math.floor(d));// 123.0,向下取整，不会四舍五入

		System.out.println(Math.abs(d));// 取绝对值

		// 生成随机数
		System.out.println(Math.random());// 0.0-1 不包含1，包含0

		// 算法：返回1-36之间的整数
		int a = (int) (Math.floor(Math.random() * 36)) + 1;
		//System.out.println(a);
		for (int i = 0; i < 200; i++) {
			Random random=new Random();
			int result=random.nextInt(10);//10是范围，但是0包含，10不包含
			System.out.println(result);
		}
		// System.out.println(0.99*36+1);
	}

}
