package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fw4 extends s4 implements w43, zf1, un1 {
    public static final /* synthetic */ long N = gq.a.objectFieldOffset(fw4.class.getDeclaredField("_state$volatile"));
    public int M;
    private volatile /* synthetic */ Object _state$volatile;

    public fw4(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.un1
    public final zf1 a(tk0 tk0Var, int i, ez ezVar) {
        return (((i < 0 || i >= 2) && i != -2) || ezVar != ez.J) ? o7.w(this, tk0Var, i, ezVar) : this;
    }

    @Override // defpackage.r43
    public final boolean b(Object obj) {
        h(obj);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r14.equals(r15) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
    
        if (r9 == r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006c, code lost:
    
        if (r15 != r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x006c, B:16:0x0076, B:19:0x007d, B:20:0x0081, B:24:0x0084, B:26:0x00a5, B:29:0x00b5, B:30:0x00d1, B:36:0x00e1, B:32:0x00d8, B:35:0x00de, B:45:0x008a, B:48:0x0091, B:56:0x0047, B:58:0x004f, B:59:0x005d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x006c, B:16:0x0076, B:19:0x007d, B:20:0x0081, B:24:0x0084, B:26:0x00a5, B:29:0x00b5, B:30:0x00d1, B:36:0x00e1, B:32:0x00d8, B:35:0x00de, B:45:0x008a, B:48:0x0091, B:56:0x0047, B:58:0x004f, B:59:0x005d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b4 -> B:14:0x006c). Please report as a decompilation issue!!! */
    @Override // defpackage.zf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(defpackage.ag1 r14, defpackage.fj0 r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw4.collect(ag1, fj0):java.lang.Object");
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        h(obj);
        return wd5.a;
    }

    @Override // defpackage.dw4
    public final Object getValue() {
        ep epVar = p70.x;
        Object objectVolatile = gq.a.getObjectVolatile(this, N);
        if (objectVolatile == epVar) {
            return null;
        }
        return objectVolatile;
    }

    public final void h(Object obj) {
        if (obj == null) {
            obj = p70.x;
        }
        i(null, obj);
    }

    public final boolean i(Object obj, Object obj2) {
        int i;
        t4[] t4VarArr;
        ep epVar;
        synchronized (this) {
            Unsafe unsafe = gq.a;
            long j = N;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !j42.c(objectVolatile, obj)) {
                return false;
            }
            if (j42.c(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.M;
            if ((i2 & 1) != 0) {
                this.M = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.M = i3;
            t4[] t4VarArr2 = this.I;
            while (true) {
                gw4[] gw4VarArr = (gw4[]) t4VarArr2;
                if (gw4VarArr != null) {
                    for (gw4 gw4Var : gw4VarArr) {
                        if (gw4Var != null) {
                            AtomicReference atomicReference = gw4Var.a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 != null && obj3 != (epVar = o7.u)) {
                                    ep epVar2 = o7.t;
                                    if (obj3 != epVar2) {
                                        while (!atomicReference.compareAndSet(obj3, epVar2)) {
                                            if (atomicReference.get() != obj3) {
                                                break;
                                            }
                                        }
                                        ((k10) obj3).resumeWith(wd5.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj3, epVar)) {
                                        if (atomicReference.get() != obj3) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.M;
                    if (i == i3) {
                        this.M = i3 + 1;
                        return true;
                    }
                    t4VarArr = this.I;
                }
                t4VarArr2 = t4VarArr;
                i3 = i;
            }
        }
    }
}
