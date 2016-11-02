package com.wuzch.animationlearning;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * Created by Administrator on 2016/11/2.
 */

public class LayoutAnimationDemo extends AppCompatActivity {
    private LinearLayout layout_Animation;
    private View.OnClickListener btn_onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            layout_Animation.removeView(v);
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_animation);
        layout_Animation= (LinearLayout) findViewById(R.id.layout_animation);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    private void addButton(){
        Button btn=new Button(LayoutAnimationDemo.this);
        btn.setText("Remove me");
        layout_Animation.addView(btn);
        btn.setOnClickListener(btn_onClickListener);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_settings:
                return  true;
            case R.id.action_add:
                addButton();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
