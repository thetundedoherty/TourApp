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
public class SouthSouthFragment extends Fragment {


    public SouthSouthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_south_south, container, false);

        // Create a list of south west tourist information
        final ArrayList<TouristAttraction> touristAttractions = new ArrayList<TouristAttraction>();
        touristAttractions.add(new TouristAttraction("Obudu Mountain Resort", "Obudu Mountain Resort (formerly known as the Obudu Cattle Ranch) is a ranch and resort on the Obudu Plateau in Cross River State, Nigeria. The Ranch is over 1,524m, has temperate weather condition to ensure green vegetation and grazing of cattle round the year.\n" +"\n" + "The Ranch is a tourist delight as a result of its divergent attractions. There are a natural swimming pool, horse riding, beautiful waterfall to behold, gorilla camp, bird watching, sporting facilities and accommodation.", R.drawable.obudu_montain_resort));
        touristAttractions.add(new TouristAttraction("Agbokim Waterfalls", "Some short distance away from the Nigeria-Cameroon border is the very captivating sight called Agbokim Waterfalls. The Falls situated in Cross River State lies less than 30km from Ikom and is highly recommended for picnics. The falls are pleasantly surrounded by green vegetation.", R.drawable.abbokim_water_fall));
        touristAttractions.add(new TouristAttraction("Okomu Wildlife Sanctuary ", "The Okomu Wildlife Sanctuary, Benin City, Edo State was the first in the country to be protected by law for conservation in August 1985.  It is jointly managed by the Edo State Government and the Nigerian Conservation Foundation, (NCF).\n" +
                "\n" + " The sanctuary contains rare species like the white-throat- ed monkey. Also present are the mona monkey, the putty nosed quenon, the red-cangaby, chimpanzees, elephants, bush-baby, the potto buffalo, red river hog, duikers, horn bills, porcupines, etc. The Okomu Forest Reserve is the second largest in the country after theOban Forests in Cross River State.", R.drawable.okomu_national_park));
        touristAttractions.add(new TouristAttraction("Ososo Tourist Centre ","Ososo town, on the boundary between Edo and Kogi States, is hilly and rocky. It lies about 40 kilometres from Igarra and 200 kilometres from Benin city in Edo State, The rocks and hills present a beautiful scenery. There is a non-catering Rest House on top of a hill at Ososo, which grants a wide view of parts of Kogi State to as far as the Niger, from the Rest House can be seen some distance away a crater take with colourful fishes.\n"+ "\n" + "An amusement park is being developed as part of the resort which has temperate weather for long periods in the year.",R.drawable.ososo_tourist_centre));
        touristAttractions.add(new TouristAttraction("Abraka River Resort, Abraka","Located in the quiet University Town of Abraka, this Motel is ideal for those who want to escape the noise and tension of city/urban life. Hence guests can swim, boat, sport-fish or simply bask in the warm sun.on the exquisite sand-beach as the glass- clear Ethiope River flows lazily by. There are also lawn tennis, squash rackets and badminton courts as well as a children's playground.", R.drawable.abraka_resort));
        touristAttractions.add(new TouristAttraction("Nana Living History Museum","The magnificent national monument of the Nana Living History Museum is situated in Koko in Warri, a museum that was built by a powerful 19th century business man, Chief Nana Olomu Ebrohimi.",R.drawable.nana_livingstone));


        // Create an ArrayAdapter, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item xml layout resource
        SouthSouthAdapter southSouthAdapter = new SouthSouthAdapter(getActivity(), touristAttractions);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a list view with the view ID root view, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.root_view);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the  ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name colorAdapter.
        listView.setAdapter(southSouthAdapter);


        return rootView;
    }

}
