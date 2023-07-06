package com.ITon;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ITonSolutionApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ITonSolutionApplication.class, args);
	}

	/**
	 *
	 */
	@Override
	public void run(String... args) throws Exception {
		
		 URL url = new URL("https://api.coindesk.com/v1/bpi/currentprice.json");
		    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		    connection.setRequestMethod("GET");
		    connection.connect();

		    int responseCode = connection.getResponseCode();
		    if (responseCode != 200) {
		      System.out.println("Error: " + responseCode);
		      return;
		    }

		    InputStream inputStream = connection.getInputStream();
		    Reader reader = new InputStreamReader(inputStream);
		    Scanner scanner = new Scanner(reader);

		   String rateString = scanner.nextLine();
		   System.out.println(rateString);

//		    JSONParser parser = new JSONParser(reader);
//		    JSONObject jsonObject = (JSONObject) parser.parse();
//
//		    String rate = jsonObject.get("rate").toString();
//
//		    String thousandsSeparator = ", ";
//		    String word;
//		    if (rate.length() < 4) {
//		      word = rate;
//		    } else {
//		      word = String.format("%,d", Integer.parseInt(rate));
//		    }
//
//		    System.out.println(word);
	}

}
