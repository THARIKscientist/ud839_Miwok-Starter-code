package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /*Version 1 */
       // ArrayList<String> words=new ArrayList<String>();

        /*Version 2 Custom Class*/
        ArrayList<Word> words=new ArrayList<Word>();

        /*Version2 */
        words.add(new Word("one","onnu"));
        words.add(new Word("two","rendu"));
        words.add(new Word("three","moonu"));
        words.add(new Word("four","naalu"));
        words.add(new Word("five","anchu"));
        words.add(new Word("six","aru"));
        words.add(new Word("seven","elu"));
        words.add(new Word("eight","ettu"));
        words.add(new Word("nine","onbathu"));
        words.add(new Word("ten","patthu"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.

        /*version 1*/
   //     ArrayAdapter<String> itemsAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,words);

        /*version 2*/
        WordAdapter itemsAdapter=new WordAdapter(this,words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.

        ListView listview=(ListView)findViewById(R.id.list);


        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

        listview.setAdapter(itemsAdapter);
    }
}
