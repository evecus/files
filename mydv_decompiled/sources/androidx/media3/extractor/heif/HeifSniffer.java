package androidx.media3.extractor.heif;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class HeifSniffer {
    private static final int BRAND_HEIC = 1751476579;

    private HeifSniffer() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean sniff(androidx.media3.extractor.ExtractorInput r12, boolean r13) {
        /*
            androidx.media3.common.util.ParsableByteArray r0 = new androidx.media3.common.util.ParsableByteArray
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = r2
        L9:
            r4 = 8
            r0.reset(r4)
            byte[] r5 = r0.getData()
            r6 = 0
            boolean r5 = r12.peekFully(r5, r6, r4, r2)
            if (r5 != 0) goto L1a
            return r6
        L1a:
            long r7 = r0.readUnsignedInt()
            int r5 = r0.readInt()
            r9 = 1
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L3c
            byte[] r7 = r0.getData()
            boolean r7 = r12.peekFully(r7, r4, r4, r2)
            if (r7 != 0) goto L33
            return r6
        L33:
            r0.setLimit(r1)
            long r7 = r0.readUnsignedLongToLong()
            r9 = r1
            goto L3d
        L3c:
            r9 = r4
        L3d:
            long r9 = (long) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L43
            return r6
        L43:
            long r7 = r7 - r9
            int r7 = (int) r7
            if (r3 == 0) goto L6f
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r3) goto L6e
            if (r7 >= r4) goto L4f
            goto L6e
        L4f:
            r3 = 4
            r0.reset(r3)
            byte[] r4 = r0.getData()
            r12.peekFully(r4, r6, r3)
            int r3 = r0.readInt()
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r4) goto L64
            return r6
        L64:
            if (r13 != 0) goto L67
            return r2
        L67:
            int r7 = r7 + (-4)
            r12.advancePeekPosition(r7)
            r3 = r6
            goto L9
        L6e:
            return r6
        L6f:
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r5 != r4) goto L75
            return r2
        L75:
            if (r7 == 0) goto L9
            r12.advancePeekPosition(r7)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.heif.HeifSniffer.sniff(androidx.media3.extractor.ExtractorInput, boolean):boolean");
    }
}
