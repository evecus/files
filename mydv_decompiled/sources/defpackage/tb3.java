package defpackage;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tb3 {
    public final CharSequence a;
    public final long b;
    public final um3 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public tb3(CharSequence charSequence, long j, um3 um3Var) {
        this.a = charSequence;
        this.b = j;
        this.c = um3Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tb3 tb3Var = (tb3) arrayList.get(i);
            um3 um3Var = tb3Var.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = tb3Var.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", tb3Var.b);
            if (um3Var != null) {
                bundle.putCharSequence("sender", um3Var.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", sb3.a(ck.N(um3Var)));
                } else {
                    bundle.putBundle("person", um3Var.b());
                }
            }
            String str = tb3Var.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = tb3Var.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            bundle.putBundle("extras", tb3Var.d);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        r0.add(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(android.os.Parcelable[] r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r14.length
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L8:
            int r3 = r14.length
            if (r2 >= r3) goto Lb6
            r3 = r14[r2]
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto Lb2
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r4 = "extras"
            java.lang.String r5 = "uri"
            java.lang.String r6 = "type"
            java.lang.String r7 = "sender"
            java.lang.String r8 = "sender_person"
            java.lang.String r9 = "person"
            java.lang.String r10 = "time"
            java.lang.String r11 = "text"
            r12 = 0
            boolean r13 = r3.containsKey(r11)     // Catch: java.lang.ClassCastException -> Lad
            if (r13 == 0) goto Lad
            boolean r13 = r3.containsKey(r10)     // Catch: java.lang.ClassCastException -> Lad
            if (r13 != 0) goto L32
            goto Lad
        L32:
            boolean r13 = r3.containsKey(r9)     // Catch: java.lang.ClassCastException -> Lad
            if (r13 == 0) goto L41
            android.os.Bundle r7 = r3.getBundle(r9)     // Catch: java.lang.ClassCastException -> Lad
            um3 r7 = defpackage.um3.a(r7)     // Catch: java.lang.ClassCastException -> Lad
            goto L76
        L41:
            boolean r9 = r3.containsKey(r8)     // Catch: java.lang.ClassCastException -> Lad
            if (r9 == 0) goto L58
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.ClassCastException -> Lad
            r13 = 28
            if (r9 < r13) goto L58
            android.os.Parcelable r7 = r3.getParcelable(r8)     // Catch: java.lang.ClassCastException -> Lad
            android.app.Person r7 = (android.app.Person) r7     // Catch: java.lang.ClassCastException -> Lad
            um3 r7 = defpackage.ck.j(r7)     // Catch: java.lang.ClassCastException -> Lad
            goto L76
        L58:
            boolean r8 = r3.containsKey(r7)     // Catch: java.lang.ClassCastException -> Lad
            if (r8 == 0) goto L75
            java.lang.CharSequence r7 = r3.getCharSequence(r7)     // Catch: java.lang.ClassCastException -> Lad
            um3 r8 = new um3     // Catch: java.lang.ClassCastException -> Lad
            r8.<init>()     // Catch: java.lang.ClassCastException -> Lad
            r8.a = r7     // Catch: java.lang.ClassCastException -> Lad
            r8.b = r12     // Catch: java.lang.ClassCastException -> Lad
            r8.c = r12     // Catch: java.lang.ClassCastException -> Lad
            r8.d = r12     // Catch: java.lang.ClassCastException -> Lad
            r8.e = r1     // Catch: java.lang.ClassCastException -> Lad
            r8.f = r1     // Catch: java.lang.ClassCastException -> Lad
            r7 = r8
            goto L76
        L75:
            r7 = r12
        L76:
            tb3 r8 = new tb3     // Catch: java.lang.ClassCastException -> Lad
            java.lang.CharSequence r9 = r3.getCharSequence(r11)     // Catch: java.lang.ClassCastException -> Lad
            long r10 = r3.getLong(r10)     // Catch: java.lang.ClassCastException -> Lad
            r8.<init>(r9, r10, r7)     // Catch: java.lang.ClassCastException -> Lad
            boolean r7 = r3.containsKey(r6)     // Catch: java.lang.ClassCastException -> Lad
            if (r7 == 0) goto L9d
            boolean r7 = r3.containsKey(r5)     // Catch: java.lang.ClassCastException -> Lad
            if (r7 == 0) goto L9d
            java.lang.String r6 = r3.getString(r6)     // Catch: java.lang.ClassCastException -> Lad
            android.os.Parcelable r5 = r3.getParcelable(r5)     // Catch: java.lang.ClassCastException -> Lad
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.ClassCastException -> Lad
            r8.e = r6     // Catch: java.lang.ClassCastException -> Lad
            r8.f = r5     // Catch: java.lang.ClassCastException -> Lad
        L9d:
            boolean r5 = r3.containsKey(r4)     // Catch: java.lang.ClassCastException -> Lad
            if (r5 == 0) goto Lac
            android.os.Bundle r5 = r8.d     // Catch: java.lang.ClassCastException -> Lad
            android.os.Bundle r3 = r3.getBundle(r4)     // Catch: java.lang.ClassCastException -> Lad
            r5.putAll(r3)     // Catch: java.lang.ClassCastException -> Lad
        Lac:
            r12 = r8
        Lad:
            if (r12 == 0) goto Lb2
            r0.add(r12)
        Lb2:
            int r2 = r2 + 1
            goto L8
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb3.b(android.os.Parcelable[]):java.util.ArrayList");
    }

    public final Notification.MessagingStyle.Message c() {
        Notification.MessagingStyle.Message a;
        int i = Build.VERSION.SDK_INT;
        long j = this.b;
        um3 um3Var = this.c;
        CharSequence charSequence = this.a;
        if (i >= 28) {
            a = sb3.b(charSequence, j, um3Var != null ? ck.N(um3Var) : null);
        } else {
            a = rb3.a(charSequence, j, um3Var != null ? um3Var.a : null);
        }
        String str = this.e;
        if (str != null) {
            rb3.b(a, str, this.f);
        }
        if (i >= 28) {
            sb3.c(a, this.d);
        }
        return a;
    }
}
