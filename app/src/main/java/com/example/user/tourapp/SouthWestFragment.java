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
public class SouthWestFragment extends Fragment {


    public SouthWestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_south_west, container, false);

        // Create a list of south west tourist
        final ArrayList<TouristAttraction> touristAttractions = new ArrayList<TouristAttraction>();
        touristAttractions.add(new TouristAttraction("Olumo Rock, Abeokuta", "The Olumo Rock is situated in the ancient city of Abeokuta in Ogun State, Nigeria. It is a popular tourist attraction and an ancient fortress used by the Egba people as a refuge during war times in the 19th century. The ancient rock was renovated for tourism in 2006 and upgraded for tour infrastructures – with a museum, water fountain, restaurants, elevators and other fascinating features built to make visiting and climbing the huge rock a delight.\n"
               + "\n" + "Guides are available to take you through the rocky climb and intimate you with the history of the place. You can see cave paintings and carvings as you climb or access the recesses of the rock, and you can also see statues and even very old women muttering blessings as you climb the rocks.",R.drawable.olumo_rock));
        touristAttractions.add(new TouristAttraction("Oranmiyan Staff, Ile-Ife", "Located in Ile-Ife, Osun State of Nigeria, the Oranmiyan staff is a commemorative stele or ancient upright stone slab bearing markings telling its own story. The Oranmiyan staff is fabled to have been erected by the descendants of Oranmiyan Omoluabi, an ancient Yoruba king that ruled Ile-Ife and an heir to Oduduwa, the founder of the Yoruba people.\n" +
                "\n" + "The Oranmiyan staff is said to have been put up where Oranmiyan himself died. The staff was however tested with radiocarbon analysis and revealed to have been erected for several centuries before the Oduduwa dynasty started in Ile-Ife. Oranmiyan was the first Alaafin of Oyo after he founded the town in 1170, and Eweka I – one of his sons later became the first Oba of the ancient Benin Empire.",R.drawable.oranmiyan_staff));
        touristAttractions.add(new TouristAttraction(" Idanre Hills, Akure", "Also called the Oke Idanre, the Idanre Hill in Idanre town of Ondo State, Nigeria is situated 3,000 feet above sea level; and its physical features include the Owa's Palace, Shrines, Old Court, Belfry, Agboogun footprint, thunder water (Omi Aopara), and burial mounds. The Idanre Hill became a UNESCO World Heritage site October 8, 2007.\n" +
                "\n" + "At the entrance of the city of Idanre and the hill is an ancient tree called the Iraye Tree, and beyond this are rich fauna and flora which make the hill a fascinating tourist center. The hill is a home to thousands of bats with a bat festival celebrated every year among the people. It is also home to several monkeys and the Hyrax, a tailless animal often sighted around the Orosun hills. Many filmmakers use the hills as location for shooting cultural films.",R.drawable.idanre_hills));
        touristAttractions.add(new TouristAttraction("Erin-Ijesha Waterfalls","Also known as Olumirin waterfalls, the Erin-Ijesha waterfalls is located in Ipetu-Ijesha in Oriade Local Government Area of Osun State, Nigeria. It is about 40 kilometres from Ife and about 37 kilometres from Akure, Ondo State. The waterfall is a tourist attraction for several people miles around, and it is a sight to behold for tourism purposes. There is also a thriving mat-weaving market in this area.", R.drawable.erin_ijesha_water_fall));
        touristAttractions.add(new TouristAttraction("Old Oyo National Park","The Old Oyo National Park is located between northern Oyo State and southern Kwara State of Nigeria. It covers an area of 2,512 km2, mostly of lowland plains at a height of 330m and 508m above sea level. It is a dense forest park reserve that can be accessed from Saki, Iseyin, Igboho, Sepeteri, Tede, and Igbeti; and is a forestry rich in plant and animal life.\n" +
                "\n" + "Hundreds of rare animals like the Kobs, Baboon, Red Monkey, Roan antelope, Bush buck, Red or green ioribe, daiker and waterbucks have been sighted at the park. There is a rich wildlife in the park, and it boasts of ancient rock outcrops and cave shelters in the extreme north of the park. There are also scattered hills, ridges, and rocky outcrops that can be used for mountaineering purposes.\n",R.drawable.old_oyo_national_park));
        touristAttractions.add(new TouristAttraction("Ikogosi Warm Spring","The Ikogosi Warm Springs is located in Ikogosi, Ekiti State of Nigeria. It is a confluence of hot and cold springs meeting together at a point – with each maintaining its own thermal properties. Tests reveal that the temperature at the warm spring is about 70 degrees Celsius at the source, and about 37 degrees Celsius at the point where the warm and cold springs merge together.\n" +
                "\n" + "It is a great tourist attraction situated on over 116 hectares of land in southwestern Nigeria, with recent renovations made at the warm springs by the Ekiti State government some years ago. The renovations and remodeling were done by former Gov. Kayode Fayemi, and included swimming pools, restaurants, hotels, guest house, a 1,000 capacity amphitheatre, and a conference hall that can seat over 600 people at a time.", R.drawable.ikogosi_warm_spring));
        touristAttractions.add(new TouristAttraction(" Lagos Bar Beach","The Bar Beach at Victoria Island, Lagos is the most popular beach in Nigeria; it is on the shoreline of Lagos with the Atlantic Ocean. The name “bar beach” is derived from the sand bars along the coastline of the beach, and not necessarily from the hundreds of bars along the beach. The beach does not have any plants or coconut trees but is largely sandy. You can have a stroll around the beach, or just stretch out on the white sands to sunbathe.\n" +
                "\n" + "The bar beach is also a place where you can hold picnics or play outdoor games like football or volleyball on the beach. It is a place where you can visit with your family and friends any time of the day or week, and though it is more crowded during the holiday or festive periods, the place buzzes with activities anytime you visit.", R.drawable.bar_beach));

        touristAttractions.add(new TouristAttraction("The Ancient Town of Badagry","Badagry was the spot where Christianity was first preached under the tree in 1842. First storey building  was built in 1845 by Rev. Henry Townsend, Relics of the slave trade comprising shackles, locks are in the custody of the Mobee family at Marina Badagry.\n" +
               "\n" + "Verekete shrine in Badagry where Richard Lander was tried before a priest for alleged espionage charges. He survived after drinking concoction as proof of his innocence. First of pair of Sato Drums In Badagry are the first pair of the drums brought to Akara Kunmo in 1543 by Tosavi and Whensu his son, from Dahomey (now Republic of Benin).", R.drawable.badagry_slave_jetty));
        touristAttractions.add(new TouristAttraction("New Afrika Shrine, Lagos","When you feel like getting lost in music from the legendary Fela’s family,the New Afrika Shrine is where you should visit. This is the replacement of the original Shrine that was burnt down. A cover charge of N500 is collected. It is located in Adeleye Street, Ikeja Lagos.",R.drawable.new_africa_shrine));


        // Create an ArrayAdapter, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item xml layout resource
        SouthWestAdapter southWestAdapter = new SouthWestAdapter(getActivity(), touristAttractions);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a list view with the view ID root view, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.root_view);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the  ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name colorAdapter.
        listView.setAdapter(southWestAdapter);


        return rootView;
    }

}
