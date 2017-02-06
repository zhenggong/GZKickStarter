package glossom.gzkikstarterandroid;


import android.os.Parcel;

/**
 * Created by zheng.gong on 2017/02/06.
 */
final class AutoParcel_Environment extends Environment {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }


    static final class Builder extends Environment.Builder {
        Builder() {
        }
        @Override
        public Environment build() {
            return null;
        }
    }
}
