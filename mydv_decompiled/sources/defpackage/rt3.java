package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rt3 extends j91 {
    final /* synthetic */ st3 this$0;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class a extends j91 {
        final /* synthetic */ st3 this$0;

        public a(st3 st3Var) {
            this.this$0 = st3Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            st3 st3Var = this.this$0;
            int i = st3Var.I + 1;
            st3Var.I = i;
            if (i == 1 && st3Var.L) {
                st3Var.N.e(ji2.ON_START);
                st3Var.L = false;
            }
        }
    }

    public rt3(st3 st3Var) {
        this.this$0 = st3Var;
    }

    @Override // defpackage.j91, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = i44.J;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((i44) findFragmentByTag).I = this.this$0.P;
        }
    }

    @Override // defpackage.j91, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        st3 st3Var = this.this$0;
        int i = st3Var.J - 1;
        st3Var.J = i;
        if (i == 0) {
            Handler handler = st3Var.M;
            handler.getClass();
            handler.postDelayed(st3Var.O, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        z9.g(activity, new a(this.this$0));
    }

    @Override // defpackage.j91, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        st3 st3Var = this.this$0;
        int i = st3Var.I - 1;
        st3Var.I = i;
        if (i == 0 && st3Var.K) {
            st3Var.N.e(ji2.ON_STOP);
            st3Var.L = true;
        }
    }
}
