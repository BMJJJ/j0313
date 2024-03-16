package api8_Date;

import java.util.Calendar;

public class T2_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH)+1));
		System.out.println("일 : " + cal.get(Calendar.DATE));
		System.out.println("시 : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("오늘이 몇번쨰 주 : " + cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("오늘이 몇번쨰 일 : " + cal.get(Calendar.DAY_OF_WEEK)); //일(1),월(2),~~~,토(7)
		System.out.println(cal.get(Calendar.AM_PM)); //AM : 0 , PM : 1
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = "";
		if(amPm == Calendar.AM) strAmPm = "오전";
		else strAmPm = "오후";
		System.out.println("지금은 "+strAmPm+" 입니다.");
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strweek = "";
		switch(week) {
			case 1:  strweek = "일"; break;
			case 2:  strweek = "월"; break;
			case 3:  strweek = "화"; break;
			case 4:  strweek = "수"; break;
			case 5:  strweek = "목"; break;
			case 6:  strweek = "금"; break;
			case 7:  strweek = "토"; break;
			
//			case Calendar.SUNDAY:    strweek = "일"; break;
//			case Calendar.MONDAY:    strweek = "월"; break;
//			case Calendar.TUESDAY:   strweek = "화"; break;
//			case Calendar.WEDNESDAY: strweek = "수"; break;
//			case Calendar.THURSDAY:  strweek = "목"; break;
//			case Calendar.FRIDAY:    strweek = "금"; break;
//			case Calendar.SATURDAY:  strweek = "토"; break;
			
		}
		System.out.println("오늘은 " +strweek+ "요일 입니다.");
	}
}
