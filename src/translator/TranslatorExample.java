package translator;

import java.io.IOException;

import com.darkprograms.speech.translator.GoogleTranslate;
import java.util.Scanner;
 
public class TranslatorExample {
	
	public static void main(String[] args) {
		
		//Read this ma bro :)
		//When you go on google translate website and you translate from English to Igbo for example
		//you can see the url is :
		// https://translate.google.com/#en/ig/How%20are%20you
		//so the code for IGBO is "ig"
		//see my examples below , i will make tutorial on youtube don't worry
		Scanner scan = new Scanner(System.in);
		try {
			//English to IGBO
                        for(int i = 0 ; i < 5; i++)
			System.out.println(""+(GoogleTranslate.translate("vi", scan.nextLine())));
			
			//English to GREEK
					} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
