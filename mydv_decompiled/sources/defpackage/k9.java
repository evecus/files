package defpackage;

import coil3.ComponentRegistry;
import coil3.fetch.Fetcher;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class k9 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ k9(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [k13] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [k13] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [b53] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [b53] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.rm1
    public final Object invoke() {
        m14 m14Var;
        List add$lambda$3$0;
        String[] names;
        byte b = this.I;
        p91 p91Var = p91.I;
        wd5 wd5Var = wd5.a;
        Object obj = this.K;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                hv4 hv4Var = (hv4) obj2;
                ru4 ru4Var = (ru4) obj;
                hv4Var.b.i(ru4Var.g);
                hv4Var.c.setValue(Boolean.valueOf(r11.b(ru4Var.e, ru4Var.c - 1.0f) >= 0 && r11.b(ru4Var.f, ru4Var.d - 1.0f) >= 0));
                return wd5Var;
            case 1:
                ((k20) obj2).d(obj);
                return wd5Var;
            case 2:
                rm1 rm1Var = (rm1) obj2;
                na3 na3Var = (na3) obj;
                if (rm1Var != null && (m14Var = (m14) rm1Var.invoke()) != null) {
                    return m14Var;
                }
                if (!na3Var.h()) {
                    na3Var = null;
                }
                if (na3Var != null) {
                    return sv2.g(0L, ut0.b0(na3Var.K));
                }
                return null;
            case 3:
                ((k00) obj2).K.invoke((m00) obj);
                return wd5Var;
            case 4:
                add$lambda$3$0 = ComponentRegistry.Builder.add$lambda$3$0((Fetcher.Factory) obj2, (t72) obj);
                return add$lambda$3$0;
            case 5:
                ((sw0) obj2).e((p63) obj, false);
                return wd5Var;
            case 6:
                ((r24) obj2).I = j42.r((zi1) obj, ym3.a);
                return wd5Var;
            case 7:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                qb.V((i62) obj, serialDescriptor);
                int f = serialDescriptor.f();
                for (int i = 0; i < f; i++) {
                    List h = serialDescriptor.h(i);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : h) {
                        if (obj3 instanceof c72) {
                            arrayList.add(obj3);
                        }
                    }
                    c72 c72Var = (c72) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (c72Var != null && (names = c72Var.names()) != null) {
                        for (String str : names) {
                            String str2 = j42.c(serialDescriptor.e(), xj4.d) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new q62(mu0.s(-1, "The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.g(i) + " is already one of the names for " + str2 + ' ' + serialDescriptor.g(((Number) sv2.E(str, linkedHashMap)).intValue()) + " in " + serialDescriptor, null, null, null));
                            }
                            linkedHashMap.put(str, Integer.valueOf(i));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? p91Var : linkedHashMap;
            case 8:
                r24 r24Var = (r24) obj;
                ja3 ja3Var = ((wa2) obj2).n0;
                if ((ja3Var.f.getAggregateChildKindSet$ui() & 8) != 0) {
                    for (k13 k13Var = ja3Var.e; k13Var != null; k13Var = k13Var.getParent$ui()) {
                        if ((k13Var.getKindSet$ui() & 8) != 0) {
                            wt0 wt0Var = k13Var;
                            ?? r1 = 0;
                            while (wt0Var != 0) {
                                if (wt0Var instanceof pi4) {
                                    pi4 pi4Var = (pi4) wt0Var;
                                    if (pi4Var.getShouldClearDescendantSemantics()) {
                                        ki4 ki4Var = new ki4();
                                        r24Var.I = ki4Var;
                                        ki4Var.L = true;
                                    }
                                    if (pi4Var.getShouldMergeDescendantSemantics()) {
                                        ((ki4) r24Var.I).K = true;
                                    }
                                    pi4Var.applySemantics((cj4) r24Var.I);
                                } else if ((wt0Var.getKindSet$ui() & 8) != 0 && (wt0Var instanceof wt0)) {
                                    k13 k13Var2 = wt0Var.J;
                                    int i2 = 0;
                                    wt0Var = wt0Var;
                                    r1 = r1;
                                    while (k13Var2 != null) {
                                        if ((k13Var2.getKindSet$ui() & 8) != 0) {
                                            i2++;
                                            r1 = r1;
                                            if (i2 == 1) {
                                                wt0Var = k13Var2;
                                            } else {
                                                if (r1 == 0) {
                                                    r1 = new b53(new k13[16]);
                                                }
                                                if (wt0Var != 0) {
                                                    r1.c(wt0Var);
                                                    wt0Var = 0;
                                                }
                                                r1.c(k13Var2);
                                            }
                                        }
                                        k13Var2 = k13Var2.getChild$ui();
                                        wt0Var = wt0Var;
                                        r1 = r1;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                wt0Var = ut0.M(r1);
                            }
                        }
                    }
                }
                return wd5Var;
            case 9:
                is0 is0Var = (is0) obj;
                vi3 vi3Var = (vi3) ((wu0) obj2).getValue();
                return new wi3(is0Var, vi3Var, new tl((u22) is0Var.d.f.getValue(), vi3Var));
            case 10:
                return new eg2((j94) obj2, p91Var, (g94) obj);
            case 11:
                z04 z04Var = (z04) obj;
                if (((da3) obj2).a.get() == 0) {
                    z04Var.invoke();
                }
                return wd5Var;
            case 12:
                ((qd0) obj2).d = (hn1) obj;
                return wd5Var;
            case 13:
                CharSequence charSequence = (CharSequence) obj;
                charSequence.getClass();
                Matcher matcher = ((v24) obj2).I.matcher(charSequence);
                matcher.getClass();
                return rt0.r(matcher, 0, charSequence);
            default:
                ((r24) obj2).I = ((ue) obj).J.invoke();
                return wd5Var;
        }
    }
}
