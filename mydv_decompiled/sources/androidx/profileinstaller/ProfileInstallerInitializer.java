package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.j02;
import defpackage.o63;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements j02 {
    @Override // defpackage.j02
    public final Object create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new o63((byte) 6);
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: eu3
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? ls1.b(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new fu3(applicationContext, (byte) 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new o63((byte) 6);
    }

    @Override // defpackage.j02
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
