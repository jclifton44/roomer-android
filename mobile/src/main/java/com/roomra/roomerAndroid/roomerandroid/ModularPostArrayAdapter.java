package com.roomra.roomerAndroid.roomerandroid;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jeremyclifton on 7/24/14.
 */
public class ModularPostArrayAdapter extends ArrayAdapter<ModularPost>{
    public Context context;
    public ModularPostArrayAdapter(Context c, int resourceId, List<ModularPost> items) {
        super(c, resourceId, items);
        this.context = c;
    }
    private class ViewHolder {
        ImageView contentPhoto;
        TextView markText;
        TextView topicText;
        TextView author;
        ImageView profilePhoto;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        ModularPost rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.markText = (TextView) convertView.findViewById(R.id.markText);
            holder.author = (TextView) convertView.findViewById(R.id.author);
            holder.topicText = (TextView) convertView.findViewById(R.id.topicText);
            holder.contentPhoto = (TextView) convertView.findViewById(R.id.contentPhoto);
            holder.profilePhoto = (TextView) convertView.findViewById(R.id.profilePhoto);

            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.author.setText(rowItem.getAuthor());
        holder.markText.setText(rowItem.getMarkText());
        holder.topicText.setText(rowItem.getMarkText());

        holder.contentPhoto.setImageResource(rowItem.getContentPhotoId());
        holder.profilePhoto.setImageResource(rowItem.getProfilePhotoId());


        return convertView;
    }
}
