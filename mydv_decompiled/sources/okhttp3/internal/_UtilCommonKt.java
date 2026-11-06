package okhttp3.internal;

import androidx.media3.common.util.Log;
import defpackage.cz;
import defpackage.h00;
import defpackage.hf1;
import defpackage.j42;
import defpackage.jp;
import defpackage.jx4;
import defpackage.ke1;
import defpackage.lz;
import defpackage.mg3;
import defpackage.mk2;
import defpackage.mz;
import defpackage.o91;
import defpackage.ok3;
import defpackage.p70;
import defpackage.rm1;
import defpackage.sv2;
import defpackage.tm1;
import defpackage.vt0;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class _UtilCommonKt {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final mg3 UNICODE_BOMS;
    public static final String USER_AGENT = "okhttp/5.5.0";

    static {
        h00 h00Var = h00.L;
        UNICODE_BOMS = vt0.J(jp.g("efbbbf"), jp.g("feff"), jp.g("fffe0000"), jp.g("fffe"), jp.g("0000feff"));
    }

    public static final <E> void addIfAbsent(List<E> list, E e) {
        list.getClass();
        if (list.contains(e)) {
            return;
        }
        list.add(e);
    }

    public static final long and(int i, long j) {
        return j & i;
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder A = hf1.A(j, "length=", ", offset=");
            A.append(j2);
            A.append(", count=");
            A.append(j2);
            throw new ArrayIndexOutOfBoundsException(A.toString());
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        strArr.getClass();
        str.getClass();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static final void deleteContents(ke1 ke1Var, ok3 ok3Var) {
        ke1Var.getClass();
        ok3Var.getClass();
        try {
            IOException iOException = null;
            for (ok3 ok3Var2 : ke1Var.list(ok3Var)) {
                try {
                    if (ke1Var.metadata(ok3Var2).b) {
                        deleteContents(ke1Var, ok3Var2);
                    }
                    ke1Var.delete(ok3Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void deleteIfExists(ke1 ke1Var, ok3 ok3Var) {
        ke1Var.getClass();
        ok3Var.getClass();
        try {
            ke1Var.delete(ok3Var);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        while (i < i2) {
            if (jx4.E(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, tm1 tm1Var) {
        iterable.getClass();
        tm1Var.getClass();
        ArrayList arrayList = o91.I;
        for (T t : iterable) {
            if (((Boolean) tm1Var.invoke(t)).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                p70.w(arrayList).add(t);
            }
        }
        return arrayList;
    }

    public static final mg3 getUNICODE_BOMS() {
        return UNICODE_BOMS;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr.getClass();
        comparator.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void ignoreIoExceptions(rm1 rm1Var) {
        rm1Var.getClass();
        try {
            rm1Var.invoke();
        } catch (IOException unused) {
        }
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        strArr.getClass();
        str.getClass();
        comparator.getClass();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (j42.m(charAt, 31) <= 0 || j42.m(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        str.getClass();
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        str.getClass();
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final <T> List<T> interleave(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends T> it2 = iterable2.iterator();
        mk2 K = p70.K();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return p70.D(K);
            }
            if (it.hasNext()) {
                K.add(it.next());
            }
            if (it2.hasNext()) {
                K.add(it2.next());
            }
        }
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr.getClass();
        strArr2.getClass();
        comparator.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isCivilized(defpackage.ke1 r2, defpackage.ok3 r3) {
        /*
            r2.getClass()
            r3.getClass()
            eq4 r0 = r2.sink(r3)
            r2.delete(r3)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L20
            r2 = 1
            if (r0 == 0) goto L13
            r0.close()     // Catch: java.lang.Throwable -> L13
        L13:
            return r2
        L14:
            r1 = move-exception
            if (r0 == 0) goto L2b
            r0.close()     // Catch: java.lang.Throwable -> L1b
            goto L2b
        L1b:
            r0 = move-exception
            defpackage.sv2.i(r1, r0)
            goto L2b
        L20:
            if (r0 == 0) goto L29
            r0.close()     // Catch: java.lang.Throwable -> L26
            goto L29
        L26:
            r0 = move-exception
        L27:
            r1 = r0
            goto L2b
        L29:
            r0 = 0
            goto L27
        L2b:
            if (r1 != 0) goto L32
            r2.delete(r3)
            r2 = 0
            return r2
        L32:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal._UtilCommonKt.isCivilized(ke1, ok3):boolean");
    }

    public static final boolean isSensitiveHeader(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int readMedium(mz mzVar) {
        mzVar.getClass();
        return and(mzVar.readByte(), 255) | (and(mzVar.readByte(), 255) << 16) | (and(mzVar.readByte(), 255) << 8);
    }

    public static final int skipAll(cz czVar, byte b) {
        czVar.getClass();
        int i = 0;
        while (!czVar.p() && czVar.y(0L) == b) {
            i++;
            czVar.readByte();
        }
        return i;
    }

    public static final long toLongOrDefault(String str, long j) {
        str.getClass();
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Log.LOG_LEVEL_OFF;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String trimSubstring(String str, int i, int i2) {
        str.getClass();
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        return str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        exc.getClass();
        list.getClass();
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            sv2.i(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(lz lzVar, int i) {
        lzVar.getClass();
        lzVar.writeByte((i >>> 16) & 255);
        lzVar.writeByte((i >>> 8) & 255);
        lzVar.writeByte(i & 255);
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
