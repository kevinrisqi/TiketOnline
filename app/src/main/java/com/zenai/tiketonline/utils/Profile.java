package com.zenai.tiketonline.utils;

import android.os.Parcel;
import android.os.Parcelable;

public class Profile implements Parcelable {
    private String name;
    private String bio;
    private String city;
    private int age;

    public Profile(String name, String city, int age, String bio) {
        this.name = name;
        this.bio = bio;
        this.city = city;
        this.age = age;
    }

    protected Profile(Parcel in) {
        name = in.readString();
        bio = in.readString();
        city = in.readString();
        age = in.readInt();
    }

    public static final Creator<Profile> CREATOR = new Creator<Profile>() {
        @Override
        public Profile createFromParcel(Parcel in) {
            return new Profile(in);
        }

        @Override
        public Profile[] newArray(int size) {
            return new Profile[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(bio);
        parcel.writeString(city);
        parcel.writeInt(age);
    }
}
