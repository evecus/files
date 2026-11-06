package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fq implements oj4 {
    public final /* synthetic */ byte a;
    public final Object b;

    public fq() {
        this.a = (byte) 3;
        this.b = new ArrayList();
    }

    public void b(Object obj, String str) {
        ((ArrayList) this.b).add(new ch5(obj, str));
    }

    @Override // defpackage.oj4
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new v2((Object[]) obj, (byte) 1);
            case 1:
                return oh4.n((hn1) obj);
            case 2:
                return new bk2((CharSequence) obj);
            default:
                return ((ArrayList) obj).iterator();
        }
    }

    public /* synthetic */ fq(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
