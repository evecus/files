package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.c81;
import defpackage.d81;
import defpackage.j02;
import defpackage.li2;
import defpackage.pn;
import defpackage.vi2;
import defpackage.yc;
import defpackage.zj1;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements j02 {
    public final void a(Context context) {
        Object obj;
        pn A = pn.A(context);
        A.getClass();
        synchronized (pn.f) {
            try {
                obj = ((HashMap) A.b).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = A.p(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        li2 k = ((vi2) obj).k();
        k.a(new d81(this, k));
    }

    @Override // defpackage.j02
    public final Object create(Context context) {
        zj1 zj1Var = new zj1(new yc(context, (byte) 1));
        zj1Var.b = true;
        if (c81.k == null) {
            synchronized (c81.j) {
                try {
                    if (c81.k == null) {
                        c81.k = new c81(zj1Var);
                    }
                } finally {
                }
            }
        }
        a(context);
        return Boolean.TRUE;
    }

    @Override // defpackage.j02
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
