package com.yb.magicwallpaper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

/**
 * @author yangbo
 * @date 2018/2/26
 *
 */
public class MainActivity extends AppCompatActivity {


    private CheckBox mCbVoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCbVoice = (CheckBox) findViewById(R.id.id_cb_voice);

        mCbVoice.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(
                            CompoundButton buttonView, boolean isChecked) {

                        if (isChecked) {
                            // 静音
                            VideoLiveWallpaper.voiceSilence(getApplicationContext());
                        } else {
                            VideoLiveWallpaper.voiceNormal(getApplicationContext());
                        }
                    }
                });
    }

    public void setVideoToWallPaper(View view) {
        VideoLiveWallpaper.setToWallPaper(this);
    }
}
