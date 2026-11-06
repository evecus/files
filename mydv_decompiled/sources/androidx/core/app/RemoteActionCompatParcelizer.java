package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.ui5;
import defpackage.vi5;
import defpackage.wi5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(ui5 ui5Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        wi5 wi5Var = remoteActionCompat.a;
        boolean z = true;
        if (ui5Var.e(1)) {
            wi5Var = ui5Var.g();
        }
        remoteActionCompat.a = (IconCompat) wi5Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (ui5Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((vi5) ui5Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (ui5Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((vi5) ui5Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) ui5Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (ui5Var.e(5)) {
            z2 = ((vi5) ui5Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!ui5Var.e(6)) {
            z = z3;
        } else if (((vi5) ui5Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, ui5 ui5Var) {
        ui5Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        ui5Var.h(1);
        ui5Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        ui5Var.h(2);
        Parcel parcel = ((vi5) ui5Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        ui5Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        ui5Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        ui5Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        ui5Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
