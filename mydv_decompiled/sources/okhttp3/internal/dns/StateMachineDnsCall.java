package okhttp3.internal.dns;

import defpackage.er0;
import defpackage.j42;
import defpackage.jt2;
import defpackage.lk2;
import defpackage.mk2;
import defpackage.o70;
import defpackage.o91;
import defpackage.p70;
import defpackage.sv2;
import defpackage.wd5;
import defpackage.zy;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Dns;
import okhttp3.Protocol;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.dns.DnsQuery;
import okhttp3.internal.dns.ResourceRecord;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class StateMachineDnsCall implements Dns.Call {
    private final boolean includeIPv6;
    private final boolean includeServiceMetadata;
    private final DnsQuery.Factory queryFactory;
    private final Dns.Request request;
    private final AtomicReference<State> state;
    private final TaskRunner taskRunner;

    public StateMachineDnsCall(TaskRunner taskRunner, Dns.Request request, DnsQuery.Factory factory, boolean z, boolean z2) {
        taskRunner.getClass();
        request.getClass();
        factory.getClass();
        this.taskRunner = taskRunner;
        this.request = request;
        this.queryFactory = factory;
        this.includeIPv6 = z;
        this.includeServiceMetadata = z2;
        this.state = new AtomicReference<>(new State.Idle(false, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 enqueue$lambda$1(Dns.Callback callback, StateMachineDnsCall stateMachineDnsCall) {
        callback.onFailure(stateMachineDnsCall, new IOException("canceled"));
        return wd5.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStateAndCallCallbacks(Question question, DnsQuery dnsQuery, DnsMessage dnsMessage) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Protocol protocol;
        try {
            int responseCode = dnsMessage.getResponseCode();
            if (responseCode != 0) {
                if (responseCode == 2) {
                    throw new UnknownHostException("DNS server failure");
                }
                throw new UnknownHostException();
            }
            List<ResourceRecord> answers = dnsMessage.getAnswers();
            int type = question.getType();
            if (type == 1 || type == 28) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : answers) {
                    if (obj instanceof ResourceRecord.IpAddress) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(p70.J(arrayList3, 10));
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList3.get(i);
                    i++;
                    arrayList4.add(new Dns.Record.IpAddress(getRequest().hostname(), ((ResourceRecord.IpAddress) obj2).getAddress()));
                }
                arrayList = arrayList4;
            } else {
                if (type != 65) {
                    zy.i("unexpected question type");
                    return;
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : answers) {
                    if (obj3 instanceof ResourceRecord.Https) {
                        arrayList5.add(obj3);
                    }
                }
                List t1 = o70.t1(arrayList5);
                Collections.shuffle(t1);
                List<ResourceRecord.Https> k1 = o70.k1(t1, new Comparator() { // from class: okhttp3.internal.dns.StateMachineDnsCall$updateStateAndCallCallbacks$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return Integer.valueOf(((ResourceRecord.Https) t).getPriority()).compareTo(Integer.valueOf(((ResourceRecord.Https) t2).getPriority()));
                    }
                });
                ArrayList arrayList6 = new ArrayList(p70.J(k1, 10));
                for (ResourceRecord.Https https : k1) {
                    if (https.getPriority() == 0) {
                        updateStateAndCallCallbacks$default(this, dnsQuery, null, null, false, 14, null);
                        return;
                    }
                    String targetName = https.getTargetName();
                    if (j42.c(targetName, "")) {
                        targetName = null;
                    }
                    if (targetName == null) {
                        targetName = getRequest().hostname();
                    }
                    String str = targetName;
                    List<String> alpnIds = https.getAlpnIds();
                    if (alpnIds != null) {
                        ArrayList arrayList7 = new ArrayList();
                        Iterator<T> it = alpnIds.iterator();
                        while (it.hasNext()) {
                            try {
                                protocol = Protocol.Companion.get((String) it.next());
                            } catch (IOException unused) {
                                protocol = null;
                            }
                            if (protocol != null) {
                                arrayList7.add(protocol);
                            }
                        }
                        arrayList2 = arrayList7;
                    } else {
                        arrayList2 = null;
                    }
                    arrayList6.add(new Dns.Record.ServiceMetadata(str, arrayList2, https.getPort(), https.getIpAddressHints(), https.getEchConfigList()));
                }
                arrayList = arrayList6;
            }
            updateStateAndCallCallbacks$default(this, dnsQuery, arrayList, null, false, 12, null);
        } catch (IOException e) {
            updateStateAndCallCallbacks$default(this, dnsQuery, null, e, false, 10, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateStateAndCallCallbacks$default(StateMachineDnsCall stateMachineDnsCall, DnsQuery dnsQuery, List list, IOException iOException, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dnsQuery = null;
        }
        if ((i & 2) != 0) {
            list = o91.I;
        }
        if ((i & 4) != 0) {
            iOException = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        stateMachineDnsCall.updateStateAndCallCallbacks(dnsQuery, list, iOException, z);
    }

    @Override // okhttp3.Dns.Call
    public void cancel() {
        State state;
        loop0: while (true) {
            state = this.state.get();
            State cancel = state.cancel();
            AtomicReference<State> atomicReference = this.state;
            while (!atomicReference.compareAndSet(state, cancel)) {
                if (atomicReference.get() != state) {
                    break;
                }
            }
        }
        if (state instanceof State.Running) {
            Iterator<DnsQuery> it = ((State.Running) state).getRunningQueries().iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }
    }

    @Override // okhttp3.Dns.Call
    public void enqueue(Dns.Callback callback) {
        callback.getClass();
        mk2 K = p70.K();
        if (this.includeServiceMetadata) {
            K.add(new Question(getRequest().port() == 443 ? getRequest().hostname() : "_" + getRequest().port() + "._https." + getRequest().hostname(), 65, 0, 4, null));
        }
        if (this.includeIPv6) {
            K.add(new Question(getRequest().hostname(), 28, 0, 4, null));
        }
        K.add(new Question(getRequest().hostname(), 1, 0, 4, null));
        mk2 D = p70.D(K);
        while (true) {
            State state = this.state.get();
            State.Idle idle = state instanceof State.Idle ? (State.Idle) state : null;
            if (idle == null) {
                zy.i("already enqueued");
                return;
            }
            if (idle.getCanceled()) {
                State.Complete complete = new State.Complete(true);
                AtomicReference<State> atomicReference = this.state;
                while (!atomicReference.compareAndSet(idle, complete)) {
                    if (atomicReference.get() != idle) {
                        break;
                    }
                }
                TaskQueue.execute$default(this.taskRunner.newQueue(), getRequest().hostname() + " dns", 0L, false, new jt2((Object) callback, (Object) this, (byte) 26), 6, null);
                return;
            }
            int J = sv2.J(p70.J(D, 10));
            if (J < 16) {
                J = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(J);
            ListIterator listIterator = D.listIterator(0);
            while (true) {
                lk2 lk2Var = (lk2) listIterator;
                if (!lk2Var.hasNext()) {
                    break;
                }
                Object next = lk2Var.next();
                linkedHashMap.put(next, this.queryFactory.newQuery((Question) next));
            }
            State.Running running = new State.Running(false, callback, false, o70.r1(linkedHashMap.values()), null, null, 52, null);
            AtomicReference<State> atomicReference2 = this.state;
            while (!atomicReference2.compareAndSet(idle, running)) {
                if (atomicReference2.get() != idle) {
                    break;
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                final Question question = (Question) entry.getKey();
                final DnsQuery dnsQuery = (DnsQuery) entry.getValue();
                dnsQuery.enqueue(new DnsQuery.Callback() { // from class: okhttp3.internal.dns.StateMachineDnsCall$enqueue$2
                    @Override // okhttp3.internal.dns.DnsQuery.Callback
                    public void onFailure(IOException iOException) {
                        iOException.getClass();
                        StateMachineDnsCall.updateStateAndCallCallbacks$default(StateMachineDnsCall.this, dnsQuery, null, iOException, false, 10, null);
                    }

                    @Override // okhttp3.internal.dns.DnsQuery.Callback
                    public void onResponse(DnsMessage dnsMessage) {
                        dnsMessage.getClass();
                        StateMachineDnsCall.this.updateStateAndCallCallbacks(question, dnsQuery, dnsMessage);
                    }
                });
            }
            return;
        }
    }

    @Override // okhttp3.Dns.Call
    public Dns.Request getRequest() {
        return this.request;
    }

    @Override // okhttp3.Dns.Call
    public boolean isCanceled() {
        return this.state.get().getCanceled();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface State {

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Complete implements State {
            private final boolean canceled;

            public Complete(boolean z) {
                this.canceled = z;
            }

            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public Idle cancel() {
                return new Idle(true);
            }

            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public boolean getCanceled() {
                return this.canceled;
            }
        }

        State cancel();

        boolean getCanceled();

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Idle implements State {
            private final boolean canceled;

            public /* synthetic */ Idle(boolean z, int i, er0 er0Var) {
                this((i & 1) != 0 ? false : z);
            }

            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public Idle cancel() {
                return new Idle(true);
            }

            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public boolean getCanceled() {
                return this.canceled;
            }

            public Idle(boolean z) {
                this.canceled = z;
            }

            public Idle() {
                this(false, 1, null);
            }
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Running implements State {
            private final Dns.Callback callback;
            private final boolean canceled;
            private final boolean lockHeld;
            private final List<IOException> pendingExceptions;
            private final List<Dns.Record> pendingRecords;
            private final List<DnsQuery> runningQueries;

            /* JADX WARN: Multi-variable type inference failed */
            public Running(boolean z, Dns.Callback callback, boolean z2, List<? extends DnsQuery> list, List<? extends Dns.Record> list2, List<? extends IOException> list3) {
                callback.getClass();
                list.getClass();
                list2.getClass();
                list3.getClass();
                this.canceled = z;
                this.callback = callback;
                this.lockHeld = z2;
                this.runningQueries = list;
                this.pendingRecords = list2;
                this.pendingExceptions = list3;
                if (list2.isEmpty() || z2) {
                    return;
                }
                zy.i("Check failed.");
                throw null;
            }

            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public Running cancel() {
                return new Running(true, this.callback, this.lockHeld, this.runningQueries, this.pendingRecords, this.pendingExceptions);
            }

            public final Dns.Callback getCallback() {
                return this.callback;
            }

            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public boolean getCanceled() {
                return this.canceled;
            }

            public final boolean getLockHeld() {
                return this.lockHeld;
            }

            public final List<IOException> getPendingExceptions() {
                return this.pendingExceptions;
            }

            public final List<Dns.Record> getPendingRecords() {
                return this.pendingRecords;
            }

            public final List<DnsQuery> getRunningQueries() {
                return this.runningQueries;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public /* synthetic */ Running(boolean r8, okhttp3.Dns.Callback r9, boolean r10, java.util.List r11, java.util.List r12, java.util.List r13, int r14, defpackage.er0 r15) {
                /*
                    r7 = this;
                    r15 = r14 & 4
                    if (r15 == 0) goto L5
                    r10 = 0
                L5:
                    r3 = r10
                    r10 = r14 & 16
                    o91 r15 = defpackage.o91.I
                    if (r10 == 0) goto Le
                    r5 = r15
                    goto Lf
                Le:
                    r5 = r12
                Lf:
                    r10 = r14 & 32
                    if (r10 == 0) goto L19
                    r6 = r15
                L14:
                    r0 = r7
                    r1 = r8
                    r2 = r9
                    r4 = r11
                    goto L1b
                L19:
                    r6 = r13
                    goto L14
                L1b:
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Running.<init>(boolean, okhttp3.Dns$Callback, boolean, java.util.List, java.util.List, java.util.List, int, er0):void");
            }
        }
    }

    private final void updateStateAndCallCallbacks(DnsQuery dnsQuery, List<? extends Dns.Record> list, IOException iOException, boolean z) {
        List<DnsQuery> runningQueries;
        List<IOException> pendingExceptions;
        o91 o91Var;
        List<Dns.Record> list2;
        State running;
        DnsQuery dnsQuery2 = dnsQuery;
        List<? extends Dns.Record> list3 = list;
        IOException iOException2 = iOException;
        boolean z2 = z;
        while (true) {
            State state = this.state.get();
            State.Running running2 = state instanceof State.Running ? (State.Running) state : null;
            if (running2 == null) {
                return;
            }
            if (dnsQuery2 != null) {
                runningQueries = o70.e1(running2.getRunningQueries(), dnsQuery2);
            } else {
                runningQueries = running2.getRunningQueries();
            }
            List<DnsQuery> list4 = runningQueries;
            if (iOException2 != null) {
                pendingExceptions = o70.g1(running2.getPendingExceptions(), iOException2);
            } else {
                pendingExceptions = running2.getPendingExceptions();
            }
            List<IOException> list5 = pendingExceptions;
            List<Dns.Record> f1 = !list3.isEmpty() ? o70.f1(running2.getPendingRecords(), list3) : running2.getPendingRecords();
            boolean isEmpty = list4.isEmpty();
            boolean z3 = false;
            boolean z4 = !z2 && running2.getLockHeld();
            if ((!isEmpty && f1.isEmpty()) || z4) {
                State.Running running3 = new State.Running(running2.getCanceled(), running2.getCallback(), z4, list4, f1, list5);
                AtomicReference<State> atomicReference = this.state;
                while (!atomicReference.compareAndSet(running2, running3)) {
                    if (atomicReference.get() != running2) {
                        break;
                    }
                }
                return;
            }
            o91 o91Var2 = o91.I;
            if (isEmpty) {
                running = new State.Complete(running2.getCanceled());
                list2 = f1;
                o91Var = o91Var2;
            } else {
                o91Var = o91Var2;
                list2 = f1;
                running = new State.Running(running2.getCanceled(), running2.getCallback(), true, list4, o91Var, list5);
            }
            AtomicReference<State> atomicReference2 = this.state;
            while (true) {
                if (atomicReference2.compareAndSet(running2, running)) {
                    if (isEmpty && list5.isEmpty()) {
                        z3 = true;
                    }
                    if (!list2.isEmpty() || z3) {
                        running2.getCallback().onRecords(this, z3, list2);
                    }
                    if (isEmpty && !list5.isEmpty()) {
                        _StateMachineDnsCallKt.onFailure(running2.getCallback(), this, list5);
                    }
                    dnsQuery2 = null;
                    iOException2 = null;
                    list3 = o91Var;
                    z2 = true;
                } else {
                    List<Dns.Record> list6 = list2;
                    if (atomicReference2.get() != running2) {
                        break;
                    } else {
                        list2 = list6;
                    }
                }
            }
        }
    }
}
