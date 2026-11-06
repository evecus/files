package defpackage;

import java.security.Permission;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class gm0 extends Permission {
    public final HashSet I;

    public gm0(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.I = hashSet;
        hashSet.add(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gm0) && this.I.equals(((gm0) obj).I);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.I.toString();
    }

    public final int hashCode() {
        return this.I.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof gm0)) {
            return false;
        }
        gm0 gm0Var = (gm0) permission;
        return getName().equals(gm0Var.getName()) || this.I.containsAll(gm0Var.I);
    }
}
