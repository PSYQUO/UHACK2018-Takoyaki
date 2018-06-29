package ph.edu.dlsu.takoyaki.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RewardsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);

        TabLayout rewardsTabLayout = (TabLayout) findViewById(R.id.rewards_tabLayout);
        rewardsTabLayout.addTab(rewardsTabLayout.newTab().setText("Gold"));
        rewardsTabLayout.addTab(rewardsTabLayout.newTab().setText("Silver"));
        rewardsTabLayout.addTab(rewardsTabLayout.newTab().setText("Bronze"));
        rewardsTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //TODO add adapter to tab viewer

    }
}
