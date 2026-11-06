package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hk3 extends lw4 implements Parcelable, bt4, t43, cw4 {
    public static final Parcelable.Creator<hk3> CREATOR = new ek3((byte) 2);
    public at4 J;

    public hk3(long j) {
        ns4 h = ws4.h();
        at4 at4Var = new at4(h.g(), j);
        if (!(h instanceof zq1)) {
            at4Var.b = new at4(1L, j);
        }
        this.J = at4Var;
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
        if (((at4) mw4Var2).c == ((at4) mw4Var3).c) {
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
        this.J = (at4) mw4Var;
    }

    @Override // defpackage.cw4
    public final /* bridge */ /* synthetic */ Object getValue() {
        return i82.f(this);
    }

    public final long h() {
        return ((at4) ws4.t(this.J, this)).c;
    }

    public final void i(long j) {
        ns4 h;
        at4 at4Var = (at4) ws4.f(this.J);
        if (at4Var.c != j) {
            at4 at4Var2 = this.J;
            synchronized (ws4.c) {
                h = ws4.h();
                ((at4) ws4.o(at4Var2, this, h, at4Var)).c = j;
            }
            ws4.m(h, this);
        }
    }

    @Override // defpackage.t43
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        i82.G(this, obj);
    }

    public final String toString() {
        return "MutableLongState(value=" + ((at4) ws4.f(this.J)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}
