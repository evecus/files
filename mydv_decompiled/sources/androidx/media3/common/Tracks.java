package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Util;
import defpackage.ay1;
import defpackage.dq2;
import defpackage.dy1;
import defpackage.mm0;
import defpackage.sp0;
import defpackage.x24;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Tracks {
    public static final Tracks EMPTY;
    private static final String FIELD_TRACK_GROUPS;
    private final dy1 groups;

    static {
        ay1 ay1Var = dy1.J;
        EMPTY = new Tracks(x24.M);
        FIELD_TRACK_GROUPS = Util.intToStringMaxRadix(0);
    }

    public Tracks(List<Group> list) {
        this.groups = dy1.p(list);
    }

    public static Tracks fromBundle(Bundle bundle) {
        List fromBundleList;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        if (parcelableArrayList == null) {
            ay1 ay1Var = dy1.J;
            fromBundleList = x24.M;
        } else {
            fromBundleList = BundleCollectionUtil.fromBundleList(new mm0((byte) 25), parcelableArrayList);
        }
        return new Tracks(fromBundleList);
    }

    public boolean containsType(int i) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            if (((Group) this.groups.get(i2)).getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tracks.class != obj.getClass()) {
            return false;
        }
        return this.groups.equals(((Tracks) obj).groups);
    }

    public dy1 getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    public boolean isEmpty() {
        return this.groups.isEmpty();
    }

    public boolean isTypeSelected(int i) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            Group group = (Group) this.groups.get(i2);
            if (group.isSelected() && group.getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupported(int i, boolean z) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            if (((Group) this.groups.get(i2)).getType() == i && ((Group) this.groups.get(i2)).isSupported(z)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i, boolean z) {
        return !containsType(i) || isTypeSupported(i, z);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, BundleCollectionUtil.toBundleArrayList(this.groups, new mm0((byte) 24)));
        return bundle;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Group {
        private final boolean adaptiveSupported;
        public final int length;
        private final TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;
        private static final String FIELD_TRACK_GROUP = Util.intToStringMaxRadix(0);
        private static final String FIELD_TRACK_SUPPORT = Util.intToStringMaxRadix(1);
        private static final String FIELD_TRACK_SELECTED = Util.intToStringMaxRadix(3);
        private static final String FIELD_ADAPTIVE_SUPPORTED = Util.intToStringMaxRadix(4);

        public Group(TrackGroup trackGroup, boolean z, int[] iArr, boolean[] zArr) {
            int i = trackGroup.length;
            this.length = i;
            boolean z2 = false;
            sp0.o(i == iArr.length && i == zArr.length);
            this.mediaTrackGroup = trackGroup;
            if (z && i > 1) {
                z2 = true;
            }
            this.adaptiveSupported = z2;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }

        public static Group fromBundle(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(FIELD_TRACK_GROUP);
            bundle2.getClass();
            TrackGroup fromBundle = TrackGroup.fromBundle(bundle2);
            return new Group(fromBundle, bundle.getBoolean(FIELD_ADAPTIVE_SUPPORTED, false), (int[]) dq2.J(bundle.getIntArray(FIELD_TRACK_SUPPORT), new int[fromBundle.length]), (boolean[]) dq2.J(bundle.getBooleanArray(FIELD_TRACK_SELECTED), new boolean[fromBundle.length]));
        }

        public Group copyWithId(String str) {
            return new Group(this.mediaTrackGroup.copyWithId(str), this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public Group copyWithMediaTrackGroup(TrackGroup trackGroup) {
            return new Group(trackGroup, this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Group.class == obj.getClass()) {
                Group group = (Group) obj;
                if (this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && Arrays.equals(this.trackSupport, group.trackSupport) && Arrays.equals(this.trackSelected, group.trackSelected)) {
                    return true;
                }
            }
            return false;
        }

        public TrackGroup getMediaTrackGroup() {
            return this.mediaTrackGroup;
        }

        public Format getTrackFormat(int i) {
            return this.mediaTrackGroup.getFormat(i);
        }

        public int getTrackSupport(int i) {
            return this.trackSupport[i];
        }

        public int getType() {
            return this.mediaTrackGroup.type;
        }

        public int hashCode() {
            return Arrays.hashCode(this.trackSelected) + ((Arrays.hashCode(this.trackSupport) + (((this.mediaTrackGroup.hashCode() * 31) + (this.adaptiveSupported ? 1 : 0)) * 31)) * 31);
        }

        public boolean isAdaptiveSupported() {
            return this.adaptiveSupported;
        }

        public boolean isSelected() {
            for (boolean z : this.trackSelected) {
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public boolean isSupported(boolean z) {
            for (int i = 0; i < this.trackSupport.length; i++) {
                if (isTrackSupported(i, z)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSelected(int i) {
            return this.trackSelected[i];
        }

        public boolean isTrackSupported(int i, boolean z) {
            int i2 = this.trackSupport[i];
            if (i2 != 4) {
                return z && i2 == 3;
            }
            return true;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
            bundle.putIntArray(FIELD_TRACK_SUPPORT, this.trackSupport);
            bundle.putBooleanArray(FIELD_TRACK_SELECTED, this.trackSelected);
            bundle.putBoolean(FIELD_ADAPTIVE_SUPPORTED, this.adaptiveSupported);
            return bundle;
        }

        public boolean isTrackSupported(int i) {
            return isTrackSupported(i, false);
        }

        public boolean isSupported() {
            return isSupported(false);
        }
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i) {
        return isTypeSupportedOrEmpty(i, false);
    }

    public boolean isTypeSupported(int i) {
        return isTypeSupported(i, false);
    }
}
