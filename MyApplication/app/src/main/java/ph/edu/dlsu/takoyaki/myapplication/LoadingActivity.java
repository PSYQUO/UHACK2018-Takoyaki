package ph.edu.dlsu.takoyaki.myapplication;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.activity_loading_layout);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();

                i.setClass(getBaseContext(), LandingActivity.class);
                startActivity(i);

                finish ();
            }
        });
    }
}
