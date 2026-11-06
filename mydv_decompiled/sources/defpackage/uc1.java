package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class uc1 extends tc1 {
    public final ReentrantLock g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public uc1(WindowLayoutComponent windowLayoutComponent, uu2 uu2Var) {
        super(windowLayoutComponent, uu2Var);
        this.g = new ReentrantLock();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    @Override // defpackage.tc1, defpackage.rc1, defpackage.nu5
    public final void a(kh0 kh0Var) {
        LinkedHashMap linkedHashMap = this.h;
        LinkedHashMap linkedHashMap2 = this.i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(kh0Var);
            if (context == null) {
                return;
            }
            f33 f33Var = (f33) linkedHashMap.get(context);
            if (f33Var == null) {
                return;
            }
            ReentrantLock reentrantLock2 = f33Var.b;
            reentrantLock2.lock();
            try {
                f33Var.d.remove(kh0Var);
                reentrantLock2.unlock();
                linkedHashMap2.remove(kh0Var);
                if (f33Var.d.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.a.removeWindowLayoutInfoListener(f33Var);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.tc1, defpackage.rc1, defpackage.nu5
    public final void b(Context context, Executor executor, kh0 kh0Var) {
        LinkedHashMap linkedHashMap = this.h;
        context.getClass();
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            f33 f33Var = (f33) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.i;
            if (f33Var != null) {
                f33Var.a(kh0Var);
                linkedHashMap2.put(kh0Var, context);
            } else {
                f33 f33Var2 = new f33(context);
                linkedHashMap.put(context, f33Var2);
                linkedHashMap2.put(kh0Var, context);
                f33Var2.a(kh0Var);
                this.a.addWindowLayoutInfoListener(context, f33Var2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
