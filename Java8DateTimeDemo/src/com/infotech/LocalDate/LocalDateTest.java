package com.infotech.LocalDate;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate1 = LocalDate.now();
		System.out.println(localDate1);
		
		Clock clock = Clock.systemDefaultZone();
		LocalDate localdate2 = LocalDate.now(clock);
		System.out.println(localdate2);
		
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		LocalDate localdate3 = LocalDate.now(zoneId);
		System.out.println(localdate3);
		
		System.out.println("-------------------------");
		LocalDate localDate4 = LocalDate.of(2022, 07, 16); //using of method
		System.out.println(localDate4);
		
		LocalDate localDate5 = LocalDate.parse("2022-07-16");
		System.out.println(localDate5);    // using parse Method
		
		LocalDate localDate6 = localDate5.plusDays(2);
		System.out.println(localDate6);
		
		LocalDate localDate7 = localDate5.minus(2, ChronoUnit.DAYS); 
		System.out.println(localDate7);
		
		
	}

}
