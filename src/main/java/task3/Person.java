package task3;

import java.util.ArrayList;

public class Person extends Thing{
    private ArrayList<Person> friends;

    public Person(String name) {
        super(name, true);
        friends = new ArrayList<>();
    }

    public void addFriend (Person friend) {
        friends.add(friend);
    }

    public String getFriends () {
        String names = "";
        for (Person j : friends) names += (j.getName() + " ");
        return names;
    }

    public Person getFriendByName (String name) {
        Person friend = null;
        for (Person j : friends) if (j.getName().equals(name)) friend = j;
        return friend;
    }
}
