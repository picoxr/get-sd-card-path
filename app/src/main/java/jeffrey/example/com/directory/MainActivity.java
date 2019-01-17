package jeffrey.example.com.directory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text1);

        androidGetSDdir();


    }
    // get SD card path main method
    public void androidGetSDdir() {

        String dir = Externalstoragedirectory.getSDdir(this);
        textView.setText(dir);


    }
}
