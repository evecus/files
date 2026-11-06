package com.github.mytv.dv.widget;

import defpackage.ax4;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.vz2;
import defpackage.yj4;
import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetEpisode {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String awemeId;
    private final int number;

    public WidgetEpisode(int i, int i2, String str, yj4 yj4Var) {
        if (3 == (i & 3)) {
            this.number = i2;
            this.awemeId = str;
            return;
        }
        SerialDescriptor descriptor = WidgetEpisode$$serializer.INSTANCE.getDescriptor();
        descriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & 3;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(descriptor.g(i4));
            }
            i3 >>>= 1;
        }
        String a = descriptor.a();
        a.getClass();
        throw new vz2(arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + a + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + a + "', but they were missing", null, arrayList, a);
    }

    public static /* synthetic */ WidgetEpisode copy$default(WidgetEpisode widgetEpisode, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = widgetEpisode.number;
        }
        if ((i2 & 2) != 0) {
            str = widgetEpisode.awemeId;
        }
        return widgetEpisode.copy(i, str);
    }

    public static final /* synthetic */ void write$Self$app(WidgetEpisode widgetEpisode, me0 me0Var, SerialDescriptor serialDescriptor) {
        ax4 ax4Var = (ax4) me0Var;
        ax4Var.A(serialDescriptor, 0, widgetEpisode.number);
        ax4Var.E(serialDescriptor, 1, widgetEpisode.awemeId);
    }

    public final int component1() {
        return this.number;
    }

    public final String component2() {
        return this.awemeId;
    }

    public final WidgetEpisode copy(int i, String str) {
        str.getClass();
        return new WidgetEpisode(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetEpisode)) {
            return false;
        }
        WidgetEpisode widgetEpisode = (WidgetEpisode) obj;
        return this.number == widgetEpisode.number && j42.c(this.awemeId, widgetEpisode.awemeId);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final int getNumber() {
        return this.number;
    }

    public int hashCode() {
        return this.awemeId.hashCode() + (this.number * 31);
    }

    public String toString() {
        return "WidgetEpisode(number=" + this.number + ", awemeId=" + this.awemeId + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return WidgetEpisode$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WidgetEpisode(int i, String str) {
        str.getClass();
        this.number = i;
        this.awemeId = str;
    }
}
