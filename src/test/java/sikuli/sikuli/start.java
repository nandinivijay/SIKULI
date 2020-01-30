package sikuli.sikuli;

import java.net.URISyntaxException;

import javax.print.DocFlavor.URL;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;




public class start {
	 private Screen screen;
	    private String basePath;
	    public start() throws URISyntaxException {
	        screen= new Screen();
	        basePath ="N:\\workspace\\sikuli\\src\\test\\java\\Resources\\Images\\";
	        System.out.println(basePath);
	    }
	    private void startTest() throws FindFailed {
	        clickWindowsStartAndOpenMSWord();
	        //typeTextInWordAndSave();
	    }
	 
	    private void clickWindowsStartAndOpenMSWord() throws FindFailed {
	        screen.click(basePath + "windows-start.png");
	        System.out.println("successful");
	        screen.wait(1.0); //need delay to allow animation to bring start menu
	        screen.type("notepad");
	        screen.wait(1.0); //wait for 1 second to show results
	        screen.type(Key.ENTER);
	        screen.click(basePath + "notepad.png");
	        screen.wait(1.0);
	        screen.type("notepad");
	        
	    }
	 
	    private void typeTextInWordAndSave() throws FindFailed {
	        screen.click(basePath + "blank-document.png");
	        screen.type("This is a test in Sikuli Automation by JavaPointers.");
	        screen.type("s", KeyModifier.CTRL);
	        screen.click(basePath + "browse-save.png");
	        screen.type("sikuli-test-document");
	        screen.click(basePath + "btn-save.png");
	 
	    }
	    public static void main(String... args) throws FindFailed, URISyntaxException {
	    	start sikuliAutomation = new start();
	        sikuliAutomation.startTest();
	    }

}
