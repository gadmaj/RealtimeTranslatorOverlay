package com.overlay;
import com.google.api.services.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import com.google.cloud.translate.v3.BatchDocumentInputConfig.Builder;

public class Translater {
    private String m_englishtext;
    private String m_chinesetext;
    private String apikey;
    private String m_targetLang;
    private Translate m_translate;
    private TranslateOptions m_translateOptions;
    private Builder m_builder;
    public Translater(){
        apikey = 
        m_targetLang = "en"; // for Spanish
        m_builder = 
        m_translateOptions = new TranslateOptions
        
        m_translate = new TranslateOptions.newBuilder().setApiKey(apikey).build().getService();
        m_translate.
        Translation translation = m_translate.translate(text, Translater.TranslateOption.targetLanguage(targetLang));
        String translatedText = translation.getTranslatedText();

    }
    // public String translateTexString(String english){
        
    // }
}
