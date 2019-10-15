package assignment2;

import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomProtocol {
	private final String ADD = "ADD";
	private final String ECHO = "ECHO";
	
	private final String ADD_PATTERN = "^(" + ADD + ")(\\s+)([0-9]{1,9})(\\s+)([0-9]{1,9})";
	private final String ECHO_PATTERN = "^(" + ECHO + ")(\\s+)([\\w|\\s+|\\.|\\']+)+";
	
	private final Pattern addPattern = Pattern.compile(ADD_PATTERN);
	private final Pattern echoPattern = Pattern.compile(ECHO_PATTERN);

	public String handleRequest(ByteBuffer buffer, SelectionKey key) {

		String message = new String(buffer.array()).trim();
		Matcher echoMatcher = echoPattern.matcher(message);
		Matcher addMatcher = addPattern.matcher(message);

		if (addMatcher.find()) {
			int number1 = Integer.parseInt(addMatcher.group(3));
			int number2 = Integer.parseInt(addMatcher.group(5));
			int sum = number1 + number2;
			String str = "SUM: " + sum;
			return str;

		} else if (echoMatcher.find()) {
			return "ECHO FROM SERVER: " + echoMatcher.group(3);
		}
		return "WRONG REQUEST";
	}

	public int validateMessage(String message) {
		Matcher echoMatcher = echoPattern.matcher(message);
		Matcher addMatcher = addPattern.matcher(message);
		if (addMatcher.find() || echoMatcher.find()) {
			return 1;
		} else {
			return 0;
		}
	}

}
