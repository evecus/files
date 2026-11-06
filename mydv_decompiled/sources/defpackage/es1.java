package defpackage;

import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class es1 {
    public static final es1 a = new es1(17669);
    public static final es1 b = new es1(35851);
    public static final es1 c = new es1(57637);

    public es1(int i) {
        int i2 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE / i;
    }
}
