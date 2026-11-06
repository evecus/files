package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fd implements pz1 {
    public final ArrayList a;
    public final int b;
    public final MotionEvent c;

    public fd(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = arrayList;
        this.b = i;
        this.c = motionEvent;
        if (arrayList.isEmpty()) {
            s83.t("changes cannot be empty");
            throw null;
        }
    }

    public final List a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }
}
