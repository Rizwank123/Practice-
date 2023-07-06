package com.ITon.assignment;

import java.net.URI;
import java.net.http.HttpRequest;

public class BitCoinRate {

	public static void main(String[] args) {
		var url ="https://api.coindesk.com/v1/bpi/currentprice.json";
	 var request=	request.newBuilder().GET().uri(URI.create(url));

	}

}
