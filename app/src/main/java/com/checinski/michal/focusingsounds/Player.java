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
                myUri=R.raw.Crisp_Ocean_Waves_Mike_Koenig_1486046376;
                break;
            case "coffee":
                myUri=R.raw.Restaurant_Ambiance_SoundBible_628640170;
                break;
            case "rain":
                myUri=R.raw.Rain_Background_Mike_Koenig_1681389445;
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
