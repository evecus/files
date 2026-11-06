package defpackage;

import com.github.mytv.dv.model.Aweme$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class ip3 implements SerialDescriptor, p00 {
    public final String a;
    public final cp1 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final uc2 i;
    public final uc2 j;
    public final uc2 k;

    public ip3(String str, cp1 cp1Var, int i) {
        this.a = str;
        this.b = cp1Var;
        this.c = i;
        String[] strArr = new String[i];
        final byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = p91.I;
        rm1 rm1Var = new rm1(this) { // from class: hp3
            public final /* synthetic */ ip3 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                byte b2 = b;
                ip3 ip3Var = this.J;
                switch (b2) {
                    case 0:
                        cp1 cp1Var2 = ip3Var.b;
                        return (cp1Var2 == null || (childSerializers = cp1Var2.childSerializers()) == null) ? o7.q : childSerializers;
                    case 1:
                        cp1 cp1Var3 = ip3Var.b;
                        if (cp1Var3 == null || (typeParametersSerializers = cp1Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return qb.z(arrayList);
                    default:
                        return Integer.valueOf(mu0.E(ip3Var, (SerialDescriptor[]) ip3Var.j.getValue()));
                }
            }
        };
        dh2 dh2Var = dh2.I;
        this.i = ut0.K(dh2Var, rm1Var);
        final byte b2 = 1;
        this.j = ut0.K(dh2Var, new rm1(this) { // from class: hp3
            public final /* synthetic */ ip3 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                byte b22 = b2;
                ip3 ip3Var = this.J;
                switch (b22) {
                    case 0:
                        cp1 cp1Var2 = ip3Var.b;
                        return (cp1Var2 == null || (childSerializers = cp1Var2.childSerializers()) == null) ? o7.q : childSerializers;
                    case 1:
                        cp1 cp1Var3 = ip3Var.b;
                        if (cp1Var3 == null || (typeParametersSerializers = cp1Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return qb.z(arrayList);
                    default:
                        return Integer.valueOf(mu0.E(ip3Var, (SerialDescriptor[]) ip3Var.j.getValue()));
                }
            }
        });
        final byte b3 = 2;
        this.k = ut0.K(dh2Var, new rm1(this) { // from class: hp3
            public final /* synthetic */ ip3 J;

            {
                this.J = this;
            }

            @Override // defpackage.rm1
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                byte b22 = b3;
                ip3 ip3Var = this.J;
                switch (b22) {
                    case 0:
                        cp1 cp1Var2 = ip3Var.b;
                        return (cp1Var2 == null || (childSerializers = cp1Var2.childSerializers()) == null) ? o7.q : childSerializers;
                    case 1:
                        cp1 cp1Var3 = ip3Var.b;
                        if (cp1Var3 == null || (typeParametersSerializers = cp1Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return qb.z(arrayList);
                    default:
                        return Integer.valueOf(mu0.E(ip3Var, (SerialDescriptor[]) ip3Var.j.getValue()));
                }
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.a;
    }

    @Override // defpackage.p00
    public final Set b() {
        return this.h.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public qi4 e() {
        return sx4.d;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ip3) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.a()) && Arrays.equals((SerialDescriptor[]) this.j.getValue(), (SerialDescriptor[]) ((ip3) obj).j.getValue())) {
                int f = serialDescriptor.f();
                int i2 = this.c;
                if (i2 == f) {
                    for (0; i < i2; i + 1) {
                        i = (j42.c(i(i).a(), serialDescriptor.i(i).a()) && j42.c(i(i).e(), serialDescriptor.i(i).e())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        return this.e[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return o91.I;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? o91.I : list;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor i(int i) {
        return ((KSerializer[]) this.i.getValue())[i].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        return this.g[i];
    }

    public final void k(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = hashMap;
        }
    }

    public final void l(Aweme$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0 aweme$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0) {
        int i = this.d;
        List[] listArr = this.f;
        List list = listArr[i];
        if (list == null) {
            list = new ArrayList(1);
            listArr[this.d] = list;
        }
        list.add(aweme$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0);
    }

    public String toString() {
        return mu0.W(this);
    }
}
