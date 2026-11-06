package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ns5 extends d1 {
    public static final Map c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(d1.d(32, 67, "SHA-256"), new ns5(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(d1.d(64, 131, "SHA-512"), new ns5(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(d1.d(32, 67, "SHAKE128"), new ns5(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(d1.d(64, 131, "SHAKE256"), new ns5(67108868, "WOTSP_SHAKE256_W16"));
        hashMap.put(d1.d(24, 51, "SHA-256"), new ns5(83886085, "WOTSP_SHA2-192_W16"));
        hashMap.put(d1.d(32, 67, "SHAKE256-LEN"), new ns5(100663302, "WOTSP_SHAKE256_256_W16"));
        hashMap.put(d1.d(24, 51, "SHAKE256-LEN"), new ns5(117440519, "WOTSP_SHAKE256_192_W16"));
        c = DesugarCollections.unmodifiableMap(hashMap);
    }
}
