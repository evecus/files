package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.nt3;
import defpackage.r7;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CollectItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int collectCount;
    private final String collectId;
    private final String collectName;

    public /* synthetic */ CollectItem(int i, String str, String str2, int i2, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.collectId = "";
        } else {
            this.collectId = str;
        }
        if ((i & 2) == 0) {
            this.collectName = "";
        } else {
            this.collectName = str2;
        }
        if ((i & 4) == 0) {
            this.collectCount = 0;
        } else {
            this.collectCount = i2;
        }
    }

    public static /* synthetic */ CollectItem copy$default(CollectItem collectItem, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = collectItem.collectId;
        }
        if ((i2 & 2) != 0) {
            str2 = collectItem.collectName;
        }
        if ((i2 & 4) != 0) {
            i = collectItem.collectCount;
        }
        return collectItem.copy(str, str2, i);
    }

    public static final /* synthetic */ void write$Self$app(CollectItem collectItem, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(collectItem.collectId, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, collectItem.collectId);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(collectItem.collectName, "")) {
            ((ax4) me0Var).E(serialDescriptor, 1, collectItem.collectName);
        }
        if (!me0Var.q(serialDescriptor) && collectItem.collectCount == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 2, collectItem.collectCount);
    }

    public final String component1() {
        return this.collectId;
    }

    public final String component2() {
        return this.collectName;
    }

    public final int component3() {
        return this.collectCount;
    }

    public final CollectItem copy(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        return new CollectItem(str, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectItem)) {
            return false;
        }
        CollectItem collectItem = (CollectItem) obj;
        return j42.c(this.collectId, collectItem.collectId) && j42.c(this.collectName, collectItem.collectName) && this.collectCount == collectItem.collectCount;
    }

    public final int getCollectCount() {
        return this.collectCount;
    }

    public final String getCollectId() {
        return this.collectId;
    }

    public final String getCollectName() {
        return this.collectName;
    }

    public int hashCode() {
        return hf1.n(this.collectId.hashCode() * 31, 31, this.collectName) + this.collectCount;
    }

    public String toString() {
        String str = this.collectId;
        String str2 = this.collectName;
        return nt3.n(r7.F("CollectItem(collectId=", str, ", collectName=", str2, ", collectCount="), this.collectCount, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return CollectItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCollectCount$annotations() {
    }

    public static /* synthetic */ void getCollectId$annotations() {
    }

    public static /* synthetic */ void getCollectName$annotations() {
    }

    public CollectItem() {
        this((String) null, (String) null, 0, 7, (er0) null);
    }

    public CollectItem(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.collectId = str;
        this.collectName = str2;
        this.collectCount = i;
    }

    public /* synthetic */ CollectItem(String str, String str2, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
