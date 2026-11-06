package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class it0 extends d1 {
    public static final Map c;

    static {
        HashMap hashMap = new HashMap();
        jp0.w(1, "XMSSMT_SHA2_20/2_256", hashMap, d1.e(32, "SHA-256", 67, 20, 2));
        jp0.w(2, "XMSSMT_SHA2_20/4_256", hashMap, d1.e(32, "SHA-256", 67, 20, 4));
        jp0.w(3, "XMSSMT_SHA2_40/2_256", hashMap, d1.e(32, "SHA-256", 67, 40, 2));
        jp0.w(4, "XMSSMT_SHA2_40/4_256", hashMap, d1.e(32, "SHA-256", 67, 40, 4));
        jp0.w(5, "XMSSMT_SHA2_40/8_256", hashMap, d1.e(32, "SHA-256", 67, 40, 8));
        jp0.w(6, "XMSSMT_SHA2_60/3_256", hashMap, d1.e(32, "SHA-256", 67, 60, 3));
        jp0.w(7, "XMSSMT_SHA2_60/6_256", hashMap, d1.e(32, "SHA-256", 67, 60, 6));
        jp0.w(8, "XMSSMT_SHA2_60/12_256", hashMap, d1.e(32, "SHA-256", 67, 60, 12));
        jp0.w(9, "XMSSMT_SHA2_20/2_512", hashMap, d1.e(64, "SHA-512", 131, 20, 2));
        jp0.w(10, "XMSSMT_SHA2_20/4_512", hashMap, d1.e(64, "SHA-512", 131, 20, 4));
        jp0.w(11, "XMSSMT_SHA2_40/2_512", hashMap, d1.e(64, "SHA-512", 131, 40, 2));
        jp0.w(12, "XMSSMT_SHA2_40/4_512", hashMap, d1.e(64, "SHA-512", 131, 40, 4));
        jp0.w(13, "XMSSMT_SHA2_40/8_512", hashMap, d1.e(64, "SHA-512", 131, 40, 8));
        jp0.w(14, "XMSSMT_SHA2_60/3_512", hashMap, d1.e(64, "SHA-512", 131, 60, 3));
        jp0.w(15, "XMSSMT_SHA2_60/6_512", hashMap, d1.e(64, "SHA-512", 131, 60, 6));
        jp0.w(16, "XMSSMT_SHA2_60/12_512", hashMap, d1.e(64, "SHA-512", 131, 60, 12));
        jp0.w(17, "XMSSMT_SHAKE_20/2_256", hashMap, d1.e(32, "SHAKE128", 67, 20, 2));
        jp0.w(18, "XMSSMT_SHAKE_20/4_256", hashMap, d1.e(32, "SHAKE128", 67, 20, 4));
        jp0.w(19, "XMSSMT_SHAKE_40/2_256", hashMap, d1.e(32, "SHAKE128", 67, 40, 2));
        jp0.w(20, "XMSSMT_SHAKE_40/4_256", hashMap, d1.e(32, "SHAKE128", 67, 40, 4));
        jp0.w(21, "XMSSMT_SHAKE_40/8_256", hashMap, d1.e(32, "SHAKE128", 67, 40, 8));
        jp0.w(22, "XMSSMT_SHAKE_60/3_256", hashMap, d1.e(32, "SHAKE128", 67, 60, 3));
        jp0.w(23, "XMSSMT_SHAKE_60/6_256", hashMap, d1.e(32, "SHAKE128", 67, 60, 6));
        jp0.w(24, "XMSSMT_SHAKE_60/12_256", hashMap, d1.e(32, "SHAKE128", 67, 60, 12));
        jp0.w(25, "XMSSMT_SHAKE_20/2_512", hashMap, d1.e(64, "SHAKE256", 131, 20, 2));
        jp0.w(26, "XMSSMT_SHAKE_20/4_512", hashMap, d1.e(64, "SHAKE256", 131, 20, 4));
        jp0.w(27, "XMSSMT_SHAKE_40/2_512", hashMap, d1.e(64, "SHAKE256", 131, 40, 2));
        jp0.w(28, "XMSSMT_SHAKE_40/4_512", hashMap, d1.e(64, "SHAKE256", 131, 40, 4));
        jp0.w(29, "XMSSMT_SHAKE_40/8_512", hashMap, d1.e(64, "SHAKE256", 131, 40, 8));
        jp0.w(30, "XMSSMT_SHAKE_60/3_512", hashMap, d1.e(64, "SHAKE256", 131, 60, 3));
        jp0.w(31, "XMSSMT_SHAKE_60/6_512", hashMap, d1.e(64, "SHAKE256", 131, 60, 6));
        jp0.w(32, "XMSSMT_SHAKE_60/12_512", hashMap, d1.e(64, "SHAKE256", 131, 60, 12));
        jp0.w(33, "XMSSMT_SHA2_20/2_192", hashMap, d1.e(24, "SHA-256", 51, 20, 2));
        jp0.w(34, "XMSSMT_SHA2_20/4_192", hashMap, d1.e(24, "SHA-256", 51, 20, 4));
        jp0.w(35, "XMSSMT_SHA2_40/2_192", hashMap, d1.e(24, "SHA-256", 51, 40, 2));
        jp0.w(36, "XMSSMT_SHA2_40/4_192", hashMap, d1.e(24, "SHA-256", 51, 40, 4));
        jp0.w(37, "XMSSMT_SHA2_40/8_192", hashMap, d1.e(24, "SHA-256", 51, 40, 8));
        jp0.w(38, "XMSSMT_SHA2_60/3_192", hashMap, d1.e(24, "SHA-256", 51, 60, 3));
        jp0.w(39, "XMSSMT_SHA2_60/6_192", hashMap, d1.e(24, "SHA-256", 51, 60, 6));
        jp0.w(40, "XMSSMT_SHA2_60/12_192", hashMap, d1.e(24, "SHA-256", 51, 60, 12));
        jp0.w(41, "XMSSMT_SHAKE256_20/2_256", hashMap, d1.e(32, "SHAKE256-LEN", 67, 20, 2));
        jp0.w(42, "XMSSMT_SHAKE256_20/4_256", hashMap, d1.e(32, "SHAKE256-LEN", 67, 20, 4));
        jp0.w(43, "XMSSMT_SHAKE256_40/2_256", hashMap, d1.e(32, "SHAKE256-LEN", 67, 40, 2));
        jp0.w(44, "XMSSMT_SHAKE256_40/4_256", hashMap, d1.e(32, "SHAKE256-LEN", 67, 40, 4));
        jp0.w(45, "XMSSMT_SHAKE256_40/8_256", hashMap, d1.e(32, "SHAKE256-LEN", 67, 40, 8));
        jp0.w(46, "XMSSMT_SHAKE256_60/3_256", hashMap, d1.e(32, "SHAKE256-LEN", 67, 60, 3));
        jp0.w(47, "XMSSMT_SHAKE256_60/6_256", hashMap, d1.e(32, "SHAKE256-LEN", 67, 60, 6));
        jp0.w(48, "XMSSMT_SHAKE256_60/12_256", hashMap, d1.e(32, "SHAKE256-LEN", 67, 60, 12));
        jp0.w(49, "XMSSMT_SHAKE256_20/2_192", hashMap, d1.e(24, "SHAKE256-LEN", 51, 20, 2));
        jp0.w(50, "XMSSMT_SHAKE256_20/4_192", hashMap, d1.e(24, "SHAKE256-LEN", 51, 20, 4));
        jp0.w(51, "XMSSMT_SHAKE256_40/2_192", hashMap, d1.e(24, "SHAKE256-LEN", 51, 40, 2));
        jp0.w(52, "XMSSMT_SHAKE256_40/4_192", hashMap, d1.e(24, "SHAKE256-LEN", 51, 40, 4));
        jp0.w(53, "XMSSMT_SHAKE256_40/8_192", hashMap, d1.e(24, "SHAKE256-LEN", 51, 40, 8));
        jp0.w(54, "XMSSMT_SHAKE256_60/3_192", hashMap, d1.e(24, "SHAKE256-LEN", 51, 60, 3));
        jp0.w(55, "XMSSMT_SHAKE256_60/6_192", hashMap, d1.e(24, "SHAKE256-LEN", 51, 60, 6));
        hashMap.put(d1.e(24, "SHAKE256-LEN", 51, 60, 12), new it0(56, "XMSSMT_SHAKE256_60/12_192"));
        c = DesugarCollections.unmodifiableMap(hashMap);
    }
}
