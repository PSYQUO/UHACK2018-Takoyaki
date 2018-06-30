package ph.edu.dlsu.takoyaki.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import ph.edu.dlsu.takoyaki.myapplication.beans.Rewards;
import ph.edu.dlsu.takoyaki.myapplication.beans.Users;

public class MyRewardsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_rewards);

        RecyclerView myRewardsRV = (RecyclerView) findViewById(R.id.my_rewards_rv);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

        FirebaseRecyclerAdapter<Rewards, RewardsViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<Rewards, RewardsViewHolder>(Rewards.class,
                        R.layout.reward_item, RewardsViewHolder.class, databaseReference.child(Rewards.NAME)) {
                    @Override
                    protected void populateViewHolder(RewardsViewHolder viewHolder, Rewards model, int position) {

                    }
                };

    }
}
