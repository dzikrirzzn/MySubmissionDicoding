package com.example.mysubmissiondicoding;

import android.os.Parcel;
import android.os.Parcelable;

public class Unicorn implements Parcelable {
    private String name;
    private String detail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {this.detail = detail;}

    public int getPhoto() { return photo; }

    public void setPhoto(int photo) {this.photo = photo; }

    private int photo;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.detail);
        dest.writeInt(this.photo);
    }

    public Unicorn() {
    }

    protected Unicorn(Parcel in) {
        this.name = in.readString();
        this.detail = in.readString();
        this.photo = in.readInt();
    }

    public static final Parcelable.Creator<Unicorn> CREATOR = new Parcelable.Creator<Unicorn>() {
        @Override
        public Unicorn createFromParcel(Parcel source) {
            return new Unicorn(source);
        }

        @Override
        public Unicorn[] newArray(int size) {
            return new Unicorn[size];
        }
    };
}
