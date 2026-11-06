package defpackage;

import android.app.Notification;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nc3 {
    public final String a;
    public final int b;
    public final Notification c;

    public nc3(String str, int i, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = notification;
    }

    public final void a(kw1 kw1Var) {
        String str = this.a;
        int i = this.b;
        Notification notification = this.c;
        iw1 iw1Var = (iw1) kw1Var;
        iw1Var.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(kw1.c);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(null);
            obtain.writeTypedObject(notification, 0);
            if (iw1Var.d.transact(1, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method notify is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        return nt3.n(sb, this.b, ", tag:null]");
    }
}
