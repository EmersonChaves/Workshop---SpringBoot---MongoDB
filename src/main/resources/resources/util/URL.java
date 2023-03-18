package resources.util;

import java.net.URLDecoder;

import com.example.demo.services.resources.util.UnsuportedEncondingException;

public class URL {
	public static String decodeParam(String text) {
		try {
			return URLDecoder.decode(text, "UTF-8");
		}
		} catch (UnsuportedEncondingException e) {
			return "";
		}
}
