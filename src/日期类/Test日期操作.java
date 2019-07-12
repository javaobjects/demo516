package 日期类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test日期操作 {

	public static void main(String[] args) {

		//1.如何把日期----->String
		Date date = new Date();
		String d = date.toString();
		System.out.println(d);//格林威治时间 Fri Jul 12 09:22:38 CST 2019
		
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		System.out.println(sdf1.format(date));//19-7-12 上午9:22
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//给个模式
		System.out.println(sdf2.format(date));//2019-07-12 09:25:02
		//2.如何把String ------> 日期
		String str1 = "2019-10-12";
		String str2 = "2018/11/23";
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");//这里一定要指定模式
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");//这里一定要指定模式
		Date d3 = null;
		Date d4 = null;
		try {
			d3 = sdf3.parse(str1);
			d4 = sdf4.parse(str2);
			System.out.println("d3: " + d3);//d3: Sat Oct 12 00:00:00 CST 2019
			System.out.println("d4: " + d4);//d4: Fri Nov 23 00:00:00 CST 2018
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//3.如何获取 当前时间
	}

}
