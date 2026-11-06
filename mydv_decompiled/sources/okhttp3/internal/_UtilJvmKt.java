package okhttp3.internal;

import defpackage.av5;
import defpackage.cz;
import defpackage.j42;
import defpackage.jp;
import defpackage.jx4;
import defpackage.l22;
import defpackage.mz;
import defpackage.nt3;
import defpackage.o91;
import defpackage.p70;
import defpackage.rm1;
import defpackage.s83;
import defpackage.sr;
import defpackage.t41;
import defpackage.tm1;
import defpackage.u22;
import defpackage.ut0;
import defpackage.ut4;
import defpackage.z50;
import defpackage.zy;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http2.Header;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class _UtilJvmKt {
    public static final TimeZone UTC;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        UTC = timeZone;
        assertionsEnabled = false;
        okHttpName = jx4.T(jx4.S(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        eventListener.getClass();
        return new sr(eventListener, (byte) 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener asFactory$lambda$0(EventListener eventListener, Call call) {
        call.getClass();
        return eventListener;
    }

    public static final void assertLockNotHeld(Dispatcher dispatcher) {
        dispatcher.getClass();
        if (assertionsEnabled && Thread.holdsLock(dispatcher)) {
            av5.b(Thread.currentThread().getName(), " MUST NOT hold lock on ", dispatcher);
        }
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        httpUrl.getClass();
        httpUrl2.getClass();
        return j42.c(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && j42.c(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        str.getClass();
        timeUnit.getClass();
        if (j < 0) {
            zy.e(str.concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            s83.h(str.concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        s83.h(str.concat(" too small"));
        return 0;
    }

    /* renamed from: checkDuration-HG0u8IE, reason: not valid java name */
    public static final int m351checkDurationHG0u8IE(String str, long j) {
        str.getClass();
        jp jpVar = t41.J;
        if (j < 0) {
            zy.e(str.concat(" < 0"));
            return 0;
        }
        long d = t41.d(j);
        if (d > 2147483647L) {
            s83.h(str.concat(" too large"));
            return 0;
        }
        if (d != 0 || j <= 0) {
            return (int) d;
        }
        s83.h(str.concat(" too small"));
        return 0;
    }

    public static final void closeQuietly(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!j42.c(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean discard(ut4 ut4Var, int i, TimeUnit timeUnit) {
        ut4Var.getClass();
        timeUnit.getClass();
        try {
            return skipAll(ut4Var, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String format(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long headersContentLength(Response response) {
        response.getClass();
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return _UtilCommonKt.toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        tArr.getClass();
        return toImmutableList(tArr);
    }

    public static final boolean isHealthy(Socket socket, mz mzVar) {
        socket.getClass();
        mzVar.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !mzVar.p();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final Charset readBomAsCharset(mz mzVar, Charset charset) {
        mzVar.getClass();
        charset.getClass();
        int P = mzVar.P(_UtilCommonKt.getUNICODE_BOMS());
        if (P == -1) {
            return charset;
        }
        if (P == 0) {
            return z50.a;
        }
        if (P == 1) {
            return z50.b;
        }
        if (P == 2) {
            Charset charset2 = z50.a;
            Charset charset3 = z50.e;
            if (charset3 != null) {
                return charset3;
            }
            Charset forName = Charset.forName("UTF-32LE");
            forName.getClass();
            z50.e = forName;
            return forName;
        }
        if (P == 3) {
            return z50.c;
        }
        if (P != 4) {
            throw new AssertionError();
        }
        Charset charset4 = z50.a;
        Charset charset5 = z50.f;
        if (charset5 != null) {
            return charset5;
        }
        Charset forName2 = Charset.forName("UTF-32BE");
        forName2.getClass();
        z50.f = forName2;
        return forName2;
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        T t;
        Object readFieldOrNull;
        obj.getClass();
        cls.getClass();
        str.getClass();
        Class<?> cls2 = obj.getClass();
        while (true) {
            t = null;
            if (cls2.equals(Object.class)) {
                if (str.equals("delegate") || (readFieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(readFieldOrNull, cls, str);
            }
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    break;
                }
                t = cls.cast(obj2);
                break;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
                cls2.getClass();
            }
        }
        return t;
    }

    public static final boolean skipAll(ut4 ut4Var, int i, TimeUnit timeUnit) {
        ut4Var.getClass();
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = ut4Var.timeout().hasDeadline() ? ut4Var.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        ut4Var.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i)) + nanoTime);
        try {
            cz czVar = new cz();
            while (ut4Var.read(czVar, 8192L) != -1) {
                czVar.e();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                ut4Var.timeout().clearDeadline();
                return true;
            }
            ut4Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                ut4Var.timeout().clearDeadline();
                return false;
            }
            ut4Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                ut4Var.timeout().clearDeadline();
            } else {
                ut4Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static final <T> T testAndSet(AtomicReference<T> atomicReference, T t, tm1 tm1Var) {
        T t2;
        atomicReference.getClass();
        tm1Var.getClass();
        do {
            t2 = atomicReference.get();
            if (!((Boolean) tm1Var.invoke(t2)).booleanValue()) {
                break;
            }
        } while (!nt3.t(atomicReference, t2, t));
        return t2;
    }

    public static final ThreadFactory threadFactory(final String str, final boolean z) {
        str.getClass();
        return new ThreadFactory() { // from class: l16
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadFactory$lambda$0;
                threadFactory$lambda$0 = _UtilJvmKt.threadFactory$lambda$0(str, z, runnable);
                return threadFactory$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread threadFactory$lambda$0(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final void threadName(String str, rm1 rm1Var) {
        str.getClass();
        rm1Var.getClass();
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            rm1Var.invoke();
        } finally {
            currentThread.setName(name);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        headers.getClass();
        u22 c0 = ut0.c0(0, headers.size());
        ArrayList arrayList = new ArrayList(p70.J(c0, 10));
        Iterator it = c0.iterator();
        while (it.hasNext()) {
            int nextInt = ((l22) it).nextInt();
            arrayList.add(new Header(headers.name(nextInt), headers.value(nextInt)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        list.getClass();
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().s(), header.component2().s());
        }
        return builder.build();
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        hexString.getClass();
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String host;
        httpUrl.getClass();
        if (jx4.D(httpUrl.host(), ":", false)) {
            host = "[" + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return host;
        }
        return host + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return o91.I;
        }
        if (list.size() == 1) {
            List<T> singletonList = Collections.singletonList(list.get(0));
            singletonList.getClass();
            return singletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List asList = Arrays.asList(array);
        asList.getClass();
        List<T> unmodifiableList = DesugarCollections.unmodifiableList(asList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final <T> List<T> unmodifiable(List<? extends T> list) {
        list.getClass();
        List<T> unmodifiableList = DesugarCollections.unmodifiableList(list);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        hexString.getClass();
        return hexString;
    }

    public static final <T> Set<T> unmodifiable(Set<? extends T> set) {
        set.getClass();
        Set<T> unmodifiableSet = DesugarCollections.unmodifiableSet(set);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public static final <K, V> Map<K, V> unmodifiable(Map<K, ? extends V> map) {
        map.getClass();
        Map<K, V> unmodifiableMap = DesugarCollections.unmodifiableMap(map);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        serverSocket.getClass();
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final <T> List<T> toImmutableList(T[] tArr) {
        if (tArr != null && tArr.length != 0) {
            if (tArr.length == 1) {
                List<T> singletonList = Collections.singletonList(tArr[0]);
                singletonList.getClass();
                return singletonList;
            }
            Object[] objArr = (Object[]) tArr.clone();
            objArr.getClass();
            List asList = Arrays.asList(objArr);
            asList.getClass();
            List<T> unmodifiableList = DesugarCollections.unmodifiableList(asList);
            unmodifiableList.getClass();
            return unmodifiableList;
        }
        return o91.I;
    }

    public static final void skipAll(mz mzVar) {
        mzVar.getClass();
        while (!mzVar.p()) {
            mzVar.skip(mzVar.a().J);
        }
    }
}
