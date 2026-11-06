package okhttp3.internal.dns;

import defpackage.er0;
import defpackage.j42;
import defpackage.p70;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DnsMessage {
    public static final Companion Companion = new Companion(null);
    private final List<ResourceRecord> additionalRecords;
    private final List<ResourceRecord> answers;
    private final List<ResourceRecord> authorityRecords;
    private final int flags;
    private final short id;
    private final List<Question> questions;

    /* JADX WARN: Multi-variable type inference failed */
    public DnsMessage(short s, int i, List<Question> list, List<? extends ResourceRecord> list2, List<? extends ResourceRecord> list3, List<? extends ResourceRecord> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.id = s;
        this.flags = i;
        this.questions = list;
        this.answers = list2;
        this.authorityRecords = list3;
        this.additionalRecords = list4;
    }

    public static /* synthetic */ DnsMessage copy$default(DnsMessage dnsMessage, short s, int i, List list, List list2, List list3, List list4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            s = dnsMessage.id;
        }
        if ((i2 & 2) != 0) {
            i = dnsMessage.flags;
        }
        if ((i2 & 4) != 0) {
            list = dnsMessage.questions;
        }
        if ((i2 & 8) != 0) {
            list2 = dnsMessage.answers;
        }
        if ((i2 & 16) != 0) {
            list3 = dnsMessage.authorityRecords;
        }
        if ((i2 & 32) != 0) {
            list4 = dnsMessage.additionalRecords;
        }
        List list5 = list3;
        List list6 = list4;
        return dnsMessage.copy(s, i, list, list2, list5, list6);
    }

    public final short component1() {
        return this.id;
    }

    public final int component2() {
        return this.flags;
    }

    public final List<Question> component3() {
        return this.questions;
    }

    public final List<ResourceRecord> component4() {
        return this.answers;
    }

    public final List<ResourceRecord> component5() {
        return this.authorityRecords;
    }

    public final List<ResourceRecord> component6() {
        return this.additionalRecords;
    }

    public final DnsMessage copy(short s, int i, List<Question> list, List<? extends ResourceRecord> list2, List<? extends ResourceRecord> list3, List<? extends ResourceRecord> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new DnsMessage(s, i, list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DnsMessage)) {
            return false;
        }
        DnsMessage dnsMessage = (DnsMessage) obj;
        return this.id == dnsMessage.id && this.flags == dnsMessage.flags && j42.c(this.questions, dnsMessage.questions) && j42.c(this.answers, dnsMessage.answers) && j42.c(this.authorityRecords, dnsMessage.authorityRecords) && j42.c(this.additionalRecords, dnsMessage.additionalRecords);
    }

    public final List<ResourceRecord> getAdditionalRecords() {
        return this.additionalRecords;
    }

    public final List<ResourceRecord> getAnswers() {
        return this.answers;
    }

    public final List<ResourceRecord> getAuthorityRecords() {
        return this.authorityRecords;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final short getId() {
        return this.id;
    }

    public final List<Question> getQuestions() {
        return this.questions;
    }

    public final int getResponseCode() {
        return this.flags & 15;
    }

    public int hashCode() {
        return this.additionalRecords.hashCode() + ((this.authorityRecords.hashCode() + ((this.answers.hashCode() + ((this.questions.hashCode() + (((this.id * 31) + this.flags) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "DnsMessage(id=" + ((int) this.id) + ", flags=" + this.flags + ", questions=" + this.questions + ", answers=" + this.answers + ", authorityRecords=" + this.authorityRecords + ", additionalRecords=" + this.additionalRecords + ')';
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public static /* synthetic */ DnsMessage response$default(Companion companion, short s, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                s = 0;
            }
            return companion.response(s, list, list2);
        }

        public final DnsMessage query(Question question) {
            question.getClass();
            return new DnsMessage((short) 0, 256, p70.j0(question), null, null, null, 56, null);
        }

        public final DnsMessage response(short s, List<Question> list, List<? extends ResourceRecord> list2) {
            list.getClass();
            list2.getClass();
            return new DnsMessage(s, 32768, list, list2, null, null, 48, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DnsMessage(short r2, int r3, java.util.List r4, java.util.List r5, java.util.List r6, java.util.List r7, int r8, defpackage.er0 r9) {
        /*
            r1 = this;
            r9 = r8 & 8
            o91 r0 = defpackage.o91.I
            if (r9 == 0) goto L7
            r5 = r0
        L7:
            r9 = r8 & 16
            if (r9 == 0) goto Lc
            r6 = r0
        Lc:
            r8 = r8 & 32
            if (r8 == 0) goto L11
            r7 = r0
        L11:
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.DnsMessage.<init>(short, int, java.util.List, java.util.List, java.util.List, java.util.List, int, er0):void");
    }
}
