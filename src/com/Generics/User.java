package com.Generics;

public class User implements Comparable<User> {
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        return this.points - other.points ;
    }

    @Override
    public String toString() {
        return ("Point: " + this.points);
    }
}
