import java.util.*;

class CopyHashMap {

    Map<Integer, String> temporaryHashMap1;
    Map<Integer, String> temporaryHashMap2;

    public void copyHashMap(Map<Integer, String> temporaryHashMap1, Map<Integer, String> temporaryHashMap2) {

        for (Map.Entry<Integer, String> entry : temporaryHashMap1.entrySet()) {

            temporaryHashMap2.put(entry.getKey(), entry.getValue());


        }
    }
}

public class Testowy4_3_Przypomnienie_HashMap {
    public static void main(String[] args) throws java.lang.Exception {

        Map<Integer, String> myFavoriteColours = new HashMap<>();
        Map<Integer, String> myFriendsFavoriteColours = new HashMap<>();
        myFavoriteColours.put(1, "Red");
        myFavoriteColours.put(2, "Green");
        myFavoriteColours.put(3, "Black");
        System.out.println("Values in first map: " + myFavoriteColours);
        myFriendsFavoriteColours.put(4, "White");
        myFriendsFavoriteColours.put(5, "Blue");
        myFriendsFavoriteColours.put(6, "Orange");
        System.out.println("Values in second map: " + myFriendsFavoriteColours);
        Map<Integer, String> ourFavoriteColours = new HashMap<>();


        CopyHashMap copyHMap = new CopyHashMap();

        copyHMap.copyHashMap(myFavoriteColours, ourFavoriteColours);
        copyHMap.copyHashMap(myFriendsFavoriteColours, ourFavoriteColours);

        System.out.println("Values after merge: " + ourFavoriteColours);


    }
}

