package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jr1 {
    public boolean A;
    public RectF B;
    public final lr1 a;
    public Outline f;
    public float j;
    public yg3 k;
    public yd l;
    public yd m;
    public boolean n;
    public r10 o;
    public pd p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public iu0 b = i42.h;
    public da2 c = da2.I;
    public tm1 d = hh.Q;
    public final kh e = new kh(this, 4);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final f60 r = new f60();

    static {
        j42.c(Build.FINGERPRINT, "robolectric");
    }

    public jr1(lr1 lr1Var) {
        this.a = lr1Var;
        lr1Var.B(false);
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.A;
            Outline outline2 = null;
            lr1 lr1Var = this.a;
            if (z || lr1Var.I() > 0.0f) {
                yd ydVar = this.l;
                if (ydVar != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = ydVar instanceof yd;
                    if (!z2) {
                        zy.p("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = ydVar.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            k5.e(outline, ydVar);
                        } else {
                            if (!z2) {
                                zy.p("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        outline.offset(this.v, this.w);
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = ydVar;
                    if (outline != null) {
                        outline.setAlpha(lr1Var.getAlpha());
                        outline2 = outline;
                    }
                    lr1Var.f(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.n && this.A) {
                        lr1Var.B(false);
                        lr1Var.h();
                    } else {
                        lr1Var.B(this.A);
                    }
                } else {
                    lr1Var.B(this.A);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long b0 = ut0.b0(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        b0 = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (b0 >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (b0 & 4294967295L)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(lr1Var.getAlpha());
                    lr1Var.f(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i4)) << 32));
                }
            } else {
                lr1Var.B(false);
                lr1Var.f(null, 0L);
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.s && this.q == 0) {
            f60 f60Var = this.r;
            jr1 jr1Var = f60Var.a;
            if (jr1Var != null) {
                jr1Var.q--;
                jr1Var.b();
                f60Var.a = null;
            }
            o43 o43Var = f60Var.c;
            if (o43Var != null) {
                Object[] objArr = o43Var.b;
                long[] jArr = o43Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.q--;
                                    ((jr1) objArr[(i << 3) + i3]).b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                o43Var.e();
            }
            this.a.h();
        }
    }

    public final void c(y31 y31Var) {
        f60 f60Var = this.r;
        f60Var.b = f60Var.a;
        o43 o43Var = f60Var.c;
        if (o43Var != null && o43Var.c()) {
            o43 o43Var2 = f60Var.d;
            if (o43Var2 == null) {
                o43 o43Var3 = ka4.a;
                o43Var2 = new o43();
                f60Var.d = o43Var2;
            }
            o43Var2.j(o43Var);
            o43Var.e();
        }
        f60Var.e = true;
        this.d.invoke(y31Var);
        f60Var.e = false;
        jr1 jr1Var = f60Var.b;
        if (jr1Var != null) {
            jr1Var.q--;
            jr1Var.b();
        }
        o43 o43Var4 = f60Var.d;
        if (o43Var4 == null || !o43Var4.c()) {
            return;
        }
        Object[] objArr = o43Var4.b;
        long[] jArr = o43Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.q--;
                            ((jr1) objArr[(i << 3) + i3]).b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        o43Var4.e();
    }

    public final yg3 d() {
        yg3 wg3Var;
        yg3 yg3Var = this.k;
        yd ydVar = this.l;
        if (yg3Var != null) {
            return yg3Var;
        }
        if (ydVar != null) {
            vg3 vg3Var = new vg3(ydVar);
            this.k = vg3Var;
            return vg3Var;
        }
        long b0 = ut0.b0(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            b0 = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (b0 >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (b0 & 4294967295L)) + intBitsToFloat2;
        if (this.j > 0.0f) {
            wg3Var = new xg3(sv2.h(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            wg3Var = new wg3(new m14(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = wg3Var;
        return wg3Var;
    }

    public final void e(iu0 iu0Var, da2 da2Var, long j, tm1 tm1Var) {
        boolean b = z22.b(this.u, j);
        lr1 lr1Var = this.a;
        if (!b) {
            this.u = j;
            long j2 = this.t;
            lr1Var.l((int) (j2 >> 32), (int) (j2 & 4294967295L), j);
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = iu0Var;
        this.c = da2Var;
        this.d = tm1Var;
        lr1Var.z(iu0Var, da2Var, this, this.e);
    }

    public final void f(long j, long j2, float f) {
        float f2 = this.v;
        float f3 = this.w;
        long f4 = pd3.f(j, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (pd3.c(this.h, f4) && fq4.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = f4;
        this.i = j2;
        this.j = f;
        a();
    }
}
