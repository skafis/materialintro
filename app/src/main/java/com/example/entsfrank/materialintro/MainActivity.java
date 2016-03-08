package com.example.entsfrank.materialintro;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setFullscreen(true);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        /**
         * Standard slide (like Google's intros)
         */
        addSlide(new SimpleSlide.Builder()
                .title(R.string.title_1)
                .description(R.string.description_1)
                .image(R.drawable.image_1)
                .background(R.color.background_1)
                .backgroundDark(R.color.background_dark_1)
                .build());

        /**
         * Custom fragment slide
         */
        addSlide(new FragmentSlide.Builder()
                .background(R.color.background_2)
                .backgroundDark(R.color.background_dark_2)
                .fragment(R.layout.fragment_2, R.style.FragmentTheme)
                .build());
        setSkipEnabled(true);

        /* Enable/disable finish button */
        setFinishEnabled(true);

        /* Add your own page change listeners */
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }


        });
    }

    @Override
    public void onStop() {
        Intent intent = new Intent(getBaseContext(),Main2Activity.class);
        startActivity(intent);
        super.onStop();

    }
}

