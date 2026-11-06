package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public abstract class n0 implements e0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return d().r(((e0) obj).d());
        }
        return false;
    }

    public int hashCode() {
        return d().hashCode();
    }

    public final byte[] l() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        u0 d = d();
        d.getClass();
        d.n(new uu2(byteArrayOutputStream), true);
        return byteArrayOutputStream.toByteArray();
    }
}
