package com.sam_chordas.android.stockhawk.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Fabian on 12/12/2016.
 */

public class DateValue implements Parcelable {

    public String date;
    public String closeValue;

    public DateValue(){
    }

    protected DateValue(Parcel in) {
        date = in.readString();
        closeValue = in.readString();
    }

    public static final Creator<DateValue> CREATOR = new Creator<DateValue>() {
        @Override
        public DateValue createFromParcel(Parcel in) {
            return new DateValue(in);
        }

        @Override
        public DateValue[] newArray(int size) {
            return new DateValue[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(date);
        dest.writeString(closeValue);
    }
}
