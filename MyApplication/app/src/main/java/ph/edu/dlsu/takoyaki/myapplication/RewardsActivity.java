package ph.edu.dlsu.takoyaki.myapplication;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RewardsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);

        Button myrewards = (Button) findViewById(R.id.rewards_myrewards);

        myrewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();

                i.setClass(getBaseContext(), MyRewardsActivity.class);
                startActivity(i);


            }
        });

        TabLayout rewardsTabLayout = (TabLayout) findViewById(R.id.rewards_tabLayout);
        rewardsTabLayout.addTab(rewardsTabLayout.newTab().setText("Gold"));
        rewardsTabLayout.addTab(rewardsTabLayout.newTab().setText("Silver"));
        rewardsTabLayout.addTab(rewardsTabLayout.newTab().setText("Bronze"));
        rewardsTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //TODO add adapter to tab viewer

    }
}
