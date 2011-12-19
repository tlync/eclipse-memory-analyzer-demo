package me.tlync.android.example;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MemoryAnalyzerDemoActivity extends Activity {

    private static SomeInnerClass innerClass;

    @SuppressWarnings("unused")
    private byte[] someBigObject = new byte[1024 * 1024 * 3];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ImageView background = (ImageView) findViewById(R.id.background);
        background.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.droid));

        if (innerClass == null) {
            innerClass = new SomeInnerClass();
        }
        innerClass.doSomething();
    }

    class SomeInnerClass {
        public void doSomething() {
            Toast.makeText(getApplicationContext(), "Do something", Toast.LENGTH_SHORT).show();
        }
    }

}