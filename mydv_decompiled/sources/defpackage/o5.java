package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o5 {
    public Object a;

    public /* synthetic */ o5(Object obj) {
        this.a = obj;
    }

    public static o5 b(int i, int i2, int i3, int i4, boolean z) {
        return new o5(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public void a(c32 c32Var) {
        Object obj = this.a;
        if (obj == null) {
            this.a = c32Var;
            return;
        }
        if (obj instanceof o43) {
            ((o43) obj).d(c32Var);
            return;
        }
        if (obj.equals(c32Var)) {
            return;
        }
        o43 o43Var = ka4.a;
        o43 o43Var2 = new o43(2);
        o43Var2.k((c32) obj);
        o43Var2.k(c32Var);
        this.a = o43Var2;
    }

    public void c(c32 c32Var) {
        Object obj = this.a;
        if (j42.c(obj, c32Var)) {
            this.a = null;
            return;
        }
        if (obj instanceof o43) {
            o43 o43Var = (o43) obj;
            o43Var.l(c32Var);
            int i = o43Var.d;
            if (i == 0) {
                this.a = null;
                return;
            }
            if (i != 1) {
                return;
            }
            Object[] objArr = o43Var.b;
            long[] jArr = o43Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                this.a = objArr[(i2 << 3) + i4];
                                return;
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            s83.l("The ScatterSet is empty");
        }
    }
}
