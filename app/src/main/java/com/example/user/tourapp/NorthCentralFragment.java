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
public class NorthCentralFragment extends Fragment {


    public NorthCentralFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_north_central, container, false);

        // Create a list of south west tourist information
        final ArrayList<TouristAttraction> touristAttractions = new ArrayList<TouristAttraction>();
        touristAttractions.add(new TouristAttraction("The Hills of Benue", "Located in the middle belt region of Nigeria, Benue State shares boundaries with Taraba State on the East; Plateau State on the North and Edo State on the West; and Anambra, Enugu, Cross River States on the South. The entire landmass presents hills of various shades and touristic appeals.\n" +
                "\n" + "lkyogen Hills exude mild weather condition which ensures steady green vegetation and a round- the-year grazing of animals in the areas which is also known as Ikyogen Cattle Ranch, Ushogbo Hills in Ushogbo town also offers clement weather condition that makes it most fulfilling spot for tourists and adventures.\n" +
                "\n" + "Bassa Hills, like the Ushogbo Hills, are worth visiting especially for their satisfying scenery; and Swern Hills are valued for their historical linkages. The hills are believed to be the place for origin of the Tiv people.", R.drawable.benue_hill));
        touristAttractions.add(new TouristAttraction("Zuma Rock", "Zuma Rock, sometimes referred to as the “the Gateway to Abuja from Suleja”, is located in Niger State in northern Nigeria. It is among Nigeria’s iconic natural wonders and lies on the border of Niger State and Federal Capital Territory (FCT). Zuma rock is unique amongst the other rocks in Nigeria because of its human face feature. Zuma rock human face is an interesting sight to behold as it looks straight ahead in the direction of the setting sun. Since time immemorial, the face has remained unchanged, a face that threatens to swallow any passersby. The majestic rock is depicted on the hundred naira note of the Nigerian currency.\n" + "\n" + "Facing the Abuja-Kaduna expressway, the human faced rock conspicuously appears to swallow the road, rising majestically to a height of about 700m. A vantage spot called the Zuma Rock Nigerian Village was constructed behind the rock to house tourists. The rock is believed to be the watchman of F.C.T because of its face.", R.drawable.zuma_rock));
        touristAttractions.add(new TouristAttraction("The Iron of Liberty Lokoja","Lokoja, because of its location near the banks of River Niger, was an important centre for slave trade during the era of slavery in Nigeria. \n" +
                "Also because if its strategic location, Lokoja aroused a great deal of interest in the European explorers and missionaries in the early 19th century, and it soon became a commercial post for European merchants and missionaries.\n" +
                "Hence, when the British Government started to wage war against slave trade, Lokoja became a collection centre for slaves seized from slave merchants to be consequently set free.", R.drawable.iron_of_liberty));
        touristAttractions.add(new TouristAttraction("Confluence of Rivers Niger and Benue","River Niger remained a marvel to the Europeans until John and Richard Landers passed through the Confluence on October 25th 1830, completing the journey that Mungo Park had started. Rivers Niger and Benue are two largest rivers in West Africa.\n" +
                "\n" + "The two rivers meet at Lokoja forming a Y-shaped structure and draining Southwards into the Ocean. While River Niger is brownish in Colour, River Benue is light green in colour.\n" +
                "Fishing is carried on extensively on the Rivers. The Inland Water Ways Divisions of the Federal Ministry of Transport also runs ferry and boat services on the River.",R.drawable.niger_benue_confluence));
        touristAttractions.add(new TouristAttraction("Gurara Water Falls, Niger","Gurara waterfalls was discovered by a Gwari hunter called Buba in 1745. It is one of Niger’s major tourist attractions. It was named after two deities Gura and Rara which were worshipped by the Gwari people. The waterfall is very beautiful and it stands at a height of 30 meters and a gushing width of 200 meters. When you visit Niger or Abuja, be sure to stop by at Gurara waterfalls.",R.drawable.gurara_water_fall));
        touristAttractions.add(new TouristAttraction("Abuja Zoological Park","Treasure Island (Former Abuja Zoological Park) is a wildlife park that hosts a variety of animals and has playing areas for kids. The National Children's Park and Zoo is located in the Asokoro District, just behind the Presidential Villa and close to the towering Aso Rock.\n" +"\n"+ "Abuja Zoological Garden has a ‘Toddlers Lane’ which is a playing area for kids. Lake Café within the premises offers freshly made snacks and drinks. There is plenty of animals to admire, including camels, elephants, crocodiles and ostriches. It is opened daily from 9 am to 6 pm admission to this park requires some fee.",R.drawable.abuja_zoological_park));


        // Create an ArrayAdapter, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item xml layout resource
        NorthCentralAdapter northCentralAdapter = new NorthCentralAdapter(getActivity(), touristAttractions);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a list view with the view ID root view, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.root_view);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the  ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name colorAdapter.
        listView.setAdapter(northCentralAdapter);

        return rootView;
    }

}


