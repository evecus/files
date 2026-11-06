package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fw1 implements gw1 {
    public IBinder d;

    @Override // defpackage.gw1
    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(gw1.a);
            obtain.writeStringArray(strArr);
            this.d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }
}
