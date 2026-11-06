package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qj0 extends k63 {
    public static final pj0 Companion = new pj0();
    public final fl4 f;
    public final Context g;
    public final mn4 h;
    public final n04 i;

    public qj0(Application application, fl4 fl4Var) {
        super(9978);
        this.f = fl4Var;
        Context applicationContext = application.getApplicationContext();
        this.g = applicationContext != null ? applicationContext : application;
        mn4 b = o7.b(4, 5, null);
        this.h = b;
        this.i = new n04(b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0187, code lost:
    
        if (r3.length() > 0) goto L60;
     */
    @Override // defpackage.k63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.h63 d(defpackage.e63 r20) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj0.d(e63):h63");
    }

    public final String h() {
        Companion.getClass();
        return r7.C("http://", pj0.b(), ":9978/submit");
    }
}
