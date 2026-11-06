package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import defpackage.ad1;
import defpackage.iw5;
import defpackage.kh0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MulticastConsumer implements kh0 {
    public final Context a;
    public final ReentrantLock b;
    public iw5 c;
    public final LinkedHashSet d;

    public MulticastConsumer(Context context) {
        context.getClass();
        this.a = context;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }

    public final void a(kh0 kh0Var) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            iw5 iw5Var = this.c;
            if (iw5Var != null) {
                kh0Var.accept(iw5Var);
            }
            this.d.add(kh0Var);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.kh0
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            iw5 c = ad1.c(this.a, windowLayoutInfo);
            this.c = c;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((kh0) it.next()).accept(c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
