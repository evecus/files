package okhttp3.internal.http1;

import defpackage.mz;
import okhttp3.Headers;
import okhttp3.internal._HeadersCommonKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class HeadersReader {
    private long headerLimit;
    private final mz source;

    public HeadersReader(mz mzVar) {
        mzVar.getClass();
        this.source = mzVar;
        this.headerLimit = _HeadersCommonKt.HEADER_LIMIT;
    }

    public final mz getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readLine = readLine();
            if (readLine.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(readLine);
        }
    }

    public final String readLine() {
        String w = this.source.w(this.headerLimit);
        this.headerLimit -= w.length();
        return w;
    }
}
