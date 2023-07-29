import com.microsoft.playwright.*;

public class TestIRSWebsite {

	public static void main(String[] args) {
		// 
		 try (Playwright playwright = Playwright.create()) {
	            Browser browser = playwright.chromium().launch();
	            Page page = browser.newPage();
	            page.navigate("https://irs.gov");
	            System.out.println(page.title());
	            System.out.println(page.title());
	        }
	}

}
