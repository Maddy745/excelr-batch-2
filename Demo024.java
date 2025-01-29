  class Friend {
    private String name;
    private String phoneNumber;
    private String address;

 
    public Friend(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

  
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return "Friend [Name=" + name + ", Phone Number=" + phoneNumber + ", Address=" + address + "]";
    }
}

public class Demo024 {
    private Friend[] friends;

    public Demo024(int size) {
        friends = new Friend[size];
         }

    public void addFriend(int index, Friend friend) {
        if (index >= 0 && index < friends.length) {
            friends[index] = friend;
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public Friend getFriend(int index) {
        if (index >= 0 && index < friends.length) {
            return friends[index];
        } else {
            System.out.println("Index out of bounds.");
            return null;
        }
    }

    public void printFriends() {
        for (Friend friend : friends) {
            if (friend != null) {
                System.out.println(friend);
            }
        }
    }

    public static void main(String[] args) {
        Demo024 friendsArray = new Demo024(3);

      
        friendsArray.addFriend(0, new Friend("Alice", "123-456-7890", "123 Elm Street"));
        friendsArray.addFriend(1, new Friend("Bob", "987-654-3210", "456 Oak Avenue"));
        friendsArray.addFriend(2, new Friend("Charlie", "555-555-5555", "789 Pine Road"));

        
        friendsArray.printFriends();
    }
}