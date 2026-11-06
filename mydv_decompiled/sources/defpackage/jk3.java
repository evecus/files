package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jk3 extends lw4 implements Parcelable, bt4 {
    public static final Parcelable.Creator<jk3> CREATOR = new ik3();
    public final q8 J;
    public ct4 K;

    public jk3(Object obj, q8 q8Var) {
        this.J = q8Var;
        ns4 h = ws4.h();
        ct4 ct4Var = new ct4(h.g(), obj);
        if (!(h instanceof zq1)) {
            ct4Var.b = new ct4(1L, obj);
        }
        this.K = ct4Var;
    }

    @Override // defpackage.bt4
    public final q8 b() {
        return this.J;
    }

    @Override // defpackage.kw4
    public final mw4 c() {
        return this.K;
    }

    @Override // defpackage.lw4, defpackage.kw4
    public final mw4 d(mw4 mw4Var, mw4 mw4Var2, mw4 mw4Var3) {
        if (this.J.g(((ct4) mw4Var2).c, ((ct4) mw4Var3).c)) {
            return mw4Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.kw4
    public final void e(mw4 mw4Var) {
        this.K = (ct4) mw4Var;
    }

    @Override // defpackage.cw4
    public final Object getValue() {
        return ((ct4) ws4.t(this.K, this)).c;
    }

    @Override // defpackage.t43
    public final void setValue(Object obj) {
        ns4 h;
        ct4 ct4Var = (ct4) ws4.f(this.K);
        if (this.J.g(ct4Var.c, obj)) {
            return;
        }
        ct4 ct4Var2 = this.K;
        synchronized (ws4.c) {
            h = ws4.h();
            ((ct4) ws4.o(ct4Var2, this, h, ct4Var)).c = obj;
        }
        ws4.m(h, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((ct4) ws4.f(this.K)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        q8 q8Var = q8.v0;
        q8 q8Var2 = this.J;
        if (q8Var2.equals(q8Var)) {
            i2 = 0;
        } else if (q8Var2.equals(q8.B0)) {
            i2 = 1;
        } else {
            if (!q8Var2.equals(q8.y0)) {
                zy.i("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
