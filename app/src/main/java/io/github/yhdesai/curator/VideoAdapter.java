package io.github.yhdesai.curator;

/**
 * Created by Harshil on 30/11/17.
 */

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class VideoAdapter extends ArrayAdapter<CuratedVideo> {
    public VideoAdapter(Context context, int resource, List<CuratedVideo> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_video, parent, false);
        }

        TextView nameTextView = (TextView) convertView.findViewById(R.id.nameTextView);
        TextView urlTextView = (TextView) convertView.findViewById(R.id.urlTextView);

        CuratedVideo message = getItem(position);


        nameTextView.setVisibility(View.VISIBLE);
        nameTextView.setText(message.getName());

        urlTextView.setVisibility(View.VISIBLE);
        urlTextView.setText(message.getUrl());


        return convertView;
    }
}

