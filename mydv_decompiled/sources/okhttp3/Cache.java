package okhttp3;

import coil3.network.internal.UtilsKt;
import defpackage.a;
import defpackage.bz;
import defpackage.cz;
import defpackage.eq4;
import defpackage.er0;
import defpackage.gl1;
import defpackage.h00;
import defpackage.hl1;
import defpackage.i42;
import defpackage.j42;
import defpackage.jp;
import defpackage.jx4;
import defpackage.ke1;
import defpackage.lz;
import defpackage.mz;
import defpackage.o91;
import defpackage.ok3;
import defpackage.q04;
import defpackage.s04;
import defpackage.su0;
import defpackage.sv2;
import defpackage.t91;
import defpackage.ut4;
import defpackage.zl1;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class CacheResponseBody extends ResponseBody {
        private final mz bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            snapshot.getClass();
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = new s04(new hl1(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // defpackage.hl1, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return _UtilCommonKt.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public mz source() {
            return this.bodySource;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public final class RealCacheRequest implements CacheRequest {
        private final eq4 body;
        private final eq4 cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            editor.getClass();
            this.this$0 = cache;
            this.editor = editor;
            eq4 newSink = editor.newSink(1);
            this.cacheOut = newSink;
            this.body = new gl1(newSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // defpackage.gl1, defpackage.eq4, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    Cache cache2 = Cache.this;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                _UtilCommonKt.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public eq4 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    public Cache(ok3 ok3Var, long j, ke1 ke1Var, TaskRunner taskRunner) {
        ok3Var.getClass();
        ke1Var.getClass();
        taskRunner.getClass();
        this.cache = new DiskLruCache(ke1Var, ok3Var, VERSION, 2, j, taskRunner);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    @su0
    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final File m218deprecated_directory() {
        return this.cache.getDirectory().toFile();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    public final void delete() {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory().toFile();
    }

    public final ok3 directoryPath() {
        return this.cache.getDirectory();
    }

    public final void evictAll() {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        request.getClass();
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                _UtilCommonKt.closeQuietly(response.body());
                return null;
            } catch (IOException unused) {
                _UtilCommonKt.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editor;
        response.getClass();
        String method = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!j42.c(method, UtilsKt.HTTP_METHOD_GET)) {
            return null;
        }
        Companion companion = Companion;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editor == null) {
                return null;
            }
            try {
                entry.writeTo(editor);
                return new RealCacheRequest(this, editor);
            } catch (IOException unused2) {
                abortQuietly(editor);
                return null;
            }
        } catch (IOException unused3) {
            editor = null;
        }
    }

    public final void remove$okhttp(Request request) {
        request.getClass();
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        try {
            cacheStrategy.getClass();
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void update$okhttp(Response response, Response response2) {
        DiskLruCache.Editor editor;
        response.getClass();
        response2.getClass();
        Entry entry = new Entry(response2);
        ResponseBody body = response.body();
        body.getClass();
        try {
            editor = ((CacheResponseBody) body).getSnapshot().edit();
            if (editor == null) {
                return;
            }
            try {
                entry.writeTo(editor);
                editor.commit();
            } catch (IOException unused) {
                abortQuietly(editor);
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    public final Iterator<String> urls() {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Entry {
        public static final Companion Companion = new Companion(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.Companion;
            sb.append(companion.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        public Entry(ut4 ut4Var) {
            ut4Var.getClass();
            try {
                s04 s04Var = new s04(ut4Var);
                String w = s04Var.w(Long.MAX_VALUE);
                HttpUrl parse = HttpUrl.Companion.parse(w);
                if (parse == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(w));
                    Platform.Companion.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = parse;
                this.requestMethod = s04Var.w(Long.MAX_VALUE);
                Headers.Builder builder = new Headers.Builder();
                int readInt$okhttp = Cache.Companion.readInt$okhttp(s04Var);
                for (int i = 0; i < readInt$okhttp; i++) {
                    builder.addLenient$okhttp(s04Var.w(Long.MAX_VALUE));
                }
                this.varyHeaders = builder.build();
                StatusLine parse2 = StatusLine.Companion.parse(s04Var.w(Long.MAX_VALUE));
                this.protocol = parse2.protocol;
                this.code = parse2.code;
                this.message = parse2.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt$okhttp2 = Cache.Companion.readInt$okhttp(s04Var);
                for (int i2 = 0; i2 < readInt$okhttp2; i2++) {
                    builder2.addLenient$okhttp(s04Var.w(Long.MAX_VALUE));
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                this.responseHeaders = builder2.build();
                if (this.url.isHttps()) {
                    String w2 = s04Var.w(Long.MAX_VALUE);
                    if (w2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + w2 + '\"');
                    }
                    this.handshake = Handshake.Companion.get(!s04Var.p() ? TlsVersion.Companion.forJavaName(s04Var.w(Long.MAX_VALUE)) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(s04Var.w(Long.MAX_VALUE)), readCertificateList(s04Var), readCertificateList(s04Var));
                } else {
                    this.handshake = null;
                }
                ut4Var.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    i42.h0(ut4Var, th);
                    throw th2;
                }
            }
        }

        private final List<Certificate> readCertificateList(mz mzVar) {
            int readInt$okhttp = Cache.Companion.readInt$okhttp(mzVar);
            if (readInt$okhttp == -1) {
                return o91.I;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                for (int i = 0; i < readInt$okhttp; i++) {
                    String L = mzVar.L();
                    cz czVar = new cz();
                    h00 h00Var = h00.L;
                    byte[] a = a.a(L);
                    h00 h00Var2 = a != null ? new h00(a) : null;
                    if (h00Var2 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    czVar.c0(h00Var2);
                    arrayList.add(certificateFactory.generateCertificate(new bz(czVar)));
                }
                return arrayList;
            } catch (CertificateException e) {
                zl1.g(e.getMessage());
                return null;
            }
        }

        private final void writeCertList(lz lzVar, List<? extends Certificate> list) {
            try {
                lzVar.V(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    h00 h00Var = h00.L;
                    encoded.getClass();
                    lzVar.B(jp.w(encoded).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                zl1.g(e.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            request.getClass();
            response.getClass();
            return j42.c(this.url, request.url()) && j42.c(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            snapshot.getClass();
            String str = this.responseHeaders.get(UtilsKt.CONTENT_TYPE);
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request(this.url, this.varyHeaders, this.requestMethod, null, 8, null)).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) {
            editor.getClass();
            q04 l = sv2.l(editor.newSink(0));
            try {
                l.B(this.url.toString());
                l.writeByte(10);
                l.B(this.requestMethod);
                l.writeByte(10);
                l.V(this.varyHeaders.size());
                l.writeByte(10);
                int size = this.varyHeaders.size();
                for (int i = 0; i < size; i++) {
                    l.B(this.varyHeaders.name(i));
                    l.B(": ");
                    l.B(this.varyHeaders.value(i));
                    l.writeByte(10);
                }
                l.B(new StatusLine(this.protocol, this.code, this.message).toString());
                l.writeByte(10);
                l.V(this.responseHeaders.size() + 2);
                l.writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    l.B(this.responseHeaders.name(i2));
                    l.B(": ");
                    l.B(this.responseHeaders.value(i2));
                    l.writeByte(10);
                }
                l.B(SENT_MILLIS);
                l.B(": ");
                l.V(this.sentRequestMillis);
                l.writeByte(10);
                l.B(RECEIVED_MILLIS);
                l.B(": ");
                l.V(this.receivedResponseMillis);
                l.writeByte(10);
                if (this.url.isHttps() && this.handshake != null) {
                    l.writeByte(10);
                    l.B(this.handshake.cipherSuite().javaName());
                    l.writeByte(10);
                    writeCertList(l, this.handshake.peerCertificates());
                    writeCertList(l, this.handshake.localCertificates());
                    l.B(this.handshake.tlsVersion().javaName());
                    l.writeByte(10);
                }
                l.close();
            } finally {
            }
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Companion {
            public /* synthetic */ Companion(er0 er0Var) {
                this();
            }

            private Companion() {
            }
        }

        public Entry(Response response) {
            response.getClass();
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if ("Vary".equalsIgnoreCase(headers.name(i))) {
                    String value = headers.value(i);
                    if (treeSet == null) {
                        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                        comparator.getClass();
                        treeSet = new TreeSet(comparator);
                    }
                    Iterator it = jx4.Y(value, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(jx4.g0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? t91.I : treeSet;
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Headers.EMPTY;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i));
                }
            }
            return builder.build();
        }

        public final boolean hasVaryAll(Response response) {
            response.getClass();
            return varyFields(response.headers()).contains("*");
        }

        public final String key(HttpUrl httpUrl) {
            httpUrl.getClass();
            h00 h00Var = h00.L;
            return jp.h(httpUrl.toString()).c("MD5").e();
        }

        public final int readInt$okhttp(mz mzVar) {
            mzVar.getClass();
            try {
                long s = mzVar.s();
                String L = mzVar.L();
                if (s >= 0 && s <= 2147483647L && L.length() <= 0) {
                    return (int) s;
                }
                throw new IOException("expected an int but was \"" + s + L + '\"');
            } catch (NumberFormatException e) {
                zl1.g(e.getMessage());
                return 0;
            }
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
            response.getClass();
            headers.getClass();
            request.getClass();
            Set<String> varyFields = varyFields(response.headers());
            if ((varyFields instanceof Collection) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!j42.c(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }

        public final Headers varyHeaders(Response response) {
            response.getClass();
            Response networkResponse = response.networkResponse();
            networkResponse.getClass();
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(ke1 ke1Var, ok3 ok3Var, long j) {
        this(ok3Var, j, ke1Var, TaskRunner.INSTANCE);
        ke1Var.getClass();
        ok3Var.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Cache(java.io.File r3, long r4) {
        /*
            r2 = this;
            r3.getClass()
            ke1 r0 = defpackage.ke1.SYSTEM
            java.lang.String r1 = defpackage.ok3.J
            ok3 r3 = defpackage.o63.g(r3)
            r2.<init>(r0, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache.<init>(java.io.File, long):void");
    }
}
