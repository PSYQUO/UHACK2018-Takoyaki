package ph.edu.dlsu.takoyaki.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PointsViewHolder extends RecyclerView.ViewHolder {

    TextView pt_points;
    TextView pt_name;

    public PointsViewHolder(View itemView) {
        super(itemView);

        pt_points = itemView.findViewById(R.id.ptitem_points);
        pt_name = itemView.findViewById(R.id.ptitem_name);
    }
}
