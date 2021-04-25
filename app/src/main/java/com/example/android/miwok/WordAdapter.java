package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Resource Id for background color
     */

    private int mBackgroundColorId;



    public WordAdapter(@NonNull Context context,  ArrayList<Word> wordsArr,int backgroundColorId) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews  , the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, wordsArr);

        // Setting Background Color Id
        mBackgroundColorId=backgroundColorId;
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Setting default Translation text inside Default TextView .
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView miWokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miWokTextView.setText(currentWord.getMiwokTranslation());

        // Find the ImageView in the list_item.xml layout with the ID default_text_view
        ImageView miWokImageView = (ImageView) listItemView.findViewById(R.id.miwok_image);

        // If view has Image then Set Image inside miWokImageView via SetImageResource
        //Else Hide the Image View
        if(currentWord.hasImage()){
            miWokImageView.setImageResource(currentWord.getImageResourceId());
            // if ImageView Visible privously because it's reused View
            miWokImageView.setVisibility(View.VISIBLE);

        }else{
            miWokImageView.setVisibility(View.GONE);
        }


        // Setting Color
        View textContainer = listItemView.findViewById(R.id.text_container) ;
        // Finding the color that resource id maps to
        int color= ContextCompat.getColor(getContext(),mBackgroundColorId);
        // Setting the background color of the text container view
        textContainer.setBackgroundColor(color);
        

        return listItemView ;
    }
}
