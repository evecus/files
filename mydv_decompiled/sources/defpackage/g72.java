package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class g72 {
    public final /* synthetic */ byte a;
    public int b;
    public final Object c;
    public Cloneable d;
    public Cloneable e;

    public g72(Bundle bundle) {
        this.a = (byte) 1;
        bundle.getClass();
        String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            jl2.W("nav-entry-state:id");
            throw null;
        }
        this.c = string;
        this.b = sp0.R(bundle, "nav-entry-state:destination-id");
        Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            jl2.W("nav-entry-state:args");
            throw null;
        }
        this.d = bundle2;
        Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 != null) {
            this.e = bundle3;
        } else {
            jl2.W("nav-entry-state:saved-state");
            throw null;
        }
    }

    public String a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.d)[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean c = j42.c(serialDescriptor.e(), sx4.e);
                int[] iArr = (int[]) this.e;
                if (!c) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.g(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.e)[i2]);
                    sb.append("]");
                }
            } else if (obj == k04.V) {
                sb.append("[<debug info disabled>]");
            } else if (obj != k04.W) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Cloneable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int[], java.lang.Cloneable] */
    public void b() {
        int i = this.b * 2;
        this.d = Arrays.copyOf((Object[]) this.d, i);
        ?? r1 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            r1[i2] = -1;
        }
        dq.S0(0, 0, 14, (int[]) this.e, r1);
        this.e = r1;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return a();
            default:
                return super.toString();
        }
    }

    public g72(p63 p63Var, int i) {
        this.a = (byte) 1;
        this.c = p63Var.N;
        this.b = i;
        r63 r63Var = p63Var.P;
        this.d = r63Var.a();
        Bundle b0 = i42.b0((uj3[]) Arrays.copyOf(new uj3[0], 0));
        this.e = b0;
        r63Var.h.q(b0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Cloneable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.lang.Cloneable] */
    public g72(n62 n62Var) {
        this.a = (byte) 0;
        this.c = n62Var;
        this.d = new Object[8];
        ?? r1 = new int[8];
        for (int i = 0; i < 8; i++) {
            r1[i] = -1;
        }
        this.e = r1;
        this.b = -1;
    }
}
