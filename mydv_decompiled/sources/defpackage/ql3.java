package defpackage;

/* loaded from: classes2.dex */
public final class ql3 {
    public String a;
    public String b;

    public final boolean equals(Object obj) {
        if (obj instanceof ql3) {
            ql3 ql3Var = (ql3) obj;
            if (ql3Var != this) {
                String str = this.a;
                String str2 = ql3Var.a;
                if (str == str2 ? true : str.equals(str2)) {
                    String str3 = this.b;
                    String str4 = ql3Var.b;
                    if (str3 == str4 ? true : (str3 == null || str4 == null) ? false : str3.equals(str4)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.b;
        return ((str == null ? 1 : str.hashCode()) * 31) + hashCode;
    }
}
