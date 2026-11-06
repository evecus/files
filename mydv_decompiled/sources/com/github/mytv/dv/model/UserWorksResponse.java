package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.dh2;
import defpackage.er0;
import defpackage.fx4;
import defpackage.hk2;
import defpackage.j42;
import defpackage.me0;
import defpackage.p91;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import defpackage.yw4;
import defpackage.zr2;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class UserWorksResponse {
    private static final uc2[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Map<String, Long> awemeDate;
    private final List<Aweme> awemeList;
    private final Long cursor;
    private final boolean hasMore;
    private final List<Aweme> items;
    private final long maxCursor;
    private final int statusCode;

    static {
        yw4 yw4Var = new yw4((byte) 12);
        dh2 dh2Var = dh2.I;
        $childSerializers = new uc2[]{ut0.K(dh2Var, yw4Var), ut0.K(dh2Var, new yw4((byte) 13)), null, null, null, ut0.K(dh2Var, new yw4((byte) 14)), null};
    }

    public /* synthetic */ UserWorksResponse(int i, List list, List list2, boolean z, long j, Long l, Map map, int i2, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.awemeList = null;
        } else {
            this.awemeList = list;
        }
        if ((i & 2) == 0) {
            this.items = null;
        } else {
            this.items = list2;
        }
        if ((i & 4) == 0) {
            this.hasMore = false;
        } else {
            this.hasMore = z;
        }
        if ((i & 8) == 0) {
            this.maxCursor = 0L;
        } else {
            this.maxCursor = j;
        }
        if ((i & 16) == 0) {
            this.cursor = null;
        } else {
            this.cursor = l;
        }
        if ((i & 32) == 0) {
            this.awemeDate = p91.I;
        } else {
            this.awemeDate = map;
        }
        if ((i & 64) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(Aweme$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new sp(Aweme$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new hk2(fx4.a, zr2.a);
    }

    public static /* synthetic */ UserWorksResponse copy$default(UserWorksResponse userWorksResponse, List list, List list2, boolean z, long j, Long l, Map map, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = userWorksResponse.awemeList;
        }
        if ((i2 & 2) != 0) {
            list2 = userWorksResponse.items;
        }
        if ((i2 & 4) != 0) {
            z = userWorksResponse.hasMore;
        }
        if ((i2 & 8) != 0) {
            j = userWorksResponse.maxCursor;
        }
        if ((i2 & 16) != 0) {
            l = userWorksResponse.cursor;
        }
        if ((i2 & 32) != 0) {
            map = userWorksResponse.awemeDate;
        }
        if ((i2 & 64) != 0) {
            i = userWorksResponse.statusCode;
        }
        int i3 = i;
        Long l2 = l;
        long j2 = j;
        boolean z2 = z;
        return userWorksResponse.copy(list, list2, z2, j2, l2, map, i3);
    }

    public static final /* synthetic */ void write$Self$app(UserWorksResponse userWorksResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || userWorksResponse.awemeList != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), userWorksResponse.awemeList);
        }
        if (me0Var.q(serialDescriptor) || userWorksResponse.items != null) {
            me0Var.k(serialDescriptor, 1, (KSerializer) uc2VarArr[1].getValue(), userWorksResponse.items);
        }
        if (me0Var.q(serialDescriptor) || userWorksResponse.hasMore) {
            ((ax4) me0Var).C(serialDescriptor, 2, FlexibleBooleanSerializer.INSTANCE, Boolean.valueOf(userWorksResponse.hasMore));
        }
        if (me0Var.q(serialDescriptor) || userWorksResponse.maxCursor != 0) {
            ((ax4) me0Var).B(serialDescriptor, 3, userWorksResponse.maxCursor);
        }
        if (me0Var.q(serialDescriptor) || userWorksResponse.cursor != null) {
            me0Var.k(serialDescriptor, 4, zr2.a, userWorksResponse.cursor);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(userWorksResponse.awemeDate, p91.I)) {
            ((ax4) me0Var).C(serialDescriptor, 5, (KSerializer) uc2VarArr[5].getValue(), userWorksResponse.awemeDate);
        }
        if (!me0Var.q(serialDescriptor) && userWorksResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 6, userWorksResponse.statusCode);
    }

    public final List<Aweme> component1() {
        return this.awemeList;
    }

    public final List<Aweme> component2() {
        return this.items;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final long component4() {
        return this.maxCursor;
    }

    public final Long component5() {
        return this.cursor;
    }

    public final Map<String, Long> component6() {
        return this.awemeDate;
    }

    public final int component7() {
        return this.statusCode;
    }

    public final UserWorksResponse copy(List<Aweme> list, List<Aweme> list2, boolean z, long j, Long l, Map<String, Long> map, int i) {
        map.getClass();
        return new UserWorksResponse(list, list2, z, j, l, map, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserWorksResponse)) {
            return false;
        }
        UserWorksResponse userWorksResponse = (UserWorksResponse) obj;
        return j42.c(this.awemeList, userWorksResponse.awemeList) && j42.c(this.items, userWorksResponse.items) && this.hasMore == userWorksResponse.hasMore && this.maxCursor == userWorksResponse.maxCursor && j42.c(this.cursor, userWorksResponse.cursor) && j42.c(this.awemeDate, userWorksResponse.awemeDate) && this.statusCode == userWorksResponse.statusCode;
    }

    public final Map<String, Long> getAwemeDate() {
        return this.awemeDate;
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final Long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<Aweme> getItems() {
        return this.items;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        List<Aweme> list = this.awemeList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Aweme> list2 = this.items;
        int hashCode2 = (((hashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + (this.hasMore ? 1231 : 1237)) * 31;
        long j = this.maxCursor;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.cursor;
        return ((this.awemeDate.hashCode() + ((i + (l != null ? l.hashCode() : 0)) * 31)) * 31) + this.statusCode;
    }

    public String toString() {
        return "UserWorksResponse(awemeList=" + this.awemeList + ", items=" + this.items + ", hasMore=" + this.hasMore + ", maxCursor=" + this.maxCursor + ", cursor=" + this.cursor + ", awemeDate=" + this.awemeDate + ", statusCode=" + this.statusCode + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return UserWorksResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAwemeDate$annotations() {
    }

    public static /* synthetic */ void getAwemeList$annotations() {
    }

    public static /* synthetic */ void getCursor$annotations() {
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getItems$annotations() {
    }

    public static /* synthetic */ void getMaxCursor$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public UserWorksResponse() {
        this((List) null, (List) null, false, 0L, (Long) null, (Map) null, 0, 127, (er0) null);
    }

    public UserWorksResponse(List<Aweme> list, List<Aweme> list2, boolean z, long j, Long l, Map<String, Long> map, int i) {
        map.getClass();
        this.awemeList = list;
        this.items = list2;
        this.hasMore = z;
        this.maxCursor = j;
        this.cursor = l;
        this.awemeDate = map;
        this.statusCode = i;
    }

    public /* synthetic */ UserWorksResponse(List list, List list2, boolean z, long j, Long l, Map map, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? p91.I : map, (i2 & 64) != 0 ? 0 : i);
    }
}
