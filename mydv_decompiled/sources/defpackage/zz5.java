package defpackage;

/* loaded from: classes2.dex */
public final class zz5 extends n0 implements d0 {
    public final u0 I;

    public zz5(u0 u0Var) {
        this.I = u0Var;
    }

    public static zz5 m(Object obj) {
        if (obj == null || (obj instanceof zz5)) {
            return (zz5) obj;
        }
        if (obj instanceof u0) {
            return new zz5((u0) obj);
        }
        if (!(obj instanceof byte[])) {
            s83.t("unknown object in getInstance()");
            return null;
        }
        try {
            return new zz5(u0.s((byte[]) obj));
        } catch (Exception e) {
            throw k21.V("unable to parse encoded data", e);
        }
    }

    @Override // defpackage.e0
    public final u0 d() {
        return this.I;
    }
}
