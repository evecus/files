package defpackage;

import coil3.network.internal.UtilsKt;
import j$.util.DesugarTimeZone;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.http2.Http2Stream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h63 implements Closeable {
    public final int I;
    public final String J;
    public final ByteArrayInputStream K;
    public final long L;
    public final f63 M = new f63(this);
    public final HashMap N = new HashMap();
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;

    public h63(int i, String str, ByteArrayInputStream byteArrayInputStream, long j) {
        this.I = i;
        this.J = str;
        this.K = byteArrayInputStream;
        this.L = j;
        this.P = j < 0;
        this.R = true;
    }

    public static void y(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final void A(OutputStream outputStream) {
        int i;
        String str = this.J;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        int i2 = this.I;
        try {
            if (i2 == 0) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, new b63(str).b())), false);
            PrintWriter append = printWriter.append("HTTP/1.1 ");
            StringBuilder sb = new StringBuilder("");
            switch (i2) {
                case 1:
                    i = HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS;
                    break;
                case 2:
                    i = 200;
                    break;
                case 3:
                    i = 201;
                    break;
                case 4:
                    i = 202;
                    break;
                case 5:
                    i = 204;
                    break;
                case 6:
                    i = 206;
                    break;
                case 7:
                    i = 207;
                    break;
                case 8:
                    i = 301;
                    break;
                case 9:
                    i = 302;
                    break;
                case 10:
                    i = 303;
                    break;
                case 11:
                    i = UtilsKt.HTTP_RESPONSE_NOT_MODIFIED;
                    break;
                case 12:
                    i = HttpStatusCodesKt.HTTP_TEMP_REDIRECT;
                    break;
                case 13:
                    i = 400;
                    break;
                case 14:
                    i = 401;
                    break;
                case 15:
                    i = 403;
                    break;
                case 16:
                    i = 404;
                    break;
                case 17:
                    i = 405;
                    break;
                case 18:
                    i = 406;
                    break;
                case 19:
                    i = 408;
                    break;
                case 20:
                    i = 409;
                    break;
                case 21:
                    i = 410;
                    break;
                case 22:
                    i = 411;
                    break;
                case 23:
                    i = 412;
                    break;
                case 24:
                    i = 413;
                    break;
                case 25:
                    i = 415;
                    break;
                case 26:
                    i = 416;
                    break;
                case 27:
                    i = 417;
                    break;
                case 28:
                    i = 429;
                    break;
                case 29:
                    i = 500;
                    break;
                case 30:
                    i = 501;
                    break;
                case 31:
                    i = 503;
                    break;
                case 32:
                    i = 505;
                    break;
                default:
                    throw null;
            }
            sb.append(i);
            sb.append(" ");
            sb.append(i82.L(i2));
            append.append(sb.toString()).append(" \r\n");
            if (str != null) {
                y(printWriter, UtilsKt.CONTENT_TYPE, str);
            }
            if (g("date") == null) {
                y(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map.Entry entry : this.M.entrySet()) {
                y(printWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            if (g("connection") == null) {
                y(printWriter, "Connection", this.R ? "keep-alive" : "close");
            }
            if (g("content-length") != null) {
                this.Q = false;
            }
            if (this.Q) {
                y(printWriter, "Content-Encoding", "gzip");
                this.P = true;
            }
            ByteArrayInputStream byteArrayInputStream = this.K;
            long j = byteArrayInputStream != null ? this.L : 0L;
            if (this.O != 5 && this.P) {
                y(printWriter, "Transfer-Encoding", "chunked");
            } else if (!this.Q) {
                j = F(printWriter, j);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (this.O != 5 && this.P) {
                g63 g63Var = new g63(outputStream);
                if (this.Q) {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(g63Var);
                    E(gZIPOutputStream, -1L);
                    gZIPOutputStream.finish();
                } else {
                    E(g63Var, -1L);
                }
                g63Var.e();
            } else if (this.Q) {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                E(gZIPOutputStream2, -1L);
                gZIPOutputStream2.finish();
            } else {
                E(outputStream, j);
            }
            outputStream.flush();
            k63.c(byteArrayInputStream);
        } catch (IOException e) {
            k63.e.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    public final void E(OutputStream outputStream, long j) {
        byte[] bArr = new byte[16384];
        boolean z = j == -1;
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            long j2 = Http2Stream.EMIT_BUFFER_SIZE;
            if (!z) {
                j2 = Math.min(j, Http2Stream.EMIT_BUFFER_SIZE);
            }
            int read = this.K.read(bArr, 0, (int) j2);
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
            if (!z) {
                j -= read;
            }
        }
    }

    public final long F(PrintWriter printWriter, long j) {
        String g = g("content-length");
        if (g != null) {
            try {
                j = Long.parseLong(g);
            } catch (NumberFormatException unused) {
                k63.e.severe("content-length was no number ".concat(g));
            }
        }
        printWriter.print("Content-Length: " + j + "\r\n");
        return j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ByteArrayInputStream byteArrayInputStream = this.K;
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
        }
    }

    public final void e(String str, String str2) {
        this.M.put(str, str2);
    }

    public final String g(String str) {
        return (String) this.N.get(str.toLowerCase());
    }

    public final String n() {
        return this.J;
    }

    public final boolean t() {
        return "close".equals(g("connection"));
    }
}
