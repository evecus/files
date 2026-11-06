package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.Util;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class RubySpan implements LanguageFeatureSpan {
    public final int position;
    public final String rubyText;
    private static final String FIELD_TEXT = Util.intToStringMaxRadix(0);
    private static final String FIELD_POSITION = Util.intToStringMaxRadix(1);

    public RubySpan(String str, int i) {
        this.rubyText = str;
        this.position = i;
    }

    public static RubySpan fromBundle(Bundle bundle) {
        String string = bundle.getString(FIELD_TEXT);
        string.getClass();
        return new RubySpan(string, bundle.getInt(FIELD_POSITION));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(FIELD_TEXT, this.rubyText);
        bundle.putInt(FIELD_POSITION, this.position);
        return bundle;
    }
}
