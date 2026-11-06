package defpackage;

import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class aw extends nj0 {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aw(byte b, int i) {
        super((byte) 1, i);
        this.i = b;
    }

    @Override // defpackage.nj0
    public void b() {
        switch (this.i) {
            case 2:
                if (!y50.a(this.c)) {
                    throw new r42(AnalyticsListener.EVENT_AUDIO_ENABLED, "Received text is no valid utf8 string!");
                }
                return;
            default:
                super.b();
                return;
        }
    }
}
