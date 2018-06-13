package com.ptp.phamtanphat.intent0405;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Nhanvien implements Parcelable{
    private String ten;
    private String tuoi;

    public Nhanvien(String ten, String tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    protected Nhanvien(Parcel in) {
        ten = in.readString();
        tuoi = in.readString();
    }

    public static final Creator<Nhanvien> CREATOR = new Creator<Nhanvien>() {
        @Override
        public Nhanvien createFromParcel(Parcel in) {
            return new Nhanvien(in);
        }

        @Override
        public Nhanvien[] newArray(int size) {
            return new Nhanvien[size];
        }
    };

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ten);
        dest.writeString(tuoi);
    }
}
