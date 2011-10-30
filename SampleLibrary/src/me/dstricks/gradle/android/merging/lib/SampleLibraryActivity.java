package me.dstricks.gradle.android.merging.lib;

import android.app.Activity;
import android.os.Bundle;

public class SampleLibraryActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}