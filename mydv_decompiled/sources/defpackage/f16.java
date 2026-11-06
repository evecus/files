package defpackage;

import androidx.media3.exoplayer.Renderer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f16 extends ke1 {
    public static final ok3 L;
    public final ok3 I;
    public final ke1 J;
    public final LinkedHashMap K;

    static {
        String str = ok3.J;
        L = o63.f("/");
    }

    public f16(ok3 ok3Var, ke1 ke1Var, LinkedHashMap linkedHashMap) {
        this.I = ok3Var;
        this.J = ke1Var;
        this.K = linkedHashMap;
    }

    @Override // defpackage.ke1
    public final eq4 appendingSink(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.ke1
    public final void atomicMove(ok3 ok3Var, ok3 ok3Var2) {
        ok3Var.getClass();
        ok3Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.ke1
    public final ok3 canonicalize(ok3 ok3Var) {
        ok3Var.getClass();
        ok3 ok3Var2 = L;
        ok3Var2.getClass();
        ok3 a = f.a(ok3Var2, ok3Var, true);
        if (this.K.containsKey(a)) {
            return a;
        }
        throw new FileNotFoundException(String.valueOf(ok3Var));
    }

    @Override // defpackage.ke1
    public final void createDirectory(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.ke1
    public final void createSymlink(ok3 ok3Var, ok3 ok3Var2) {
        ok3Var.getClass();
        ok3Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.ke1
    public final void delete(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    public final List e(ok3 ok3Var, boolean z) {
        e16 e16Var = (e16) this.K.get(L.e(ok3Var, true));
        if (e16Var != null) {
            return o70.r1(e16Var.q);
        }
        if (!z) {
            return null;
        }
        zl1.g(r7.y(ok3Var, "not a directory: "));
        return null;
    }

    @Override // defpackage.ke1
    public final List list(ok3 ok3Var) {
        ok3Var.getClass();
        List e = e(ok3Var, true);
        e.getClass();
        return e;
    }

    @Override // defpackage.ke1
    public final List listOrNull(ok3 ok3Var) {
        ok3Var.getClass();
        return e(ok3Var, false);
    }

    @Override // defpackage.ke1
    public final he1 metadataOrNull(ok3 ok3Var) {
        boolean z;
        Long l;
        Long l2;
        Long l3;
        Long valueOf;
        Throwable th;
        Throwable th2;
        ok3Var.getClass();
        ok3 ok3Var2 = L;
        ok3Var2.getClass();
        e16 e16Var = (e16) this.K.get(f.a(ok3Var2, ok3Var, true));
        if (e16Var == null) {
            return null;
        }
        long j = e16Var.h;
        if (j != -1) {
            ge1 openReadOnly = this.J.openReadOnly(this.I);
            try {
                s04 s04Var = new s04(openReadOnly.t(j));
                try {
                    e16Var = g06.h(s04Var, e16Var);
                    e16Var.getClass();
                    try {
                        s04Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        s04Var.close();
                    } catch (Throwable th5) {
                        sv2.i(th4, th5);
                    }
                    th2 = th4;
                    e16Var = null;
                }
            } catch (Throwable th6) {
                if (openReadOnly != null) {
                    try {
                        openReadOnly.close();
                    } catch (Throwable th7) {
                        sv2.i(th6, th7);
                    }
                }
                th = th6;
                e16Var = null;
            }
            if (th2 != null) {
                throw th2;
            }
            try {
                openReadOnly.close();
                th = null;
            } catch (Throwable th8) {
                th = th8;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z2 = e16Var.b;
        boolean z3 = !z2;
        Long valueOf2 = z2 ? null : Long.valueOf(e16Var.f);
        Long l4 = e16Var.m;
        if (l4 != null) {
            l = Long.valueOf((l4.longValue() / Renderer.DEFAULT_DURATION_TO_PROGRESS_US) - 11644473600000L);
            z = true;
        } else {
            if (e16Var.p != null) {
                z = true;
                l = Long.valueOf(r0.intValue() * 1000);
            } else {
                z = true;
                l = null;
            }
        }
        Long l5 = e16Var.k;
        if (l5 != null) {
            l2 = Long.valueOf((l5.longValue() / Renderer.DEFAULT_DURATION_TO_PROGRESS_US) - 11644473600000L);
        } else {
            if (e16Var.n != null) {
                l2 = Long.valueOf(r2.intValue() * 1000);
            } else {
                int i = e16Var.j;
                if (i != -1) {
                    int i2 = e16Var.i;
                    if (i != -1) {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        l2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l2 = null;
            }
        }
        Long l6 = e16Var.l;
        if (l6 != null) {
            valueOf = Long.valueOf((l6.longValue() / Renderer.DEFAULT_DURATION_TO_PROGRESS_US) - 11644473600000L);
        } else {
            if (e16Var.o == null) {
                l3 = null;
                return new he1(z3, z2, null, valueOf2, l, l2, l3);
            }
            valueOf = Long.valueOf(r1.intValue() * 1000);
        }
        l3 = valueOf;
        return new he1(z3, z2, null, valueOf2, l, l2, l3);
    }

    @Override // defpackage.ke1
    public final ge1 openReadOnly(ok3 ok3Var) {
        ok3Var.getClass();
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.ke1
    public final ge1 openReadWrite(ok3 ok3Var, boolean z, boolean z2) {
        ok3Var.getClass();
        throw new IOException("zip entries are not writable");
    }

    @Override // defpackage.ke1
    public final eq4 sink(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.ke1
    public final ut4 source(ok3 ok3Var) {
        s04 s04Var;
        Throwable th;
        ok3Var.getClass();
        ok3 ok3Var2 = L;
        ok3Var2.getClass();
        e16 e16Var = (e16) this.K.get(f.a(ok3Var2, ok3Var, true));
        if (e16Var == null) {
            throw new FileNotFoundException(r7.y(ok3Var, "no such file: "));
        }
        long j = e16Var.f;
        ge1 openReadOnly = this.J.openReadOnly(this.I);
        try {
            s04Var = new s04(openReadOnly.t(e16Var.h));
            try {
                openReadOnly.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (Throwable th4) {
                    sv2.i(th3, th4);
                }
            }
            s04Var = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        s04Var.getClass();
        g06.h(s04Var, null);
        return e16Var.g == 0 ? new gj2(s04Var, j, false) : new gj2(new h02(new gj2(s04Var, e16Var.e, false), new Inflater(true)), j, true);
    }
}
