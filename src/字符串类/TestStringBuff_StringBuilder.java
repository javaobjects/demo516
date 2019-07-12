package 字符串类;

public class TestStringBuff_StringBuilder {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("888sjierijj");//堆区中创建了一个对象
		
		sb1.append(true);
		sb1.append("123".toCharArray());
		sb1.insert(8,'p');//在索引是8的位置插入
		System.out.println(sb1.toString());
		sb1.replace(0,3,"999");//结束索引不包括在内
		System.out.println(sb1.toString());//sjierijjtrue123
		sb1.reverse();
		System.out.println("delete 之前:"+sb1);
		sb1.delete(0, 2);//结束索引不包括在内
		
		System.out.println("delete 之后:"+sb1);//delete 之后:1eurtjjipreijs999
		
		System.out.println(sb1.charAt(5));
		StringBuilder sb2 = new StringBuilder("abc");
	}
}
