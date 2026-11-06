package coil3.network;

import defpackage.qb0;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DeDupeConcurrentRequestStrategy implements ConcurrentRequestStrategy {
    private final Map<String, qb0> concurrentRequests = new LinkedHashMap();
    private final Object lock = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a5, code lost:
    
        if (r12 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a5 -> B:43:0x00a8). Please report as a decompilation issue!!! */
    @Override // coil3.network.ConcurrentRequestStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.String r10, defpackage.tm1 r11, defpackage.fj0 r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.DeDupeConcurrentRequestStrategy.apply(java.lang.String, tm1, fj0):java.lang.Object");
    }
}
