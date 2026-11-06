package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jh5 extends nh5 {
    public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            TypedArray a0 = hc4.a0(resources, theme, attributeSet, j16.d);
            String string = a0.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = a0.getString(1);
            if (string2 != null) {
                this.a = il2.r(string2);
            }
            this.c = hc4.R(xmlPullParser, "fillType") ? a0.getInt(2, 0) : 0;
            a0.recycle();
        }
    }
}
