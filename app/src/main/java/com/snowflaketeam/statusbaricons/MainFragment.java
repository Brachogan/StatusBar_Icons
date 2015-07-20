package com.snowflaketeam.statusbaricons;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Mohammed on 7/13/2015.
 * to start with intial grid without storing them in database
 * so they wont loop each time the app start.
 */
public class MainFragment extends BaseAdapter {
    private Context myContext;
    private final int[] iconIDs;

    public MainFragment(Context context, int[] iconIDs) {
        myContext = context;
        this.iconIDs = iconIDs;
    }

    @Override
    public int getCount() {
        return iconIDs.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.view_template, parent, false);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.image_view);
            viewHolder.imageView.setPadding(4, 4, 4, 4);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.imageView.setImageResource(iconIDs[position]);
        return convertView;
    }

    private static class ViewHolder {
        ImageView imageView;
    }
}


