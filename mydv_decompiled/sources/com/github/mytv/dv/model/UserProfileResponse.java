package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class UserProfileResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int statusCode;
    private final Author user;

    public /* synthetic */ UserProfileResponse(int i, Author author, int i2, yj4 yj4Var) {
        this.user = (i & 1) == 0 ? null : author;
        if ((i & 2) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i2;
        }
    }

    public static /* synthetic */ UserProfileResponse copy$default(UserProfileResponse userProfileResponse, Author author, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            author = userProfileResponse.user;
        }
        if ((i2 & 2) != 0) {
            i = userProfileResponse.statusCode;
        }
        return userProfileResponse.copy(author, i);
    }

    public static final /* synthetic */ void write$Self$app(UserProfileResponse userProfileResponse, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || userProfileResponse.user != null) {
            me0Var.k(serialDescriptor, 0, Author$$serializer.INSTANCE, userProfileResponse.user);
        }
        if (!me0Var.q(serialDescriptor) && userProfileResponse.statusCode == 0) {
            return;
        }
        ((ax4) me0Var).A(serialDescriptor, 1, userProfileResponse.statusCode);
    }

    public final Author component1() {
        return this.user;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final UserProfileResponse copy(Author author, int i) {
        return new UserProfileResponse(author, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileResponse)) {
            return false;
        }
        UserProfileResponse userProfileResponse = (UserProfileResponse) obj;
        return j42.c(this.user, userProfileResponse.user) && this.statusCode == userProfileResponse.statusCode;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Author getUser() {
        return this.user;
    }

    public int hashCode() {
        Author author = this.user;
        return ((author == null ? 0 : author.hashCode()) * 31) + this.statusCode;
    }

    public String toString() {
        return "UserProfileResponse(user=" + this.user + ", statusCode=" + this.statusCode + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return UserProfileResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileResponse() {
        this((Author) null, 0, 3, (er0) (0 == true ? 1 : 0));
    }

    public UserProfileResponse(Author author, int i) {
        this.user = author;
        this.statusCode = i;
    }

    public /* synthetic */ UserProfileResponse(Author author, int i, int i2, er0 er0Var) {
        this((i2 & 1) != 0 ? null : author, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public static /* synthetic */ void getUser$annotations() {
    }
}
