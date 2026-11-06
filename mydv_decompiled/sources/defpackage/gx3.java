package defpackage;

import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.MixPlaylistPagination;
import com.github.mytv.dv.model.UserWorksResponse;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gx3 extends qr5 {
    public static final sw3 Companion = new sw3();
    public int A;
    public long A0;
    public final ConcurrentHashMap.KeySetView B;
    public boolean B0;
    public final ConcurrentHashMap.KeySetView C;
    public final fw4 C0;
    public final ConcurrentHashMap D;
    public final p04 D0;
    public final fw4 E;
    public long E0;
    public final p04 F;
    public boolean F0;
    public final fw4 G;
    public boolean G0;
    public final p04 H;
    public final fw4 H0;
    public long I;
    public final p04 I0;
    public boolean J;
    public final fw4 J0;
    public boolean K;
    public final p04 K0;
    public final fw4 L;
    public final fw4 L0;
    public final p04 M;
    public final p04 M0;
    public long N;
    public final fw4 N0;
    public boolean O;
    public final p04 O0;
    public boolean P;
    public long P0;
    public final fw4 Q;
    public boolean Q0;
    public final p04 R;
    public boolean R0;
    public long S;
    public final fw4 S0;
    public boolean T;
    public final p04 T0;
    public boolean U;
    public final fw4 U0;
    public final fw4 V;
    public final p04 V0;
    public final p04 W;
    public final fw4 W0;
    public long X;
    public final p04 X0;
    public boolean Y;
    public final LinkedHashMap Y0;
    public boolean Z;
    public final fw4 Z0;
    public final fw4 a0;
    public final p04 a1;
    public final kq5 b;
    public final p04 b0;
    public final p04 b1;
    public final fl4 c;
    public long c0;
    public final p04 c1;
    public final n94 d;
    public boolean d0;
    public rv4 d1;
    public final fw4 e;
    public final fw4 e0;
    public final p04 f;
    public final p04 f0;
    public final fw4 g;
    public long g0;
    public final p04 h;
    public boolean h0;
    public long i;
    public final fw4 i0;
    public boolean j;
    public final p04 j0;
    public final fw4 k;
    public final fw4 k0;
    public final p04 l;
    public final p04 l0;
    public int m;
    public long m0;
    public final fw4 n;
    public boolean n0;
    public final p04 o;
    public final fw4 o0;
    public long p;
    public final p04 p0;
    public boolean q;
    public long q0;
    public final fw4 r;
    public boolean r0;
    public final p04 s;
    public final fw4 s0;
    public final fw4 t;
    public final p04 t0;
    public final p04 u;
    public final fw4 u0;
    public final fw4 v;
    public final p04 v0;
    public final p04 w;
    public int w0;
    public rv4 x;
    public boolean x0;
    public int y;
    public final fw4 y0;
    public rv4 z;
    public final p04 z0;

    public gx3(kq5 kq5Var, fl4 fl4Var, n94 n94Var) {
        this.b = kq5Var;
        this.c = fl4Var;
        this.d = n94Var;
        fw4 c = o7.c(null);
        this.e = c;
        this.f = sv2.j(c);
        o91 o91Var = o91.I;
        fw4 c2 = o7.c(o91Var);
        this.g = c2;
        this.h = sv2.j(c2);
        this.j = true;
        fw4 c3 = o7.c(new gu3());
        this.k = c3;
        this.l = sv2.j(c3);
        fw4 c4 = o7.c(o91Var);
        this.n = c4;
        this.o = sv2.j(c4);
        this.q = true;
        Boolean bool = Boolean.FALSE;
        fw4 c5 = o7.c(bool);
        this.r = c5;
        this.s = sv2.j(c5);
        fw4 c6 = o7.c(bool);
        this.t = c6;
        this.u = sv2.j(c6);
        fw4 c7 = o7.c(bool);
        this.v = c7;
        this.w = sv2.j(c7);
        this.B = ConcurrentHashMap.newKeySet();
        this.C = ConcurrentHashMap.newKeySet();
        this.D = new ConcurrentHashMap();
        fw4 c8 = o7.c(null);
        this.E = c8;
        this.F = sv2.j(c8);
        fw4 c9 = o7.c(o91Var);
        this.G = c9;
        this.H = sv2.j(c9);
        this.J = true;
        fw4 c10 = o7.c(o91Var);
        this.L = c10;
        this.M = sv2.j(c10);
        this.O = true;
        fw4 c11 = o7.c(o91Var);
        this.Q = c11;
        this.R = sv2.j(c11);
        this.T = true;
        fw4 c12 = o7.c(o91Var);
        this.V = c12;
        this.W = sv2.j(c12);
        this.Y = true;
        fw4 c13 = o7.c(o91Var);
        this.a0 = c13;
        this.b0 = sv2.j(c13);
        this.d0 = true;
        fw4 c14 = o7.c(o91Var);
        this.e0 = c14;
        this.f0 = sv2.j(c14);
        this.h0 = true;
        fw4 c15 = o7.c(o91Var);
        this.i0 = c15;
        this.j0 = sv2.j(c15);
        p91 p91Var = p91.I;
        fw4 c16 = o7.c(p91Var);
        this.k0 = c16;
        this.l0 = sv2.j(c16);
        this.n0 = true;
        fw4 c17 = o7.c(o91Var);
        this.o0 = c17;
        this.p0 = sv2.j(c17);
        this.r0 = true;
        fw4 c18 = o7.c(o91Var);
        this.s0 = c18;
        this.t0 = sv2.j(c18);
        fw4 c19 = o7.c(bool);
        this.u0 = c19;
        this.v0 = sv2.j(c19);
        this.x0 = true;
        fw4 c20 = o7.c(o91Var);
        this.y0 = c20;
        this.z0 = sv2.j(c20);
        this.B0 = true;
        fw4 c21 = o7.c(o91Var);
        this.C0 = c21;
        this.D0 = sv2.j(c21);
        this.F0 = true;
        fw4 c22 = o7.c(null);
        this.H0 = c22;
        this.I0 = sv2.j(c22);
        fw4 c23 = o7.c(o91Var);
        this.J0 = c23;
        this.K0 = sv2.j(c23);
        fw4 c24 = o7.c(bool);
        this.L0 = c24;
        this.M0 = sv2.j(c24);
        fw4 c25 = o7.c(p91Var);
        this.N0 = c25;
        this.O0 = sv2.j(c25);
        this.Q0 = true;
        fw4 c26 = o7.c(null);
        this.S0 = c26;
        this.T0 = sv2.j(c26);
        fw4 c27 = o7.c(null);
        this.U0 = c27;
        this.V0 = sv2.j(c27);
        fw4 c28 = o7.c(p91Var);
        this.W0 = c28;
        this.X0 = sv2.j(c28);
        this.Y0 = new LinkedHashMap();
        fw4 c29 = o7.c(o91Var);
        this.Z0 = c29;
        this.a1 = sv2.j(c29);
        this.b1 = n94Var.b("profile.currentTab", "works");
        this.c1 = n94Var.b("profile.playerSource", null);
        o7.c(o91Var);
        o7.c(0);
    }

    public static /* synthetic */ void D(gx3 gx3Var, boolean z, int i) {
        boolean z2 = (i & 1) == 0;
        if ((i & 2) != 0) {
            z = true;
        }
        gx3Var.C(z2, z);
    }

    public static List p(List list, List list2) {
        if (list2.isEmpty()) {
            return list;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((Aweme) it.next()).getAwemeId());
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            Aweme aweme = (Aweme) obj;
            if (jx4.L(aweme.getAwemeId()) || !hashSet.contains(aweme.getAwemeId())) {
                arrayList.add(obj);
            }
        }
        return o70.f1(list, arrayList);
    }

    public static final Aweme v(gx3 gx3Var, int i) {
        Object obj;
        Iterator it = ((Iterable) gx3Var.J0.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = (Integer) ((Map) gx3Var.N0.getValue()).get(((Aweme) obj).getAwemeId());
            if (num != null && num.intValue() == i) {
                break;
            }
        }
        return (Aweme) obj;
    }

    public static boolean w(boolean z, int i, boolean z2, long j, long j2) {
        if (z2) {
            return (z && i == 0 && j2 == j) ? false : true;
        }
        return false;
    }

    public static boolean z(UserWorksResponse userWorksResponse, boolean z) {
        return z && userWorksResponse.getAwemeList() == null && userWorksResponse.getMaxCursor() == 0 && userWorksResponse.getCursor() == null;
    }

    public final void A(uw3 uw3Var, tm1 tm1Var) {
        int i = this.y;
        this.D.put(uw3Var, Integer.valueOf(i));
        rv4 g0 = p70.g0(o7.B(this), null, null, new ha0(tm1Var, this, uw3Var, i, (fj0) null), 3);
        ConcurrentHashMap.KeySetView keySetView = this.C;
        keySetView.getClass();
        keySetView.add(g0);
        g0.Q(new rw3(this, g0, (byte) 1));
    }

    public final void B(tm1 tm1Var) {
        rv4 g0 = p70.g0(o7.B(this), null, null, new mu1((byte) 1, (fj0) null, tm1Var), 3);
        ConcurrentHashMap.KeySetView keySetView = this.B;
        keySetView.getClass();
        keySetView.add(g0);
        g0.Q(new rw3(this, g0, (byte) 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (r6 < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(boolean r11, boolean r12) {
        /*
            r10 = this;
            fw4 r0 = r10.H0
            java.lang.Object r0 = r0.getValue()
            com.github.mytv.dv.model.MixInfo r0 = (com.github.mytv.dv.model.MixInfo) r0
            if (r0 != 0) goto Lb
            goto L3c
        Lb:
            java.lang.String r3 = r0.getMixId()
            int r1 = r3.length()
            if (r1 != 0) goto L16
            goto L3c
        L16:
            if (r11 != 0) goto L27
            fw4 r1 = r10.J0
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L27
            goto L3c
        L27:
            if (r11 == 0) goto L2e
            boolean r1 = r10.Q0
            if (r1 != 0) goto L2e
            goto L3c
        L2e:
            fw4 r1 = r10.L0
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L3d
        L3c:
            return
        L3d:
            com.github.mytv.dv.model.MixStatis r2 = r0.getStatis()
            int r2 = r2.getTotalEpisode()
            com.github.mytv.dv.model.MixStatis r4 = r0.getStatis()
            int r4 = r4.getUpdatedToEpisode()
            com.github.mytv.dv.model.MixStatis r0 = r0.getStatis()
            int r0 = r0.getCurrentEpisode()
            int r0 = java.lang.Math.max(r4, r0)
            int r0 = java.lang.Math.max(r2, r0)
            r2 = 20
            if (r11 != 0) goto L6a
            if (r12 == 0) goto L67
            if (r0 <= r2) goto L67
            r12 = 1
            goto L68
        L67:
            r12 = 0
        L68:
            r10.R0 = r12
        L6a:
            if (r11 != 0) goto L73
            boolean r12 = r10.R0
            if (r12 == 0) goto L73
            int r0 = r0 - r2
            long r4 = (long) r0
            goto L87
        L73:
            r4 = 0
            if (r11 != 0) goto L78
            goto L87
        L78:
            boolean r12 = r10.R0
            long r6 = r10.P0
            if (r12 == 0) goto L86
            r8 = 20
            long r6 = r6 - r8
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 >= 0) goto L86
            goto L87
        L86:
            r4 = r6
        L87:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r0 = 0
            r1.i(r0, r12)
            y60 r12 = defpackage.o7.B(r10)
            zw3 r1 = new zw3
            r7 = 0
            r2 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r6, r7)
            r10 = 3
            defpackage.p70.g0(r12, r0, r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx3.C(boolean, boolean):void");
    }

    public final void E(boolean z) {
        if (this.E.getValue() != null) {
            return;
        }
        if (z || ((Collection) this.o0.getValue()).isEmpty()) {
            if (!z || this.r0) {
                ConcurrentHashMap concurrentHashMap = this.D;
                uw3 uw3Var = uw3.N;
                if (concurrentHashMap.containsKey(uw3Var)) {
                    return;
                }
                A(uw3Var, new ax3(this, this.q0, this.y, O("collections", z), z, new n24(), null, (byte) 0));
            }
        }
    }

    public final void F(boolean z) {
        fw4 fw4Var = this.E;
        Author author = (Author) fw4Var.getValue();
        if (author == null && (author = (Author) this.e.getValue()) == null) {
            return;
        }
        boolean z2 = fw4Var.getValue() != null;
        List list = (List) (z2 ? this.L : this.n).getValue();
        boolean z3 = z2 ? this.O : this.q;
        long j = z2 ? this.N : this.p;
        uw3 uw3Var = uw3.J;
        boolean containsKey = z2 ? this.P : this.D.containsKey(uw3Var);
        if (z || list.isEmpty()) {
            if ((!z || z3) && !containsKey) {
                if (!z2) {
                    A(uw3Var, new cx3(author, this, j, this.y, O("favorites", z), z, new n24(), (fj0) null, (byte) 0));
                } else {
                    this.P = true;
                    B(new bx3(author.getSecUid(), this, j, this.A, O("favorites", z), z, new n24(), null, (byte) 0));
                }
            }
        }
    }

    public final void G(boolean z) {
        fw4 fw4Var = this.E;
        Author author = (Author) fw4Var.getValue();
        if (author == null && (author = (Author) this.e.getValue()) == null) {
            return;
        }
        Author author2 = author;
        boolean z2 = fw4Var.getValue() != null;
        List list = z2 ? (List) this.Q.getValue() : (List) this.a0.getValue();
        boolean z3 = z2 ? this.T : this.d0;
        long j = z2 ? this.S : this.c0;
        uw3 uw3Var = uw3.K;
        boolean containsKey = z2 ? this.U : this.D.containsKey(uw3Var);
        if (z || list.isEmpty()) {
            if ((!z || z3) && !containsKey) {
                if (!z2) {
                    A(uw3Var, new cx3(this, author2, j, this.y, O("followers", z), z, new n24(), (fj0) null, (byte) 1));
                } else {
                    this.U = true;
                    B(new dx3(this, author2.getSecUid(), author2, j, this.A, O("followers", z), z, new n24(), null, (byte) 0));
                }
            }
        }
    }

    public final void H(boolean z) {
        fw4 fw4Var = this.E;
        Author author = (Author) fw4Var.getValue();
        if (author == null && (author = (Author) this.e.getValue()) == null) {
            return;
        }
        Author author2 = author;
        boolean z2 = fw4Var.getValue() != null;
        List list = z2 ? (List) this.V.getValue() : (List) this.e0.getValue();
        boolean z3 = z2 ? this.Y : this.h0;
        long j = z2 ? this.X : this.g0;
        uw3 uw3Var = uw3.L;
        boolean containsKey = z2 ? this.Z : this.D.containsKey(uw3Var);
        if (z || list.isEmpty()) {
            if ((!z || z3) && !containsKey) {
                if (!z2) {
                    A(uw3Var, new cx3(this, author2, j, this.y, O("following", z), z, new n24(), (fj0) null, (byte) 2));
                } else {
                    this.Z = true;
                    B(new dx3(this, author2.getSecUid(), author2, j, this.A, O("following", z), z, new n24(), null, (byte) 1));
                }
            }
        }
    }

    public final void I(boolean z) {
        fw4 fw4Var = this.E;
        Author author = (Author) fw4Var.getValue();
        if (author == null && (author = (Author) this.e.getValue()) == null) {
            return;
        }
        boolean z2 = fw4Var.getValue() != null;
        List list = (List) (z2 ? this.C0 : this.y0).getValue();
        boolean z3 = z2 ? this.F0 : this.B0;
        long j = z2 ? this.E0 : this.A0;
        uw3 uw3Var = uw3.P;
        boolean containsKey = z2 ? this.G0 : this.D.containsKey(uw3Var);
        if (z || list.isEmpty()) {
            if ((!z || z3) && !containsKey) {
                String secUid = author.getSecUid();
                if (z2 && secUid.length() == 0) {
                    return;
                }
                if (!z2) {
                    A(uw3Var, new ax3(this, j, this.y, O("mixes", z), z, new n24(), null, (byte) 1));
                } else {
                    this.G0 = true;
                    B(new bx3(this, secUid, j, this.A, O("mixes", z), z, new n24(), null));
                }
            }
        }
    }

    public final void J() {
        rv4 rv4Var = this.x;
        byte b = 1;
        if (rv4Var == null || !rv4Var.isActive()) {
            int i = this.y + 1;
            this.y = i;
            this.x = p70.g0(o7.B(this), null, null, new xw3(this, i, null, b), 3);
        }
    }

    public final void K(boolean z) {
        fw4 fw4Var = this.E;
        Author author = (Author) fw4Var.getValue();
        if (author == null && (author = (Author) this.e.getValue()) == null) {
            return;
        }
        boolean z2 = fw4Var.getValue() != null;
        List list = (List) (z2 ? this.G : this.g).getValue();
        boolean z3 = z2 ? this.J : this.j;
        long j = z2 ? this.I : this.i;
        uw3 uw3Var = uw3.I;
        boolean containsKey = z2 ? this.K : this.D.containsKey(uw3Var);
        if (z || list.isEmpty()) {
            if ((!z || z3) && !containsKey) {
                if (!z2) {
                    A(uw3Var, new cx3(author, this, j, this.y, O("works", z), z, new n24(), (fj0) null, (byte) 3));
                } else {
                    this.K = true;
                    B(new bx3(author.getSecUid(), this, j, this.A, O("works", z), z, new n24(), null, (byte) 2));
                }
            }
        }
    }

    public final void L(boolean z) {
        if (z || ((Collection) this.i0.getValue()).isEmpty()) {
            if (!z || this.n0) {
                ConcurrentHashMap concurrentHashMap = this.D;
                uw3 uw3Var = uw3.M;
                if (concurrentHashMap.containsKey(uw3Var)) {
                    return;
                }
                A(uw3Var, new ax3(this, this.m0, this.y, O("history", z), z, new n24(), null, (byte) 2));
            }
        }
    }

    public final void M(boolean z) {
        if (this.E.getValue() != null) {
            return;
        }
        if (z || ((Collection) this.s0.getValue()).isEmpty()) {
            if (!z || this.x0) {
                ConcurrentHashMap concurrentHashMap = this.D;
                uw3 uw3Var = uw3.O;
                if (concurrentHashMap.containsKey(uw3Var)) {
                    return;
                }
                A(uw3Var, new ex3(this, this.y, O("watch_later", z), z, new n24(), null));
            }
        }
    }

    public final void N(int i, boolean z, boolean z2, boolean z3) {
        if (i != this.m) {
            return;
        }
        this.k.i(null, new gu3(false, z && z3, z2));
    }

    public final int O(String str, boolean z) {
        if (!j42.c(((fw4) this.b1.I).getValue(), str)) {
            return -1;
        }
        this.m++;
        fw4 fw4Var = this.k;
        fw4Var.i(null, z ? gu3.a((gu3) fw4Var.getValue(), 4) : new gu3());
        return this.m;
    }

    public final void P(boolean z) {
        x();
        this.e.h(null);
        this.t.i(null, Boolean.TRUE);
        this.v.i(null, Boolean.valueOf(z));
    }

    public final void Q() {
        y();
        this.E.h(null);
        fw4 fw4Var = this.G;
        o91 o91Var = o91.I;
        fw4Var.i(null, o91Var);
        this.L.i(null, o91Var);
        this.Q.i(null, o91Var);
        this.S = 0L;
        this.T = true;
        this.V.i(null, o91Var);
        this.X = 0L;
        this.Y = true;
        this.C0.i(null, o91Var);
        this.E0 = 0L;
        this.F0 = true;
    }

    public final Object R(List list, int i, int i2, k05 k05Var) {
        fw4 fw4Var;
        LinkedHashMap linkedHashMap;
        v52 v52Var;
        Object W;
        if (this.b.H() && !list.isEmpty()) {
            int i3 = i + 1;
            int i4 = i3 < 0 ? 0 : i3;
            int i5 = i2 + i4;
            int size = list.size();
            if (i5 > size) {
                i5 = size;
            }
            String awemeId = ((Aweme) list.get(ut0.r(i3, 0, list.size() - 1))).getAwemeId();
            while (true) {
                fw4Var = this.W0;
                linkedHashMap = this.Y0;
                if (i4 >= i5) {
                    break;
                }
                String awemeId2 = ((Aweme) list.get(i4)).getAwemeId();
                if (!jx4.L(awemeId2) && !((Map) fw4Var.getValue()).containsKey(awemeId2) && !linkedHashMap.containsKey(awemeId2)) {
                    linkedHashMap.put(awemeId2, p70.g0(o7.B(this), null, null, new gu2((Object) this, (Object) awemeId2, (fj0) null, (byte) 7), 3));
                }
                i4++;
            }
            if (!jx4.L(awemeId) && !((Map) fw4Var.getValue()).containsKey(awemeId) && (v52Var = (v52) linkedHashMap.get(awemeId)) != null && (W = v52Var.W(k05Var)) == el0.I) {
                return W;
            }
        }
        return wd5.a;
    }

    public final void S(String str) {
        str.getClass();
        if (jx4.L(str)) {
            return;
        }
        fw4 fw4Var = this.Z0;
        List list = (List) fw4Var.getValue();
        tw3 tw3Var = (tw3) o70.b1(list);
        if (tw3Var == null) {
            return;
        }
        Iterator it = tw3Var.e().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (j42.c(((Aweme) it.next()).getAwemeId(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        List e = tw3Var.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e) {
            if (!j42.c(((Aweme) obj).getAwemeId(), str)) {
                arrayList.add(obj);
            }
        }
        fw4Var.i(null, o70.g1(o70.R0(list), tw3.a(tw3Var, arrayList, arrayList.isEmpty() ? 0 : i <= tw3Var.d() ? ut0.r(tw3Var.d(), 0, arrayList.size() - 1) : tw3Var.d(), null, 28)));
        fw4 fw4Var2 = this.W0;
        fw4Var2.i(null, sv2.M(str, (Map) fw4Var2.getValue()));
        LinkedHashMap linkedHashMap = this.Y0;
        v52 v52Var = (v52) linkedHashMap.get(str);
        if (v52Var != null) {
            v52Var.e(null);
        }
        linkedHashMap.remove(str);
    }

    public final void T(Author author) {
        x();
        this.e.i(null, author);
    }

    public final void U(List list, int i, String str, String str2, MixPlaylistPagination mixPlaylistPagination) {
        this.Z0.i(null, p70.j0(new tw3(list, i, str2, mixPlaylistPagination, 16)));
        this.d.c(str, "profile.playerSource");
    }

    public final void q() {
        this.Z0.i(null, o91.I);
        this.d.c(null, "profile.playerSource");
        this.W0.i(null, p91.I);
        LinkedHashMap linkedHashMap = this.Y0;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((v52) it.next()).e(null);
        }
        linkedHashMap.clear();
    }

    public final void r() {
        x();
        this.e.h(null);
        fw4 fw4Var = this.g;
        o91 o91Var = o91.I;
        fw4Var.i(null, o91Var);
        this.i = 0L;
        this.j = true;
        this.n.i(null, o91Var);
        this.p = 0L;
        this.q = true;
        this.a0.i(null, o91Var);
        this.c0 = 0L;
        this.d0 = true;
        this.e0.i(null, o91Var);
        this.g0 = 0L;
        this.h0 = true;
        this.i0.i(null, o91Var);
        this.m0 = 0L;
        this.n0 = true;
        this.o0.i(null, o91Var);
        this.q0 = 0L;
        this.r0 = true;
        this.s0.i(null, o91Var);
        this.u0.i(null, Boolean.FALSE);
        this.w0 = 0;
        this.x0 = true;
        this.y0.i(null, o91Var);
        this.A0 = 0L;
        this.B0 = true;
        this.S0.h(null);
    }

    public final void s() {
        this.i0.i(null, o91.I);
        this.k0.i(null, p91.I);
        this.m0 = 0L;
        this.n0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x0026, B:12:0x0049, B:14:0x004d, B:16:0x0051, B:18:0x0063, B:20:0x0071, B:23:0x0078, B:24:0x007c, B:26:0x0082, B:31:0x0096, B:33:0x00a7, B:34:0x00b8, B:35:0x00af, B:36:0x00bc, B:43:0x003a), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r6, defpackage.gj0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.vw3
            if (r0 == 0) goto L13
            r0 = r7
            vw3 r0 = (defpackage.vw3) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            vw3 r0 = new vw3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.J
            int r1 = r0.L
            r2 = 0
            java.util.LinkedHashMap r3 = r5.Y0
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 != r4) goto L31
            java.lang.String r6 = r0.I
            defpackage.mu0.V(r7)     // Catch: java.lang.Throwable -> L2e
            h54 r7 = (defpackage.h54) r7     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r7.I     // Catch: java.lang.Throwable -> L2e
            goto L49
        L2e:
            r5 = move-exception
            goto Lc5
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r2
        L37:
            defpackage.mu0.V(r7)
            kq5 r7 = r5.b     // Catch: java.lang.Throwable -> L2e
            r0.I = r6     // Catch: java.lang.Throwable -> L2e
            r0.L = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r7.E(r6, r0)     // Catch: java.lang.Throwable -> L2e
            el0 r0 = defpackage.el0.I
            if (r7 != r0) goto L49
            return r0
        L49:
            boolean r0 = r7 instanceof defpackage.g54     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto Lbf
            com.github.mytv.dv.model.Aweme r7 = (com.github.mytv.dv.model.Aweme) r7     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto Lbc
            com.github.mytv.dv.model.Video r0 = r7.getVideo()     // Catch: java.lang.Throwable -> L2e
            com.github.mytv.dv.model.PlayAddr r0 = r0.getPlayAddr()     // Catch: java.lang.Throwable -> L2e
            java.util.List r0 = r0.getUrlList()     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L96
            com.github.mytv.dv.model.Video r0 = r7.getVideo()     // Catch: java.lang.Throwable -> L2e
            java.util.List r0 = r0.getBitRate()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = defpackage.nt3.r(r0)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L78
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L78
            goto Lbf
        L78:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2e
        L7c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto Lbf
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2e
            com.github.mytv.dv.model.BitRate r1 = (com.github.mytv.dv.model.BitRate) r1     // Catch: java.lang.Throwable -> L2e
            com.github.mytv.dv.model.PlayAddr r1 = r1.getPlayAddr()     // Catch: java.lang.Throwable -> L2e
            java.util.List r1 = r1.getUrlList()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L7c
        L96:
            fw4 r5 = r5.W0     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r5.getValue()     // Catch: java.lang.Throwable -> L2e
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L2e
            r0.getClass()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto Laf
            java.util.Map r7 = java.util.Collections.singletonMap(r6, r7)     // Catch: java.lang.Throwable -> L2e
            r7.getClass()     // Catch: java.lang.Throwable -> L2e
            goto Lb8
        Laf:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            r1.put(r6, r7)     // Catch: java.lang.Throwable -> L2e
            r7 = r1
        Lb8:
            r5.i(r2, r7)     // Catch: java.lang.Throwable -> L2e
            goto Lbf
        Lbc:
            r5.S(r6)     // Catch: java.lang.Throwable -> L2e
        Lbf:
            r3.remove(r6)
            wd5 r5 = defpackage.wd5.a
            return r5
        Lc5:
            r3.remove(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx3.t(java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006c -> B:10:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(int r10, defpackage.gj0 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.ww3
            if (r0 == 0) goto L13
            r0 = r11
            ww3 r0 = (defpackage.ww3) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.M = r1
            goto L18
        L13:
            ww3 r0 = new ww3
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.K
            int r1 = r0.M
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2e
            int r10 = r0.J
            int r1 = r0.I
            defpackage.mu0.V(r11)
            r8 = r1
            r1 = r10
            r10 = r8
            goto L6f
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r9)
            return r2
        L34:
            defpackage.mu0.V(r11)
            com.github.mytv.dv.model.Aweme r11 = v(r9, r10)
            if (r11 == 0) goto L3e
            return r11
        L3e:
            r11 = r3
        L3f:
            int r1 = r11 + 1
            r5 = 10
            if (r11 >= r5) goto L7d
            boolean r11 = r9.Q0
            if (r11 == 0) goto L7d
            fw4 r11 = r9.J0
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            int r11 = r11.size()
            r5 = 2
            D(r9, r3, r5)
            xw3 r5 = new xw3
            r5.<init>(r9, r11, r2, r3)
            r0.I = r10
            r0.J = r1
            r0.M = r4
            r6 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r11 = defpackage.qi4.n(r6, r5, r0)
            el0 r5 = defpackage.el0.I
            if (r11 != r5) goto L6f
            return r5
        L6f:
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L74
            goto L7d
        L74:
            com.github.mytv.dv.model.Aweme r11 = v(r9, r10)
            if (r11 == 0) goto L7b
            return r11
        L7b:
            r11 = r1
            goto L3f
        L7d:
            com.github.mytv.dv.model.Aweme r9 = v(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx3.u(int, gj0):java.lang.Object");
    }

    public final void x() {
        this.y++;
        rv4 rv4Var = this.x;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.x = null;
        ConcurrentHashMap.KeySetView keySetView = this.C;
        keySetView.getClass();
        List<v52> r1 = o70.r1(keySetView);
        keySetView.clear();
        this.D.clear();
        for (v52 v52Var : r1) {
            v52Var.getClass();
            v52Var.e(null);
        }
        Boolean bool = Boolean.FALSE;
        this.r.i(null, bool);
        this.t.i(null, bool);
        this.v.i(null, bool);
    }

    public final void y() {
        this.A++;
        rv4 rv4Var = this.z;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.z = null;
        ConcurrentHashMap.KeySetView keySetView = this.B;
        keySetView.getClass();
        List<v52> r1 = o70.r1(keySetView);
        keySetView.clear();
        for (v52 v52Var : r1) {
            v52Var.getClass();
            v52Var.e(null);
        }
        this.K = false;
        this.P = false;
        this.U = false;
        this.Z = false;
        this.G0 = false;
        this.r.i(null, Boolean.FALSE);
    }
}
