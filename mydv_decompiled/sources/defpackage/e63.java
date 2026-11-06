package defpackage;

import coil3.network.internal.UtilsKt;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.net.ssl.SSLException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e63 {
    public final d63 a;
    public final OutputStream b;
    public final BufferedInputStream c;
    public int d;
    public int e;
    public String f;
    public int g;
    public HashMap h;
    public final HashMap i;
    public c63 j;
    public final String k;
    public String l;
    public final /* synthetic */ k63 m;

    public e63(k63 k63Var, d63 d63Var, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.m = k63Var;
        this.a = d63Var;
        this.c = new BufferedInputStream(inputStream, 8192);
        this.b = outputStream;
        this.k = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.i = new HashMap();
    }

    public static void b(String str, Map map) {
        String trim;
        String str2;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(61);
            if (indexOf >= 0) {
                trim = k63.a(nextToken.substring(0, indexOf)).trim();
                str2 = k63.a(nextToken.substring(indexOf + 1));
            } else {
                trim = k63.a(nextToken).trim();
                str2 = "";
            }
            List list = (List) map.get(trim);
            if (list == null) {
                list = new ArrayList();
                map.put(trim, list);
            }
            list.add(str2);
        }
    }

    public static int d(int i, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i) {
                return 0;
            }
            byte b = bArr[i3];
            if (b == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                return i3 + 4;
            }
            if (b == 10 && bArr[i4] == 10) {
                return i3 + 2;
            }
            i3 = i4;
        }
    }

    public final void a(BufferedReader bufferedReader, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        String a;
        try {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(readLine);
            if (!stringTokenizer.hasMoreTokens()) {
                throw new i63(13, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
            hashMap.put("method", stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreTokens()) {
                throw new i63(13, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(63);
            if (indexOf >= 0) {
                b(nextToken.substring(indexOf + 1), hashMap2);
                a = k63.a(nextToken.substring(0, indexOf));
            } else {
                a = k63.a(nextToken);
            }
            if (stringTokenizer.hasMoreTokens()) {
                this.l = stringTokenizer.nextToken();
            } else {
                this.l = "HTTP/1.1";
                k63.e.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
            }
            String readLine2 = bufferedReader.readLine();
            while (readLine2 != null && !readLine2.trim().isEmpty()) {
                int indexOf2 = readLine2.indexOf(58);
                if (indexOf2 >= 0) {
                    hashMap3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                }
                readLine2 = bufferedReader.readLine();
            }
            hashMap.put("uri", a);
        } catch (IOException e) {
            throw new i63("SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
        }
    }

    public final void c() {
        HashMap hashMap = this.i;
        k63 k63Var = this.m;
        d63 d63Var = this.a;
        BufferedInputStream bufferedInputStream = this.c;
        OutputStream outputStream = this.b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z = false;
                        this.d = 0;
                        this.e = 0;
                        bufferedInputStream.mark(8192);
                        try {
                            int read = bufferedInputStream.read(bArr, 0, 8192);
                            if (read == -1) {
                                k63.c(bufferedInputStream);
                                k63.c(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (read > 0) {
                                int i = this.e + read;
                                this.e = i;
                                int d = d(i, bArr);
                                this.d = d;
                                if (d > 0) {
                                    break;
                                }
                                int i2 = this.e;
                                read = bufferedInputStream.read(bArr, i2, 8192 - i2);
                            }
                            if (this.d < this.e) {
                                bufferedInputStream.reset();
                                bufferedInputStream.skip(this.d);
                            }
                            this.h = new HashMap();
                            hashMap.clear();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.e)));
                            HashMap hashMap2 = new HashMap();
                            a(bufferedReader, hashMap2, this.h, hashMap);
                            String str = this.k;
                            if (str != null) {
                                hashMap.put("remote-addr", str);
                                hashMap.put("http-client-ip", str);
                            }
                            int K = i82.K((String) hashMap2.get("method"));
                            this.g = K;
                            if (K == 0) {
                                throw new i63(13, "BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap2.get("method")) + " unhandled.");
                            }
                            this.f = (String) hashMap2.get("uri");
                            this.j = new c63(hashMap);
                            String str2 = (String) hashMap.get("connection");
                            boolean z2 = "HTTP/1.1".equals(this.l) && (str2 == null || !str2.matches("(?i).*close.*"));
                            h63 d2 = k63Var.d(this);
                            if (d2 == null) {
                                throw new i63(29, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                            }
                            String str3 = (String) hashMap.get("accept-encoding");
                            this.j.j();
                            d2.O = this.g;
                            if (k63.g(d2) && str3 != null && str3.contains("gzip")) {
                                z = true;
                            }
                            d2.Q = z;
                            d2.R = z2;
                            d2.A(outputStream);
                            if (!z2 || d2.t()) {
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            k63.c(d2);
                            d63Var.c();
                        } catch (SSLException e) {
                            throw e;
                        } catch (IOException unused) {
                            k63.c(bufferedInputStream);
                            k63.c(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (i63 e2) {
                        k63.b(UtilsKt.MIME_TYPE_TEXT_PLAIN, e2.I, e2.getMessage()).A(outputStream);
                        k63.c(outputStream);
                        k63.c(null);
                        d63Var.c();
                    }
                } catch (SSLException e3) {
                    k63.b(UtilsKt.MIME_TYPE_TEXT_PLAIN, 29, "SSL PROTOCOL FAILURE: " + e3.getMessage()).A(outputStream);
                    k63.c(outputStream);
                    k63.c(null);
                    d63Var.c();
                } catch (IOException e4) {
                    k63.b(UtilsKt.MIME_TYPE_TEXT_PLAIN, 29, "SERVER INTERNAL ERROR: IOException: " + e4.getMessage()).A(outputStream);
                    k63.c(outputStream);
                    k63.c(null);
                    d63Var.c();
                }
            } catch (SocketException e5) {
                throw e5;
            } catch (SocketTimeoutException e6) {
                throw e6;
            }
        } catch (Throwable th) {
            k63.c(null);
            d63Var.c();
            throw th;
        }
    }

    public final Map e() {
        return this.i;
    }

    public final BufferedInputStream f() {
        return this.c;
    }

    public final int g() {
        return this.g;
    }

    public final String h() {
        return this.f;
    }
}
