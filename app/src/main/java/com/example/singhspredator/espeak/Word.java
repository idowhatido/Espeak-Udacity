package com.example.singhspredator.espeak;


import android.media.AudioManager;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Spanish translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Spanish translation for the word */
    private String mSpanishTranslation;


    /** Image resource ID for the word */
    private int mImageResourceId = noImageResourceID;

    private static final int noImageResourceID = -1;

    private int mAudioResourceID;




    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,int audioResouceID) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = miwokTranslation;
        mAudioResourceID = audioResouceID;
    }
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param spanishTranslation is the word in the Miwok language
     * @param imaageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Word(String defaultTranslation, String spanishTranslation, int imaageResourceId, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = spanishTranslation;
        mImageResourceId = imaageResourceId;
        mAudioResourceID = audioResourceID;


    }


    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Spanish translation of the word.
     */
    public String getSpanishTranslation() {
        return mSpanishTranslation;
    }


    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
    return mImageResourceId  != noImageResourceID;

    }

    public int getmAudioResourceID(){
        return mAudioResourceID;
    }
}
