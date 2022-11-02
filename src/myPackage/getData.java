package myPackage;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import tuple.Tuple5;

public class getData {
	
	public static List<Result > getMockData() {
		Scanner s = null;
		try {
			URL url = new URL("https://api.mockaroo.com/api/c5cae050?count=500&key=02bbc7a0");
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
		httpConn.setRequestMethod("GET");

		InputStream responseStream = httpConn.getResponseCode() / 100 == 2
				? httpConn.getInputStream()
				: httpConn.getErrorStream();
				s = new Scanner(responseStream).useDelimiter("\\A");
		} catch (Exception e) {
			e.printStackTrace();
		}
		String response = s.hasNext() ? s.next() : "";
		String lines[] = response.split("\\r?\\n");
		List<Result> output = new LinkedList<Result>();
		System.out.println("Start Parsing");
		int header = 0; 
		for(String line: lines) {
			if(header==0) {
				header++;
				continue;
			}
			output.add(parse(line));
		}
		System.out.println("End Parsing");
		return output;
	}
	
	
	public static String toString(Result input) {
		String output = "Result [id=" + input.getiPRN() + ", sLFC=" + input.getsLFC() + ", pPROT=" + input.getpPROT() + ", value=" + input.getValue() + ", result=" + input.getResult()
		+ "]";
		return output;
	}
	
	
	private static Result parse(String input){
		String values[] = input.split(",");
		return new Result(values[0], Double.parseDouble(values[19]), values[30],  Double.parseDouble(values[31]), "Unclassified");
	}
	
	
	
	public static Tuple5<String, Double ,String, Double ,String> getAttributes(Result r) {
		return new Tuple5<String, Double, String, Double, String>(r.getiPRN(), r.getsLFC(), r.getpPROT(), r.getValue(), r.getResult());
	}
	
	public static void setOutcome(Result input, String outcome) {
		input.setResult(outcome);
	}
}
