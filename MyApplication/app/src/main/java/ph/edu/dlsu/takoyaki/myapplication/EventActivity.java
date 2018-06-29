package ph.edu.dlsu.takoyaki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        ImageButton eventCameraBtn = (ImageButton) findViewById(R.id.event_cameraBtn);

        eventCameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();

                //TODO change home activity
                i.setClass(getBaseContext(), HomeActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity (i);

                finish ();
            }
        });
    }
}
