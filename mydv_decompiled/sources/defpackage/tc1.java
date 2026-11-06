package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class tc1 extends rc1 {
    public final WindowLayoutComponent a;
    public final uu2 b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public tc1(WindowLayoutComponent windowLayoutComponent, uu2 uu2Var) {
        this.a = windowLayoutComponent;
        this.b = uu2Var;
    }

    @Override // defpackage.rc1, defpackage.nu5
    public void a(kh0 kh0Var) {
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.e;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(kh0Var);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.d;
            ReentrantLock reentrantLock2 = multicastConsumer.b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(kh0Var);
                reentrantLock2.unlock();
                linkedHashMap2.remove(kh0Var);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    mh0 mh0Var = (mh0) this.f.remove(multicastConsumer);
                    if (mh0Var != null) {
                        mh0Var.a.invoke(mh0Var.b, mh0Var.c);
                    }
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.rc1, defpackage.nu5
    public void b(Context context, Executor executor, kh0 kh0Var) {
        LinkedHashMap linkedHashMap = this.d;
        context.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
            if (multicastConsumer != null) {
                multicastConsumer.a(kh0Var);
                linkedHashMap2.put(kh0Var, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(kh0Var, context);
                multicastConsumer2.a(kh0Var);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(o91.I));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f.put(multicastConsumer2, this.b.n(this.a, s24.a(WindowLayoutInfo.class), (Activity) context, new sc1(1, multicastConsumer2, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
