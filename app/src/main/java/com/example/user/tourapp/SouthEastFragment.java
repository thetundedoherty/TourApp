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
public class SouthEastFragment extends Fragment {


    public SouthEastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_south_east, container, false);

        // Create a list of south west tourist information
        final ArrayList<TouristAttraction> touristAttractions = new ArrayList<TouristAttraction>();
        touristAttractions.add(new TouristAttraction("Azumini Blue River Rose", "Azurnini Blue River is located in Abia State towards its boundary with Akwa lbom State. The River has become a resort for tourists because of the pleasantness it offers. The attractive features of the River include its crystal-clear blue water; canoe rides; sandy beaches with such relaxation facilities as chairs and tables. At the beach also, BBQ grill are delicacies provided for picnickers", R.drawable.azumimi_blue_river));
        touristAttractions.add(new TouristAttraction("Ogbunike Cave", "Ogbunike Cave can be described as the very wonder of nature. The Cave, segmented into sections, is found in Anambra State, some few kilometres away from the Onitsha market town. There are different stories about the various sections that constitute the cave. The stories are better told by the native tour guides.", R.drawable.ogbunike_cave));
        touristAttractions.add(new TouristAttraction("Rojenny Tourist Village","In Anambra State, just at the outskirts of Onitsha market town is found Rojenny Village, one of the leading tourist resorts in Nigeria. Among the many attractions of the village are amusement park, joy rides and sporting/relaxation facilities",R.drawable.rojenny));
        touristAttractions.add(new TouristAttraction("Igbo-Ukwu","lgbo-Ukwu is an ancient town which has remained an attraction to tourists because of its bronze artifacts. The bronze which was first noticed in 1938 was later excavated by Thurstan Shaw, an English archaeologist. The bronzes which date back to about the 9th century are of high value because of their historic relevance.",R.drawable.igbo_ukwu));
        touristAttractions.add(new TouristAttraction("Mbari Cultural Centres","The home of Mbari sculptural houses. These sculptures are robust art manifestations of the prevalent social life and a monumental art sacrifice to \"ALA\" the earth goodness. In Mbari, Imo State there are very many objects like the terrorising beast, the plastic forms of symbols of the prevalent deities among which is the \"ALA\" herself, the Amadioha (Thunder god), the Ogwugwu (forest god) each deity with his or her mystical messengers such as snakes, monkeys, rams, tortoise and owl are properly represented.\n" + "\n"+ "A number of symbolic models were sculptured or painted, these sculptures reflect the lgbo aesthetics. The Mbari Cultural Centre is an open air museum and found in Ikenegbu layout Owerri and at Eke-Nguru in Aboh Mbaise.",R.drawable.mbari_house));
        touristAttractions.add(new TouristAttraction("Oguta Lake Holiday Complex","The holiday complex situates in Oguta local government area of Imo State about 40km (forty kilometres) away from Owerri, the Capital of Imo State. The lake is of fresh water and the second largest natural lake in the country after lake Chad. To complement the complex water-based recreation services, there are other interesting attractions to watch. These include Golf Course with 18 standard international holes.\n" + "\n" + " Relic of war (mini bunker) constructed by the defunct Biafran Navy during Civic war to include Natural confluence of Oguta Lake and Urashi River,Cruise boat services, Golf Club Bar House/Oguta Lake Motel for refreshment, lodging, feeding and mini-children recreation park ", R.drawable.oguta_lake));



        // Create an ArrayAdapter, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item xml layout resource
        SouthEastAdapter southEastAdapter = new SouthEastAdapter(getActivity(), touristAttractions);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a list view with the view ID root view, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.root_view);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the  ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name colorAdapter.
        listView.setAdapter(southEastAdapter);


        return rootView;
    }

}


