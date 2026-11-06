package com.github.mytv.dv.model;

import defpackage.ax4;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.me0;
import defpackage.yj4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SearchLiveLives {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Author author;
    private final String awemeId;
    private final String rawdata;

    public /* synthetic */ SearchLiveLives(int i, String str, Author author, String str2, yj4 yj4Var) {
        if ((i & 1) == 0) {
            this.awemeId = "";
        } else {
            this.awemeId = str;
        }
        if ((i & 2) == 0) {
            this.author = new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null);
        } else {
            this.author = author;
        }
        if ((i & 4) == 0) {
            this.rawdata = "";
        } else {
            this.rawdata = str2;
        }
    }

    public static /* synthetic */ SearchLiveLives copy$default(SearchLiveLives searchLiveLives, String str, Author author, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchLiveLives.awemeId;
        }
        if ((i & 2) != 0) {
            author = searchLiveLives.author;
        }
        if ((i & 4) != 0) {
            str2 = searchLiveLives.rawdata;
        }
        return searchLiveLives.copy(str, author, str2);
    }

    public static final /* synthetic */ void write$Self$app(SearchLiveLives searchLiveLives, me0 me0Var, SerialDescriptor serialDescriptor) {
        if (me0Var.q(serialDescriptor) || !j42.c(searchLiveLives.awemeId, "")) {
            ((ax4) me0Var).E(serialDescriptor, 0, searchLiveLives.awemeId);
        }
        if (me0Var.q(serialDescriptor) || !j42.c(searchLiveLives.author, new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null))) {
            ((ax4) me0Var).C(serialDescriptor, 1, Author$$serializer.INSTANCE, searchLiveLives.author);
        }
        if (!me0Var.q(serialDescriptor) && j42.c(searchLiveLives.rawdata, "")) {
            return;
        }
        ((ax4) me0Var).E(serialDescriptor, 2, searchLiveLives.rawdata);
    }

    public final String component1() {
        return this.awemeId;
    }

    public final Author component2() {
        return this.author;
    }

    public final String component3() {
        return this.rawdata;
    }

    public final SearchLiveLives copy(String str, Author author, String str2) {
        str.getClass();
        author.getClass();
        str2.getClass();
        return new SearchLiveLives(str, author, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLiveLives)) {
            return false;
        }
        SearchLiveLives searchLiveLives = (SearchLiveLives) obj;
        return j42.c(this.awemeId, searchLiveLives.awemeId) && j42.c(this.author, searchLiveLives.author) && j42.c(this.rawdata, searchLiveLives.rawdata);
    }

    public final Author getAuthor() {
        return this.author;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getRawdata() {
        return this.rawdata;
    }

    public int hashCode() {
        return this.rawdata.hashCode() + ((this.author.hashCode() + (this.awemeId.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.awemeId;
        Author author = this.author;
        String str2 = this.rawdata;
        StringBuilder sb = new StringBuilder("SearchLiveLives(awemeId=");
        sb.append(str);
        sb.append(", author=");
        sb.append(author);
        sb.append(", rawdata=");
        return hf1.z(sb, str2, ")");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final KSerializer serializer() {
            return SearchLiveLives$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAuthor$annotations() {
    }

    public static /* synthetic */ void getAwemeId$annotations() {
    }

    public static /* synthetic */ void getRawdata$annotations() {
    }

    public SearchLiveLives() {
        this((String) null, (Author) null, (String) null, 7, (er0) null);
    }

    public SearchLiveLives(String str, Author author, String str2) {
        str.getClass();
        author.getClass();
        str2.getClass();
        this.awemeId = str;
        this.author = author;
        this.rawdata = str2;
    }

    public /* synthetic */ SearchLiveLives(String str, Author author, String str2, int i, er0 er0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null) : author, (i & 4) == 0 ? str2 : "");
    }
}
