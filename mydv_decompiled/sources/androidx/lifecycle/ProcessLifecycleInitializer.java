package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.j02;
import defpackage.ji2;
import defpackage.ni2;
import defpackage.o91;
import defpackage.oi2;
import defpackage.pn;
import defpackage.rt3;
import defpackage.st3;
import defpackage.zy;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements j02 {
    @Override // defpackage.j02
    public final Object create(Context context) {
        context.getClass();
        pn A = pn.A(context);
        A.getClass();
        if (!((HashSet) A.c).contains(ProcessLifecycleInitializer.class)) {
            zy.i("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!oi2.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new ni2());
        }
        st3 st3Var = st3.Q;
        st3Var.getClass();
        st3Var.M = new Handler();
        st3Var.N.e(ji2.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new rt3(st3Var));
        return st3Var;
    }

    @Override // defpackage.j02
    public final List dependencies() {
        return o91.I;
    }
}
