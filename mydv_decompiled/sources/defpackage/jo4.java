package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jo4 implements nu5 {
    public static volatile jo4 c;
    public static final ReentrantLock d = new ReentrantLock();
    public final ic1 a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public jo4(ho4 ho4Var) {
        this.a = ho4Var;
        if (ho4Var != null) {
            ho4Var.d(new g73((Object) this, (byte) 9));
        }
    }

    @Override // defpackage.nu5
    public final void a(kh0 kh0Var) {
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    io4 io4Var = (io4) it.next();
                    if (io4Var.c == kh0Var) {
                        arrayList.add(io4Var);
                    }
                }
                this.b.removeAll(arrayList);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Activity activity = ((io4) obj).a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (!(copyOnWriteArrayList != null) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((io4) it2.next()).a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    ic1 ic1Var = this.a;
                    if (ic1Var != null) {
                        ((ho4) ic1Var).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nu5
    public final void b(Context context, Executor executor, kh0 kh0Var) {
        Object obj;
        WindowManager.LayoutParams attributes;
        context.getClass();
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        o91 o91Var = o91.I;
        if (activity == null) {
            kh0Var.accept(new iw5(o91Var));
            return;
        }
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            ic1 ic1Var = this.a;
            if (ic1Var == null) {
                kh0Var.accept(new iw5(o91Var));
                return;
            }
            boolean z = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            if ((copyOnWriteArrayList != null) == false || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (((io4) it.next()).a.equals(activity)) {
                        break;
                    }
                }
            }
            z = false;
            io4 io4Var = new io4(activity, executor, kh0Var);
            copyOnWriteArrayList.add(io4Var);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (activity.equals(((io4) obj).a)) {
                            break;
                        }
                    }
                }
                io4 io4Var2 = (io4) obj;
                iw5 iw5Var = io4Var2 != null ? io4Var2.d : null;
                if (iw5Var != null) {
                    io4Var.d = iw5Var;
                    io4Var.b.execute(new h8(io4Var, iw5Var, (byte) 25));
                }
            } else {
                ho4 ho4Var = (ho4) ic1Var;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    ho4Var.c(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new go4(ho4Var, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
