package com.collectionPractise.Friendbook;

import java.util.ArrayList;

public class FriendMain {
    public static void main(String[] args) {
        ArrayList<Friend> FriendDetails = new ArrayList<>();

        FriendDetails.add(new Friend("Sonal",
                724053324,
                "sonal@gmail.com"));
        FriendDetails.add(new Friend("Somesh",
                646464645,
                "somesh@gmail.com"));

        System.out.println(FriendDetails.indexOf("Sonal"));
        System.out.println("Friend details: " + FriendDetails);
    }
}
