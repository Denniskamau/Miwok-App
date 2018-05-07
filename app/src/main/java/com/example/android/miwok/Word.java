package com.example.android.miwok;

public class Word {
    //State:Default Translation of the word
    private String mDefaultTranslation;

    //State:Miwok translation of the word
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGEPROVIDED;

    private static final int NO_IMAGEPROVIDED = -1;

    public Word(String defaultTranslation , String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation , String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }
    //Get the English Translation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    //Get the Miwok Translation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public Integer getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGEPROVIDED;
    }
}
