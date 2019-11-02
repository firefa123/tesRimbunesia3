package com.firefa.tesrimbunesia3;

import android.os.Parcel;
import android.os.Parcelable;


public class PlayerItem implements Parcelable{
    private String name, club, category;

    public PlayerItem(String name, String club, String category ) {
        this.name = name;
        this.club =club;
        this.category = category;
    }



    public String getName() {
        return name;
    }

    public String getClub() {
        return club;
    }

    public String getCategory() {
        return category;
    }

    public void setNo(String club) {
        this.club = club;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category= category;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.club);
        parcel.writeString(this.name);
        parcel.writeString(this.category);

    }

    public PlayerItem(){
    }

    protected PlayerItem(Parcel in ){
        this.club = in.readString();
        this.name = in.readString();
        this.category = in.readString();
    }

    public static final Parcelable.Creator<PlayerItem> CREATOR = new Parcelable.Creator<PlayerItem>(){

        @Override
        public PlayerItem createFromParcel(Parcel source) {
            return new PlayerItem(source);
        }

        @Override
        public PlayerItem[] newArray(int size) {
            return new PlayerItem[size];
        }
    };
}