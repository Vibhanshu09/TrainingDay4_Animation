package com.example.tcsexam.trainingday4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView animTextFadeIn, animTextFadeOut, animTextBlink, animTextMove, animTextRotate, animTextScale;
    Animation fadeIn, fadeOut, blink, move, rotate, scale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animTextFadeIn = findViewById(R.id.anim_text_fadein);
        animTextFadeOut = findViewById(R.id.anim_text_fadeout);
        animTextBlink = findViewById(R.id.anim_text_blink);
        animTextMove = findViewById(R.id.anim_text_move);
        animTextRotate = findViewById(R.id.anim_text_rotate);
        animTextScale = findViewById(R.id.anim_text_scale);

        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        move = AnimationUtils.loadAnimation(this, R.anim.move);
        rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        scale = AnimationUtils.loadAnimation(this, R.anim.scale);


        animTextFadeIn.startAnimation(fadeIn);
        animTextFadeOut.startAnimation(fadeOut);
        animTextBlink.startAnimation(blink);
        animTextMove.startAnimation(move);
        animTextRotate.startAnimation(rotate);
        animTextScale.startAnimation(scale);

    }
}
