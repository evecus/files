package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a51 {
    public String a;
    public tm1 b;
    public tm1 c;
    public boolean d;
    public tm1 e;
    public tm1 f;
    public tm1 g;
    public tm1 h;
    public tm1 i;
    public tm1 j;

    public final b51 a() {
        tm1 tm1Var = this.f;
        if (tm1Var == null && this.g != null) {
            s83.h(r7.C("Color ", this.a, " has secondBackground defined, but background is not defined."));
            return null;
        }
        if (tm1Var == null && this.h != null) {
            s83.h(r7.C("Color ", this.a, " has contrastCurve defined, but background is not defined."));
            return null;
        }
        if (tm1Var != null && this.h == null) {
            s83.h(r7.C("Color ", this.a, " has background defined, but contrastCurve is not defined."));
            return null;
        }
        tm1 tm1Var2 = this.c;
        if (tm1Var2 == null) {
            tm1Var2 = tm1Var == null ? new yy0((byte) 9) : new y41(tm1Var, (byte) 0);
        }
        String str = this.a;
        str.getClass();
        tm1 tm1Var3 = this.b;
        tm1Var3.getClass();
        return new b51(str, tm1Var3, tm1Var2, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final a51 b(final b51 b51Var) {
        String str = this.a;
        String str2 = b51Var.a;
        boolean c = j42.c(str, str2);
        a90 a90Var = a90.L;
        if (!c) {
            zl1.j(r7.F("Attempting to extend color ", this.a, " with color ", str2, " of different name for spec version "), a90Var, ".");
            return null;
        }
        boolean z = this.d;
        boolean z2 = b51Var.d;
        String str3 = this.a;
        if (z != z2) {
            String str4 = DownloadService.KEY_FOREGROUND;
            String str5 = z ? "background" : DownloadService.KEY_FOREGROUND;
            if (z2) {
                str4 = "background";
            }
            StringBuilder F = r7.F("Attempting to extend color ", str3, " as a ", str5, " with color ");
            r7.N(F, str2, " as a ", str4, " for spec version ");
            zl1.j(F, a90Var, ".");
            return null;
        }
        a51 a51Var = new a51();
        str3.getClass();
        a51Var.a = str3;
        a51Var.d = this.d;
        final byte b = 0;
        a51Var.b = new tm1() { // from class: z41
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                k85 k85Var;
                byte b2 = b;
                a51 a51Var2 = this;
                b51 b51Var2 = b51Var;
                a90 a90Var2 = a90.L;
                switch (b2) {
                    case 0:
                        tm1 tm1Var = b51Var2.b;
                        k51 k51Var = (k51) obj;
                        k51Var.getClass();
                        tm1 tm1Var2 = k51Var.l == a90Var2 ? tm1Var : a51Var2.b;
                        return (tm1Var2 == null || (k85Var = (k85) tm1Var2.invoke(k51Var)) == null) ? (k85) tm1Var.invoke(k51Var) : k85Var;
                    case 1:
                        tm1 tm1Var3 = b51Var2.c;
                        k51 k51Var2 = (k51) obj;
                        k51Var2.getClass();
                        tm1 tm1Var4 = k51Var2.l == a90Var2 ? tm1Var3 : a51Var2.c;
                        return Double.valueOf(((Number) (tm1Var4 != null ? tm1Var4.invoke(k51Var2) : tm1Var3.invoke(k51Var2))).doubleValue());
                    case 2:
                        k51 k51Var3 = (k51) obj;
                        k51Var3.getClass();
                        tm1 tm1Var5 = k51Var3.l == a90Var2 ? b51Var2.e : a51Var2.e;
                        return tm1Var5 != null ? (Double) tm1Var5.invoke(k51Var3) : Double.valueOf(1.0d);
                    case 3:
                        k51 k51Var4 = (k51) obj;
                        k51Var4.getClass();
                        tm1 tm1Var6 = k51Var4.l == a90Var2 ? b51Var2.f : a51Var2.f;
                        if (tm1Var6 != null) {
                            return (b51) tm1Var6.invoke(k51Var4);
                        }
                        return null;
                    case 4:
                        k51 k51Var5 = (k51) obj;
                        k51Var5.getClass();
                        tm1 tm1Var7 = k51Var5.l == a90Var2 ? b51Var2.g : a51Var2.g;
                        if (tm1Var7 != null) {
                            return (b51) tm1Var7.invoke(k51Var5);
                        }
                        return null;
                    case 5:
                        k51 k51Var6 = (k51) obj;
                        k51Var6.getClass();
                        tm1 tm1Var8 = k51Var6.l == a90Var2 ? b51Var2.h : a51Var2.h;
                        if (tm1Var8 != null) {
                            return (lj0) tm1Var8.invoke(k51Var6);
                        }
                        return null;
                    case 6:
                        k51 k51Var7 = (k51) obj;
                        k51Var7.getClass();
                        tm1 tm1Var9 = k51Var7.l == a90Var2 ? b51Var2.i : a51Var2.i;
                        if (tm1Var9 != null) {
                            return (n85) tm1Var9.invoke(k51Var7);
                        }
                        return null;
                    default:
                        k51 k51Var8 = (k51) obj;
                        k51Var8.getClass();
                        tm1 tm1Var10 = k51Var8.l == a90Var2 ? b51Var2.j : a51Var2.j;
                        if (tm1Var10 != null) {
                            return (Double) tm1Var10.invoke(k51Var8);
                        }
                        return null;
                }
            }
        };
        final byte b2 = 1;
        a51Var.c = new tm1() { // from class: z41
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                k85 k85Var;
                byte b22 = b2;
                a51 a51Var2 = this;
                b51 b51Var2 = b51Var;
                a90 a90Var2 = a90.L;
                switch (b22) {
                    case 0:
                        tm1 tm1Var = b51Var2.b;
                        k51 k51Var = (k51) obj;
                        k51Var.getClass();
                        tm1 tm1Var2 = k51Var.l == a90Var2 ? tm1Var : a51Var2.b;
                        return (tm1Var2 == null || (k85Var = (k85) tm1Var2.invoke(k51Var)) == null) ? (k85) tm1Var.invoke(k51Var) : k85Var;
                    case 1:
                        tm1 tm1Var3 = b51Var2.c;
                        k51 k51Var2 = (k51) obj;
                        k51Var2.getClass();
                        tm1 tm1Var4 = k51Var2.l == a90Var2 ? tm1Var3 : a51Var2.c;
                        return Double.valueOf(((Number) (tm1Var4 != null ? tm1Var4.invoke(k51Var2) : tm1Var3.invoke(k51Var2))).doubleValue());
                    case 2:
                        k51 k51Var3 = (k51) obj;
                        k51Var3.getClass();
                        tm1 tm1Var5 = k51Var3.l == a90Var2 ? b51Var2.e : a51Var2.e;
                        return tm1Var5 != null ? (Double) tm1Var5.invoke(k51Var3) : Double.valueOf(1.0d);
                    case 3:
                        k51 k51Var4 = (k51) obj;
                        k51Var4.getClass();
                        tm1 tm1Var6 = k51Var4.l == a90Var2 ? b51Var2.f : a51Var2.f;
                        if (tm1Var6 != null) {
                            return (b51) tm1Var6.invoke(k51Var4);
                        }
                        return null;
                    case 4:
                        k51 k51Var5 = (k51) obj;
                        k51Var5.getClass();
                        tm1 tm1Var7 = k51Var5.l == a90Var2 ? b51Var2.g : a51Var2.g;
                        if (tm1Var7 != null) {
                            return (b51) tm1Var7.invoke(k51Var5);
                        }
                        return null;
                    case 5:
                        k51 k51Var6 = (k51) obj;
                        k51Var6.getClass();
                        tm1 tm1Var8 = k51Var6.l == a90Var2 ? b51Var2.h : a51Var2.h;
                        if (tm1Var8 != null) {
                            return (lj0) tm1Var8.invoke(k51Var6);
                        }
                        return null;
                    case 6:
                        k51 k51Var7 = (k51) obj;
                        k51Var7.getClass();
                        tm1 tm1Var9 = k51Var7.l == a90Var2 ? b51Var2.i : a51Var2.i;
                        if (tm1Var9 != null) {
                            return (n85) tm1Var9.invoke(k51Var7);
                        }
                        return null;
                    default:
                        k51 k51Var8 = (k51) obj;
                        k51Var8.getClass();
                        tm1 tm1Var10 = k51Var8.l == a90Var2 ? b51Var2.j : a51Var2.j;
                        if (tm1Var10 != null) {
                            return (Double) tm1Var10.invoke(k51Var8);
                        }
                        return null;
                }
            }
        };
        final byte b3 = 2;
        a51Var.e = new tm1() { // from class: z41
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                k85 k85Var;
                byte b22 = b3;
                a51 a51Var2 = this;
                b51 b51Var2 = b51Var;
                a90 a90Var2 = a90.L;
                switch (b22) {
                    case 0:
                        tm1 tm1Var = b51Var2.b;
                        k51 k51Var = (k51) obj;
                        k51Var.getClass();
                        tm1 tm1Var2 = k51Var.l == a90Var2 ? tm1Var : a51Var2.b;
                        return (tm1Var2 == null || (k85Var = (k85) tm1Var2.invoke(k51Var)) == null) ? (k85) tm1Var.invoke(k51Var) : k85Var;
                    case 1:
                        tm1 tm1Var3 = b51Var2.c;
                        k51 k51Var2 = (k51) obj;
                        k51Var2.getClass();
                        tm1 tm1Var4 = k51Var2.l == a90Var2 ? tm1Var3 : a51Var2.c;
                        return Double.valueOf(((Number) (tm1Var4 != null ? tm1Var4.invoke(k51Var2) : tm1Var3.invoke(k51Var2))).doubleValue());
                    case 2:
                        k51 k51Var3 = (k51) obj;
                        k51Var3.getClass();
                        tm1 tm1Var5 = k51Var3.l == a90Var2 ? b51Var2.e : a51Var2.e;
                        return tm1Var5 != null ? (Double) tm1Var5.invoke(k51Var3) : Double.valueOf(1.0d);
                    case 3:
                        k51 k51Var4 = (k51) obj;
                        k51Var4.getClass();
                        tm1 tm1Var6 = k51Var4.l == a90Var2 ? b51Var2.f : a51Var2.f;
                        if (tm1Var6 != null) {
                            return (b51) tm1Var6.invoke(k51Var4);
                        }
                        return null;
                    case 4:
                        k51 k51Var5 = (k51) obj;
                        k51Var5.getClass();
                        tm1 tm1Var7 = k51Var5.l == a90Var2 ? b51Var2.g : a51Var2.g;
                        if (tm1Var7 != null) {
                            return (b51) tm1Var7.invoke(k51Var5);
                        }
                        return null;
                    case 5:
                        k51 k51Var6 = (k51) obj;
                        k51Var6.getClass();
                        tm1 tm1Var8 = k51Var6.l == a90Var2 ? b51Var2.h : a51Var2.h;
                        if (tm1Var8 != null) {
                            return (lj0) tm1Var8.invoke(k51Var6);
                        }
                        return null;
                    case 6:
                        k51 k51Var7 = (k51) obj;
                        k51Var7.getClass();
                        tm1 tm1Var9 = k51Var7.l == a90Var2 ? b51Var2.i : a51Var2.i;
                        if (tm1Var9 != null) {
                            return (n85) tm1Var9.invoke(k51Var7);
                        }
                        return null;
                    default:
                        k51 k51Var8 = (k51) obj;
                        k51Var8.getClass();
                        tm1 tm1Var10 = k51Var8.l == a90Var2 ? b51Var2.j : a51Var2.j;
                        if (tm1Var10 != null) {
                            return (Double) tm1Var10.invoke(k51Var8);
                        }
                        return null;
                }
            }
        };
        final byte b4 = 3;
        a51Var.f = new tm1() { // from class: z41
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                k85 k85Var;
                byte b22 = b4;
                a51 a51Var2 = this;
                b51 b51Var2 = b51Var;
                a90 a90Var2 = a90.L;
                switch (b22) {
                    case 0:
                        tm1 tm1Var = b51Var2.b;
                        k51 k51Var = (k51) obj;
                        k51Var.getClass();
                        tm1 tm1Var2 = k51Var.l == a90Var2 ? tm1Var : a51Var2.b;
                        return (tm1Var2 == null || (k85Var = (k85) tm1Var2.invoke(k51Var)) == null) ? (k85) tm1Var.invoke(k51Var) : k85Var;
                    case 1:
                        tm1 tm1Var3 = b51Var2.c;
                        k51 k51Var2 = (k51) obj;
                        k51Var2.getClass();
                        tm1 tm1Var4 = k51Var2.l == a90Var2 ? tm1Var3 : a51Var2.c;
                        return Double.valueOf(((Number) (tm1Var4 != null ? tm1Var4.invoke(k51Var2) : tm1Var3.invoke(k51Var2))).doubleValue());
                    case 2:
                        k51 k51Var3 = (k51) obj;
                        k51Var3.getClass();
                        tm1 tm1Var5 = k51Var3.l == a90Var2 ? b51Var2.e : a51Var2.e;
                        return tm1Var5 != null ? (Double) tm1Var5.invoke(k51Var3) : Double.valueOf(1.0d);
                    case 3:
                        k51 k51Var4 = (k51) obj;
                        k51Var4.getClass();
                        tm1 tm1Var6 = k51Var4.l == a90Var2 ? b51Var2.f : a51Var2.f;
                        if (tm1Var6 != null) {
                            return (b51) tm1Var6.invoke(k51Var4);
                        }
                        return null;
                    case 4:
                        k51 k51Var5 = (k51) obj;
                        k51Var5.getClass();
                        tm1 tm1Var7 = k51Var5.l == a90Var2 ? b51Var2.g : a51Var2.g;
                        if (tm1Var7 != null) {
                            return (b51) tm1Var7.invoke(k51Var5);
                        }
                        return null;
                    case 5:
                        k51 k51Var6 = (k51) obj;
                        k51Var6.getClass();
                        tm1 tm1Var8 = k51Var6.l == a90Var2 ? b51Var2.h : a51Var2.h;
                        if (tm1Var8 != null) {
                            return (lj0) tm1Var8.invoke(k51Var6);
                        }
                        return null;
                    case 6:
                        k51 k51Var7 = (k51) obj;
                        k51Var7.getClass();
                        tm1 tm1Var9 = k51Var7.l == a90Var2 ? b51Var2.i : a51Var2.i;
                        if (tm1Var9 != null) {
                            return (n85) tm1Var9.invoke(k51Var7);
                        }
                        return null;
                    default:
                        k51 k51Var8 = (k51) obj;
                        k51Var8.getClass();
                        tm1 tm1Var10 = k51Var8.l == a90Var2 ? b51Var2.j : a51Var2.j;
                        if (tm1Var10 != null) {
                            return (Double) tm1Var10.invoke(k51Var8);
                        }
                        return null;
                }
            }
        };
        final byte b5 = 4;
        a51Var.g = new tm1() { // from class: z41
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                k85 k85Var;
                byte b22 = b5;
                a51 a51Var2 = this;
                b51 b51Var2 = b51Var;
                a90 a90Var2 = a90.L;
                switch (b22) {
                    case 0:
                        tm1 tm1Var = b51Var2.b;
                        k51 k51Var = (k51) obj;
                        k51Var.getClass();
                        tm1 tm1Var2 = k51Var.l == a90Var2 ? tm1Var : a51Var2.b;
                        return (tm1Var2 == null || (k85Var = (k85) tm1Var2.invoke(k51Var)) == null) ? (k85) tm1Var.invoke(k51Var) : k85Var;
                    case 1:
                        tm1 tm1Var3 = b51Var2.c;
                        k51 k51Var2 = (k51) obj;
                        k51Var2.getClass();
                        tm1 tm1Var4 = k51Var2.l == a90Var2 ? tm1Var3 : a51Var2.c;
                        return Double.valueOf(((Number) (tm1Var4 != null ? tm1Var4.invoke(k51Var2) : tm1Var3.invoke(k51Var2))).doubleValue());
                    case 2:
                        k51 k51Var3 = (k51) obj;
                        k51Var3.getClass();
                        tm1 tm1Var5 = k51Var3.l == a90Var2 ? b51Var2.e : a51Var2.e;
                        return tm1Var5 != null ? (Double) tm1Var5.invoke(k51Var3) : Double.valueOf(1.0d);
                    case 3:
                        k51 k51Var4 = (k51) obj;
                        k51Var4.getClass();
                        tm1 tm1Var6 = k51Var4.l == a90Var2 ? b51Var2.f : a51Var2.f;
                        if (tm1Var6 != null) {
                            return (b51) tm1Var6.invoke(k51Var4);
                        }
                        return null;
                    case 4:
                        k51 k51Var5 = (k51) obj;
                        k51Var5.getClass();
                        tm1 tm1Var7 = k51Var5.l == a90Var2 ? b51Var2.g : a51Var2.g;
                        if (tm1Var7 != null) {
                            return (b51) tm1Var7.invoke(k51Var5);
                        }
                        return null;
                    case 5:
                        k51 k51Var6 = (k51) obj;
                        k51Var6.getClass();
                        tm1 tm1Var8 = k51Var6.l == a90Var2 ? b51Var2.h : a51Var2.h;
                        if (tm1Var8 != null) {
                            return (lj0) tm1Var8.invoke(k51Var6);
                        }
                        return null;
                    case 6:
                        k51 k51Var7 = (k51) obj;
                        k51Var7.getClass();
                        tm1 tm1Var9 = k51Var7.l == a90Var2 ? b51Var2.i : a51Var2.i;
                        if (tm1Var9 != null) {
                            return (n85) tm1Var9.invoke(k51Var7);
                        }
                        return null;
                    default:
                        k51 k51Var8 = (k51) obj;
                        k51Var8.getClass();
                        tm1 tm1Var10 = k51Var8.l == a90Var2 ? b51Var2.j : a51Var2.j;
                        if (tm1Var10 != null) {
                            return (Double) tm1Var10.invoke(k51Var8);
                        }
                        return null;
                }
            }
        };
        final byte b6 = 5;
        a51Var.h = new tm1() { // from class: z41
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                k85 k85Var;
                byte b22 = b6;
                a51 a51Var2 = this;
                b51 b51Var2 = b51Var;
                a90 a90Var2 = a90.L;
                switch (b22) {
                    case 0:
                        tm1 tm1Var = b51Var2.b;
                        k51 k51Var = (k51) obj;
                        k51Var.getClass();
                        tm1 tm1Var2 = k51Var.l == a90Var2 ? tm1Var : a51Var2.b;
                        return (tm1Var2 == null || (k85Var = (k85) tm1Var2.invoke(k51Var)) == null) ? (k85) tm1Var.invoke(k51Var) : k85Var;
                    case 1:
                        tm1 tm1Var3 = b51Var2.c;
                        k51 k51Var2 = (k51) obj;
                        k51Var2.getClass();
                        tm1 tm1Var4 = k51Var2.l == a90Var2 ? tm1Var3 : a51Var2.c;
                        return Double.valueOf(((Number) (tm1Var4 != null ? tm1Var4.invoke(k51Var2) : tm1Var3.invoke(k51Var2))).doubleValue());
                    case 2:
                        k51 k51Var3 = (k51) obj;
                        k51Var3.getClass();
                        tm1 tm1Var5 = k51Var3.l == a90Var2 ? b51Var2.e : a51Var2.e;
                        return tm1Var5 != null ? (Double) tm1Var5.invoke(k51Var3) : Double.valueOf(1.0d);
                    case 3:
                        k51 k51Var4 = (k51) obj;
                        k51Var4.getClass();
                        tm1 tm1Var6 = k51Var4.l == a90Var2 ? b51Var2.f : a51Var2.f;
                        if (tm1Var6 != null) {
                            return (b51) tm1Var6.invoke(k51Var4);
                        }
                        return null;
                    case 4:
                        k51 k51Var5 = (k51) obj;
                        k51Var5.getClass();
                        tm1 tm1Var7 = k51Var5.l == a90Var2 ? b51Var2.g : a51Var2.g;
                        if (tm1Var7 != null) {
                            return (b51) tm1Var7.invoke(k51Var5);
                        }
                        return null;
                    case 5:
                        k51 k51Var6 = (k51) obj;
                        k51Var6.getClass();
                        tm1 tm1Var8 = k51Var6.l == a90Var2 ? b51Var2.h : a51Var2.h;
                        if (tm1Var8 != null) {
                            return (lj0) tm1Var8.invoke(k51Var6);
                        }
                        return null;
                    case 6:
                        k51 k51Var7 = (k51) obj;
                        k51Var7.getClass();
                        tm1 tm1Var9 = k51Var7.l == a90Var2 ? b51Var2.i : a51Var2.i;
                        if (tm1Var9 != null) {
                            return (n85) tm1Var9.invoke(k51Var7);
                        }
                        return null;
                    default:
                        k51 k51Var8 = (k51) obj;
                        k51Var8.getClass();
                        tm1 tm1Var10 = k51Var8.l == a90Var2 ? b51Var2.j : a51Var2.j;
                        if (tm1Var10 != null) {
                            return (Double) tm1Var10.invoke(k51Var8);
                        }
                        return null;
                }
            }
        };
        final byte b7 = 6;
        a51Var.i = new tm1() { // from class: z41
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                k85 k85Var;
                byte b22 = b7;
                a51 a51Var2 = this;
                b51 b51Var2 = b51Var;
                a90 a90Var2 = a90.L;
                switch (b22) {
                    case 0:
                        tm1 tm1Var = b51Var2.b;
                        k51 k51Var = (k51) obj;
                        k51Var.getClass();
                        tm1 tm1Var2 = k51Var.l == a90Var2 ? tm1Var : a51Var2.b;
                        return (tm1Var2 == null || (k85Var = (k85) tm1Var2.invoke(k51Var)) == null) ? (k85) tm1Var.invoke(k51Var) : k85Var;
                    case 1:
                        tm1 tm1Var3 = b51Var2.c;
                        k51 k51Var2 = (k51) obj;
                        k51Var2.getClass();
                        tm1 tm1Var4 = k51Var2.l == a90Var2 ? tm1Var3 : a51Var2.c;
                        return Double.valueOf(((Number) (tm1Var4 != null ? tm1Var4.invoke(k51Var2) : tm1Var3.invoke(k51Var2))).doubleValue());
                    case 2:
                        k51 k51Var3 = (k51) obj;
                        k51Var3.getClass();
                        tm1 tm1Var5 = k51Var3.l == a90Var2 ? b51Var2.e : a51Var2.e;
                        return tm1Var5 != null ? (Double) tm1Var5.invoke(k51Var3) : Double.valueOf(1.0d);
                    case 3:
                        k51 k51Var4 = (k51) obj;
                        k51Var4.getClass();
                        tm1 tm1Var6 = k51Var4.l == a90Var2 ? b51Var2.f : a51Var2.f;
                        if (tm1Var6 != null) {
                            return (b51) tm1Var6.invoke(k51Var4);
                        }
                        return null;
                    case 4:
                        k51 k51Var5 = (k51) obj;
                        k51Var5.getClass();
                        tm1 tm1Var7 = k51Var5.l == a90Var2 ? b51Var2.g : a51Var2.g;
                        if (tm1Var7 != null) {
                            return (b51) tm1Var7.invoke(k51Var5);
                        }
                        return null;
                    case 5:
                        k51 k51Var6 = (k51) obj;
                        k51Var6.getClass();
                        tm1 tm1Var8 = k51Var6.l == a90Var2 ? b51Var2.h : a51Var2.h;
                        if (tm1Var8 != null) {
                            return (lj0) tm1Var8.invoke(k51Var6);
                        }
                        return null;
                    case 6:
                        k51 k51Var7 = (k51) obj;
                        k51Var7.getClass();
                        tm1 tm1Var9 = k51Var7.l == a90Var2 ? b51Var2.i : a51Var2.i;
                        if (tm1Var9 != null) {
                            return (n85) tm1Var9.invoke(k51Var7);
                        }
                        return null;
                    default:
                        k51 k51Var8 = (k51) obj;
                        k51Var8.getClass();
                        tm1 tm1Var10 = k51Var8.l == a90Var2 ? b51Var2.j : a51Var2.j;
                        if (tm1Var10 != null) {
                            return (Double) tm1Var10.invoke(k51Var8);
                        }
                        return null;
                }
            }
        };
        final byte b8 = 7;
        a51Var.j = new tm1() { // from class: z41
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                k85 k85Var;
                byte b22 = b8;
                a51 a51Var2 = this;
                b51 b51Var2 = b51Var;
                a90 a90Var2 = a90.L;
                switch (b22) {
                    case 0:
                        tm1 tm1Var = b51Var2.b;
                        k51 k51Var = (k51) obj;
                        k51Var.getClass();
                        tm1 tm1Var2 = k51Var.l == a90Var2 ? tm1Var : a51Var2.b;
                        return (tm1Var2 == null || (k85Var = (k85) tm1Var2.invoke(k51Var)) == null) ? (k85) tm1Var.invoke(k51Var) : k85Var;
                    case 1:
                        tm1 tm1Var3 = b51Var2.c;
                        k51 k51Var2 = (k51) obj;
                        k51Var2.getClass();
                        tm1 tm1Var4 = k51Var2.l == a90Var2 ? tm1Var3 : a51Var2.c;
                        return Double.valueOf(((Number) (tm1Var4 != null ? tm1Var4.invoke(k51Var2) : tm1Var3.invoke(k51Var2))).doubleValue());
                    case 2:
                        k51 k51Var3 = (k51) obj;
                        k51Var3.getClass();
                        tm1 tm1Var5 = k51Var3.l == a90Var2 ? b51Var2.e : a51Var2.e;
                        return tm1Var5 != null ? (Double) tm1Var5.invoke(k51Var3) : Double.valueOf(1.0d);
                    case 3:
                        k51 k51Var4 = (k51) obj;
                        k51Var4.getClass();
                        tm1 tm1Var6 = k51Var4.l == a90Var2 ? b51Var2.f : a51Var2.f;
                        if (tm1Var6 != null) {
                            return (b51) tm1Var6.invoke(k51Var4);
                        }
                        return null;
                    case 4:
                        k51 k51Var5 = (k51) obj;
                        k51Var5.getClass();
                        tm1 tm1Var7 = k51Var5.l == a90Var2 ? b51Var2.g : a51Var2.g;
                        if (tm1Var7 != null) {
                            return (b51) tm1Var7.invoke(k51Var5);
                        }
                        return null;
                    case 5:
                        k51 k51Var6 = (k51) obj;
                        k51Var6.getClass();
                        tm1 tm1Var8 = k51Var6.l == a90Var2 ? b51Var2.h : a51Var2.h;
                        if (tm1Var8 != null) {
                            return (lj0) tm1Var8.invoke(k51Var6);
                        }
                        return null;
                    case 6:
                        k51 k51Var7 = (k51) obj;
                        k51Var7.getClass();
                        tm1 tm1Var9 = k51Var7.l == a90Var2 ? b51Var2.i : a51Var2.i;
                        if (tm1Var9 != null) {
                            return (n85) tm1Var9.invoke(k51Var7);
                        }
                        return null;
                    default:
                        k51 k51Var8 = (k51) obj;
                        k51Var8.getClass();
                        tm1 tm1Var10 = k51Var8.l == a90Var2 ? b51Var2.j : a51Var2.j;
                        if (tm1Var10 != null) {
                            return (Double) tm1Var10.invoke(k51Var8);
                        }
                        return null;
                }
            }
        };
        return a51Var;
    }
}
