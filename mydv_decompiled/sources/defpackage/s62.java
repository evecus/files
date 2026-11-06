package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class s62 extends tn1 implements hn1 {
    public final /* synthetic */ byte I = 1;

    public s62(t62 t62Var) {
        super(2, t62Var, t62.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        int i = 0;
        switch (this.I) {
            case 0:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                int intValue = ((Number) obj2).intValue();
                serialDescriptor.getClass();
                t62 t62Var = (t62) this.receiver;
                t62Var.getClass();
                boolean z = !serialDescriptor.j(intValue) && serialDescriptor.i(intValue).c();
                t62Var.b = z;
                return Boolean.valueOf(z);
            default:
                int intValue2 = ((Number) obj).intValue();
                int intValue3 = ((Number) obj2).intValue();
                zg2 zg2Var = (zg2) this.receiver;
                yv yvVar = zg2Var.e;
                int[] iArr = new int[intValue3];
                if (((sg2) zg2Var.d.getValue()).j.C(intValue2)) {
                    dq.Y0(intValue2, 0, 6, iArr);
                } else {
                    yvVar.f(intValue2 + intValue3);
                    int i2 = yvVar.i(intValue2);
                    if (i2 != -2 && i2 != -1) {
                        if (i2 < 0) {
                            t02.a("Expected positive lane number, got " + i2 + " instead.");
                        }
                        i = Math.min(i2, intValue3);
                    }
                    int i3 = i - 1;
                    int i4 = intValue2;
                    while (true) {
                        if (-1 < i3) {
                            i4 = yvVar.g(i4, i3);
                            iArr[i3] = i4;
                            if (i4 == -1) {
                                dq.Y0(-1, i3, 2, iArr);
                            } else {
                                i3--;
                            }
                        }
                    }
                    iArr[i] = intValue2;
                    for (int i5 = i + 1; i5 < intValue3; i5++) {
                        intValue2++;
                        int length = yvVar.a + ((int[]) yvVar.b).length;
                        while (true) {
                            if (intValue2 >= length) {
                                intValue2 = yvVar.a + ((int[]) yvVar.b).length;
                            } else {
                                if (yvVar.b(intValue2, i5)) {
                                    break;
                                }
                                intValue2++;
                            }
                        }
                        iArr[i5] = intValue2;
                    }
                }
                return iArr;
        }
    }

    public /* synthetic */ s62(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
