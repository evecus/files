package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kn3 implements ts1 {
    public final View a;

    public kn3(View view) {
        this.a = view;
    }

    public final void a(int i) {
        int i2 = 16;
        if (!us1.a(i, 16)) {
            i2 = 6;
            if (!us1.a(i, 6)) {
                i2 = 13;
                if (!us1.a(i, 13)) {
                    i2 = 23;
                    if (!us1.a(i, 23)) {
                        i2 = 3;
                        if (!us1.a(i, 3)) {
                            i2 = 0;
                            if (!us1.a(i, 0)) {
                                i2 = 17;
                                if (!us1.a(i, 17)) {
                                    i2 = 27;
                                    if (!us1.a(i, 27)) {
                                        i2 = 26;
                                        if (!us1.a(i, 26)) {
                                            i2 = 9;
                                            if (!us1.a(i, 9)) {
                                                i2 = 22;
                                                if (!us1.a(i, 22)) {
                                                    i2 = 21;
                                                    if (!us1.a(i, 21)) {
                                                        i2 = 1;
                                                        if (!us1.a(i, 1)) {
                                                            i2 = -1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = dr5.a;
        int H = k21.H(i2);
        if (H == -1) {
            return;
        }
        this.a.performHapticFeedback(H);
    }
}
