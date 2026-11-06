package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ye4 extends qr5 {
    public static final ve4 Companion = new ve4();
    public String A;
    public int B;
    public String C;
    public final fw4 D;
    public final p04 E;
    public final p04 F;
    public final fw4 G;
    public final p04 H;
    public final fw4 I;
    public final p04 J;
    public final fw4 K;
    public final p04 L;
    public final fw4 M;
    public final p04 N;
    public final fw4 O;
    public final p04 P;
    public final fw4 Q;
    public final p04 R;
    public final fw4 S;
    public final p04 T;
    public int U;
    public String V;
    public long W;
    public rv4 X;
    public rv4 Y;
    public final v24 Z;
    public final kq5 b;
    public final n94 c;
    public final zc4 d;
    public final fl4 e;
    public final tc4 f;
    public final p04 g;
    public final p04 h;
    public final p04 i;
    public final mn4 j;
    public final n04 k;
    public final fw4 l;
    public final p04 m;
    public final fw4 n;
    public final p04 o;
    public final fw4 p;
    public final p04 q;
    public final fw4 r;
    public final p04 s;
    public final fw4 t;
    public final p04 u;
    public final fw4 v;
    public final p04 w;
    public final fw4 x;
    public final p04 y;
    public int z;

    public ye4(kq5 kq5Var, n94 n94Var, tc4 tc4Var, zc4 zc4Var, fl4 fl4Var) {
        this.b = kq5Var;
        this.c = n94Var;
        this.d = zc4Var;
        this.e = fl4Var;
        this.f = tc4Var;
        this.g = tc4Var.c;
        this.h = zc4Var.d;
        this.i = sv2.V(zc4Var.m, o7.B(this), new aw4(5000L, Long.MAX_VALUE), "");
        fj0 fj0Var = null;
        mn4 b = o7.b(1, 5, null);
        this.j = b;
        this.k = new n04(b);
        p70.g0(o7.B(this), null, null, new ue4(this, fj0Var, (byte) 0), 3);
        p70.g0(o7.B(this), null, null, new ue4(this, fj0Var, (byte) 1), 3);
        o91 o91Var = o91.I;
        fw4 c = o7.c(o91Var);
        this.l = c;
        this.m = sv2.j(c);
        fw4 c2 = o7.c(re4.J);
        this.n = c2;
        this.o = sv2.j(c2);
        fw4 c3 = o7.c(o91Var);
        this.p = c3;
        this.q = sv2.j(c3);
        fw4 c4 = o7.c(o91Var);
        this.r = c4;
        this.s = sv2.j(c4);
        Boolean bool = Boolean.TRUE;
        fw4 c5 = o7.c(bool);
        this.t = c5;
        this.u = sv2.j(c5);
        fw4 c6 = o7.c(bool);
        this.v = c6;
        this.w = sv2.j(c6);
        Boolean bool2 = Boolean.FALSE;
        fw4 c7 = o7.c(bool2);
        this.x = c7;
        this.y = sv2.j(c7);
        this.A = "";
        this.C = "";
        fw4 c8 = o7.c(bool2);
        this.D = c8;
        this.E = sv2.j(c8);
        this.F = n94Var.b("search.query", "");
        p70.g0(o7.B(this), null, null, new ue4(this, fj0Var, (byte) 2), 3);
        fw4 c9 = o7.c(o91Var);
        this.G = c9;
        this.H = sv2.j(c9);
        fw4 c10 = o7.c(o91Var);
        this.I = c10;
        this.J = sv2.j(c10);
        fw4 c11 = o7.c(o91Var);
        this.K = c11;
        this.L = sv2.j(c11);
        fw4 c12 = o7.c(null);
        this.M = c12;
        this.N = sv2.j(c12);
        fw4 c13 = o7.c(bool2);
        this.O = c13;
        this.P = sv2.j(c13);
        fw4 c14 = o7.c(bool);
        this.Q = c14;
        this.R = sv2.j(c14);
        fw4 c15 = o7.c(bool2);
        this.S = c15;
        this.T = sv2.j(c15);
        this.V = "";
        o7.c(bool);
        this.Z = new v24("\\d{15,}");
    }

    public static ArrayList p(List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Aweme aweme = (Aweme) obj;
            String awemeId = aweme.getAwemeId();
            if (jx4.L(awemeId)) {
                awemeId = o70.Z0(p70.k0(aweme.getAuthor().getUid(), aweme.getDesc(), String.valueOf(aweme.getCreateTime())), "#", null, null, 0, null, 62);
            }
            if (hashSet.add(awemeId)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static String y(String str, Throwable th) {
        if (!(th instanceof rc4)) {
            return r7.C(str, "搜索失败: ", th.getMessage());
        }
        rc4 rc4Var = (rc4) th;
        String a = rc4Var.a();
        int hashCode = a.hashCode();
        if (hashCode != -282275390) {
            if (hashCode != 255885387) {
                if (hashCode == 1695515919 && a.equals("params_check")) {
                    return "搜索参数校验失败";
                }
            } else if (a.equals("web_need_login")) {
                return "搜索需要登录态，请更新 Cookie";
            }
        } else if (a.equals("verify_check")) {
            return "搜索被风控校验拦截，请稍后重试";
        }
        return hf1.w("搜索错误: ", rc4Var.a());
    }

    public final boolean A(re4 re4Var) {
        int ordinal = re4Var.ordinal();
        if (ordinal == 0) {
            return ((Boolean) this.S.getValue()).booleanValue();
        }
        if (ordinal == 1 || ordinal == 2) {
            return ((Boolean) this.x.getValue()).booleanValue();
        }
        s83.v();
        return false;
    }

    public final void B(String str) {
        str.getClass();
        fj0 fj0Var = null;
        if (!str.equals(((fw4) this.F.I).getValue())) {
            this.M.h(null);
        }
        this.c.c(str, "search.query");
        rv4 rv4Var = this.X;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        rv4 rv4Var2 = this.Y;
        if (rv4Var2 != null) {
            rv4Var2.e(null);
        }
        boolean v = this.e.v();
        o91 o91Var = o91.I;
        fw4 fw4Var = this.I;
        if (!v) {
            fw4Var.getClass();
            fw4Var.i(null, o91Var);
            return;
        }
        if (jx4.g0(str).toString().length() > 0) {
            this.X = p70.g0(o7.B(this), null, null, new jd(this, str, fj0Var, (byte) 7), 3);
            return;
        }
        fw4Var.getClass();
        fw4Var.i(null, o91Var);
        fw4 fw4Var2 = this.l;
        fw4Var2.getClass();
        fw4Var2.i(null, o91Var);
        Boolean bool = Boolean.TRUE;
        fw4 fw4Var3 = this.Q;
        fw4Var3.getClass();
        fw4Var3.i(null, bool);
        this.U = 0;
        w();
        u();
    }

    @Override // defpackage.qr5
    public final void o() {
        this.d.a();
    }

    public final void q() {
        if (this.e.v() && ((Collection) this.G.getValue()).isEmpty()) {
            p70.g0(o7.B(this), null, null, new we4(this, null, (byte) 0), 3);
        }
    }

    public final void r() {
        re4 re4Var = (re4) this.n.getValue();
        if (A(re4Var) || !z(re4Var) || jx4.g0((String) ((fw4) this.F.I).getValue()).toString().length() == 0) {
            return;
        }
        rv4 rv4Var = this.Y;
        if (rv4Var == null || !rv4Var.isActive()) {
            this.Y = p70.g0(o7.B(this), null, null, new nc4(this, null, (byte) 1), 3);
        }
    }

    public final void s() {
        rv4 rv4Var = this.Y;
        fj0 fj0Var = null;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        v((re4) this.n.getValue());
        p70.g0(o7.B(this), null, null, new we4(this, fj0Var, (byte) 2), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(2:252|(1:(2:255|(8:257|258|259|73|(12:75|76|(1:78)|79|(5:81|(1:83)|84|(2:86|87)(1:89)|88)|90|91|(1:93)(1:115)|94|(1:96)|97|(2:101|102))(1:116)|103|(1:105)|106)(2:260|261))(8:262|263|264|148|(10:150|151|(1:153)|154|(5:156|(1:158)|159|(2:161|162)(1:164)|163)|165|166|(1:168)|169|(2:173|174))(1:178)|175|(1:177)|106))(9:265|266|267|190|191|(6:193|(1:195)(1:204)|196|(1:198)|199|(1:203))|205|(1:207)|209))(4:9|(2:11|(5:13|(2:15|(6:17|(4:20|(2:22|23)(1:25)|24|18)|26|27|(1:29)|(1:(2:40|(12:42|(2:44|(1:46)(2:239|240))(1:241)|47|48|(1:50)(2:(1:233)(2:235|(1:237)(1:238))|234)|51|52|54|55|56|(3:58|59|(2:61|(5:67|68|69|70|(6:72|73|(0)(0)|103|(0)|106))(3:63|64|65))(2:145|(6:147|148|(0)(0)|175|(0)|106)))(7:182|183|184|185|186|187|(7:189|190|191|(0)|205|(0)|209))|117)(11:242|243|48|(0)(0)|51|52|54|55|56|(0)(0)|117))(2:244|(11:246|243|48|(0)(0)|51|52|54|55|56|(0)(0)|117)(10:247|48|(0)(0)|51|52|54|55|56|(0)(0)|117)))))(1:249)|248|(1:31)|(0)(0)))|250|251)|(1:111)(1:(1:113)(1:114))|250|251))|276|6|7|(0)(0)|(0)(0)|250|251|(3:(0)|(0)|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:3|(7:5|6|7|(2:252|(1:(2:255|(8:257|258|259|73|(12:75|76|(1:78)|79|(5:81|(1:83)|84|(2:86|87)(1:89)|88)|90|91|(1:93)(1:115)|94|(1:96)|97|(2:101|102))(1:116)|103|(1:105)|106)(2:260|261))(8:262|263|264|148|(10:150|151|(1:153)|154|(5:156|(1:158)|159|(2:161|162)(1:164)|163)|165|166|(1:168)|169|(2:173|174))(1:178)|175|(1:177)|106))(9:265|266|267|190|191|(6:193|(1:195)(1:204)|196|(1:198)|199|(1:203))|205|(1:207)|209))(4:9|(2:11|(5:13|(2:15|(6:17|(4:20|(2:22|23)(1:25)|24|18)|26|27|(1:29)|(1:(2:40|(12:42|(2:44|(1:46)(2:239|240))(1:241)|47|48|(1:50)(2:(1:233)(2:235|(1:237)(1:238))|234)|51|52|54|55|56|(3:58|59|(2:61|(5:67|68|69|70|(6:72|73|(0)(0)|103|(0)|106))(3:63|64|65))(2:145|(6:147|148|(0)(0)|175|(0)|106)))(7:182|183|184|185|186|187|(7:189|190|191|(0)|205|(0)|209))|117)(11:242|243|48|(0)(0)|51|52|54|55|56|(0)(0)|117))(2:244|(11:246|243|48|(0)(0)|51|52|54|55|56|(0)(0)|117)(10:247|48|(0)(0)|51|52|54|55|56|(0)(0)|117)))))(1:249)|248|(1:31)|(0)(0)))|250|251)|(1:111)(1:(1:113)(1:114))|250|251))|7|(0)(0)|(0)(0)|250|251) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0444, code lost:
    
        if (r4 == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0446, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0447, code lost:
    
        r24.Y = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x04d5, code lost:
    
        if (r4 == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04c2, code lost:
    
        if (r4 != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0220, code lost:
    
        r23 = 1;
        r3 = r3;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x02b2, code lost:
    
        r23 = 1;
        r2 = r9;
        r3 = r3;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x021b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x021c, code lost:
    
        r23 = 1;
        r3 = r3;
        r4 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bf A[Catch: all -> 0x0050, Exception -> 0x021b, CancellationException -> 0x0220, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0220, blocks: (B:73:0x0208, B:75:0x020c, B:78:0x0213, B:79:0x0225, B:81:0x0240, B:83:0x0256, B:84:0x025a, B:86:0x0264, B:91:0x026c, B:94:0x027c, B:96:0x028a, B:97:0x0290, B:102:0x02ab, B:103:0x02b9, B:105:0x02bf, B:148:0x030f, B:150:0x0313, B:153:0x031a, B:154:0x0321, B:156:0x033c, B:158:0x0352, B:159:0x0356, B:161:0x0360, B:166:0x0368, B:168:0x0381, B:169:0x0387, B:174:0x03a2, B:175:0x03ab, B:177:0x03b1), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04aa A[Catch: all -> 0x0050, TryCatch #13 {all -> 0x0050, blocks: (B:258:0x0045, B:73:0x0208, B:75:0x020c, B:78:0x0213, B:79:0x0225, B:81:0x0240, B:83:0x0256, B:84:0x025a, B:86:0x0264, B:91:0x026c, B:94:0x027c, B:96:0x028a, B:97:0x0290, B:99:0x02a3, B:102:0x02ab, B:103:0x02b9, B:105:0x02bf, B:126:0x046c, B:132:0x0478, B:133:0x04bf, B:135:0x048e, B:136:0x0493, B:137:0x0494, B:138:0x04aa, B:263:0x006b, B:148:0x030f, B:150:0x0313, B:153:0x031a, B:154:0x0321, B:156:0x033c, B:158:0x0352, B:159:0x0356, B:161:0x0360, B:166:0x0368, B:168:0x0381, B:169:0x0387, B:171:0x039a, B:174:0x03a2, B:175:0x03ab, B:177:0x03b1, B:266:0x007c), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0313 A[Catch: all -> 0x0050, Exception -> 0x021b, CancellationException -> 0x0220, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0220, blocks: (B:73:0x0208, B:75:0x020c, B:78:0x0213, B:79:0x0225, B:81:0x0240, B:83:0x0256, B:84:0x025a, B:86:0x0264, B:91:0x026c, B:94:0x027c, B:96:0x028a, B:97:0x0290, B:102:0x02ab, B:103:0x02b9, B:105:0x02bf, B:148:0x030f, B:150:0x0313, B:153:0x031a, B:154:0x0321, B:156:0x033c, B:158:0x0352, B:159:0x0356, B:161:0x0360, B:166:0x0368, B:168:0x0381, B:169:0x0387, B:174:0x03a2, B:175:0x03ab, B:177:0x03b1), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b1 A[Catch: all -> 0x0050, Exception -> 0x021b, CancellationException -> 0x0220, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0220, blocks: (B:73:0x0208, B:75:0x020c, B:78:0x0213, B:79:0x0225, B:81:0x0240, B:83:0x0256, B:84:0x025a, B:86:0x0264, B:91:0x026c, B:94:0x027c, B:96:0x028a, B:97:0x0290, B:102:0x02ab, B:103:0x02b9, B:105:0x02bf, B:148:0x030f, B:150:0x0313, B:153:0x031a, B:154:0x0321, B:156:0x033c, B:158:0x0352, B:159:0x0356, B:161:0x0360, B:166:0x0368, B:168:0x0381, B:169:0x0387, B:174:0x03a2, B:175:0x03ab, B:177:0x03b1), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03de A[Catch: all -> 0x03f2, Exception -> 0x03f6, CancellationException -> 0x03fa, TryCatch #14 {all -> 0x03f2, blocks: (B:191:0x03da, B:193:0x03de, B:195:0x03ed, B:196:0x03fe, B:198:0x0418, B:199:0x041e, B:201:0x042b, B:203:0x0431, B:205:0x0436, B:207:0x043c, B:184:0x03c4, B:187:0x03cf), top: B:183:0x03c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x043c A[Catch: all -> 0x03f2, Exception -> 0x03f6, CancellationException -> 0x03fa, TRY_LEAVE, TryCatch #14 {all -> 0x03f2, blocks: (B:191:0x03da, B:193:0x03de, B:195:0x03ed, B:196:0x03fe, B:198:0x0418, B:199:0x041e, B:201:0x042b, B:203:0x0431, B:205:0x0436, B:207:0x043c, B:184:0x03c4, B:187:0x03cf), top: B:183:0x03c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020c A[Catch: all -> 0x0050, Exception -> 0x021b, CancellationException -> 0x0220, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0220, blocks: (B:73:0x0208, B:75:0x020c, B:78:0x0213, B:79:0x0225, B:81:0x0240, B:83:0x0256, B:84:0x025a, B:86:0x0264, B:91:0x026c, B:94:0x027c, B:96:0x028a, B:97:0x0290, B:102:0x02ab, B:103:0x02b9, B:105:0x02bf, B:148:0x030f, B:150:0x0313, B:153:0x031a, B:154:0x0321, B:156:0x033c, B:158:0x0352, B:159:0x0356, B:161:0x0360, B:166:0x0368, B:168:0x0381, B:169:0x0387, B:174:0x03a2, B:175:0x03ab, B:177:0x03b1), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0089  */
    /* JADX WARN: Type inference failed for: r3v2, types: [xe4] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r9v0, types: [fw4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(boolean r25, defpackage.gj0 r26) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye4.t(boolean, gj0):java.lang.Object");
    }

    public final void u() {
        fw4 fw4Var = this.r;
        fw4Var.getClass();
        fw4Var.i(null, o91.I);
        Boolean bool = Boolean.TRUE;
        fw4 fw4Var2 = this.v;
        fw4Var2.getClass();
        fw4Var2.i(null, bool);
        this.B = 0;
        this.C = "";
    }

    public final void v(re4 re4Var) {
        if (re4Var != re4.J) {
            fw4 fw4Var = this.l;
            fw4Var.getClass();
            fw4Var.i(null, o91.I);
            Boolean bool = Boolean.TRUE;
            fw4 fw4Var2 = this.Q;
            fw4Var2.getClass();
            fw4Var2.i(null, bool);
            this.U = 0;
            this.V = "";
        }
        if (re4Var != re4.K) {
            w();
        }
        if (re4Var != re4.L) {
            u();
        }
    }

    public final void w() {
        fw4 fw4Var = this.p;
        fw4Var.getClass();
        fw4Var.i(null, o91.I);
        Boolean bool = Boolean.TRUE;
        fw4 fw4Var2 = this.t;
        fw4Var2.getClass();
        fw4Var2.i(null, bool);
        this.z = 0;
        this.A = "";
    }

    public final void x(String str) {
        this.c.c(str, "search.query");
        rv4 rv4Var = this.X;
        fj0 fj0Var = null;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        rv4 rv4Var2 = this.Y;
        if (rv4Var2 != null) {
            rv4Var2.e(null);
        }
        v((re4) this.n.getValue());
        p70.g0(o7.B(this), null, null, new we4(this, fj0Var, (byte) 3), 3);
    }

    public final boolean z(re4 re4Var) {
        int ordinal = re4Var.ordinal();
        if (ordinal == 0) {
            return ((Boolean) this.Q.getValue()).booleanValue();
        }
        if (ordinal == 1) {
            return ((Boolean) this.t.getValue()).booleanValue();
        }
        if (ordinal == 2) {
            return ((Boolean) this.v.getValue()).booleanValue();
        }
        s83.v();
        return false;
    }
}
