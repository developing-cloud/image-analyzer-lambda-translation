package cloud.developing.imageanalyzer.translation;

import com.amazonaws.services.translate.AmazonTranslate;
import com.amazonaws.services.translate.AmazonTranslateClientBuilder;
import com.amazonaws.services.translate.model.TranslateTextRequest;

public class Translation {

	private final AmazonTranslate translate = AmazonTranslateClientBuilder.defaultClient();

	public String translate(String text) throws Exception {
		return translate.translateText(
				new TranslateTextRequest().withSourceLanguageCode("en").withTargetLanguageCode("pl").withText(text))
				.getTranslatedText();
	}

}
