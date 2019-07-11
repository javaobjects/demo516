package 包装类;

public class Test2 {

	public static void main(String[] args) {
		//需求：
		//1. int --- Integer
		int a = 100;
		Integer a2 = new Integer(a);
		
		Integer a3 = Integer.valueOf(a);
		
		//2.Integer ----- int
		Integer b = new Integer(123);//new Integer(123)是自动装箱：把int  123 自动装箱成Integer对象类型
		int b2 = b;//int b2 = b 是自动拆箱,把Integer对象b脱去外衣，还原成int类型
		int b3 = b.intValue();
		//3.String ----- int
		String s = new String("666");
		int s2 = Integer.parseInt(s);
		int s3 = new Integer(s);
		//4.String ----- Integer
		String ss = new String("888");
		Integer i = Integer.parseInt(ss);
		Integer ii = new Integer(ss);
		//5.int ---- String
		int p = 333;
		String y = new String(p + "");
		String yy = Integer.toString(p);
		//6.Integer ---- String
		Integer g = new Integer(10);
		String k = Integer.toString(g);
		String kk = g.toString();
		System.out.println(kk);//10
	}

}
