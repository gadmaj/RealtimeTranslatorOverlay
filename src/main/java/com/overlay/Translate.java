package com.overlay;
// import com.google.api.services.translate.Translate;
// import com.google.cloud.translate.TranslateOptions;
// import com.google.cloud.translate.Translation;

public class Translate {
    private String m_englishtext;
    private String m_chinesetext;
    private String apikey;

    public Translate(){
        apikey = "AIzaSyC_OlOxgkCKdnyYLgUX2Xui5EYlluFo8Bc";
        String targetLang = "en"; // for Spanish
        // Translate translate = TranslateOptions.newBuilder().setApiKey(apikey).build().getService();
        // Translation translation = translate.translate(text, Translate.TranslateOption.targetLanguage(targetLang));
        // String translatedText = translation.getTranslatedText();

    }
}
