package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ez3 {
    public static final jy3 Companion = new jy3();
    public final fw4 a;
    public final p04 b;
    public final fz4 c;
    public final dj0 d;
    public rv4 e;
    public int f;
    public boolean g;
    public final Handler h;
    public od2 i;

    public ez3() {
        fw4 c = o7.c(new vy3(null, null, null, null, 63));
        this.a = c;
        this.b = sv2.j(c);
        fz4 b = ui4.b();
        this.c = b;
        os0 os0Var = sx0.a;
        this.d = i42.H(p70.p0(b, ju2.a.L));
        this.h = new Handler(Looper.getMainLooper());
    }

    public static Bitmap e(String str) {
        Object g54Var;
        if (jx4.L(str)) {
            return null;
        }
        try {
            if (qx4.y(str, "data:image/", false)) {
                str = jx4.a0(str, "base64,");
            }
            byte[] decode = Base64.decode(str, 0);
            g54Var = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable th) {
            g54Var = new g54(th);
        }
        return (Bitmap) (g54Var instanceof g54 ? null : g54Var);
    }

    public static String h(JSONObject jSONObject) {
        Object g54Var;
        String optString = jSONObject != null ? jSONObject.optString("qr") : null;
        if (optString == null) {
            optString = "";
        }
        if (jx4.L(optString) || optString.equals("null")) {
            return null;
        }
        try {
            JSONObject optJSONObject = new JSONObject(optString).optJSONObject("data");
            g54Var = optJSONObject != null ? optJSONObject.optString("qrcode") : null;
        } catch (Throwable th) {
            g54Var = new g54(th);
        }
        if (g54Var instanceof g54) {
            g54Var = null;
        }
        String str = (String) g54Var;
        if (str == null || jx4.L(str) || str.equals("null")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.od2 r6, defpackage.gj0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.wy3
            if (r0 == 0) goto L13
            r0 = r7
            wy3 r0 = (defpackage.wy3) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            wy3 r0 = new wy3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.I
            int r1 = r0.K
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.mu0.V(r7)
            goto L3d
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r2
        L2c:
            defpackage.mu0.V(r7)
            r0.K = r3
            r3 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r7 = r5.b(r6, r3, r0)
            el0 r5 = defpackage.el0.I
            if (r7 != r5) goto L3d
            return r5
        L3d:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 == 0) goto L42
            return r7
        L42:
            java.lang.String r5 = "抖音二维码生成超时，请重试"
            defpackage.zy.i(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.a(od2, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r0v20, types: [char, int] */
    /* JADX WARN: Type inference failed for: r0v28, types: [char, int] */
    /* JADX WARN: Type inference failed for: r8v2, types: [char, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0154 -> B:12:0x015c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.od2 r23, long r24, defpackage.gj0 r26) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.b(od2, long, gj0):java.lang.Object");
    }

    public final void c(String str) {
        if (this.g) {
            return;
        }
        rv4 rv4Var = this.e;
        fj0 fj0Var = null;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.a.i(null, new vy3(uy3.J, str, null, null, 60));
        this.e = p70.g0(this.d, null, null, new h40((Object) this, fj0Var, (byte) 18), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:64|(1:65)|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|83|84|85|86|87|88|(1:90)|(5:94|95|96|97|(0))|92|93) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|83|84|85|86|87|88|(1:90)|(5:94|95|96|97|(0))|92|93) */
    /* JADX WARN: Can't wrap try/catch for region: R(29:130|(1:131)|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|(1:158)|(2:160|161)(7:162|163|164|165|166|167|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025c, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0264, code lost:
    
        r51 = r8;
        r8 = r2;
        r2 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x025f, code lost:
    
        r39 = r4;
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x026a, code lost:
    
        r39 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x026c, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0270, code lost:
    
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0273, code lost:
    
        r22 = r5;
        r24 = r13;
        r5 = r13;
        r13 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x027c, code lost:
    
        r26 = r3;
        r22 = r5;
        r24 = r13;
        r5 = r13;
        r13 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0286, code lost:
    
        r2 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0289, code lost:
    
        r26 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x028b, code lost:
    
        r22 = r5;
        r5 = r13;
        r13 = r32;
        r24 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03ab, code lost:
    
        r6 = r13;
        r15 = r4;
        r7 = r10;
        r8 = r18;
        r0 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03a0, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03a3, code lost:
    
        r23 = r0;
        r24 = r6;
        r26 = r8;
        r30 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03b4, code lost:
    
        r24 = r6;
        r26 = r8;
        r30 = r11;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03be, code lost:
    
        r15 = r4;
        r7 = r10;
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03c3, code lost:
    
        r28 = r2;
        r24 = r6;
        r26 = r8;
        r30 = r11;
        r6 = r13;
        r2 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03d2, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03d6, code lost:
    
        r24 = r6;
        r26 = r8;
        r30 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03dc, code lost:
    
        r6 = r13;
        r2 = r39;
        r4 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03e3, code lost:
    
        r28 = r2;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03ea, code lost:
    
        r28 = r2;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03f0, code lost:
    
        r24 = r6;
        r26 = r8;
        r30 = r11;
        r10 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02cc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x0465 -> B:14:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.od2 r56, defpackage.gj0 r57) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.d(od2, gj0):java.lang.Object");
    }

    public final void f() {
        if (this.g) {
            return;
        }
        this.g = true;
        rv4 rv4Var = this.e;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.e = null;
        this.a.i(null, new vy3(null, null, null, null, 63));
        this.c.e(null);
        od2 od2Var = this.i;
        this.i = null;
        if (od2Var != null) {
            iy3 iy3Var = new iy3(od2Var, (byte) 0);
            if (j42.c(Looper.myLooper(), Looper.getMainLooper())) {
                iy3Var.invoke();
            } else {
                this.h.post(new h(iy3Var, (byte) 18));
            }
        }
    }

    public final void g(String str) {
        if (this.g) {
            return;
        }
        int i = this.f;
        if (i >= 8) {
            fw4 fw4Var = this.a;
            fw4Var.i(null, vy3.a((vy3) fw4Var.getValue(), uy3.M, str, null, false, 56));
            return;
        }
        int i2 = i + 1;
        this.f = i2;
        Log.i("QrLoginManager", "qr expired, restarting login (#" + i2 + ")");
        c("二维码已过期，正在重新生成");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:155|156|(1:158)(1:448)|(1:160)|161|(2:163|(32:428|429|(1:431)(1:443)|432|(1:434)|435|(1:442)|441|(1:167)(1:427)|168|(1:426)(1:174)|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|193|194|195|(2:197|198)(51:199|200|201|202|203|204|(1:206)|207|(1:401)(4:(1:210)(1:400)|(1:212)|213|(1:399))|(1:398)(8:220|221|222|223|(1:225)|226|(1:394)(3:228|(2:230|(1:232))(1:393)|392)|233)|(2:390|391)(3:(3:237|(1:239)|(3:(1:244)(1:247)|245|246))|248|249)|250|(2:252|(5:254|255|(1:387)(1:259)|(1:386)(1:262)|(31:317|318|319|320|321|322|323|324|325|326|327|328|329|330|331|332|333|334|335|336|337|338|339|340|341|342|343|344|345|346|(1:357)(19:348|349|350|351|(1:353)(1:356)|354|355|17|(5:19|(1:21)(1:493)|22|(1:24)(1:492)|25)(1:494)|26|(3:488|489|(1:491))(1:30)|31|(1:487)(1:35)|(1:486)(1:42)|(1:485)(1:47)|48|49|(1:484)(1:53)|(10:64|65|(1:483)(8:(1:482)(1:71)|481|(1:75)(1:480)|(2:476|(4:478|82|83|(0)(0))(1:479))(3:77|(1:79)(1:475)|80)|81|82|83|(0)(0))|73|(0)(0)|(0)(0)|81|82|83|(0)(0))(2:62|63)))(2:265|(31:315|17|(0)(0)|26|(1:28)|488|489|(0)|31|(1:33)|487|(1:37)|486|(0)|485|48|49|(1:51)|484|(2:58|60)|64|65|(1:67)|483|73|(0)(0)|(0)(0)|81|82|83|(0)(0))(57:270|271|272|273|274|275|276|277|278|279|280|281|282|283|284|285|286|287|288|289|290|291|292|(1:295)|294|15|16|17|(0)(0)|26|(0)|488|489|(0)|31|(0)|487|(0)|486|(0)|485|48|49|(0)|484|(0)|64|65|(0)|483|73|(0)(0)|(0)(0)|81|82|83|(0)(0)))))(1:389)|388|255|(1:257)|387|(0)|386|(0)|317|318|319|320|321|322|323|324|325|326|327|328|329|330|331|332|333|334|335|336|337|338|339|340|341|342|343|344|345|346|(0)(0))))(1:447)|165|(0)(0)|168|(1:170)|426|175|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|193|194|195|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(51:199|(1:200)|201|202|203|204|(1:206)|207|(1:401)(4:(1:210)(1:400)|(1:212)|213|(1:399))|(1:398)(8:220|221|222|223|(1:225)|226|(1:394)(3:228|(2:230|(1:232))(1:393)|392)|233)|(2:390|391)(3:(3:237|(1:239)|(3:(1:244)(1:247)|245|246))|248|249)|250|(2:252|(5:254|255|(1:387)(1:259)|(1:386)(1:262)|(31:317|318|319|320|321|322|323|324|325|326|327|328|329|330|331|332|333|334|335|336|337|338|339|340|341|342|343|344|345|346|(1:357)(19:348|349|350|351|(1:353)(1:356)|354|355|17|(5:19|(1:21)(1:493)|22|(1:24)(1:492)|25)(1:494)|26|(3:488|489|(1:491))(1:30)|31|(1:487)(1:35)|(1:486)(1:42)|(1:485)(1:47)|48|49|(1:484)(1:53)|(10:64|65|(1:483)(8:(1:482)(1:71)|481|(1:75)(1:480)|(2:476|(4:478|82|83|(0)(0))(1:479))(3:77|(1:79)(1:475)|80)|81|82|83|(0)(0))|73|(0)(0)|(0)(0)|81|82|83|(0)(0))(2:62|63)))(2:265|(31:315|17|(0)(0)|26|(1:28)|488|489|(0)|31|(1:33)|487|(1:37)|486|(0)|485|48|49|(1:51)|484|(2:58|60)|64|65|(1:67)|483|73|(0)(0)|(0)(0)|81|82|83|(0)(0))(57:270|271|272|273|274|275|276|277|278|279|280|281|282|283|284|285|286|287|288|289|290|291|292|(1:295)|294|15|16|17|(0)(0)|26|(0)|488|489|(0)|31|(0)|487|(0)|486|(0)|485|48|49|(0)|484|(0)|64|65|(0)|483|73|(0)(0)|(0)(0)|81|82|83|(0)(0)))))(1:389)|388|255|(1:257)|387|(0)|386|(0)|317|318|319|320|321|322|323|324|325|326|327|328|329|330|331|332|333|334|335|336|337|338|339|340|341|342|343|344|345|346|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(51:199|200|201|202|203|204|(1:206)|207|(1:401)(4:(1:210)(1:400)|(1:212)|213|(1:399))|(1:398)(8:220|221|222|223|(1:225)|226|(1:394)(3:228|(2:230|(1:232))(1:393)|392)|233)|(2:390|391)(3:(3:237|(1:239)|(3:(1:244)(1:247)|245|246))|248|249)|250|(2:252|(5:254|255|(1:387)(1:259)|(1:386)(1:262)|(31:317|318|319|320|321|322|323|324|325|326|327|328|329|330|331|332|333|334|335|336|337|338|339|340|341|342|343|344|345|346|(1:357)(19:348|349|350|351|(1:353)(1:356)|354|355|17|(5:19|(1:21)(1:493)|22|(1:24)(1:492)|25)(1:494)|26|(3:488|489|(1:491))(1:30)|31|(1:487)(1:35)|(1:486)(1:42)|(1:485)(1:47)|48|49|(1:484)(1:53)|(10:64|65|(1:483)(8:(1:482)(1:71)|481|(1:75)(1:480)|(2:476|(4:478|82|83|(0)(0))(1:479))(3:77|(1:79)(1:475)|80)|81|82|83|(0)(0))|73|(0)(0)|(0)(0)|81|82|83|(0)(0))(2:62|63)))(2:265|(31:315|17|(0)(0)|26|(1:28)|488|489|(0)|31|(1:33)|487|(1:37)|486|(0)|485|48|49|(1:51)|484|(2:58|60)|64|65|(1:67)|483|73|(0)(0)|(0)(0)|81|82|83|(0)(0))(57:270|271|272|273|274|275|276|277|278|279|280|281|282|283|284|285|286|287|288|289|290|291|292|(1:295)|294|15|16|17|(0)(0)|26|(0)|488|489|(0)|31|(0)|487|(0)|486|(0)|485|48|49|(0)|484|(0)|64|65|(0)|483|73|(0)(0)|(0)(0)|81|82|83|(0)(0)))))(1:389)|388|255|(1:257)|387|(0)|386|(0)|317|318|319|320|321|322|323|324|325|326|327|328|329|330|331|332|333|334|335|336|337|338|339|340|341|342|343|344|345|346|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(57:270|(1:271)|272|273|274|275|276|277|278|279|280|281|282|283|284|285|286|287|288|289|290|291|292|(1:295)|294|15|16|17|(0)(0)|26|(0)|488|489|(0)|31|(0)|487|(0)|486|(0)|485|48|49|(0)|484|(0)|64|65|(0)|483|73|(0)(0)|(0)(0)|81|82|83|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(57:270|271|272|273|274|275|276|277|278|279|280|281|282|283|284|285|286|287|288|289|290|291|292|(1:295)|294|15|16|17|(0)(0)|26|(0)|488|489|(0)|31|(0)|487|(0)|486|(0)|485|48|49|(0)|484|(0)|64|65|(0)|483|73|(0)(0)|(0)(0)|81|82|83|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x096b, code lost:
    
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0966, code lost:
    
        r29 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0969, code lost:
    
        r29 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x096e, code lost:
    
        r29 = r0;
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0972, code lost:
    
        r66 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0975, code lost:
    
        r15 = r66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0978, code lost:
    
        r15 = r66;
        r29 = r0;
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x087f, code lost:
    
        r10 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x088c, code lost:
    
        r4 = r2;
        r29 = r5;
        r15 = r7;
        r5 = r8;
        r8 = r31;
        r2 = r0;
        r0 = r66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0882, code lost:
    
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0889, code lost:
    
        r10 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0885, code lost:
    
        r31 = r3;
        r66 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0897, code lost:
    
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0899, code lost:
    
        r66 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x089b, code lost:
    
        r10 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x089f, code lost:
    
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x08a1, code lost:
    
        r66 = r10;
        r27 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x08a6, code lost:
    
        r35 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x08a9, code lost:
    
        r37 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x08ac, code lost:
    
        r37 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x08af, code lost:
    
        r33 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x08b1, code lost:
    
        r66 = r10;
        r10 = r57;
        r37 = r58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0648, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0661, code lost:
    
        r6 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x064a, code lost:
    
        r60 = r31;
        r31 = r8;
        r8 = r60;
        r60 = r35;
        r35 = r1;
        r1 = r3;
        r3 = r7;
        r7 = r11;
        r36 = r33;
        r33 = r12;
        r11 = r29;
        r29 = r60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0660, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0664, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0665, code lost:
    
        r33 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0667, code lost:
    
        r4 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x066a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x066b, code lost:
    
        r29 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x066e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x066f, code lost:
    
        r15 = r4;
        r35 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0673, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0674, code lost:
    
        r15 = r4;
        r31 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0678, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0679, code lost:
    
        r31 = r5;
        r19 = r15;
        r6 = r57;
        r15 = r4;
        r4 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0aa9, code lost:
    
        if (r11.optBoolean("scanned") == true) goto L418;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0758 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x07dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0a4b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0af3  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0a6b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a6  */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:278:0x095b -> B:15:0x0961). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:298:0x099d -> B:17:0x09c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:338:0x08d1 -> B:17:0x09c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.od2 r66, defpackage.gj0 r67) {
        /*
            Method dump skipped, instructions count: 2900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.i(od2, gj0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(4:21|22|23|(1:25))|11|12|(1:17)(2:14|15)))|28|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0026, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        r4 = new defpackage.g54(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.od2 r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.az3
            if (r0 == 0) goto L13
            r0 = r6
            az3 r0 = (defpackage.az3) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            az3 r0 = new az3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.I
            int r6 = r0.K
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L2e
            if (r6 != r1) goto L28
            defpackage.mu0.V(r4)     // Catch: java.lang.Throwable -> L26
            goto L3e
        L26:
            r4 = move-exception
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L2e:
            defpackage.mu0.V(r4)
            java.lang.String r4 = "\n(function(){\n  try {\n    return JSON.stringify({\n      qr: window.__dyQr || null,\n      poll: window.__dyPoll || null,\n      pollAt: window.__dyPollAt || 0\n    });\n  } catch (e) { return JSON.stringify({error:String(e)}); }\n})()\n"
            r0.K = r1     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r5.c(r4, r0)     // Catch: java.lang.Throwable -> L26
            el0 r5 = defpackage.el0.I
            if (r4 != r5) goto L3e
            return r5
        L3e:
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch: java.lang.Throwable -> L26
            goto L47
        L41:
            g54 r5 = new g54
            r5.<init>(r4)
            r4 = r5
        L47:
            boolean r5 = r4 instanceof defpackage.g54
            if (r5 == 0) goto L4d
            goto L4e
        L4d:
            r2 = r4
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.j(od2, gj0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(1:(1:9)(2:17|18))(2:19|(1:21))|10|11|12|13))|22|6|(0)(0)|10|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.gj0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.bz3
            if (r0 == 0) goto L13
            r0 = r5
            bz3 r0 = (defpackage.bz3) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            bz3 r0 = new bz3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.J
            int r5 = r0.L
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L2e
            if (r5 != r2) goto L28
            android.webkit.CookieManager r5 = r0.I
            defpackage.mu0.V(r4)
            goto L4b
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r1
        L2e:
            defpackage.mu0.V(r4)
            android.webkit.CookieManager r5 = android.webkit.CookieManager.getInstance()
            gu2 r4 = new gu2
            r3 = 10
            r4.<init>(r5, r1, r3)
            r0.I = r5
            r0.L = r2
            r1 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r4 = defpackage.qi4.n(r1, r4, r0)
            el0 r0 = defpackage.el0.I
            if (r4 != r0) goto L4b
            return r0
        L4b:
            r5.flush()     // Catch: java.lang.Throwable -> L4e
        L4e:
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.k(gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e6, code lost:
    
        if (i(r4, r2) == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r1 != r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0097, code lost:
    
        if (r4.e(r2) == r3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.gj0 r18) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez3.l(gj0):java.lang.Object");
    }

    public final void m() {
        if (this.g) {
            return;
        }
        this.f = 0;
        c("正在打开抖音登录页");
    }
}
