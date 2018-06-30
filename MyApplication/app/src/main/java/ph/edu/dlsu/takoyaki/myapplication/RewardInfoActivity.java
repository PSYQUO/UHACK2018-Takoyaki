package ph.edu.dlsu.takoyaki.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import ph.edu.dlsu.takoyaki.myapplication.beans.Rewards;

public class RewardInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward_info);

        Button useReward = (Button) findViewById(R.id.use_reward);
        final TextView rewardInfoDesc = findViewById(R.id.rewardInfo_desc);
        final TextView rewardInfoValidity = findViewById(R.id.rewardInfo_validity);

        String key = getIntent().getExtras().getString("key");
        final DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child(Rewards.NAME).child(key);
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Rewards r = dataSnapshot.getValue(Rewards.class);

                rewardInfoDesc.setText(r.getDesc());
                // TODO fix this
                rewardInfoValidity.setText(r.getSponsor());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        useReward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child("use").setValue(true);
            }
        });
    }
}
