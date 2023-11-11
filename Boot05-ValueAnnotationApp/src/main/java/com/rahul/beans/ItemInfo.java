package com.rahul.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "info")
public class ItemInfo {

	@Value("${item.idli.price}")
	private float idliPrice;

	@Value("${item.vada.price}")
	private float vadaPrice;

	@Value("${item.dosa.price}")
	private float dosaPrice;

	@Override
	public String toString() {
		return "ItemInfo [idliPrice=" + idliPrice + ", vadaPRice=" + vadaPrice + ", dosaPrice=" + dosaPrice + "]";
	}

}
