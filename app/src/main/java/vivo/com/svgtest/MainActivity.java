package vivo.com.svgtest;


import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Collections;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;
    private boolean isChecked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView) findViewById(R.id.iv_svg);
        mImageView.setOnClickListener(mOnClickListener);
    }
    private View.OnClickListener mOnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View arg0) {
            isChecked = !isChecked;
            final int[] stateSet = {android.R.attr.state_checked * (isChecked ? 1 : -1)};
            mImageView.setImageState(stateSet, true);
            //使用asl时下边这句话注释掉，加上//。使用avd时下边这句话去掉前边//
            //((AnimatedVectorDrawable) mImageView.getDrawable()).start();
        }
    };
}
