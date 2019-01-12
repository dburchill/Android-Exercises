package work.nbcc.dburchill.exercise1_2b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    private Button toastButton;
    private Button countButton;
    private TextView showCount;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // get references to View objects in the layout by finding them by id
        toastButton = (Button) findViewById(R.id.toast_button);
        countButton = (Button) findViewById(R.id.count_button);
        showCount = (TextView) findViewById(R.id.show_count);


        // set the toast button callback using an inner class
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // use the Toast.makeText() factory method to make a new instance of Toast
                // you can also use getApplicationContext() to get the context
                Toast toast = Toast.makeText(MainActivity.this, R.string.toast_message, Toast.LENGTH_SHORT);

                // show the toast
                toast.show();
            }
        });


        // set the count callback using a lambda expression
        // to use lambdas you have to set the java language level to 8
        countButton.setOnClickListener((View v) -> {
            count++;
            showCount.setText(Integer.toString(count));
        });
    }
}
