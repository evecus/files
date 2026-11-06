package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class ct3 implements we1 {
    public final BigInteger a;

    public ct3(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // defpackage.we1
    public final int a() {
        return 1;
    }

    @Override // defpackage.we1
    public final BigInteger b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ct3) {
            return this.a.equals(((ct3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
