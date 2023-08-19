package com.example.space;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<List_item> listItems;

    public MyAdapter(Context context, List<List_item> listItems) {
        this.context = context;
        this.listItems = listItems;
    }
    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.img1);
        ImageButton icon1 = convertView.findViewById(R.id.img2);
        ImageButton icon2 = convertView.findViewById(R.id.img3);
        ImageButton icon3 = convertView.findViewById(R.id.img4);
        ImageButton icon4 = convertView.findViewById(R.id.img5);

        TextView likesTextView = convertView.findViewById(R.id.tlike);
        TextView commentTextView = convertView.findViewById(R.id.ct1);


        List_item post = (List_item) getItem(position);

        imageView.setImageResource(post.getImage());
        icon1.setImageResource(post.getIcon1());
        icon2.setImageResource(post.getIcon2());
        icon3.setImageResource(post.getIcon3());
        icon4.setImageResource(post.getIcon4());
        likesTextView.setText(post.getLikes());
        commentTextView.setText(post.getComments());

        return convertView;
    }
}