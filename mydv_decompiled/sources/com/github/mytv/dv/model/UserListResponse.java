package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.dh2;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.sp;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.yj4;
import defpackage.yw4;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class UserListResponse {
    private static final uc2[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final List<Author> followers;
    private final List<Author> followings;
    private final boolean hasMore;
    private final long maxTime;
    private final long minTime;
    private final int offset;
    private final int statusCode;
    private final long total;

    static {
        yw4 yw4Var = new yw4((byte) 10);
        dh2 dh2Var = dh2.I;
        $childSerializers = new uc2[]{ut0.K(dh2Var, yw4Var), ut0.K(dh2Var, new yw4((byte) 11)), null, null, null, null, null, null};
    }

    public /* synthetic */ UserListResponse(int i, List list, List list2, boolean z, long j, long j2, long j3, int i2, int i3, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.followings = null;
        } else {
            this.followings = list;
        }
        if ((i & 2) == 0) {
            this.followers = null;
        } else {
            this.followers = list2;
        }
        if ((i & 4) == 0) {
            this.hasMore = false;
        } else {
            this.hasMore = z;
        }
        if ((i & 8) == 0) {
            this.total = 0L;
        } else {
            this.total = j;
        }
        if ((i & 16) == 0) {
            this.minTime = 0L;
        } else {
            this.minTime = j2;
        }
        if ((i & 32) == 0) {
            this.maxTime = 0L;
        } else {
            this.maxTime = j3;
        }
        if ((i & 64) == 0) {
            this.offset = 0;
        } else {
            this.offset = i2;
        }
        if ((i & 128) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new sp(Author$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new sp(Author$$serializer.INSTANCE);
    }

    public static /* synthetic */ UserListResponse copy$default(UserListResponse userListResponse, List list, List list2, boolean z, long j, long j2, long j3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = userListResponse.followings;
        }
        if ((i3 & 2) != 0) {
            list2 = userListResponse.followers;
        }
        if ((i3 & 4) != 0) {
            z = userListResponse.hasMore;
        }
        if ((i3 & 8) != 0) {
            j = userListResponse.total;
        }
        if ((i3 & 16) != 0) {
            j2 = userListResponse.minTime;
        }
        if ((i3 & 32) != 0) {
            j3 = userListResponse.maxTime;
        }
        if ((i3 & 64) != 0) {
            i = userListResponse.offset;
        }
        if ((i3 & 128) != 0) {
            i2 = userListResponse.statusCode;
        }
        long j4 = j3;
        long j5 = j2;
        long j6 = j;
        boolean z2 = z;
        return userListResponse.copy(list, list2, z2, j6, j5, j4, i, i2);
    }

    public static final /* synthetic */ void write$Self$app(UserListResponse userListResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        uc2[] uc2VarArr = $childSerializers;
        if (me0Var.q(serialDescriptor) || userListResponse.followings != null) {
            me0Var.k(serialDescriptor, 0, (KSerializer) uc2VarArr[0].getValue(), userListResponse.followings);
        }
        if (me0Var.q(serialDescriptor) || userListResponse.followers != null) {
            me0Var.k(serialDescriptor, 1, (KSerializer) uc2VarArr[1].getValue(), userListResponse.followers);
        }
        if (me0Var.q(serialDescriptor) || userListResponse.hasMore) {
            ((ax4) me0Var).C(serialDescriptor, 2, FlexibleBooleanSerializer.INSTANCE, Boolean.valueOf(userListResponse.hasMore));
        }
        if (me0Var.q(serialDescriptor) || userListResponse.total != 0) {
            ((ax4) me0Var).B(serialDescriptor, 3, userListResponse.total);
        }
        if (me0Var.q(serialDescriptor) || userListResponse.minTime != 0) {
            ((ax4) me0Var).C(serialDescriptor, 4, FlexibleLongSerializer.INSTANCE, Long.valueOf(userListResponse.minTime));
        }
        if (me0Var.q(serialDescriptor) || userListResponse.maxTime != 0) {
            ((ax4) me0Var).C(serialDescriptor, 5, FlexibleLongSerializer.INSTANCE, Long.valueOf(userListResponse.maxTime));
        }
        if (me0Var.q(serialDescriptor) || userListResponse.offset != 0) {
            ((ax4) me0Var).A(serialDescriptor, 6, userListResponse.offset);
        }
        if (!me0Var.q(serialDescriptor) && userListResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 7, userListResponse.statusCode);
    }

    public final List<Author> component1() {
        return this.followings;
    }

    public final List<Author> component2() {
        return this.followers;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final long component4() {
        return this.total;
    }

    public final long component5() {
        return this.minTime;
    }

    public final long component6() {
        return this.maxTime;
    }

    public final int component7() {
        return this.offset;
    }

    public final int component8() {
        return this.statusCode;
    }

    public final UserListResponse copy(List<Author> list, List<Author> list2, boolean z, long j, long j2, long j3, int i, int i2) {
        return new UserListResponse(list, list2, z, j, j2, j3, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserListResponse)) {
            return false;
        }
        UserListResponse userListResponse = (UserListResponse) obj;
        return j42.c(this.followings, userListResponse.followings) && j42.c(this.followers, userListResponse.followers) && this.hasMore == userListResponse.hasMore && this.total == userListResponse.total && this.minTime == userListResponse.minTime && this.maxTime == userListResponse.maxTime && this.offset == userListResponse.offset && this.statusCode == userListResponse.statusCode;
    }

    public final List<Author> getFollowers() {
        return this.followers;
    }

    public final List<Author> getFollowings() {
        return this.followings;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getMaxTime() {
        return this.maxTime;
    }

    public final long getMinTime() {
        return this.minTime;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final long getTotal() {
        return this.total;
    }

    public int hashCode() {
        List<Author> list = this.followings;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Author> list2 = this.followers;
        int hashCode2 = (((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31) + (this.hasMore ? 1231 : 1237)) * 31;
        long j = this.total;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.minTime;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.maxTime;
        return ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.offset) * 31) + this.statusCode;
    }

    public String toString() {
        return "UserListResponse(followings=" + this.followings + ", followers=" + this.followers + ", hasMore=" + this.hasMore + ", total=" + this.total + ", minTime=" + this.minTime + ", maxTime=" + this.maxTime + ", offset=" + this.offset + ", statusCode=" + this.statusCode + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return UserListResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getFollowers$annotations() {
    }

    public static /* synthetic */ void getFollowings$annotations() {
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getMaxTime$annotations() {
    }

    public static /* synthetic */ void getMinTime$annotations() {
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public static /* synthetic */ void getTotal$annotations() {
    }

    public UserListResponse() {
        this((List) null, (List) null, false, 0L, 0L, 0L, 0, 0, 255, (er0) null);
    }

    public UserListResponse(List<Author> list, List<Author> list2, boolean z, long j, long j2, long j3, int i, int i2) {
        this.followings = list;
        this.followers = list2;
        this.hasMore = z;
        this.total = j;
        this.minTime = j2;
        this.maxTime = j3;
        this.offset = i;
        this.statusCode = i2;
    }

    public /* synthetic */ UserListResponse(List list, List list2, boolean z, long j, long j2, long j3, int i, int i2, int i3, er0 er0Var) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? null : list2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? 0L : j, (i3 & 16) != 0 ? 0L : j2, (i3 & 32) == 0 ? j3 : 0L, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2);
    }
}
