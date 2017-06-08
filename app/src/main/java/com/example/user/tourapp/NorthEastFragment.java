package com.example.user.tourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NorthEastFragment extends Fragment {


    public NorthEastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_north_east, container, false);

        // Create a list of south west tourist information
        final ArrayList<TouristAttraction> touristAttractions = new ArrayList<TouristAttraction>();
        touristAttractions.add(new TouristAttraction("Yankari National Park", "Yankari National Park has become the most developed Wildlife park in Nigeria with a lot of attractions for visitors. The park is famous for its variety of animals available for viewing round the year, though the animals are better watched between November and May period of the dry season when the animals converge around the Gaji River, Baboons, Waterbucks, Elephants, Crocodiles, Bushbucks, Duikers, Warthogs, Hippopotamus are among the anirnals commonly seen at the park", R.drawable.yankari_national_park));
        touristAttractions.add(new TouristAttraction("Wikki Warm Springs", "This is a famous attraction in the Yankari National Park. It is particularly prized for its warm water. It is available both night and day for tourists who cherish swimming. The National Park is located in the South-Eastern area of Bauchi, the capital town of Bauchi State in the North-Eastern part of Nigeria.", R.drawable.wiki_warm_spring));
        touristAttractions.add(new TouristAttraction("Lake Chad", "Lake Chad occupies a strategic location serving not only Borno State of Nigeria where it is located but serving also the three neighbouring countries of Niger, Cameroon, and Chad. The lake, apart from serving the agricultural and economic needs of the people, attracts a great number of tourists. Of paramount interest to tourists is the boating opportunity and visits to the numerous fishing villages in the area.", R.drawable.lake_chad));
        touristAttractions.add(new TouristAttraction("Mambilla Plateau, Taraba", "It is the highest point in Nigeria standing at about 1,600 meters (5,249 ft) above sea level and is a combination of waterfalls, hills and mountains. The highest mountain Chappal Wadi which stands at 7,936 ft above sea level is the highest mountain in Nigeria is found at the northeastern flank of the Plateau.\n" + "\n" + "The plateau is Nigeria’s northern continuation of the Bamenda Highlands of Cameroon.",R.drawable.mambilla));
        touristAttractions.add(new TouristAttraction("Gashaka Gumti National Park, Taraba","Gashaka Gumti is said to be the largest wildlife park in Nigeria with various species of games to view. The national park was created from two game reserves in 1991 and is in the eastern provinces of Taraba and Adamawa state to the border with Cameroon. The animal fauna is diverse with over 103 mammal species recorded, the avian fauna also has an estimate of over a million birds and has been labelled one of Africa’s Important Bird Areas. The flora includes an isolated population of the red sunbird bush.",R.drawable.gashaka_gumti_national_park));

        // Create an ArrayAdapter, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item xml layout resource
        NorthEastAdapter northEastAdapter = new NorthEastAdapter(getActivity(), touristAttractions);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a list view with the view ID root view, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.root_view);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the  ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name colorAdapter.
        listView.setAdapter(northEastAdapter);


        return rootView;
    }

}


