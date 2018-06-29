package ph.edu.dlsu.takoyaki.myapplication;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ConstraintLayout eventBanner = (ConstraintLayout) findViewById(R.id.eventBanner);
        ConstraintLayout pointsBanner = (ConstraintLayout) findViewById(R.id.pointsBanner);
        Button rewards = (Button) findViewById(R.id.home_rewardsBtn);
        ImageButton homeCameraBtn = (ImageButton) findViewById(R.id.home_cameraBtn);

        eventBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent ();
                i.setClass (getBaseContext(), EventActivity.class);
                startActivity(i);
            }
        });

        pointsBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent ();
                i.setClass(getBaseContext(), PointsActivity.class);
                startActivity(i);
            }
        });

        rewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), RewardsActivity.class);
                startActivity(i);
            }
        });

        homeCameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent ();
                // TODO fix this intent
                i.setClass(getBaseContext(), HomeActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                finish ();
            }
        });

    }
}
