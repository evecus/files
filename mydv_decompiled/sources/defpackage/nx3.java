package defpackage;

import java.security.PrivilegedAction;
import java.security.Security;

/* loaded from: classes2.dex */
public final class nx3 implements PrivilegedAction {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ nx3(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                return Security.getProperty(str);
            default:
                return System.getProperty(str);
        }
    }
}
