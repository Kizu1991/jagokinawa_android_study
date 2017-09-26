package jag.okinawa.androidstudy.myapplication;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * カスタムAdapterクラス
 * pdc-k-kamiya on 2017/09/13.
 */
public class MyAdapter extends BaseAdapter{

    private List<MyModel> mModels;

    public MyAdapter(List<MyModel> models) {
        mModels = models;
    }

    @Override
    public int getCount() {
        return mModels.size();
    }

    @Override
    public MyModel getItem(int position) {
        return mModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        MyModel model = getItem(position);
        ViewHolder viewHolder;

        if(view == null){
            view = View.inflate(viewGroup.getContext(), R.layout.row, null);
            viewHolder = new ViewHolder();
            viewHolder.mImageView = (ImageView) view.findViewById(R.id.image);
            viewHolder.mTitle = (TextView) view.findViewById(R.id.title);
            viewHolder.mDescription = (TextView) view.findViewById(R.id.description);
            view.setTag(viewHolder);
        } else{
            viewHolder = (ViewHolder) view.getTag();
        }

        Picasso.with(viewGroup.getContext())
                .load(model.getImageUrl())
                .into(viewHolder.mImageView);

        viewHolder.mTitle.setText(model.getTitle());
        viewHolder.mDescription.setText(model.getDescription());

        return view;
    }

    private static class ViewHolder{
        ImageView mImageView;
        TextView mTitle;
        TextView mDescription;
    }
}
