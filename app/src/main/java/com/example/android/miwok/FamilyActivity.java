package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.family_father, "әpә", "father"));
        words.add(new Word(R.drawable.family_mother, "әṭa", "mother"));
        words.add(new Word(R.drawable.family_son, "angsi", "son"));
        words.add(new Word(R.drawable.family_daughter, "tune", "daughter"));
        words.add(new Word(R.drawable.family_older_brother, "taachi", "older brother"));
        words.add(new Word(R.drawable.family_younger_brother, "chalitti", "younger brother"));
        words.add(new Word(R.drawable.family_older_sister, "teṭe", "older sister"));
        words.add(new Word(R.drawable.family_younger_sister, "kolliti", "younger sister"));
        words.add(new Word(R.drawable.family_grandmother, "ama", "grandmother"));
        words.add(new Word(R.drawable.family_grandfather, "paapa", "grandfather"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

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