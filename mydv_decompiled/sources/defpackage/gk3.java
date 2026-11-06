package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gk3 extends lw4 implements Parcelable, s33, bt4 {
    public static final Parcelable.Creator<gk3> CREATOR = new ek3((byte) 1);
    public zs4 J;

    public gk3(int i) {
        ns4 h = ws4.h();
        zs4 zs4Var = new zs4(h.g(), i);
        if (!(h instanceof zq1)) {
            zs4Var.b = new zs4(1L, i);
        }
        this.J = zs4Var;
    }

    @Override // defpackage.bt4
    public final q8 b() {
        return q8.B0;
    }

    @Override // defpackage.kw4
    public final mw4 c() {
        return this.J;
    }

    @Override // defpackage.lw4, defpackage.kw4
    public final mw4 d(mw4 mw4Var, mw4 mw4Var2, mw4 mw4Var3) {
        if (((zs4) mw4Var2).c == ((zs4) mw4Var3).c) {
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
        this.J = (zs4) mw4Var;
    }

    @Override // defpackage.cw4
    public final /* bridge */ /* synthetic */ Object getValue() {
        return i82.e(this);
    }

    public final int h() {
        return ((zs4) ws4.t(this.J, this)).c;
    }

    public final void i(int i) {
        ns4 h;
        zs4 zs4Var = (zs4) ws4.f(this.J);
        if (zs4Var.c != i) {
            zs4 zs4Var2 = this.J;
            synchronized (ws4.c) {
                h = ws4.h();
                ((zs4) ws4.o(zs4Var2, this, h, zs4Var)).c = i;
            }
            ws4.m(h, this);
        }
    }

    @Override // defpackage.t43
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        i82.F(this, obj);
    }

    public final String toString() {
        return r7.x(((zs4) ws4.f(this.J)).c, hashCode(), "MutableIntState(value=", ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}
