package work.nbcc.dburchill.exercise1_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HelloActivity extends AppCompatActivity {

    //private static final String TAG =  HelloActivity.class.getSimpleName();
    private static final String TAG =  "work.nbcc.Exercise1_1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Log.d( TAG, "Hello Debug Log");
        Log.e(TAG, "Hello Error Log");
    }
}
