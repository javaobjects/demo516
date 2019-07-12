package 字符串类;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Test练习四 {

	public static void main(String[] args) {
		// 4、巴黎时间比北京时间晚7个小时，纽约时间比北京时间晚12个小时，
		// 试编写一程序，根据输入的北京时间输出相应的巴黎和纽约时间。[选做题]
		Date date = new Date();

		System.out.println(date);

		// 把时间相加：操作时间的毫秒值
		Date bali_date = new Date(date.getTime() - 7 * 60 * 60 * 1000);

		System.out.println("巴黎时间：" + bali_date);

		// System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+
		// c.get(Calendar.DATE)+"日"+c.get(Calendar.HOUR_OF_DAY)+"时");//2019年5月16日13时
		Calendar c = Calendar.getInstance();
		Date date2 = new Date(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1,
				c.get(Calendar.DATE), c.get(Calendar.HOUR_OF_DAY) - 12, 0);
		System.out.println(date2);
		
		Calendar bali_c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
		System.out.println(bali_c.get(Calendar.YEAR)+"年"+(bali_c.get(Calendar.MONTH)+1)+"月"+
				bali_c.get(Calendar.DATE)+"日"+bali_c.get(Calendar.HOUR_OF_DAY)+"时");
		
		
	}

}
