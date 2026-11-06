package androidx.media3.common;

import android.os.Build;
import android.util.SparseBooleanArray;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FlagSet {
    private final SparseBooleanArray flags;

    private FlagSet(SparseBooleanArray sparseBooleanArray) {
        this.flags = sparseBooleanArray;
    }

    public boolean contains(int i) {
        return this.flags.get(i);
    }

    public boolean containsAny(FlagSet flagSet) {
        for (int i = 0; i < flagSet.size(); i++) {
            if (contains(flagSet.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagSet)) {
            return false;
        }
        FlagSet flagSet = (FlagSet) obj;
        if (Build.VERSION.SDK_INT >= 24) {
            return this.flags.equals(flagSet.flags);
        }
        if (size() != flagSet.size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (get(i) != flagSet.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i) {
        sp0.u(i, size());
        return this.flags.keyAt(i);
    }

    public int hashCode() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.flags.hashCode();
        }
        int size = size();
        for (int i = 0; i < size(); i++) {
            size = (size * 31) + get(i);
        }
        return size;
    }

    public int size() {
        return this.flags.size();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private boolean buildCalled;
        private final SparseBooleanArray flags = new SparseBooleanArray();

        public Builder add(int i) {
            sp0.z(!this.buildCalled);
            this.flags.append(i, true);
            return this;
        }

        public Builder addAll(FlagSet flagSet) {
            for (int i = 0; i < flagSet.size(); i++) {
                add(flagSet.get(i));
            }
            return this;
        }

        public Builder addIf(int i, boolean z) {
            return z ? add(i) : this;
        }

        public FlagSet build() {
            sp0.z(!this.buildCalled);
            this.buildCalled = true;
            return new FlagSet(this.flags);
        }

        public Builder remove(int i) {
            sp0.z(!this.buildCalled);
            this.flags.delete(i);
            return this;
        }

        public Builder removeAll(int... iArr) {
            for (int i : iArr) {
                remove(i);
            }
            return this;
        }

        public Builder removeIf(int i, boolean z) {
            return z ? remove(i) : this;
        }

        public Builder addAll(int... iArr) {
            for (int i : iArr) {
                add(i);
            }
            return this;
        }
    }

    public boolean containsAny(int... iArr) {
        for (int i : iArr) {
            if (contains(i)) {
                return true;
            }
        }
        return false;
    }
}
