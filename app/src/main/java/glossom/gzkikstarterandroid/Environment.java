package glossom.gzkikstarterandroid;

import android.os.Parcelable;

import auto.parcel.AutoParcel;

/**
 * Created by zheng.gong on 2017/02/06.
 */
@AutoParcel
public abstract class Environment implements Parcelable {

    @AutoParcel.Builder
    public abstract static class Builder {

        public abstract Environment build();
    }

    public static Builder builder() {
        return new AutoParcel_Environmen.Builder();
    }
}
