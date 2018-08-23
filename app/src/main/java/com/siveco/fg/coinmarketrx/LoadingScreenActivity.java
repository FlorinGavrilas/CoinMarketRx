package com.siveco.fg.coinmarketrx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class LoadingScreenActivity extends Activity {

    public final int WAIT_TIME = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_screen);
        findViewById(R.id.mainSpinner1).setVisibility(View.VISIBLE);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(LoadingScreenActivity.this, MainActivity.class);
                LoadingScreenActivity.this.startActivity(mainIntent);
                LoadingScreenActivity.this.finish();
            }
        }, WAIT_TIME);
    }
}
