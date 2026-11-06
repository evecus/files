package j$.time.format;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public class q implements f {
    public final a a;
    public final String b;

    public q(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    @Override // j$.time.format.f
    public boolean d(u uVar, StringBuilder sb) {
        j$.time.x xVar = (j$.time.x) uVar.b(this.a);
        if (xVar == null) {
            return false;
        }
        sb.append(xVar.getId());
        return true;
    }

    public final String toString() {
        return this.b;
    }
}
