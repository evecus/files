package okhttp3;

import defpackage.cz;
import defpackage.er0;
import defpackage.h00;
import defpackage.j42;
import defpackage.jp;
import defpackage.mg3;
import defpackage.mz;
import defpackage.r7;
import defpackage.s04;
import defpackage.s83;
import defpackage.t75;
import defpackage.u75;
import defpackage.ut4;
import defpackage.vt0;
import defpackage.zl1;
import defpackage.zy;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http1.HeadersReader;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final mg3 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final h00 crlfDashDashBoundary;
    private PartSource currentPart;
    private final h00 dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final mz source;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Part implements Closeable {
        private final mz body;
        private final Headers headers;

        public Part(Headers headers, mz mzVar) {
            headers.getClass();
            mzVar.getClass();
            this.headers = headers;
            this.body = mzVar;
        }

        public final mz body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class PartSource implements ut4 {
        private final u75 timeout = new u75();

        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (j42.c(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // defpackage.ut4
        public long read(cz czVar, long j) {
            czVar.getClass();
            if (j < 0) {
                s83.h(r7.A("byteCount < 0: ", j));
                return 0L;
            }
            if (!j42.c(MultipartReader.this.currentPart, this)) {
                zy.i("closed");
                return 0L;
            }
            u75 timeout = MultipartReader.this.source.timeout();
            u75 u75Var = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long timeoutNanos = timeout.timeoutNanos();
            t75 t75Var = u75.Companion;
            long timeoutNanos2 = u75Var.timeoutNanos();
            long timeoutNanos3 = timeout.timeoutNanos();
            t75Var.getClass();
            if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
                timeoutNanos2 = timeoutNanos3;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.timeout(timeoutNanos2, timeUnit);
            if (!timeout.hasDeadline()) {
                if (u75Var.hasDeadline()) {
                    timeout.deadlineNanoTime(u75Var.deadlineNanoTime());
                }
                try {
                    long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j);
                    return currentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(czVar, currentPartBytesRemaining);
                } finally {
                    timeout.timeout(timeoutNanos, timeUnit);
                    if (u75Var.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                }
            }
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (u75Var.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), u75Var.deadlineNanoTime()));
            }
            try {
                long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j);
                return currentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(czVar, currentPartBytesRemaining2);
            } finally {
                timeout.timeout(timeoutNanos, timeUnit);
                if (u75Var.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
            }
        }

        @Override // defpackage.ut4
        public u75 timeout() {
            return this.timeout;
        }
    }

    static {
        h00 h00Var = h00.L;
        afterBoundaryOptions = vt0.J(jp.h("\r\n"), jp.h("--"), jp.h(" "), jp.h("\t"));
    }

    public MultipartReader(mz mzVar, String str) {
        mzVar.getClass();
        str.getClass();
        this.source = mzVar;
        this.boundary = str;
        cz czVar = new cz();
        czVar.k0("--");
        czVar.k0(str);
        this.dashDashBoundary = czVar.i(czVar.J);
        cz czVar2 = new cz();
        czVar2.k0("\r\n--");
        czVar2.k0(str);
        this.crlfDashDashBoundary = czVar2.i(czVar2.J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j) {
        long min = Math.min(this.source.a().J, j) + 1;
        long u = this.source.u(min, this.crlfDashDashBoundary);
        if (u != -1) {
            return u;
        }
        if (this.source.a().J >= min) {
            return Math.min(min, j);
        }
        zy.c();
        return 0L;
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() {
        mz mzVar;
        if (this.closed) {
            zy.i("closed");
            return null;
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.h(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.d());
        } else {
            while (true) {
                long currentPartBytesRemaining = currentPartBytesRemaining(8192L);
                mzVar = this.source;
                if (currentPartBytesRemaining == 0) {
                    break;
                }
                mzVar.skip(currentPartBytesRemaining);
            }
            mzVar.skip(this.crlfDashDashBoundary.d());
        }
        boolean z = false;
        while (true) {
            int P = this.source.P(afterBoundaryOptions);
            if (P == -1) {
                zl1.m("unexpected characters after boundary");
                return null;
            }
            if (P == 0) {
                this.partCount++;
                Headers readHeaders = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(readHeaders, new s04(partSource));
            }
            if (P == 1) {
                if (z) {
                    zl1.m("unexpected characters after boundary");
                    return null;
                }
                if (this.partCount != 0) {
                    this.noMoreParts = true;
                    return null;
                }
                zl1.m("expected at least 1 part");
                return null;
            }
            if (P == 2 || P == 3) {
                z = true;
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final mg3 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultipartReader(okhttp3.ResponseBody r3) {
        /*
            r2 = this;
            r3.getClass()
            mz r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L19
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L19
            r2.<init>(r0, r3)
            return
        L19:
            java.lang.String r2 = "expected the Content-Type to have a boundary parameter"
            defpackage.zl1.m(r2)
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
