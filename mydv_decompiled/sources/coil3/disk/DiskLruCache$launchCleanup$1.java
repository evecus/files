package coil3.disk;

import defpackage.dl0;
import defpackage.ew;
import defpackage.fj0;
import defpackage.hn1;
import defpackage.k05;
import defpackage.mu0;
import defpackage.q04;
import defpackage.rp0;
import defpackage.wd5;
import defpackage.zy;
import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
@rp0(c = "coil3.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class DiskLruCache$launchCleanup$1 extends k05 implements hn1 {
    int label;
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$launchCleanup$1(DiskLruCache diskLruCache, fj0 fj0Var) {
        super(2, fj0Var);
        this.this$0 = diskLruCache;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new DiskLruCache$launchCleanup$1(this.this$0, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(dl0 dl0Var, fj0 fj0Var) {
        return ((DiskLruCache$launchCleanup$1) create(dl0Var, fj0Var)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        boolean journalRewriteRequired;
        if (this.label != 0) {
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mu0.V(obj);
        Object obj2 = this.this$0.lock;
        DiskLruCache diskLruCache = this.this$0;
        synchronized (obj2) {
            z = diskLruCache.initialized;
            if (z) {
                z2 = diskLruCache.closed;
                if (!z2) {
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        journalRewriteRequired = diskLruCache.journalRewriteRequired();
                        if (journalRewriteRequired) {
                            diskLruCache.writeJournal();
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        diskLruCache.journalWriter = new q04(new ew());
                    }
                    return wd5.a;
                }
            }
            return wd5.a;
        }
    }
}
