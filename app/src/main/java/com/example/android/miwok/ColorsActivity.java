package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.color_red, "weṭeṭṭi", "red"));
        words.add(new Word(R.drawable.color_green, "chokokki", "green"));
        words.add(new Word(R.drawable.color_brown, "ṭakaakki", "brown"));
        words.add(new Word(R.drawable.color_gray, "ṭopoppi", "gray"));
        words.add(new Word(R.drawable.color_black, "kululli", "black"));
        words.add(new Word(R.drawable.color_white, "kelelli", "white"));
        words.add(new Word(R.drawable.color_dusty_yellow, "ṭopiisә", "dusty yellow"));
        words.add(new Word(R.drawable.color_mustard_yellow, "chiwiiṭә", "mustard yellow"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}