package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.Util;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class VoiceSpan {
    private static final String FIELD_NAME = Util.intToStringMaxRadix(0);
    public final String name;

    public VoiceSpan(String str) {
        this.name = str;
    }

    public static VoiceSpan fromBundle(Bundle bundle) {
        String string = bundle.getString(FIELD_NAME);
        string.getClass();
        return new VoiceSpan(string);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(FIELD_NAME, this.name);
        return bundle;
    }
}
