package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class k63 {
    public static final Logger e;
    public final short a;
    public volatile ServerSocket b;
    public Thread c;
    public final e60 d = new e60((byte) 1);

    static {
        Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
        Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
        Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
        e = Logger.getLogger(k63.class.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k63(int i) {
        this.a = i;
    }

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e2) {
            e.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e2);
            return null;
        }
    }

    public static h63 b(String str, int i, String str2) {
        byte[] bArr;
        b63 b63Var = new b63(str);
        if (str2 == null) {
            return new h63(i, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(b63Var.b()).newEncoder().canEncode(str2)) {
                b63Var = b63Var.c();
            }
            bArr = str2.getBytes(b63Var.b());
        } catch (UnsupportedEncodingException e2) {
            e.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e2);
            bArr = new byte[0];
        }
        return new h63(i, b63Var.a(), new ByteArrayInputStream(bArr), bArr.length);
    }

    public static final void c(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (!(obj instanceof ServerSocket)) {
                        throw new IllegalArgumentException("Unknown object to close");
                    }
                    ((ServerSocket) obj).close();
                }
            } catch (IOException e2) {
                e.log(Level.SEVERE, "Could not close", (Throwable) e2);
            }
        }
    }

    public static boolean g(h63 h63Var) {
        if (h63Var.n() != null) {
            return h63Var.n().toLowerCase().contains("text/") || h63Var.n().toLowerCase().contains("/json");
        }
        return false;
    }

    public abstract h63 d(e63 e63Var);

    /* JADX WARN: Incorrect condition in loop: B:3:0x002c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r3) {
        /*
            r2 = this;
            java.net.ServerSocket r0 = new java.net.ServerSocket
            r0.<init>()
            r2.b = r0
            java.net.ServerSocket r0 = r2.b
            r1 = 1
            r0.setReuseAddress(r1)
            j63 r0 = new j63
            r0.<init>(r2)
            java.lang.Thread r1 = new java.lang.Thread
            r1.<init>(r0)
            r2.c = r1
            r1.setDaemon(r3)
            java.lang.Thread r3 = r2.c
            java.lang.String r1 = "NanoHttpd Main Listener"
            r3.setName(r1)
            java.lang.Thread r2 = r2.c
            r2.start()
        L28:
            boolean r2 = defpackage.j63.a(r0)
            if (r2 != 0) goto L3a
            java.io.IOException r2 = defpackage.j63.b(r0)
            if (r2 != 0) goto L3a
            r2 = 10
            java.lang.Thread.sleep(r2)     // Catch: java.lang.Throwable -> L28
            goto L28
        L3a:
            java.io.IOException r2 = defpackage.j63.b(r0)
            if (r2 != 0) goto L41
            return
        L41:
            java.io.IOException r2 = defpackage.j63.b(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k63.e(boolean):void");
    }

    public final void f() {
        try {
            c(this.b);
            ArrayList arrayList = new ArrayList((List) this.d.c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((a63) obj).a();
            }
            Thread thread = this.c;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e2) {
            e.log(Level.SEVERE, "Could not stop all connections", (Throwable) e2);
        }
    }
}
