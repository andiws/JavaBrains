package org.koushik.javabrains;

public class webClientGeoLocator {

	public static void main(String []args) {
		//input argument 
		if (args.length != 1) {
			System.out.println("You need to pass an IP address"); 
		}
		
		else {
			String ipAddress = args[0]; 
			//now call the remote WS and use SEI 
			//stub.getCountryName(ipAddress);
			//After saving the classes from wsimport, expand stub 
			GeoIPService ipService = new GeoIPService)(); 
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap(); 
			GeoIP geoIp = GeoIPServiceSoap.getGeoIP(ipAddress); 
			System.out.println(geoIp.getCountryName()); 
			//Run and config argument with an IP addy
			
		}
	}
	
}
