package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class c91 {
    public static final Pattern a = Pattern.compile("\\[[^\\[\\]]+\\]");

    public static final void a(String str, l13 l13Var, cw4 cw4Var, m65 m65Var, long j, int i, Map map, fe0 fe0Var, int i2) {
        int i3;
        go1 go1Var;
        l13 l13Var2;
        Map map2;
        str.getClass();
        cw4Var.getClass();
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.f0(1478615789);
        if ((i2 & 6) == 0) {
            i3 = (go1Var2.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= go1Var2.g(cw4Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= go1Var2.g(m65Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= go1Var2.f(j) ? 16384 : 8192;
        }
        int i5 = i4 | 196608;
        if ((1572864 & i2) == 0) {
            i5 |= go1Var2.e(i) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= go1Var2.e(2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= (134217728 & i2) == 0 ? go1Var2.g(map) : go1Var2.i(map) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if (go1Var2.T(i5 & 1, (38347923 & i5) != 38347922)) {
            go1Var2.Y();
            if ((i2 & 1) == 0 || go1Var2.C()) {
                l13Var2 = i13.a;
            } else {
                go1Var2.W();
                l13Var2 = l13Var;
            }
            go1Var2.r();
            boolean z = (i5 & 896) == 256;
            Object Q = go1Var2.Q();
            if (z || Q == de0.a) {
                Q = new b91(cw4Var);
                go1Var2.o0(Q);
            }
            g80 g80Var = (g80) Q;
            if (map == null) {
                go1Var2.d0(-684378446);
                Map map3 = (Map) wi4.g(t81.c, go1Var2).getValue();
                go1Var2.q(false);
                map2 = map3;
            } else {
                go1Var2.d0(-684380027);
                go1Var2.q(false);
                map2 = map;
            }
            go1Var = go1Var2;
            b(str, l13Var2, g80Var, m65Var, j, i, map2, go1Var, i5 & 33553534);
        } else {
            go1Var = go1Var2;
            go1Var.W();
            l13Var2 = l13Var;
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new z81(str, l13Var2, cw4Var, m65Var, j, i, map, i2, (byte) 2);
        }
    }

    public static final void b(String str, l13 l13Var, g80 g80Var, m65 m65Var, long j, int i, Map map, fe0 fe0Var, int i2) {
        go1 go1Var;
        x04 x04Var;
        z81 z81Var;
        go1 go1Var2;
        int i3;
        int i4;
        m65 m65Var2;
        boolean z;
        int i5;
        int i6;
        go1 go1Var3 = (go1) fe0Var;
        go1Var3.f0(1932314656);
        int i7 = (i2 & 6) == 0 ? (go1Var3.g(str) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i7 |= go1Var3.g(l13Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= (i2 & 512) == 0 ? go1Var3.g(g80Var) : go1Var3.i(g80Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i7 |= go1Var3.g(m65Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i7 |= go1Var3.f(j) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i7 |= go1Var3.g(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i7 |= go1Var3.e(i) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i7 |= go1Var3.e(2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i7 |= (i2 & C.BUFFER_FLAG_FIRST_SAMPLE) == 0 ? go1Var3.g(map) : go1Var3.i(map) ? 67108864 : 33554432;
        }
        int i8 = i7;
        if (go1Var3.T(i8 & 1, (i8 & 38347923) != 38347922)) {
            if (p65.a(j, p65.c)) {
                go1Var2 = go1Var3;
                i3 = 2;
                i4 = 4;
                m65Var2 = m65Var;
            } else {
                go1Var2 = go1Var3;
                i3 = 2;
                i4 = 4;
                m65Var2 = m65.a(m65Var, 0L, 0L, null, null, 0L, null, j, null, 16646143);
            }
            if (map.isEmpty() || !jx4.E(str, '[')) {
                go1 go1Var4 = go1Var2;
                m65 m65Var3 = m65Var2;
                int i9 = i3;
                go1Var4.d0(139817367);
                qb.f(str, l13Var, m65Var3, i9, false, i, 0, g80Var, go1Var4, (i8 & WebSocketProtocol.PAYLOAD_SHORT) | ((i8 >> 9) & 57344) | (i8 & 3670016) | ((i8 << 18) & 234881024), 680);
                go1Var4.q(false);
                x04Var = go1Var4.u();
                if (x04Var != null) {
                    z81Var = new z81(str, l13Var, g80Var, m65Var, j, i, map, i2, (byte) 0);
                    x04Var.d = z81Var;
                }
                return;
            }
            go1Var2.d0(140043202);
            go1Var2.q(false);
            iu0 iu0Var = (iu0) go1Var2.k(hf0.h);
            boolean f = go1Var2.f(m65Var2.a.b) | go1Var2.g(iu0Var);
            Object Q = go1Var2.Q();
            jp jpVar = de0.a;
            if (f || Q == jpVar) {
                long j2 = m65Var2.a.b;
                if ((1095216660480L & j2) == 0) {
                    j2 = oh4.j(14);
                }
                float f0 = iu0Var.f0(j2);
                Paint paint = new Paint();
                paint.setTextSize(f0);
                z = true;
                paint.getTextBounds("国", 0, 1, new Rect());
                p65 p65Var = new p65(iu0Var.B(r9.bottom - r9.top));
                go1Var2.o0(p65Var);
                Q = p65Var;
            } else {
                z = true;
            }
            long j3 = ((p65) Q).a;
            boolean f2 = ((i8 & 14) == i4 ? z : false) | (((i8 & 234881024) == 67108864 || ((i8 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 && go1Var2.g(map))) ? z : false) | go1Var2.f(j3);
            Object Q2 = go1Var2.Q();
            if (f2 || Q2 == jpVar) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                mj mjVar = new mj();
                Matcher matcher = a.matcher(str);
                int i10 = 0;
                while (matcher.find()) {
                    if (matcher.start() > i10) {
                        mjVar.b(str, i10, matcher.start());
                    }
                    String group = matcher.group();
                    boolean containsKey = map.containsKey(group);
                    StringBuilder sb = mjVar.I;
                    if (containsKey) {
                        group.getClass();
                        if (group.length() <= 0) {
                            t02.a("alternateText can't be an empty string.");
                        }
                        lj ljVar = new lj(new dx4(group), sb.length(), 0, i4);
                        ArrayList arrayList = mjVar.J;
                        arrayList.add(ljVar);
                        mjVar.K.add(ljVar);
                        arrayList.size();
                        sb.append(group);
                        mjVar.d();
                        linkedHashSet.add(group);
                    } else {
                        group.getClass();
                        sb.append(group);
                    }
                    i10 = matcher.end();
                }
                i5 = 3670016;
                i6 = 57344;
                if (i10 < str.length()) {
                    mjVar.b(str, i10, str.length());
                }
                oj f3 = mjVar.f();
                int J = sv2.J(p70.J(linkedHashSet, 10));
                if (J < 16) {
                    J = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(J);
                for (Object obj : linkedHashSet) {
                    linkedHashMap.put(obj, new v02(new en3(j3, j3), new tc0(-1500520397, new a91(map, (String) obj, (byte) 0), true)));
                }
                Q2 = new uj3(f3, linkedHashMap);
                go1Var2.o0(Q2);
            } else {
                i5 = 3670016;
                i6 = 57344;
            }
            uj3 uj3Var = (uj3) Q2;
            go1Var = go1Var2;
            qb.e((oj) uj3Var.I, l13Var, m65Var2, null, i3, false, i, 0, (Map) uj3Var.J, g80Var, go1Var, (i8 & 112) | ((i8 >> 9) & i6) | (i8 & i5) | ((i8 << 21) & C.ENCODING_PCM_DOUBLE), 0, 1192);
        } else {
            go1Var = go1Var3;
            go1Var.W();
        }
        x04Var = go1Var.u();
        if (x04Var != null) {
            z81Var = new z81(str, l13Var, g80Var, m65Var, j, i, map, i2, (byte) 1);
            x04Var.d = z81Var;
        }
    }
}
