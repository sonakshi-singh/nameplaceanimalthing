package com.example.sonia.nameplaceanimalthing;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class lev2 extends AppCompatActivity {
    private int sum = 0;
    int count;

    TextView timer1;
    EditText t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
    Button Alpha, done1;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1 = (EditText) findViewById(R.id.Text1);
        t2 = (EditText) findViewById(R.id.Text2);
        t3 = (EditText) findViewById(R.id.Text3);
        t4 = (EditText) findViewById(R.id.Text4);
        t5 = (EditText) findViewById(R.id.Text5);
        t6 = (EditText) findViewById(R.id.Text6);
        t7 = (EditText) findViewById(R.id.Text7);
        t8 = (EditText) findViewById(R.id.Text8);
        t9 = (EditText) findViewById(R.id.Text9);
        t10 = (EditText) findViewById(R.id.Text10);
        t11 = (EditText) findViewById(R.id.Text11);
        t12 = (EditText) findViewById(R.id.Text12);

        Alpha = (Button) findViewById(R.id.alpha1);

        done1 = (Button) findViewById(R.id.check1);


        final TextView timer1 = (TextView) findViewById(R.id.timer);

        CountDownTimer countDownTimer = new CountDownTimer(60000, 1000) {
            public void onTick(long millisUntilFinished) {
                timer1.setText("seconds remaining "+millisUntilFinished / 1000);
            }
            public void onFinish() {
                timer1.setText("WOOPS!");
                finish();
                calculate();
            }
        }.start();











        Alpha.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View view)
        {

            String alphab="abcdefghijklmnopqrstuvwxyz";
            alphab=alphab.toUpperCase();
            System.out.println(alphab);
            int index =0,i;
            int len=alphab.length();
            index=(int)(Math.random()*len);
            // System.out.println(" Alpha "+alphab.charAt(index));


            // String tmsg = "Alpha: " +alphab.charAt(index);

            Toast.makeText(getApplicationContext(), "Alpha:"+alphab.charAt(index), Toast.LENGTH_LONG).show();



        }


        });



        done1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calculate();

            }





        });








    }


    private void calculate(){
        ArrayList<String> names= new ArrayList<String>();
        ArrayList<String> places= new ArrayList<String>();
        String place[] = {"Australia","Belgium","Canada","Denmark","England","France","Germany","Hungary","India","Japan","Karnataka","London","Mumbai","Nagpur","Oman","Portugal","Qatar","Rajasthan","Spain","Tamil Nadu","United states of america","Venuezla","Warsaw","Xiamen","Yemen","Zimbabwe"};
        names.addAll(Arrays.asList("Aardvark","Abyssinian", "Adelie Penguin","Affenpinscher","Afghan Hound","African Bush Elephant","African Civet","African Clawed Frog","African Forest Elephant","African Palm Civet","African Penguin","African Tree Toad","African Wild Dog","Ainu Dog","Airedale Terrier","Akbash","Akita","Alaskan Malamute","Albatross","Aldabra Giant Tortoise","Alligator","Alpine Dachsbracke","American Bulldog","American Cocker Spaniel","American Coonhound","American Eskimo Dog","American Foxhound","American Pit Bull Terrier","American Staffordshire Terrier","American Water Spaniel","Anatolian Shepherd Dog","Angelfish","Ant","Anteater","Antelope","Appenzeller Dog","Arctic Fox","Arctic Hare","Armadillo","Asian Elephant","Asian Giant Hornet","Asian Palm Civet","Asiatic Black Bear","Australian Cattle Dog","Australian Kelpie Dog","Australian Mist","Australian Shepherd","Australian Terrier","Avocet","Axolotl","Aye Aye","Baboon","Bactrian Camel","Badger","Balinese","Banded Palm Civet","Bandicoot","Barb","Barn Owl","Barracuda","Basenji Dog","Basking Shark","Basset Hound","Bat","Bavarian Mountain Hound","Beagle","Bear","Bearded Collie","Bearded Dragon","Beaver","Bedlington Terrier","Beetle","Bengal Tiger","Bernese Mountain Dog", "Bichon Frise","Binturong","Bird","Birds Of Paradise","Birman","Bison","Black Bear","Black Rhinoceros","Black Russian Terrier","Black Widow Spider","Bloodhound","Blue Lacy Dog","Blue Whale","Bluetick Coonhound","Bobcat","Bolognese Dog","Bombay","Bongo","Bonobo","Booby","Border Collie","Border Terrier","Bornean Orang-utan","Borneo Elephant","Boston Terrier","Bottle Nosed Dolphin","Boxer Dog","Boykin Spaniel","Brazilian Terrier","Brown Bear","Budgerigar","Buffalo","Bull Mastiff","Bull Shark","Bull Terrier","Bulldog","Bullfrog","Bumble Bee","Burmese","Burrowing Frog","Butterfly","Butterfly Fish","Caiman","Caiman Lizard","Cairn Terrier", "Camel","Canaan Dog","Capybara","Caracal","Carolina Dog","Cassowary","Cat","Catfish","Cavalier King","Charles Spaniel","Centipede","Cesky Fousek","Chameleon","Chamois","Cheetah","Chesapeake Bay Retriever","Chicken","Chihuahua","Chimpanzee","Chinchilla","Chinese Crested Dog","Chinook","Chinstrap Penguin","Chipmunk","Chow Chow","Cichlid","Clouded Leopard","Clown Fish","Clumber Spaniel","Coati","Cockroach","Collared Peccary","Collie","Common Buzzard","Common Frog","Common Loon","Common Toad","Coral","Cottontop Tamarin","Cougar","Cow","Coyote","Crab","Crab-Eating Macaque","Crane","Crested Penguin","Crocodile","Cross River Gorilla","Curly Coated Retriever","Cuscus","Cuttlefish","Dachshund","Dalmatian","Darwin's Frog","Deer","Desert Tortoise","Deutsche Bracke","Dhole","Dingo","Discus","Doberman Pinscher","Dodo","Dog","Dogo Argentino","Dogue De Bordeaux","Dolphin","Donkey","Dormouse","Dragonfly","Drever","Duck","Dugong","Dunker","Dusky Dolphin","Dwarf Crocodile","Eagle","Earwig","Eastern Gorilla","Eastern Lowland Gorilla","Echidna","Edible Frog","Egyptian Mau","Electric Eel","Elephant","Elephant Seal","Elephant Shrew","Emperor Penguin","Emperor Tamarin","Emu","English Cocker Spaniel","English Shepherd","English Springer Spaniel","Epagneul Pont Audemer","Eskimo Dog","Estrela Mountain Dog","falcon","Fennec Fox","Ferret”,”Field Spaniel","Fin Whale","Finnish Spitz","Fire-Bellied Toad","Fish","Fishing Cat","Flamingo","Flat Coat Retriever","Flounder","Fly","Flying Squirrel","Fossa","Fox","Fox Terrier","French Bulldog","Frigatebird”,”Frilled Lizard","Frog","Fur Seal","Galapagos Penguin","Galapagos Tortoise","Gar","Gecko","Gentoo Penguin","Geoffroys Tamarin","Gerbil","German Pinscher","German Shepherd","Gharial","Giant African Land Snail","Giant Clam","Giant Panda Bear","Giant Schnauzer","Gibbon","Gila Monster","Giraffe","Glass Lizard","Glow Worm","Goat","Golden Lion Tamarin","Golden Oriole","Golden Retriever","Goose","Gopher","Gorilla","Grasshopper","Great Dane","Great White Shark","Greater Swiss Mountain Dog","Green Bee-Eater","Greenland Dog","Grey Mouse Lemur","Grey Reef Shark","Grey Seal","Greyhound","Grizzly Bear","Grouse","Guinea Fowl","Guinea Pig","Guppy","Hammerhead Shark","Hamster","Hare","Harrier","Havanese","Hedgehog","Hercules Beetle","Hermit Crab","Heron","Highland Cattle","Himalayan","Hippopotamus","Honey Bee","Horn Shark","Horned Frog","Horse","Horseshoe Crab","Howler Monkey","Human","Humboldt Penguin","Hummingbird","Humpback Whale","Hyena","Ibis","Ibizan Hound","Iguana","Impala","Indian Elephant","Indian Palm Squirrel","Indian Rhinoceros","Indian Star Tortoise","Indochinese Tiger","Indri","Insect","Irish Setter","Irish WolfHound","Jack Russel","Jackal","Jaguar","Japanese Chin","Japanese Macaque","Javan Rhinoceros","Javanese","Jellyfish","Kakapo","Kangaroo","Keel Billed Toucan","Killer Whale","King Crab","King Penguin","Kingfisher","Kiwi","Koala","Komodo Dragon","Kudu","Labradoodle","Labrador Retriever","Ladybird","Leaf-Tailed Gecko","Lemming","Lemur","Leopard","Leopard Cat","Leopard Seal","Leopard Tortoise","Liger","Lion","Lionfish","Little Penguin","Lizard","Llama","  Lobster","Long-Eared Owl","Lynx","Macaroni Penguin","Macaw","Magellanic Penguin","Magpie”,”Maine Coon","Malayan Civet","Malayan Tiger","Maltese","Manatee","Mandrill","Manta Ray","Marine Toad","Markhor","Marsh Frog","Masked Palm Civet","Mastiff","Mayfly","Meerkat","Millipede","Minke Whale","Mole","Molly","Mongoose","Mongrel","Monitor Lizard","Monkey","Monte Iberia Eleuth","Moorhen","Moose","Moray Eel","Moth","Mountain Gorilla","Mountain Lion","Mouse","Mule","Neanderthal","Neapolitan Mastiff","Newfoundland","Newt","Nightingale","Norfolk Terrier","Norwegian Forest","Numbat","Nurse Shark","Ocelot","Octopus","Okapi","Old English Sheepdog","Olm","Opossum","Orang-utan","Ostrich","Otter","Oyster","Pademelon","Panther","Parrot","Patas Monkey","Peacock","Pekingese","Pelican","Penguin","Persian","Pheasant","Pied Tamarin","Pig","Pika","Pike","Pink Fairy Armadillo","Piranha","Platypus","Pointer","Poison Dart Frog","Polar Bear","Pond Skater","Poodle","Pool Frog","Porcupine","Possum","Prawn","Proboscis Monkey","Puffer Fish","Puffin","Pug","Puma","Purple Emperor","Puss Moth","Pygmy Hippopotamus","Pygmy Marmoset","Quail","Quetzal","Quokka","Quoll","Rabbit","Raccoon","Raccoon Dog","Radiated Tortoise","Ragdoll","Rat","Rattlesnake","Red Knee Tarantula","Red Panda","Red Wolf","Red-handed Tamarin","Reindeer","Rhinoceros","River Dolphin","River Turtle","Robin","Rock Hyrax","Rockhopper Penguin","Roseate Spoonbill","Rottweiler","Royal Penguin","Russian Blue","Sabre-Toothed Tiger","Saint Bernard","Salamander","Sand Lizard","Saola","Scorpion","Scorpion Fish","Sea Dragon","Sea Lion","Sea Otter","Sea Slug","Sea Squirt","Sea Turtle","Sea Urchin","Seahorse","Seal","Serval","Sheep","Shih Tzu","Shrimp","Siamese","Siamese Fighting Fish","Siberian","Siberian Husky","Siberian Tiger","Silver Dollar","Skunk","Sloth","Slow Worm","Snail","Snake","Snapping Turtle","Snowshoe","Snowy Owl","Somali","South China Tiger","Spadefoot Toad","Sparrow","Spectacled Bear","Sperm Whale","Spider Monkey","Spiny Dogfish","Sponge","Squid","Squirrel","Squirrel Monkey","Sri Lankan Elephant","Staffordshire Bull Terrier","Stag Beetle","Starfish","Stellers Sea Cow","Stick Insect","Stingray","Stoat","Striped Rocket Frog","Sumatran Elephant","Sumatran Orang-utan","Sumatran Rhinoceros","Sumatran Tiger","Sun Bear","Swan","Tang","Tapir","Tarsier","Tasmanian Devil","Tawny Owl","Termite","Tetra","Thorny Devil","Tibetan Mastiff","Tiffany","Tiger","Tiger Salamander","Tiger Shark","Tortoise","Toucan","Tree Frog","Tropicbird", "Tuatara","Turkey","Turkish Angora","Uakari","Uguisu","Umbrellabird","Vampire Bat","Vervet Monkey","Vulture","Wallaby","Walrus","Warthog","Wasp","Water Buffalo","Waterdragon","WaterVole","Weasel","WelshCorgi","WestHighlandTerrier","WesternGorilla","WesternLowlandGorilla","WhaleShark","Whippet","WhiteFacedCapuchin","WhiteRhinoceros","WhiteTiger","WildBoar","Wildebeest","Wolf","Wolverine","Wombat","Woodlouse","Woodpecker", "WoollyMammoth","WoollyMonkey","Wrasse","XRayTetra","Xerus","YakYellowEyed","Penguin","Yorkshire","Terrier","Zebra","Zebr","Shark","Zebu","Zonkey","zorse" ));
        places.addAll(Arrays.asList("Afghanistan","Albania","Algeria","Andorra","Angola","Antigua and Barbuda","Argentina","Armenia","Australia","Austria","Azerbaijan","Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bhutan","Bolivia","Bosnia and Herzegovina","Botswana","Brazil","Brunei","Bulgaria","Burkina Faso","Burundi","Cabo Verde","Cambodia","Cameroon","Canada","Central African Republic (CAR)","Chad","Chile","China", "Colombia", "Comoros", "Democratic Republic of the Congo", "Republic of the Congo", "Costa Rica", "Cote d'Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras","Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia","Montenegro", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States of America", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City","Wales","Xiamen","Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" ));
        int size = place.length;
        String place22 = "Man";
        String[] animal_names= new String[names.size()];
        animal_names=names.toArray(animal_names);

        String[] place_names= new String[places.size()];
        place_names=places.toArray(place_names);

        final String word2=t2.getText().toString().trim();
        String word1=t1.getText().toString();

        final String word3=t3.getText().toString();
        String word4=t4.getText().toString();
        String word5=t5.getText().toString();
        final String word6=t6.getText().toString();
        final String word7=t7.getText().toString();
        String word8=t8.getText().toString();
        String word9=t9.getText().toString();
        final String word10=t10.getText().toString();
        final String word11=t11.getText().toString();
        String word12=t12.getText().toString();

        if(word1.matches(""))
        {
            sum=sum+0;
        }
        else
        {
            sum=sum+10;
        }
        if(word4.matches(""))
        {
            sum=sum+0;
        }
        else
        {
            sum=sum+10;
        }
        if(word5.matches(""))
        {
            sum=sum+0;
        }
        else
        {
            sum=sum+10;
        }
        if(word8.matches(""))
        {
            sum=sum+0;
        }
        else
        {
            sum=sum+10;
        }
        if(word9.matches(""))
        {
            sum=sum+0;
        }
        else
        {
            sum=sum+10;
        }
        if(word12.matches(""))
        {
            sum=sum+0;
        }
        else
        {
            sum=sum+10;
        }
        for(String name: place_names)
        {

            if(word2.equals(name))
            {
                sum=sum+10;
            }
            if(word6.equals(name))
            {
                sum=sum+10;
            }
            if(word10.equals(name))
            {
                sum=sum+10;
            }
        }

        for(String name: animal_names)
        {
            if(word3.equals(name))
            {
                sum=sum+10;
            }
            if(word7.equals(name))
            {
                sum=sum+10;
            }
            if(word11.equals(name))
            {
                sum=sum+10;
            }

        }


        Toast.makeText(getApplicationContext(), "POINTS SCORED:"+sum, Toast.LENGTH_LONG).show();
        finish();
    }

}

