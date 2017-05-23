package helloworld;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * 
 * @author ferreraalexandre
 *
 * TODO: get the code out of the main + make it a little bit more generic
 */

public class ProcessBuilderExample {
	public static void main(String[] args) throws InterruptedException,
			IOException {
		String pathToScript = "/home/ferreraalexandre/Desktop/data-integration/";  //This must be an absolute path => no '~' allowed

		
		ProcessBuilder pb = new ProcessBuilder("/bin/bash", pathToScript+"pan.sh", "/file", "tutorial/Hello.ktr", "/norep");
		//Thank you : https://examples.javacodegeeks.com/core-java/lang/processbuilder/java-lang-processbuilder-example/
		
		
		System.out.println("Run echo command");
		Process process = pb.start();
		int errCode = process.waitFor();
		System.out.println("command executed, any errors? " + (errCode == 0 ? "No" : "Yes: " + errCode));
		System.out.println("Output:\n" + output(process.getInputStream()));	
	}

	
	
	
	private static String output(InputStream inputStream) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line + System.getProperty("line.separator"));
			}
		} finally {
			br.close();
		}
		return sb.toString();
	}
}
