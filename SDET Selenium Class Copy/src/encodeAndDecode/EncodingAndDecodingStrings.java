package encodeAndDecode;

import com.lowagie.text.pdf.codec.Base64;

public class EncodingAndDecodingStrings {

	public static void main(String[] args) {
		
		//this is our actual password
		String str = "Lg46JR5@JpRvTd";
		
		//encoding the actual password
		String encodedString = Base64.encodeBytes(str.getBytes());
		System.out.println("encoded string:"+new String(encodedString));
		
		//decoding the encoded password
		byte[] decodedString = Base64.decode(encodedString);
		System.out.println("decoded string:"+new String(decodedString));
	}

}
