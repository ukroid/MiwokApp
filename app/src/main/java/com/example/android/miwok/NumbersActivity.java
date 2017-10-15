package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class NumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.number_one, "lutti", "one"));
        words.add(new Word(R.drawable.number_two, "otiiko", "two"));
        words.add(new Word(R.drawable.number_three, "tolookosu", "three"));
        words.add(new Word( R.drawable.number_four, "oyyisa", "four"));
        words.add(new Word(R.drawable.number_five, "massokka", "five"));
        words.add(new Word(R.drawable.number_six, "temmokka", "six"));
        words.add(new Word(R.drawable.number_seven, "kenekaku", "seven"));
        words.add(new Word(R.drawable.number_eight, "kawinta", "eight"));
        words.add(new Word(R.drawable.number_nine, "wo’e", "nine"));
        words.add(new Word(R.drawable.number_ten, "na’aacha", "ten"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        final ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.number_one);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 1) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.number_two);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 2) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.number_three);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 3) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.number_four);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 4) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.number_five);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 5) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.number_six);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 6) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.number_seven);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 7) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.number_eight);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 8) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.number_nine);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 9) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.number_ten);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
            }
        }

        );


    }


}


//if (listView.getSelectedItemPosition() == 0) {