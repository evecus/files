package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class co5 implements bn {
    public static final bo5 Companion = new bo5();
    public final String a;
    public final String b;

    public co5(String str) {
        this.a = str;
        this.b = hf1.w("video_player/", Uri.encode(str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof co5) && this.a.equals(((co5) obj).a);
    }

    @Override // defpackage.bn
    public final String getRoute() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return r7.C("VideoPlayerDestination(source=", this.a, ")");
    }
}
