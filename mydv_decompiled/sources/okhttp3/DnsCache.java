package okhttp3;

import defpackage.er0;
import defpackage.q8;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.dns.RealDnsCache;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DnsCache {

    /* renamed from: -delegate, reason: not valid java name */
    public final RealDnsCache f1delegate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DnsCache(long r11, long r13, long r15, long r17, int r19, int r20, defpackage.er0 r21) {
        /*
            r10 = this;
            r0 = r20 & 1
            x41 r1 = defpackage.x41.SECONDS
            r2 = 10
            if (r0 == 0) goto Lf
            jp r0 = defpackage.t41.J
            long r3 = defpackage.sp0.n0(r2, r1)
            goto L10
        Lf:
            r3 = r11
        L10:
            r0 = r20 & 2
            if (r0 == 0) goto L1d
            jp r0 = defpackage.t41.J
            r0 = 300(0x12c, float:4.2E-43)
            long r5 = defpackage.sp0.n0(r0, r1)
            goto L1e
        L1d:
            r5 = r13
        L1e:
            r0 = r20 & 4
            if (r0 == 0) goto L29
            jp r0 = defpackage.t41.J
            long r7 = defpackage.sp0.n0(r2, r1)
            goto L2a
        L29:
            r7 = r15
        L2a:
            r0 = r20 & 8
            if (r0 == 0) goto L36
            jp r0 = defpackage.t41.J
            r0 = 2
            long r0 = defpackage.sp0.n0(r0, r1)
            goto L38
        L36:
            r0 = r17
        L38:
            r2 = r20 & 16
            if (r2 == 0) goto L3f
            r2 = 1000(0x3e8, float:1.401E-42)
            goto L41
        L3f:
            r2 = r19
        L41:
            r9 = 0
            r11 = r10
            r18 = r0
            r20 = r2
            r12 = r3
            r14 = r5
            r16 = r7
            r21 = r9
            r11.<init>(r12, r14, r16, r18, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.DnsCache.<init>(long, long, long, long, int, int, er0):void");
    }

    public final void evictAll() {
        this.f1delegate.evictAll();
    }

    public final long failureTimeToLive() {
        return this.f1delegate.m358getFailureTimeToLiveUwyO8pc$okhttp();
    }

    public final int hitCount() {
        return this.f1delegate.getHitCount$okhttp();
    }

    public final int maxSize() {
        return this.f1delegate.getMaxSize$okhttp();
    }

    public final long maximumTimeToLive() {
        return this.f1delegate.m359getMaximumTimeToLiveUwyO8pc$okhttp();
    }

    public final long minimumTimeToLive() {
        return this.f1delegate.m360getMinimumTimeToLiveUwyO8pc$okhttp();
    }

    public final int networkCount() {
        return this.f1delegate.getNetworkCount$okhttp();
    }

    public final int requestCount() {
        return this.f1delegate.getRequestCount$okhttp();
    }

    public final long revalidateBeforeExpire() {
        return this.f1delegate.m361getRevalidateBeforeExpireUwyO8pc$okhttp();
    }

    public final int size() {
        return this.f1delegate.getSize$okhttp();
    }

    /* renamed from: get-delegate$okhttp$annotations, reason: not valid java name */
    public static /* synthetic */ void m250getdelegate$okhttp$annotations() {
    }

    public DnsCache(RealDnsCache realDnsCache) {
        realDnsCache.getClass();
        this.f1delegate = realDnsCache;
    }

    public /* synthetic */ DnsCache(long j, long j2, long j3, long j4, int i, er0 er0Var) {
        this(j, j2, j3, j4, i);
    }

    private DnsCache(long j, long j2, long j3, long j4, int i) {
        this(new RealDnsCache(TaskRunner.INSTANCE, q8.C0, j, j2, j3, j4, i, null));
    }
}
