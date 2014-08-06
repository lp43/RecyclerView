package recyclerview.android.hmkcode.com.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;

/**
 * Created by lp43 on 2014/8/4.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private ItemData[] itemsData;

    public MyAdapter(ItemData[] itemsData) {
        this.itemsData = itemsData;
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData

        viewHolder.txtViewTitle.setText(itemsData[position].getTitle());
//        viewHolder.imgViewIcon.setImageResource(itemsData[position].getImageUrl());

        Picasso.with(viewHolder.imgViewIcon.getContext()).cancelRequest(viewHolder.imgViewIcon);
        Picasso.with(viewHolder.imgViewIcon.getContext()).load(itemsData[position].getImageUrl()).into(viewHolder.imgViewIcon);
    }

    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsData.length;
    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView txtViewTitle;
        public ImageView imgViewIcon;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            itemLayoutView.setOnClickListener(this);
            txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.item_title);
            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.item_icon);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "position = " + getPosition(), Toast.LENGTH_SHORT).show();
        }
    }
}
