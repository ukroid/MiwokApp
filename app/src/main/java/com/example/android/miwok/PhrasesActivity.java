package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("minto wuksus", "Where are you going?"));
        words.add(new Word("tinnә oyaase'nә", "What is your name?"));
        words.add(new Word("oyaaset...", "My name is..."));
        words.add(new Word("michәksәs?", "How are you feeling?"));
        words.add(new Word("kuchi achit", "I’m feeling good."));
        words.add(new Word("әәnәs'aa?", "Are you coming?"));
        words.add(new Word("hәә’ әәnәm", "Yes, I’m coming."));
        words.add(new Word("әәnәm", "I’m coming."));
        words.add(new Word("yoowutis", "Let’s go."));
        words.add(new Word("әnni'nem", "Come here."));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.phrase_where_are_you_going);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 1) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.phrase_what_is_your_name);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 2) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.phrase_my_name_is);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 3) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.phrase_how_are_you_feeling);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 4) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.phrase_im_feeling_good);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 5) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.phrase_are_you_coming);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 6) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.phrase_yes_im_coming);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 7) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.phrase_im_coming);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 8) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.phrase_lets_go);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }
                if (i == 9) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.phrase_come_here);
                    mediaPlayer.start();
                    mediaPlayer.setLooping(false);
                }

            }
        }

        );

    }
}