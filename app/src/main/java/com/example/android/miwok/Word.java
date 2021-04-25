package com.example.android.miwok;

public class Word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;



    private static final int NO_IMAGE_PROVIDED=-1;

    /**
     * Image resource id
     */
    private int mImageResourceId=NO_IMAGE_PROVIDED ;


    /*Audio Resouce Id
     */
    private int mAudioResouceId ;


    /**
     * Here is Two Constractors

     */

    /**First Constractor
     * @param defaultTranslation
     * @param miwokTranslation
    */


    public Word(String defaultTranslation, String miwokTranslation,int audioResouceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResouceId=audioResouceId;
    }

    /**Second Constractor
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceId
     * */
    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId,int audioResouceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResouceId=audioResouceId;
    }

    /**
     * Get default translation of Words
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    /**
     * Get miwok translation of Words
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /*
    * Return Image Resource Id*/
    public int getImageResourceId (){
        return mImageResourceId ;
    }

    /**
     * it Returns Whether or not there is image for this word
     */


    public boolean hasImage(){
        return mImageResourceId !=NO_IMAGE_PROVIDED ;

    }


    /**
     * it Returns the audio Resouce id for the word
     * @return
     */

    public int getAudioResouceId (){
        return mAudioResouceId;
    }





}
