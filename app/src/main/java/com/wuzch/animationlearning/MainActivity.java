package com.wuzch.animationlearning;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

import com.gc.materialdesign.views.ButtonFlat;
import com.gc.materialdesign.views.ButtonRectangle;

public class MainActivity extends AppCompatActivity {
    private Button btnAnimate,btnCustomAnime;
    private com.gc.materialdesign.views.ButtonRectangle btnRotateme;
    private com.gc.materialdesign.views.ButtonFlat btnSetAnime;
//    private AnimationSet animationset;
//    private AlphaAnimation alphaAnimation;
//    private TranslateAnimation translateAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 透明动画效果
         */
        btnAnimate= (Button) findViewById(R.id.btnAnimate);
        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                AlphaAnimation anime=new AlphaAnimation(0,1);
//                anime.setDuration(1000);
//                v.startAnimation(anime);
                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.anime));
            }
        });
        /**
         * 旋转动画效果
         */
//        btnRotateme= (Button) findViewById(R.id.btnRotate);
        btnRotateme= (ButtonRectangle) findViewById(R.id.btnRotate);
        btnRotateme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                RotateAnimation rotateAnime=new RotateAnimation(0,360,
//                        RotateAnimation.RELATIVE_TO_SELF,0.5f,
//                        RotateAnimation.RELATIVE_TO_SELF,0.5f);
//                rotateAnime.setDuration(1000);
                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate_anime));
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(MainActivity.this,LayoutAnimationDemo.class));
                    }
                }, 900);
            }
        });
        /**
         * 混合动画效果
         */
//        animationset=new AnimationSet(true);
//        animationset.setDuration(1000);
//        alphaAnimation=new AlphaAnimation(0,1);
//        alphaAnimation.setDuration(1000);
//        translateAnimation=new TranslateAnimation(0,200,0,200);
//        translateAnimation.setDuration(1000);
//        animationset.addAnimation(alphaAnimation);
//        animationset.addAnimation(translateAnimation);
        btnSetAnime= (ButtonFlat) findViewById(R.id.btnSetAnime);
        btnSetAnime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.set_anime));
            }
        });
        /**
         * 自定义动画效果
         */
        btnCustomAnime= (Button) findViewById(R.id.btnCustomAnime);
        btnCustomAnime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomAnime customAnime=new CustomAnime();
                customAnime.setDuration(1000);
                v.startAnimation(customAnime);
            }
        });
    }

}
