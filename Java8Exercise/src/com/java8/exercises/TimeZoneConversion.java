package com.java8.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//Program to convert timezone from one to other.

public class TimeZoneConversion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TimeZoneConversion newTime = new TimeZoneConversion();

		System.out.println(
				"This is a timezone conversion program,Please ennter the details\nin the format date-time,from-TZ,to-TZ,plushours Eg: 20/04/1939 20:34,Australia/Sydney,Asia/Ho_Chi_Minh,8");

		String[] line = br.readLine().split(",");
		System.out.println(newTime.converTimeZone(line[0], line[1], line[2], line[3]));


	}

	private ZonedDateTime converTimeZone(String string1, String string2, String string3, String string4) {

		DateTimeFormatter dtr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime local = LocalDateTime.parse(string1, dtr); // 1939-04-20T20:34
		LocalDateTime localUpdated = local.plusHours(Long.parseLong(string4)); // 1939-04-21T04:34
		ZonedDateTime atCurrentZone = localUpdated.atZone(ZoneId.of(string2)); // 1939-04-21T04:34+10:00[Australia/Sydney]
		ZonedDateTime ConvertedZoneSameInstant = atCurrentZone.withZoneSameInstant(ZoneId.of(string3)); // 1939-04-21T01:34+07:00[Asia/Ho_Chi_Minh]

		return ConvertedZoneSameInstant;

	}

}
