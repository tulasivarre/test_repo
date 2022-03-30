package com.zensar;

import java.sql.Date;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.util.Locale;


public class DateApiAssignment {
	private static final String today = null;
	private static final String Time = null;
	private static final Month Month = null;
	private static final int Dates = 0;

	//1)find out the day exactly after 15 days from today’s date.
	//2)Find out how much time is required from now for 12 PM.
	//3)Find out how many days are required to reach 29-Feb from today’s date.
	//4)Print the current time in different time zones.
	//5)Print the current date with different locales.
	//6)Print the current date with different date formats like dd/mm/yyyy, mm/dd/yyyy hh:mm:ss etc.
	//7)Find out how many Sundays the current year has.
	//8)Find out the months in the given year having 5 Sundays.
	//9)Let user enter month & year. Find out total number of holidays within that month. Note, all Sundays and 2nd, 4th Saturday remains holiday. (Write custom TemoralAdjuster)

	public static void sundaysCount() {
		
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int year = LocalDate.now().getYear();
		LocalDate now = LocalDate.of(year, Month.JANUARY, 1);
		LocalDate sunday = now.with((DayOfWeek.SUNDAY));
		long count = 0;
		do {
		System.out.println("count : " + count + sunday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		sunday = sunday.plus(Period.ofDays(7));
		count++;
		} while (sunday.getYear() == year);



		System.out.println("total sundays = "+ count);
		{
			int year1 = LocalDate.now().getYear();
			LocalDate now1 = LocalDate.of(year1, Month.JANUARY, 1);
			LocalDate sunday1 = now1.with((DayOfWeek.SUNDAY));
			do {
			System.out.println(sunday1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
			sunday1 = sunday1.plus(Period.ofDays(7));
			} while (sunday1.getYear() == year1);

		{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1 = LocalDate.of(2022, 3, 24);
		String formattedDate = date1.format(formatter);
		System.out.println(formattedDate);
		LocalDate date2 = LocalDate.parse("20220324", DateTimeFormatter.BASIC_ISO_DATE); //2014-03-18
		System.out.println(date2);
		// LocalDate date3 = LocalDate.parse("2014318", DateTimeFormatter.ISO_LOCAL_TIME);
		// System.out.println(date3);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date3 = LocalDate.of(2022, 03, 27);
		String formattedDate1 = date3.format(formatter1);
		System.out.println(formattedDate1);
		// LocalDate date5 = LocalDate.parse("20220324", DateTimeFormatter.ISO_DATE); //2014-03-18
		// System.out.println(date5);
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime myDate = LocalDateTime.now();
		String formattedDate2 = myDate.format(myFormat);
		System.out.println("dd-MM-yyyy HH:mm:ss format: " + formattedDate2);
		{
		DateTimeFormatter italianFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.FRENCH);
		LocalDate date31 = LocalDate.of(2014, 3, 18);
		String formattedDate_2 = date31.format(italianFormatter);
		System.out.println("FrenchFormatter : " + formattedDate_2 );
		italianFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.GERMAN);
		date31 = LocalDate.of(2014, 3, 18);
		formattedDate_2 = date31.format(italianFormatter);
		System.out.println("GERMANFormatter : " + formattedDate_2 );
		italianFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.ITALIAN);
		date31 = LocalDate.of(2014, 3, 18);
		formattedDate_2 = date31.format(italianFormatter);
		System.out.println("ItalianFormatter : " + formattedDate_2 );

		{
		ZoneId zoneId = ZoneId.of("Europe/Berlin");
		LocalTime localTime = LocalTime.now(zoneId);
		System.out.println("Europe/Berlin Time -- " + localTime);

		zoneId = ZoneId.of("America/Matamoros");
		localTime = LocalTime.now(zoneId);
		System.out.println("America/Matamoros Time -- " + localTime);

		zoneId = ZoneId.of("Indian/Christmas");
		localTime = LocalTime.now(zoneId);
		System.out.println("Indian/Christmas Time -- " + localTime);
		
		{
		LocalDate todayDate = LocalDate.now();
		LocalDate localDate2 = LocalDate.of(2024, 2, 29);
		Period period = Period.between(todayDate, localDate2);
		System.out.println("no of days required to reach 29 feb from today's date : " + ChronoUnit.DAYS.between(todayDate, localDate2));
		{
		LocalTime localTime1 = LocalTime.now();
		localTime1 = LocalTime.of(12, 0);
		LocalTime localTime2 = LocalTime.now();
		Duration duration = Duration.between(localTime1, localTime2);
		System.out.println(duration);
		
		{
		 LocalDate today = LocalDate.now(); 
	     System.out.println("Current Date: "+today); 
	     System.out.println("15 days after today will be "+today.plusDays(15)+"\n");
}}}}}}}}}

	