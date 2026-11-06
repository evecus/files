package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.df0;
import defpackage.dh2;
import defpackage.er0;
import defpackage.i82;
import defpackage.j42;
import defpackage.me0;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class EmojiListResponse {
    private final List<EmojiItem> emojiList;
    private final int statusCode;
    private final long version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final uc2[] $childSerializers = {null, null, ut0.K(dh2.I, new df0(14))};

    public /* synthetic */ EmojiListResponse(int i, int i2, long j, List list, yj4 yj4Var) {
        this.statusCode = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.version = 0L;
        } else {
            this.version = j;
        }
        if ((i & 4) == 0) {
            this.emojiList = null;
        } else {
            this.emojiList = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(EmojiItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmojiListResponse copy$default(EmojiListResponse emojiListResponse, int i, long j, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = emojiListResponse.statusCode;
        }
        if ((i2 & 2) != 0) {
            j = emojiListResponse.version;
        }
        if ((i2 & 4) != 0) {
            list = emojiListResponse.emojiList;
        }
        return emojiListResponse.copy(i, j, list);
    }

    public static final /* synthetic */ void write$Self$app(EmojiListResponse emojiListResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || emojiListResponse.statusCode != 0) {
            ((ax4) me0Var).A(serialDescriptor, 0, emojiListResponse.statusCode);
        }
        if (me0Var.q(serialDescriptor) || emojiListResponse.version != 0) {
            ((ax4) me0Var).B(serialDescriptor, 1, emojiListResponse.version);
        }
        if (!me0Var.q(serialDescriptor) && emojiListResponse.emojiList == null) {
            return;
        }
        me0Var.k(serialDescriptor, 2, (KSerializer) uc2VarArr[2].getValue(), emojiListResponse.emojiList);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final long component2() {
        return this.version;
    }

    public final List<EmojiItem> component3() {
        return this.emojiList;
    }

    public final EmojiListResponse copy(int i, long j, List<EmojiItem> list) {
        return new EmojiListResponse(i, j, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiListResponse)) {
            return false;
        }
        EmojiListResponse emojiListResponse = (EmojiListResponse) obj;
        return this.statusCode == emojiListResponse.statusCode && this.version == emojiListResponse.version && j42.c(this.emojiList, emojiListResponse.emojiList);
    }

    public final List<EmojiItem> getEmojiList() {
        return this.emojiList;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        int Q = (i82.Q(this.version) + (this.statusCode * 31)) * 31;
        List<EmojiItem> list = this.emojiList;
        return Q + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "EmojiListResponse(statusCode=" + this.statusCode + ", version=" + this.version + ", emojiList=" + this.emojiList + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return EmojiListResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EmojiListResponse() {
        this(0, 0L, (List) null, 7, (er0) null);
    }

    public static /* synthetic */ void getEmojiList$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public EmojiListResponse(int i, long j, List<EmojiItem> list) {
        this.statusCode = i;
        this.version = j;
        this.emojiList = list;
    }

    public /* synthetic */ EmojiListResponse(int i, long j, List list, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? null : list);
    }
}
