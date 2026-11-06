package coil3.network.okhttp.internal;

import coil3.network.NetworkClient;
import coil3.network.NetworkRequest;
import defpackage.fj0;
import defpackage.hn1;
import defpackage.j42;
import okhttp3.Call;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CallFactoryNetworkClient implements NetworkClient {
    private final Call.Factory callFactory;

    private /* synthetic */ CallFactoryNetworkClient(Call.Factory factory) {
        this.callFactory = factory;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CallFactoryNetworkClient m94boximpl(Call.Factory factory) {
        return new CallFactoryNetworkClient(factory);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m96equalsimpl(Call.Factory factory, Object obj) {
        return (obj instanceof CallFactoryNetworkClient) && j42.c(factory, ((CallFactoryNetworkClient) obj).m101unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m97equalsimpl0(Call.Factory factory, Call.Factory factory2) {
        return j42.c(factory, factory2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        if (r11 == r6) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: executeRequest-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object m98executeRequestimpl(okhttp3.Call.Factory r8, coil3.network.NetworkRequest r9, defpackage.hn1 r10, defpackage.fj0 r11) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.CallFactoryNetworkClient.m98executeRequestimpl(okhttp3.Call$Factory, coil3.network.NetworkRequest, hn1, fj0):java.lang.Object");
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m99hashCodeimpl(Call.Factory factory) {
        return factory.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m100toStringimpl(Call.Factory factory) {
        return "CallFactoryNetworkClient(callFactory=" + factory + ")";
    }

    public boolean equals(Object obj) {
        return m96equalsimpl(this.callFactory, obj);
    }

    @Override // coil3.network.NetworkClient
    public <T> Object executeRequest(NetworkRequest networkRequest, hn1 hn1Var, fj0 fj0Var) {
        return m98executeRequestimpl(this.callFactory, networkRequest, hn1Var, fj0Var);
    }

    public int hashCode() {
        return m99hashCodeimpl(this.callFactory);
    }

    public String toString() {
        return m100toStringimpl(this.callFactory);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Call.Factory m101unboximpl() {
        return this.callFactory;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Call.Factory m95constructorimpl(Call.Factory factory) {
        return factory;
    }
}
