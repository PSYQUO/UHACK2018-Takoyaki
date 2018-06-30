package ph.edu.dlsu.takoyaki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import ph.edu.dlsu.takoyaki.myapplication.beans.PointHistory;
import ph.edu.dlsu.takoyaki.myapplication.beans.Rewards;
import ph.edu.dlsu.takoyaki.myapplication.beans.Users;

public class PointsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);

        RecyclerView myRewardsRV = (RecyclerView) findViewById(R.id.points_rv);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

        final TextView pointsHelp = (TextView) findViewById(R.id.points_help);

//        FirebaseRecyclerAdapter<PointHistory, PointsViewHolder> firebaseRecyclerAdapter =
//                new FirebaseRecyclerAdapter<PointHistory, PointsViewHolder>(PointsActivity.class,
//                        R.layout.reward_item, PointsViewHolder.class, databaseReference.child(PointsActivity.NAME)) {
//                    @Override
//                    protected void populateViewHolder(final PointsViewHolder viewHolder, final PointHistory model, int position) {
//
//                        //viewHolder.pt_points.setText();
//                        final String uid = model.getUid();
//
//                        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child(Users.NAME);
//
//                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
//                            @Override
//                            public void onDataChange(DataSnapshot dataSnapshot) {
//                                for (DataSnapshot snap: dataSnapshot.getChildren()) {
//                                    Users u = snap.getValue(Users.class);
//                                    if (u.getUid().equals(uid)) {
//                                        viewHolder.pt_points.setText((int) u.getPoints());
//                                        return;
//                                    }
//                                }
//                            }
//
//                            @Override
//                            public void onCancelled(DatabaseError databaseError) {
//
//                            }
//                        });
//
////                        viewHolder.pt_name.setText(model.);
//
//
//                    }
//
////                    @Override
////                    protected void populateViewHolder(RewardsViewHolder viewHolder, Rewards model, int position) {
////                        viewHolder.rewardDesc.setText(model.getDesc());
////                        //TODO fix this
////                        viewHolder.rewardValidity.setText(model.getSponsor());
////
////                        String key = getRef(position).getKey ();
////                        viewHolder.itemView.setTag (key);
////
////                        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
////                            @Override
////                            public void onClick(View view) {
////                                Intent i = new Intent(getBaseContext(), RewardInfoActivity.class);
////                                i.putExtra("key", view.getTag().toString());
////                                startActivity(i);
////                            }
////                        });
////                    }
//                };

        pointsHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), Tutorial.class);
                startActivity(i);
            }
        });
    }
}
