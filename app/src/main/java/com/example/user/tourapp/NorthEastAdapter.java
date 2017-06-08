package com.example.user.tourapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 6/2/2017.
 */

public class NorthEastAdapter extends ArrayAdapter {
    private static final String LOG_TAG = NorthEastAdapter.class.getSimpleName();

    public NorthEastAdapter(Activity context, ArrayList<TouristAttraction> touristAttractions) {
        super(context, 0, touristAttractions);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the South west object located at this position in the list
        TouristAttraction currentTouristAttraction = (TouristAttraction) getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);

        // Get the title text view from the current south west object and
        // set this text on the name TextView

        titleTextView.setText(currentTouristAttraction.getmTitle());


        // Find the TextView in the list_item.xml layout with the ID name

        TextView overviewTextView = (TextView) listItemView.findViewById(R.id.overview_text_view);

        // Get the title text view from the current south west object and
        // set this text on the name TextView

        overviewTextView.setText(currentTouristAttraction.getmOverview());

        // Find the TextView in the list_item.xml layout with the ID name

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        // Get the title text view from the current south west object and
        // set this text on the name TextView

        imageView.setImageResource(currentTouristAttraction.getmImageResourceID());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

        return listItemView;
    }

}
