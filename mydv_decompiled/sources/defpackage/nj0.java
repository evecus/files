package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class nj0 {
    public final int b;
    public final /* synthetic */ byte h;
    public ByteBuffer c = ByteBuffer.allocate(0);
    public boolean a = true;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;

    public nj0(byte b, int i) {
        this.h = b;
        this.b = i;
    }

    public ByteBuffer a() {
        return this.c;
    }

    public void b() {
        switch (this.h) {
            case 0:
                if (!this.a) {
                    throw new s42("Control frame can't have fin==false set");
                }
                if (this.e) {
                    throw new s42("Control frame can't have rsv1==true set");
                }
                if (this.f) {
                    throw new s42("Control frame can't have rsv2==true set");
                }
                if (this.g) {
                    throw new s42("Control frame can't have rsv3==true set");
                }
                return;
            default:
                return;
        }
    }

    public void d(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nj0 nj0Var = (nj0) obj;
        if (this.a != nj0Var.a || this.d != nj0Var.d || this.e != nj0Var.e || this.f != nj0Var.f || this.g != nj0Var.g || this.b != nj0Var.b) {
            return false;
        }
        ByteBuffer byteBuffer = this.c;
        ByteBuffer byteBuffer2 = nj0Var.c;
        return byteBuffer != null ? byteBuffer.equals(byteBuffer2) : byteBuffer2 == null;
    }

    public int hashCode() {
        int F = (pt1.F(this.b) + ((this.a ? 1 : 0) * 31)) * 31;
        ByteBuffer byteBuffer = this.c;
        return ((((((((F + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Framedata{ opcode:");
        switch (this.b) {
            case 1:
                str = "CONTINUOUS";
                break;
            case 2:
                str = "TEXT";
                break;
            case 3:
                str = "BINARY";
                break;
            case 4:
                str = "PING";
                break;
            case 5:
                str = "PONG";
                break;
            case 6:
                str = "CLOSING";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", fin:");
        sb.append(this.a);
        sb.append(", rsv1:");
        sb.append(this.e);
        sb.append(", rsv2:");
        sb.append(this.f);
        sb.append(", rsv3:");
        sb.append(this.g);
        sb.append(", payload length:[pos:");
        sb.append(this.c.position());
        sb.append(", len:");
        sb.append(this.c.remaining());
        sb.append("], payload:");
        sb.append(this.c.remaining() > 1000 ? "(too big to display)" : new String(this.c.array()));
        sb.append('}');
        return sb.toString();
    }

    private void c() {
    }
}
