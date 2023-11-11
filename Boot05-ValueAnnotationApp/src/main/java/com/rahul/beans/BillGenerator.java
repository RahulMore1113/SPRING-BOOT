package com.rahul.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "bill")
public class BillGenerator {

	@Value("#{info.idliPrice+info.vadaPrice+info.dosaPrice}")
	private float billAmount;

	@Value("A2B")
	private String hotelName;

	@Autowired
	private ItemInfo info;

	@Override
	public String toString() {
		return "BillGenerator [billAmount=" + billAmount + ", hotelName=" + hotelName + ", info=" + info + "]";
	}

}
