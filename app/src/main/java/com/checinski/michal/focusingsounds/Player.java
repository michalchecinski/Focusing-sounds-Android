package com.checinski.michal.focusingsounds;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;

/**
 * Created by micha on 21.05.2016.
 */
public class Player {
    MediaPlayer mediaPlayer = new MediaPlayer();
    Uri myUri;

    void play(Context context, String a)
    {
        switch (a)
        {
            case "sea":
                myUri=R.raw.crisp_ccean_waves_mike_koenig;
                break;
            case "coffee":
                myUri=R.raw.restaurant_ambiance_soundbible;
                break;
            case "rain":
                myUri=R.raw.rain_background_mike_koenig;
                break;
        }
        mediaPlayer.stop();

        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mediaPlayer.setDataSource(context, myUri);
        mediaPlayer.setLooping(true);
        mediaPlayer.prepare();
        mediaPlayer.start();

    }

    void stop()
    {
        mediaPlayer.stop();
    }
}
