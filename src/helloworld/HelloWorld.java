package helloworld;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");

/*		String[] cmd = { "sh", "ls.sh", "./"};
	    try {
			Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("éo");
			e.printStackTrace();
		}*/
		
		String pathToScript = "~/Desktop/data-integration/";

		

		
		/*    
		String[] cmd = { "sh", "ls.sh", pathToScript, "/file", "tutorial/Hello.ktr", "/norep"};

		Runtime run = Runtime.getRuntime();

		Process pr;
		try {
			pr = run.exec(cmd);
 
			pr.waitFor();

			BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));

			String line = "";

			while ((line=buf.readLine())!=null) {

				System.out.println(line);

			}
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
*/
	    
/*		String PATH = "~/Desktop/data-integration/";
		
		String scriptName = PATH+"/pan.sh";
		  String commands[] = new String[]{scriptName,"/file", "tutorial/Hello.ktr", "/norep"};

		  Runtime rt = Runtime.getRuntime();
		  Process process = null;
		  try{
		      process = rt.exec(commands);
		      process.waitFor();
		  }catch(Exception e){
		      e.printStackTrace();
		  }  

		ProcessBuilder pb = new ProcessBuilder("~/Desktop/data-integration/pan.sh", "/file", "tutorial/Hello.ktr","/norep");
		Map<String, String> env = pb.environment();
		env.put("VAR1", "myValue");
		env.remove("OTHERVAR");
		env.put("VAR2", env.get("VAR1") + "suffix");
		pb.directory(new File("myDir"));
		try {
			Process p = pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	


		
		String cmd = "~/Desktop/data-integration/pan.sh /file tutorial/Hello.ktr /norep";

		Runtime run = Runtime.getRuntime();

		Process pr;
		try {
			pr = run.exec(cmd);
 
			pr.waitFor();

			BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));

			String line = "";

			while ((line=buf.readLine())!=null) {

				System.out.println(line);

			}
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
*/
	}

}
