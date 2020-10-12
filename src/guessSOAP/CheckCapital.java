package guessSOAP;

import java.io.IOException;
import java.net.URISyntaxException;
import org.oorsprong.websamples.*;

public class CheckCapital {
	
	public CheckCapital() {}
	
	
	public String checkCorrectness(String codeOfCountry, String inputCapital) throws IOException, URISyntaxException {

		
		CountryInfoService cis = new CountryInfoService();
		CountryInfoServiceSoapType cisService = cis.getCountryInfoServiceSoap();
		String correctCapital = cisService.capitalCity(codeOfCountry);
		if (correctCapital.equalsIgnoreCase(inputCapital)) return "Perfect! You are right";
		

		
		return "Wrong! The correct name is " + correctCapital;
	}
}
