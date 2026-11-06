package okhttp3.logging;

import defpackage.er0;
import defpackage.j42;
import defpackage.sp0;
import defpackage.su0;
import defpackage.t91;
import defpackage.u70;
import defpackage.ya1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;
    private volatile Set<String> queryParamsNameToRedact;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Level {
        private static final /* synthetic */ ya1 $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level NONE = new Level("NONE", 0);
        public static final Level BASIC = new Level("BASIC", 1);
        public static final Level HEADERS = new Level("HEADERS", 2);
        public static final Level BODY = new Level("BODY", 3);

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{NONE, BASIC, HEADERS, BODY};
        }

        static {
            Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = sp0.I($values);
        }

        private Level(String str, int i) {
        }

        public static ya1 getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Logger {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String str) {
                    str.getClass();
                    Platform.log$default(Platform.Companion.get(), str, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void log(String str);
    }

    public HttpLoggingInterceptor(Logger logger) {
        logger.getClass();
        this.logger = logger;
        t91 t91Var = t91.I;
        this.headersToRedact = t91Var;
        this.queryParamsNameToRedact = t91Var;
        this.level = Level.NONE;
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || str.equalsIgnoreCase("identity") || str.equalsIgnoreCase("gzip")) ? false : true;
    }

    private final boolean bodyIsStreaming(Response response) {
        MediaType contentType = response.body().contentType();
        return contentType != null && j42.c(contentType.type(), "text") && j42.c(contentType.subtype(), "event-stream");
    }

    private final void logHeader(Headers headers, int i) {
        String value = this.headersToRedact.contains(headers.name(i)) ? "██" : headers.value(i);
        this.logger.log(headers.name(i) + ": " + value);
    }

    @su0
    /* renamed from: -deprecated_level, reason: not valid java name */
    public final Level m363deprecated_level() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x031d  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r27) {
        /*
            Method dump skipped, instructions count: 1149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    public final void level(Level level) {
        level.getClass();
        this.level = level;
    }

    public final void redactHeader(String str) {
        str.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        u70.I0(treeSet, this.headersToRedact);
        treeSet.add(str);
        this.headersToRedact = treeSet;
    }

    public final void redactQueryParams(String... strArr) {
        strArr.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        u70.I0(treeSet, this.queryParamsNameToRedact);
        List asList = Arrays.asList(strArr);
        asList.getClass();
        treeSet.addAll(asList);
        this.queryParamsNameToRedact = treeSet;
    }

    public final String redactUrl$logging_interceptor(HttpUrl httpUrl) {
        httpUrl.getClass();
        if (this.queryParamsNameToRedact.isEmpty() || httpUrl.querySize() == 0) {
            return httpUrl.toString();
        }
        HttpUrl.Builder query = httpUrl.newBuilder().query(null);
        int querySize = httpUrl.querySize();
        for (int i = 0; i < querySize; i++) {
            String queryParameterName = httpUrl.queryParameterName(i);
            query.addEncodedQueryParameter(queryParameterName, this.queryParamsNameToRedact.contains(queryParameterName) ? "██" : httpUrl.queryParameterValue(i));
        }
        return query.toString();
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        level.getClass();
        this.level = level;
        return this;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i, er0 er0Var) {
        this((i & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
