package defpackage;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x60 extends nj0 {
    public int i;
    public String j;

    public x60() {
        super((byte) 0, 6);
        this.j = "";
        e();
        this.i = 1000;
        e();
    }

    @Override // defpackage.nj0
    public final ByteBuffer a() {
        return this.i == 1005 ? ByteBuffer.allocate(0) : this.c;
    }

    @Override // defpackage.nj0
    public final void b() {
        super.b();
        if (this.i == 1007 && this.j.isEmpty()) {
            throw new r42(AnalyticsListener.EVENT_AUDIO_ENABLED, "Received text is no valid utf8 string!");
        }
        if (this.i == 1005 && this.j.length() > 0) {
            throw new r42(1002, "A close frame must have a closecode if it has a reason");
        }
        int i = this.i;
        if (i > 1015 && i < 3000) {
            throw new r42(1002, "Trying to send an illegal close code!");
        }
        if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
            throw new s42("closecode must not be sent over the wire: " + this.i);
        }
    }

    @Override // defpackage.nj0
    public final void d(ByteBuffer byteBuffer) {
        this.i = 1005;
        this.j = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.i = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.i = 1002;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(byteBuffer.getShort());
            allocate.position(0);
            this.i = allocate.getInt();
        }
        byteBuffer.reset();
        try {
            int position = byteBuffer.position();
            try {
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.j = y50.b(byteBuffer);
                } catch (IllegalArgumentException unused) {
                    throw new r42(AnalyticsListener.EVENT_AUDIO_ENABLED);
                }
            } finally {
                byteBuffer.position(position);
            }
        } catch (r42 unused2) {
            this.i = AnalyticsListener.EVENT_AUDIO_ENABLED;
            this.j = null;
        }
    }

    public final void e() {
        String str = this.j;
        CodingErrorAction codingErrorAction = y50.a;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.i);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(bytes.length + 2);
        allocate2.put(allocate);
        allocate2.put(bytes);
        allocate2.rewind();
        this.c = allocate2;
    }

    @Override // defpackage.nj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x60.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        x60 x60Var = (x60) obj;
        if (this.i != x60Var.i) {
            return false;
        }
        String str = this.j;
        String str2 = x60Var.j;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // defpackage.nj0
    public final int hashCode() {
        int hashCode = ((super.hashCode() * 31) + this.i) * 31;
        String str = this.j;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.nj0
    public final String toString() {
        return super.toString() + "code: " + this.i;
    }
}
