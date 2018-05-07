package com.example.android.miwok;

public class Word {
    //State:Default Translation of the word
    private String mDefaultTranslation;

    //State:Miwok translation of the word
    private String mMiwokTranslation;

    public Word(String defaultTranslation , String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    //Get the English Translation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    //Get the Miwok Translation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
