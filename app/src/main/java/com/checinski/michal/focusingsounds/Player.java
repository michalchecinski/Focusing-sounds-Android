package com.checinski.michal.focusingsounds;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;


public class Player {
    MediaPlayer mediaPlayer = new MediaPlayer();
    String filename;
	private boolean isPlaying=false;

    void play(Context context, String sound)
    {
		if(isPlaying){
            mediaPlayer.reset();
		}
        switch (sound)
        {
            case "sea":
                filename = "android.resource://" + context.getPackageName() +
                        "/raw/crisp_ccean_waves_mike_koenig";
                break;
            case "coffee":
                filename = "android.resource://" + context.getPackageName() +
                        "/raw/restaurant_ambiance_soundbible";
                break;
            case "rain":
                filename = "android.resource://" + context.getPackageName() +
                        "/raw/rain_background_mike_koenig";
                break;
        }


        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mediaPlayer.setLooping(true);
        try { mediaPlayer.setDataSource(context, Uri.parse(filename)); } catch (Exception e) {}
        try { mediaPlayer.prepare(); } catch (Exception e) {}

        mediaPlayer.start();
		
		isPlaying=true;

    }

    void stop()
    {
        if(isPlaying) {
            mediaPlayer.reset();
            isPlaying = false;
        }
    }
}
