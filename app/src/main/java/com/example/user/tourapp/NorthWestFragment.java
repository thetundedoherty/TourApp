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
public class NorthWestFragment extends Fragment {


    public NorthWestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_north_west, container, false);

        // Create a list of south west tourist information
        final ArrayList<TouristAttraction> touristAttractions = new ArrayList<TouristAttraction>();
        touristAttractions.add(new TouristAttraction("Nok Village", "A trip to the Nok Village in Kaduna State launches visitors into physical romance with the so-much-talked-about culture of the Nok people. The cultures has been known for over 2,500 years. The Nok culture is better appreciated appraising the excavations made by the numerous scholars and research.\n" +
                "\n" + "Terra cotta, heads of animals and man; and weapons of war are abundant on display.", R.drawable.nok_terracota));
        touristAttractions.add(new TouristAttraction("Matsirga Falls Kanfanchan, Kaduna", "Matsirga Falls is located in Madakiya, Kafanchan Kaduna and is yet another beautiful waterfall in the North. It has a height of about 30 meters and gets its source from springs on the Kagoro hills. The water at the Matsirga Falls drops into a gorge that has been supported by beautiful rocks.\n" +  "\n" + "Something magical happens at the point of impact with the river, the avalanche of the fall creates a rainbow-like mist which appears and disappears mysteriously.", R.drawable.matsirga_water_fall));
        touristAttractions.add(new TouristAttraction("Kamuku National Park","The park is located in the west of Kaduna State, and is adjacent to the Kwiambana Game Reserve to the north west and 14km away from main town. It was established in 1936 as the Native Authority Forest Reserve of Birnin Gwari under the Northern Nigeria Government. It was upgraded from a state Game Reserve to a National Park in May 1999, in part due to the success of a community-based project promoting sustainable resource usage, managed by Savanna Conservation Nigeria, a national NGO.\n" +
                "\n" +  "The park has generally flat terrain, sloping gradually upwards to the Birnin Gwari Ridge along the eastern boundary. Natural features of interest include the Dogon Ruwa Waterfalls; the Goron Dutse, a large isolated inselberg with a smooth surface stratified in a pattern of black and white squares; and the Tsaunin Rema, a hill made of large boulders piled on top of each other, with a large population of rock hyraxes." ,R.drawable.kamuku_national_park));
        touristAttractions.add(new TouristAttraction("Gobarau Minaret","The Gobarau Minaret was constructed over 300 years ago – of baked clay and mud. It is a 50-foot or 15-meters minaret located at the centre of Katsina city. The tower has now become a symbol of the city. It is said to have been completed during the reign of Sarkin Katsina Muhammadu Korau (1398-1408 AD), the first Muslim king of Katsina.\n" + "\n" + "Over the centuries, it has been used as a central mosque, an Islamic centre for higher education, and a high tower for spotting invading armies.",R.drawable.gobarau_minaret));
        touristAttractions.add(new TouristAttraction("Katsina City Gates","Constructed about 900 years ago during the reign of King Murabus, the Katsina city wall surrounds the city and has seven different gates for access. The ancient seven gates of the city wall continue to fascinate visitors to the town, and something that faraway tourists have heard about and wish to see.",R.drawable.kastina_city_gate));
        touristAttractions.add(new TouristAttraction("Dala hills Kano","The Dala hills is where the first settlers in Kano dwelt when they first arrived the city thousands of years ago, and the first inhabitants used the hills to model their housing and villages. The hills still retain tourism values that visitors will find fascinating anytime they visit the hills in Kano.",R.drawable.dala_hills));
        touristAttractions.add(new TouristAttraction("Kano walls","The Kano city walls was constructed in the 14th century and is 14 km radius from the center of the city. It provided protection against marauders and external aggression in the olden days, and served as defensive landmarks on which the people relied upon for safety from attackers",R.drawable.kano_walls));
        touristAttractions.add(new TouristAttraction("Birnin Kudu Rock Painting","Birnin Kudu town lies in the South of Jigawa State. Birnin Kudu is noted for the presence of rocks. Fascinating are the ancient paintings on these rocks. The different paintings are eloquent information on the styles of the early settlers in the area.",R.drawable.birnin_rock_painting));

        // Create an ArrayAdapter, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item xml layout resource
        NorthWestAdapter northWestAdapter = new NorthWestAdapter(getActivity(), touristAttractions);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a list view with the view ID root view, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.root_view);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the  ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name colorAdapter.
        listView.setAdapter(northWestAdapter);

        return rootView;
    }

}


