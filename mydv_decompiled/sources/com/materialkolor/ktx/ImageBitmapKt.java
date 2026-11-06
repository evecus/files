package com.materialkolor.ktx;

import androidx.media3.exoplayer.RendererCapabilities;
import defpackage.ad4;
import defpackage.de0;
import defpackage.fe0;
import defpackage.fw2;
import defpackage.fz3;
import defpackage.go1;
import defpackage.hn1;
import defpackage.jp;
import defpackage.lw2;
import defpackage.mw2;
import defpackage.o70;
import defpackage.p70;
import defpackage.qb;
import defpackage.t43;
import defpackage.tw1;
import defpackage.vt0;
import defpackage.vw1;
import defpackage.ww1;
import defpackage.x70;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ImageBitmapKt {
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03ce, code lost:
    
        r1 = new java.util.ArrayList();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03d5, code lost:
    
        if (r2 >= r7) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03d7, code lost:
    
        r5 = (defpackage.hz3[]) r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03db, code lost:
    
        if (r5 == null) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03dd, code lost:
    
        r5 = r5[r2];
        r9 = r6.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03e1, code lost:
    
        if (r9 == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03e3, code lost:
    
        r9 = defpackage.sv2.c0(r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03e7, code lost:
    
        if (r9 <= 0) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03e9, code lost:
    
        r10 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03eb, code lost:
    
        if (r10 == null) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03ed, code lost:
    
        r10 = defpackage.sv2.c0(r5, r10) / r9;
        r11 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03f4, code lost:
    
        if (r11 == null) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03f6, code lost:
    
        r11 = defpackage.sv2.c0(r5, r11) / r9;
        r12 = r6.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03fd, code lost:
    
        if (r12 == null) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03ff, code lost:
    
        r1.add(java.lang.Integer.valueOf(((defpackage.sv2.c0(r5, r12) / r9) & 255) | ((((r10 & 255) << 16) | (-16777216)) | ((r11 & 255) << 8))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0427, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x041b, code lost:
    
        defpackage.j42.g0("momentsB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x041e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x041f, code lost:
    
        defpackage.j42.g0("momentsG");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0422, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0423, code lost:
    
        defpackage.j42.g0("momentsR");
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0426, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x042a, code lost:
    
        defpackage.j42.g0("weights");
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x042d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x042e, code lost:
    
        defpackage.j42.g0(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0431, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0432, code lost:
    
        r2 = new java.util.LinkedHashMap();
        r5 = r1.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x043d, code lost:
    
        if (r6 >= r5) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x043f, code lost:
    
        r7 = r1.get(r6);
        r6 = r6 + 1;
        r2.put(java.lang.Integer.valueOf(((java.lang.Number) r7).intValue()), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0457, code lost:
    
        r1 = r2.keySet();
        r2 = r1.size();
        r5 = new int[r2];
        r1 = r1.iterator();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x046b, code lost:
    
        if (r1.hasNext() == false) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x046d, code lost:
    
        r5[r6] = ((java.lang.Number) r1.next()).intValue();
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x047d, code lost:
    
        r1 = new defpackage.a16();
        r1.J = 272008;
        r1.K = 0;
        r1.L = 0;
        r1.M = 0;
        r1.N = -272009;
        r1.O = 278536192;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x049c, code lost:
    
        if (r6 >= 64) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x049e, code lost:
    
        r1.b();
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x04a4, code lost:
    
        r6 = new java.util.LinkedHashMap();
        r7 = new double[r4][];
        r9 = new int[r4];
        r10 = 0;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x04b0, code lost:
    
        if (r10 >= r4) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04b2, code lost:
    
        r13 = r3[r10];
        r14 = (java.lang.Integer) r6.get(java.lang.Integer.valueOf(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x04be, code lost:
    
        if (r14 != null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04c0, code lost:
    
        r14 = defpackage.p70.d0(r13);
        r17 = r14[0];
        r20 = r14[1];
        r22 = r14[r8];
        r12 = new double[3];
        r12[0] = r17;
        r12[1] = r20;
        r12[r8] = r22;
        r7[r11] = r12;
        r9[r11] = r13;
        r11 = r11 + 1;
        r6.put(java.lang.Integer.valueOf(r13), 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04fa, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04e7, code lost:
    
        r6.put(java.lang.Integer.valueOf(r13), java.lang.Integer.valueOf(r14.intValue() + 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04fd, code lost:
    
        r3 = new int[r11];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0500, code lost:
    
        if (r4 >= r11) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0502, code lost:
    
        r10 = r6.get(java.lang.Integer.valueOf(r9[r4]));
        r10.getClass();
        r3[r4] = ((java.lang.Number) r10).intValue();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x051a, code lost:
    
        r0 = java.lang.Math.min(r37, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x051e, code lost:
    
        if (r2 != 0) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0521, code lost:
    
        r0 = java.lang.Math.min(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0525, code lost:
    
        r4 = new double[r0][];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0528, code lost:
    
        if (r6 >= r2) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x052a, code lost:
    
        r9 = defpackage.p70.d0(r5[r6]);
        r13 = r9[0];
        r17 = r9[1];
        r20 = r9[r8];
        r9 = new double[3];
        r9[0] = r13;
        r9[1] = r17;
        r9[r8] = r20;
        r4[r6] = r9;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0546, code lost:
    
        r2 = new int[r11];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0549, code lost:
    
        if (r5 >= r11) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x054b, code lost:
    
        r2[r5] = r1.c(r0);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0554, code lost:
    
        r1 = new int[r0][];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0557, code lost:
    
        if (r5 >= r0) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0559, code lost:
    
        r1[r5] = new int[r0];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0560, code lost:
    
        r5 = new defpackage.gz3[r0][];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0563, code lost:
    
        if (r6 >= r0) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0565, code lost:
    
        r9 = new defpackage.gz3[r0];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0568, code lost:
    
        if (r10 >= r0) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x056a, code lost:
    
        r9[r10] = new defpackage.gz3();
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0574, code lost:
    
        r5[r6] = r9;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0579, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x057a, code lost:
    
        if (r6 >= r0) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x057c, code lost:
    
        r5[r6] = new defpackage.gz3[r0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0581, code lost:
    
        if (r9 >= r0) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0583, code lost:
    
        r5[r6][r9] = new defpackage.gz3();
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x058f, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0592, code lost:
    
        r6 = new int[r0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0597, code lost:
    
        if (r9 >= 10) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0599, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x059a, code lost:
    
        if (r10 >= r0) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x059c, code lost:
    
        r13 = r10 + 1;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x059f, code lost:
    
        if (r14 >= r0) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x05a1, code lost:
    
        r15 = r4[r10];
        r15.getClass();
        r34 = r8;
        r8 = r4[r14];
        r8.getClass();
        r12 = defpackage.sv2.v(r15, r8);
        r8 = r5[r14][r10];
        r8.getClass();
        r8.J = r12;
        r8 = r5[r14][r10];
        r8.getClass();
        r8.I = r10;
        r8 = r5[r10][r14];
        r8.getClass();
        r8.J = r12;
        r8 = r5[r10][r14];
        r8.getClass();
        r8.I = r14;
        r14 = r14 + 1;
        r13 = r13;
        r8 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x05df, code lost:
    
        r34 = r8;
        r37 = r13;
        r8 = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x05e7, code lost:
    
        if (r8.length <= 1) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x05e9, code lost:
    
        r12 = new defpackage.se3(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x05f0, code lost:
    
        if (r8.length <= 1) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05f2, code lost:
    
        java.util.Arrays.sort(r8, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05f5, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05f6, code lost:
    
        if (r8 >= r0) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05f8, code lost:
    
        r12 = r1[r10];
        r12.getClass();
        r13 = r5[r10][r8];
        r13.getClass();
        r12[r8] = r13.I;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x060b, code lost:
    
        r10 = r37;
        r8 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0611, code lost:
    
        r34 = r8;
        r8 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0615, code lost:
    
        if (r8 >= r11) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0617, code lost:
    
        r12 = r7[r8];
        r12.getClass();
        r13 = r2[r8];
        r14 = r4[r13];
        r14.getClass();
        r14 = defpackage.sv2.v(r12, r14);
        r18 = r1;
        r19 = r2;
        r20 = r14;
        r1 = 0;
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x062f, code lost:
    
        if (r1 >= r0) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0631, code lost:
    
        r23 = r1;
        r1 = r5[r13][r23];
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0637, code lost:
    
        if (r1 != null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0639, code lost:
    
        r22 = r3;
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x065e, code lost:
    
        r1 = r23 + 1;
        r3 = r22;
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x063e, code lost:
    
        r22 = r3;
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x064a, code lost:
    
        if (r1.J < (4.0d * r14)) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x064d, code lost:
    
        r1 = r24[r23];
        r1.getClass();
        r3 = defpackage.sv2.v(r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0658, code lost:
    
        if (r3 >= r20) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x065a, code lost:
    
        r20 = r3;
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0665, code lost:
    
        r22 = r3;
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x066a, code lost:
    
        if (r2 == (-1)) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x067d, code lost:
    
        if (java.lang.Math.abs(java.lang.Math.sqrt(r20) - java.lang.Math.sqrt(r14)) <= 3.0d) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x067f, code lost:
    
        r10 = r10 + 1;
        r19[r8] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0683, code lost:
    
        r8 = r8 + 1;
        r1 = r18;
        r2 = r19;
        r3 = r22;
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x068e, code lost:
    
        r18 = r1;
        r19 = r2;
        r22 = r3;
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0696, code lost:
    
        if (r10 != 0) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0698, code lost:
    
        if (r9 == 0) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0735, code lost:
    
        r1 = new java.util.LinkedHashMap();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x073b, code lost:
    
        if (r2 >= r0) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x073d, code lost:
    
        r3 = r6[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x073f, code lost:
    
        if (r3 != 0) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x079b, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0744, code lost:
    
        r4 = r24[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0746, code lost:
    
        if (r4 == null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0748, code lost:
    
        r7 = r4[0];
        r9 = r4[1];
        r11 = r4[r34];
        r4 = defpackage.p70.l;
        r7 = (r7 + 16.0d) / 116.0d;
        r4 = java.lang.Integer.valueOf(defpackage.p70.t(defpackage.p70.e0((r9 / 500.0d) + r7) * r4[0], defpackage.p70.e0(r7) * r4[1], defpackage.p70.e0(r7 - (r11 / 200.0d)) * r4[r34]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x078b, code lost:
    
        if (r4 == null) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0791, code lost:
    
        if (r1.containsKey(r4) == false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0794, code lost:
    
        r1.put(r4, java.lang.Integer.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0787, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x079e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x069c, code lost:
    
        r1 = new double[r0];
        r2 = new double[r0];
        r3 = new double[r0];
        r15 = 0;
        defpackage.dq.Y0(0, 0, 6, r6);
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x06a8, code lost:
    
        if (r4 >= r11) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x06aa, code lost:
    
        r8 = r19[r4];
        r10 = r7[r4];
        r12 = r22[r4];
        r6[r8] = r6[r8] + r12;
        r13 = r1[r8];
        r10.getClass();
        r20 = r10[r15];
        r15 = r1;
        r23 = r2;
        r1 = r12;
        r15[r8] = (r20 * r1) + r13;
        r23[r8] = (r10[1] * r1) + r23[r8];
        r3[r8] = (r10[r34] * r1) + r3[r8];
        r4 = r4 + 1;
        r1 = r15;
        r2 = r23;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x06e2, code lost:
    
        r15 = r1;
        r23 = r2;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x06e6, code lost:
    
        if (r1 >= r0) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x06e8, code lost:
    
        r2 = r6[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x06ea, code lost:
    
        if (r2 != 0) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x06ec, code lost:
    
        r24[r1] = new double[]{0.0d, 0.0d, 0.0d};
        r37 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x071d, code lost:
    
        r1 = r1 + 1;
        r15 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x06f7, code lost:
    
        r37 = r15;
        r14 = r2;
        r12 = r15[r1] / r14;
        r20 = r23[r1] / r14;
        r25 = r3[r1] / r14;
        r2 = r24[r1];
        r2.getClass();
        r2[0] = r12;
        r2 = r24[r1];
        r2.getClass();
        r2[1] = r20;
        r2 = r24[r1];
        r2.getClass();
        r2[r34] = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0722, code lost:
    
        r9 = r9 + 1;
        r1 = r18;
        r2 = r19;
        r3 = r22;
        r4 = r24;
        r8 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0731, code lost:
    
        r24 = r4;
        r34 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a3 A[LOOP:6: B:118:0x022e->B:147:0x03a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x039a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.Integer, java.lang.Integer> quantize(defpackage.fz3 r35, defpackage.tw1 r36, int r37) {
        /*
            Method dump skipped, instructions count: 1974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.materialkolor.ktx.ImageBitmapKt.quantize(fz3, tw1, int):java.util.Map");
    }

    /* renamed from: rememberThemeColor-sW7UJKQ, reason: not valid java name */
    public static final long m185rememberThemeColorsW7UJKQ(tw1 tw1Var, long j, boolean z, int i, fe0 fe0Var, int i2, int i3) {
        t43 t43Var;
        tw1Var.getClass();
        long j2 = (i3 & 2) != 0 ? ((fw2) ((go1) fe0Var).k(lw2.b)).a.a : j;
        boolean z2 = true;
        boolean z3 = (i3 & 4) != 0 ? true : z;
        int i4 = (i3 & 8) != 0 ? 128 : i;
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (Q == jpVar) {
            Q = ad4.w(new x70(j2));
            go1Var.o0(Q);
        }
        t43 t43Var2 = (t43) Q;
        Object[] objArr = {tw1Var, new x70(j2), Boolean.valueOf(z3), Integer.valueOf(i4)};
        boolean z4 = ((((i2 & 14) ^ 6) > 4 && go1Var.i(tw1Var)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && go1Var.f(j2)) || (i2 & 48) == 32) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && go1Var.h(z3)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
        if ((((i2 & 7168) ^ 3072) <= 2048 || !go1Var.e(i4)) && (i2 & 3072) != 2048) {
            z2 = false;
        }
        boolean z5 = z4 | z2;
        Object Q2 = go1Var.Q();
        if (z5 || Q2 == jpVar) {
            int i5 = i4;
            t43Var = t43Var2;
            vw1 vw1Var = new vw1(tw1Var, j2, z3, i5, t43Var, null);
            go1Var.o0(vw1Var);
            Q2 = vw1Var;
        } else {
            t43Var = t43Var2;
        }
        mw2.k(objArr, (hn1) Q2, go1Var);
        return ((x70) t43Var.getValue()).a;
    }

    /* renamed from: rememberThemeColors-8V94_ZQ, reason: not valid java name */
    public static final List<x70> m186rememberThemeColors8V94_ZQ(tw1 tw1Var, long j, int i, boolean z, int i2, fe0 fe0Var, int i3, int i4) {
        t43 t43Var;
        tw1Var.getClass();
        long j2 = (i4 & 2) != 0 ? ((fw2) ((go1) fe0Var).k(lw2.b)).a.a : j;
        int i5 = (i4 & 4) != 0 ? 128 : i;
        boolean z2 = true;
        boolean z3 = (i4 & 8) != 0 ? true : z;
        int i6 = (i4 & 16) != 0 ? 4 : i2;
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        if (Q == jpVar) {
            Q = ad4.w(p70.j0(new x70(j2)));
            go1Var.o0(Q);
        }
        t43 t43Var2 = (t43) Q;
        Object[] objArr = {tw1Var, new x70(j2), Boolean.valueOf(z3), Integer.valueOf(i5)};
        boolean z4 = ((((i3 & 14) ^ 6) > 4 && go1Var.i(tw1Var)) || (i3 & 6) == 4) | ((((i3 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && go1Var.e(i5)) || (i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i3 & 112) ^ 48) > 32 && go1Var.f(j2)) || (i3 & 48) == 32) | ((((i3 & 7168) ^ 3072) > 2048 && go1Var.h(z3)) || (i3 & 3072) == 2048);
        if ((((57344 & i3) ^ 24576) <= 16384 || !go1Var.e(i6)) && (i3 & 24576) != 16384) {
            z2 = false;
        }
        boolean z5 = z4 | z2;
        Object Q2 = go1Var.Q();
        if (z5 || Q2 == jpVar) {
            int i7 = i6;
            t43Var = t43Var2;
            ww1 ww1Var = new ww1(tw1Var, i5, j2, z3, i7, t43Var, null);
            go1Var.o0(ww1Var);
            Q2 = ww1Var;
        } else {
            t43Var = t43Var2;
        }
        mw2.k(objArr, (hn1) Q2, go1Var);
        return (List) t43Var.getValue();
    }

    /* renamed from: themeColor-RPmYEkk, reason: not valid java name */
    public static final long m187themeColorRPmYEkk(tw1 tw1Var, long j, boolean z, int i) {
        tw1Var.getClass();
        return ((x70) o70.T0(m190themeColorsXOJAsU$default(tw1Var, i, j, z, 0, 8, null))).a;
    }

    /* renamed from: themeColor-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ long m188themeColorRPmYEkk$default(tw1 tw1Var, long j, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            i = 128;
        }
        return m187themeColorRPmYEkk(tw1Var, j, z, i);
    }

    public static final x70 themeColorOrNull(tw1 tw1Var, boolean z, int i) {
        tw1Var.getClass();
        Integer num = (Integer) o70.U0(vt0.X(quantize(fz3.a, tw1Var, i), 1, null, z));
        if (num != null) {
            return new x70(qb.i(num.intValue()));
        }
        return null;
    }

    public static /* synthetic */ x70 themeColorOrNull$default(tw1 tw1Var, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            i = 128;
        }
        return themeColorOrNull(tw1Var, z, i);
    }

    /* renamed from: themeColors-XO-JAsU, reason: not valid java name */
    public static final List<x70> m189themeColorsXOJAsU(tw1 tw1Var, int i, long j, boolean z, int i2) {
        tw1Var.getClass();
        ArrayList X = vt0.X(quantize(fz3.a, tw1Var, i), i2, Integer.valueOf(qb.i0(j)), z);
        ArrayList arrayList = new ArrayList(p70.J(X, 10));
        int size = X.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = X.get(i3);
            i3++;
            arrayList.add(new x70(qb.i(((Number) obj).intValue())));
        }
        return arrayList;
    }

    /* renamed from: themeColors-XO-JAsU$default, reason: not valid java name */
    public static /* synthetic */ List m190themeColorsXOJAsU$default(tw1 tw1Var, int i, long j, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 128;
        }
        if ((i3 & 2) != 0) {
            j = qb.i(-12417548);
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        if ((i3 & 8) != 0) {
            i2 = 4;
        }
        return m189themeColorsXOJAsU(tw1Var, i, j, z, i2);
    }
}
