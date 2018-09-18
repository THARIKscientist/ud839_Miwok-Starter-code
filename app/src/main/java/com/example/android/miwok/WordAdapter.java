package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words)
    {
        super(context,0,words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Word currentWord=getItem(position);

        View listItemView=convertView;

        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView defaultWord=(TextView) listItemView.findViewById(R.id.defaultWord);
        defaultWord.setText(currentWord.getDefaultTranslation());

        TextView miwokWord=(TextView) listItemView.findViewById(R.id.miwokWord);
        miwokWord.setText(currentWord.getMiwokTranslation());


        return listItemView;
    }


}
