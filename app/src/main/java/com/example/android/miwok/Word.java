package com.example.android.miwok;

/**
 * Created by Plop on 06/01/2017.
 */

public class Word {

    private String  mDefaultTranslation;
    private String  mMiwokTranslation;
    private int     mImageResourceId;
    private int     mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = -1;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    public String getDefaultTranslation() {
        return(mDefaultTranslation);
    }
    public  String getMiwokTranslation() {
        return (mMiwokTranslation);
    }
    public int getImageResourceId() {
        return (mImageResourceId);
    }
    public int getmAudioResourceId() {return  (mAudioResourceId);}
/*
    public void setEnglishName(String name) {
        englishName = name;
    }
    public void setMiwokName(String name) {
        miwokName = name;
    }*/

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
