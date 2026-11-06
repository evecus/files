package androidx.media3.extractor;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class GaplessInfoHolder {
    private static final Pattern GAPLESS_COMMENT_PATTERN = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    private static final String GAPLESS_DESCRIPTION = "iTunSMPB";
    private static final String GAPLESS_DOMAIN = "com.apple.iTunes";
    public int encoderDelay = -1;
    public int encoderPadding = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setFromMetadata$0(CommentFrame commentFrame) {
        return commentFrame.description.equals(GAPLESS_DESCRIPTION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setFromMetadata$1(InternalFrame internalFrame) {
        return internalFrame.domain.equals(GAPLESS_DOMAIN) && internalFrame.description.equals(GAPLESS_DESCRIPTION);
    }

    private boolean setFromComment(String str) {
        Matcher matcher = GAPLESS_COMMENT_PATTERN.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) Util.castNonNull(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) Util.castNonNull(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.encoderDelay = parseInt;
            this.encoderPadding = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean hasGaplessInfo() {
        return (this.encoderDelay == -1 || this.encoderPadding == -1) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean setFromMetadata(androidx.media3.common.Metadata r5) {
        /*
            r4 = this;
            oo1 r0 = new oo1
            r1 = 0
            r0.<init>()
            java.lang.Class<androidx.media3.extractor.metadata.id3.CommentFrame> r2 = androidx.media3.extractor.metadata.id3.CommentFrame.class
            dy1 r0 = r5.getMatchingEntries(r2, r0)
            ay1 r0 = r0.listIterator(r1)
        L10:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L26
            java.lang.Object r2 = r0.next()
            androidx.media3.extractor.metadata.id3.CommentFrame r2 = (androidx.media3.extractor.metadata.id3.CommentFrame) r2
            java.lang.String r2 = r2.text
            boolean r2 = r4.setFromComment(r2)
            if (r2 == 0) goto L10
            goto L49
        L26:
            oo1 r0 = new oo1
            r0.<init>()
            java.lang.Class<androidx.media3.extractor.metadata.id3.InternalFrame> r2 = androidx.media3.extractor.metadata.id3.InternalFrame.class
            dy1 r5 = r5.getMatchingEntries(r2, r0)
            ay1 r5 = r5.listIterator(r1)
        L35:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r5.next()
            androidx.media3.extractor.metadata.id3.InternalFrame r0 = (androidx.media3.extractor.metadata.id3.InternalFrame) r0
            java.lang.String r0 = r0.text
            boolean r0 = r4.setFromComment(r0)
            if (r0 == 0) goto L35
        L49:
            return r3
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.GaplessInfoHolder.setFromMetadata(androidx.media3.common.Metadata):boolean");
    }
}
