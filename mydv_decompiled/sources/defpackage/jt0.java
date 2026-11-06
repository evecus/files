package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jt0 extends d1 {
    public static final Map c;

    static {
        HashMap hashMap = new HashMap();
        jp0.C(1, "XMSS_SHA2_10_256", hashMap, d1.f("SHA-256", 32, 67, 10));
        jp0.C(2, "XMSS_SHA2_16_256", hashMap, d1.f("SHA-256", 32, 67, 16));
        jp0.C(3, "XMSS_SHA2_20_256", hashMap, d1.f("SHA-256", 32, 67, 20));
        jp0.C(4, "XMSS_SHA2_10_512", hashMap, d1.f("SHA-512", 64, 131, 10));
        jp0.C(5, "XMSS_SHA2_16_512", hashMap, d1.f("SHA-512", 64, 131, 16));
        jp0.C(6, "XMSS_SHA2_20_512", hashMap, d1.f("SHA-512", 64, 131, 20));
        jp0.C(7, "XMSS_SHAKE_10_256", hashMap, d1.f("SHAKE128", 32, 67, 10));
        jp0.C(8, "XMSS_SHAKE_16_256", hashMap, d1.f("SHAKE128", 32, 67, 16));
        jp0.C(9, "XMSS_SHAKE_20_256", hashMap, d1.f("SHAKE128", 32, 67, 20));
        jp0.C(10, "XMSS_SHAKE_10_512", hashMap, d1.f("SHAKE256", 64, 131, 10));
        jp0.C(11, "XMSS_SHAKE_16_512", hashMap, d1.f("SHAKE256", 64, 131, 16));
        jp0.C(12, "XMSS_SHAKE_20_512", hashMap, d1.f("SHAKE256", 64, 131, 20));
        jp0.C(13, "XMSS_SHA2_10_192", hashMap, d1.f("SHA-256", 24, 51, 10));
        jp0.C(14, "XMSS_SHA2_16_192", hashMap, d1.f("SHA-256", 24, 51, 16));
        jp0.C(15, "XMSS_SHA2_20_192", hashMap, d1.f("SHA-256", 24, 51, 20));
        jp0.C(16, "XMSS_SHAKE256_10_256", hashMap, d1.f("SHAKE256-LEN", 32, 67, 10));
        jp0.C(17, "XMSS_SHAKE256_16_256", hashMap, d1.f("SHAKE256-LEN", 32, 67, 16));
        jp0.C(18, "XMSS_SHAKE256_20_256", hashMap, d1.f("SHAKE256-LEN", 32, 67, 20));
        jp0.C(19, "XMSS_SHAKE256_10_192", hashMap, d1.f("SHAKE256-LEN", 24, 51, 10));
        jp0.C(20, "XMSS_SHAKE256_16_192", hashMap, d1.f("SHAKE256-LEN", 24, 51, 16));
        hashMap.put(d1.f("SHAKE256-LEN", 24, 51, 20), new jt0(21, "XMSS_SHAKE256_20_192"));
        c = DesugarCollections.unmodifiableMap(hashMap);
    }
}
