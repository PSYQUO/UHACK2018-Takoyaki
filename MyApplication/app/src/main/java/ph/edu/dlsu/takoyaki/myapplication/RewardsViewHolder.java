package ph.edu.dlsu.takoyaki.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RewardsViewHolder extends RecyclerView.ViewHolder {

    ImageView rewardLogo;
    TextView rewardDesc;
    TextView rewardValidity;

    public RewardsViewHolder(View itemView) {
        super(itemView);

        rewardLogo = itemView.findViewById(R.id.reward_logo);
        rewardDesc = itemView.findViewById(R.id.reward_desc);
        rewardValidity = itemView.findViewById(R.id.reward_validity);
    }

}
