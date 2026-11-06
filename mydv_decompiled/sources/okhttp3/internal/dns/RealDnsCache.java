package okhttp3.internal.dns;

import defpackage.d4;
import defpackage.er0;
import defpackage.i82;
import defpackage.j42;
import defpackage.jp;
import defpackage.kb0;
import defpackage.o70;
import defpackage.o75;
import defpackage.o91;
import defpackage.p70;
import defpackage.p75;
import defpackage.rm1;
import defpackage.s83;
import defpackage.sp0;
import defpackage.t41;
import defpackage.wd3;
import defpackage.wd5;
import defpackage.x41;
import defpackage.yp0;
import defpackage.zy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.dns.DnsQuery;
import okhttp3.internal.dns.RealDnsCache;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class RealDnsCache {
    private final AtomicInteger atomicHitCount;
    private final AtomicInteger atomicNetworkCount;
    private final AtomicInteger atomicRequestCount;
    private final RealDnsCache$cache$1 cache;
    private final long failureTimeToLive;
    private final long maximumTimeToLive;
    private final long minimumTimeToLive;
    private final long revalidateBeforeExpire;
    private final TaskRunner taskRunner;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class CacheQuery implements DnsQuery, DnsQuery.Callback {
        private DnsQuery.Callback callback;
        private final DnsQuery.Factory delegate;
        private final Entry entry;
        private final Question question;
        final /* synthetic */ RealDnsCache this$0;

        public CacheQuery(RealDnsCache realDnsCache, Question question, DnsQuery.Factory factory, Entry entry) {
            question.getClass();
            factory.getClass();
            entry.getClass();
            this.this$0 = realDnsCache;
            this.question = question;
            this.delegate = factory;
            this.entry = entry;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd5 cancel$lambda$0(CacheQuery cacheQuery) {
            DnsQuery.Callback callback = cacheQuery.callback;
            callback.getClass();
            callback.onFailure(new IOException("canceled"));
            return wd5.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd5 enqueue$lambda$1(Result result, DnsQuery.Callback callback) {
            if (result instanceof Result.Success) {
                callback.onResponse(((Result.Success) result).getMessage());
            } else {
                if (!(result instanceof Result.Failure)) {
                    s83.v();
                    return null;
                }
                callback.onFailure(((Result.Failure) result).getException());
            }
            return wd5.a;
        }

        @Override // okhttp3.internal.dns.DnsQuery
        public void cancel() {
            while (true) {
                State state = this.entry.getState().get();
                InFlightCall inFlightCall = state.getInFlightCall();
                if (inFlightCall == null) {
                    return;
                }
                ArrayList e1 = o70.e1(inFlightCall.getQueries(), this);
                if (e1.size() == inFlightCall.getQueries().size()) {
                    return;
                }
                State copy$default = State.copy$default(state, null, InFlightCall.copy$default(inFlightCall, null, null, e1, 3, null), null, 5, null);
                AtomicReference<State> state2 = this.entry.getState();
                while (!state2.compareAndSet(state, copy$default)) {
                    if (state2.get() != state) {
                        break;
                    }
                }
                TaskQueue.execute$default(this.this$0.taskRunner.newQueue(), this.question.getName() + " dns", 0L, false, new rm1() { // from class: okhttp3.internal.dns.c
                    @Override // defpackage.rm1
                    public final Object invoke() {
                        wd5 cancel$lambda$0;
                        cancel$lambda$0 = RealDnsCache.CacheQuery.cancel$lambda$0(RealDnsCache.CacheQuery.this);
                        return cancel$lambda$0;
                    }
                }, 6, null);
                return;
            }
        }

        @Override // okhttp3.internal.dns.DnsQuery
        public void enqueue(final DnsQuery.Callback callback) {
            final Result result;
            boolean z;
            InFlightCall inFlightCall;
            State copy$default;
            callback.getClass();
            if (this.callback != null) {
                zy.i("already enqueued");
                return;
            }
            this.callback = callback;
            o75 f = getTimeSource().f();
            loop0: while (true) {
                State state = this.entry.getState().get();
                result = state.getResult();
                InFlightCall inFlightCall2 = state.getInFlightCall();
                z = result != null && d4.l(f, result.getExpireAt()) < 0;
                if (inFlightCall2 != null && z) {
                    inFlightCall = inFlightCall2;
                } else if (inFlightCall2 != null) {
                    inFlightCall = inFlightCall2;
                    inFlightCall2 = InFlightCall.copy$default(inFlightCall2, null, null, o70.g1(inFlightCall2.getQueries(), this), 3, null);
                } else {
                    inFlightCall = inFlightCall2;
                    if (result == null || d4.l(f, result.getRevalidateAt()) >= 0) {
                        inFlightCall2 = new InFlightCall(this.delegate.newQuery(this.question), f, z ? o91.I : p70.j0(this));
                    } else {
                        inFlightCall2 = null;
                    }
                }
                copy$default = State.copy$default(state, f, inFlightCall2, null, 4, null);
                AtomicReference<State> state2 = this.entry.getState();
                while (!state2.compareAndSet(state, copy$default)) {
                    if (state2.get() != state) {
                        break;
                    }
                }
            }
            this.this$0.atomicRequestCount.incrementAndGet();
            if (inFlightCall == null && copy$default.getInFlightCall() != null) {
                this.this$0.atomicNetworkCount.incrementAndGet();
                copy$default.getInFlightCall().getQuery().enqueue(this);
            }
            if (z) {
                this.this$0.atomicHitCount.incrementAndGet();
                TaskQueue.execute$default(this.this$0.taskRunner.newQueue(), this.question.getName() + " dns", 0L, false, new rm1() { // from class: okhttp3.internal.dns.b
                    @Override // defpackage.rm1
                    public final Object invoke() {
                        wd5 enqueue$lambda$1;
                        enqueue$lambda$1 = RealDnsCache.CacheQuery.enqueue$lambda$1(RealDnsCache.Result.this, callback);
                        return enqueue$lambda$1;
                    }
                }, 6, null);
            }
        }

        public final DnsQuery.Callback getCallback() {
            return this.callback;
        }

        public final DnsQuery.Factory getDelegate() {
            return this.delegate;
        }

        public final Entry getEntry() {
            return this.entry;
        }

        public final Question getQuestion() {
            return this.question;
        }

        @Override // okhttp3.internal.dns.DnsQuery.Callback
        public void onFailure(IOException iOException) {
            State state;
            iOException.getClass();
            loop0: while (true) {
                state = this.entry.getState().get();
                InFlightCall inFlightCall = state.getInFlightCall();
                inFlightCall.getClass();
                kb0 sentAt = inFlightCall.getSentAt();
                t41 t41Var = new t41(t41.g(this.this$0.m358getFailureTimeToLiveUwyO8pc$okhttp(), t41.j(this.this$0.m361getRevalidateBeforeExpireUwyO8pc$okhttp())));
                t41 t41Var2 = new t41(sp0.n0(0, x41.SECONDS));
                if (t41Var.compareTo(t41Var2) < 0) {
                    t41Var = t41Var2;
                }
                o75 o75Var = (o75) sentAt;
                State copy$default = State.copy$default(state, null, null, new Result.Failure(o75Var.c(t41Var.I), o75Var.c(this.this$0.m358getFailureTimeToLiveUwyO8pc$okhttp()), iOException), 1, null);
                AtomicReference<State> state2 = this.entry.getState();
                while (!state2.compareAndSet(state, copy$default)) {
                    if (state2.get() != state) {
                        break;
                    }
                }
            }
            Iterator<CacheQuery> it = state.getInFlightCall().getQueries().iterator();
            while (it.hasNext()) {
                DnsQuery.Callback callback = it.next().callback;
                callback.getClass();
                callback.onFailure(iOException);
            }
        }

        @Override // okhttp3.internal.dns.DnsQuery.Callback
        public void onResponse(DnsMessage dnsMessage) {
            long j;
            dnsMessage.getClass();
            while (true) {
                State state = this.entry.getState().get();
                InFlightCall inFlightCall = state.getInFlightCall();
                inFlightCall.getClass();
                kb0 sentAt = inFlightCall.getSentAt();
                boolean isEmpty = dnsMessage.getAnswers().isEmpty();
                x41 x41Var = x41.SECONDS;
                if (isEmpty) {
                    j = this.this$0.m358getFailureTimeToLiveUwyO8pc$okhttp();
                } else {
                    jp jpVar = t41.J;
                    Iterator<T> it = dnsMessage.getAnswers().iterator();
                    if (!it.hasNext()) {
                        zy.k();
                        return;
                    }
                    int timeToLive = ((ResourceRecord) it.next()).getTimeToLive();
                    while (it.hasNext()) {
                        int timeToLive2 = ((ResourceRecord) it.next()).getTimeToLive();
                        if (timeToLive > timeToLive2) {
                            timeToLive = timeToLive2;
                        }
                    }
                    t41 t41Var = new t41(sp0.n0(timeToLive, x41Var));
                    t41 t41Var2 = new t41(this.this$0.m360getMinimumTimeToLiveUwyO8pc$okhttp());
                    t41 t41Var3 = new t41(this.this$0.m359getMaximumTimeToLiveUwyO8pc$okhttp());
                    if (t41Var2.compareTo(t41Var3) > 0) {
                        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t41Var3 + " is less than minimum " + t41Var2 + '.');
                    }
                    if (t41Var.compareTo(t41Var2) < 0) {
                        t41Var = t41Var2;
                    } else if (t41Var.compareTo(t41Var3) > 0) {
                        t41Var = t41Var3;
                    }
                    j = t41Var.I;
                }
                t41 t41Var4 = new t41(t41.g(j, t41.j(this.this$0.m361getRevalidateBeforeExpireUwyO8pc$okhttp())));
                t41 t41Var5 = new t41(sp0.n0(0, x41Var));
                if (t41Var4.compareTo(t41Var5) < 0) {
                    t41Var4 = t41Var5;
                }
                o75 o75Var = (o75) sentAt;
                State copy$default = State.copy$default(state, null, null, new Result.Success(o75Var.c(t41Var4.I), o75Var.c(j), dnsMessage), 1, null);
                AtomicReference<State> state2 = this.entry.getState();
                while (!state2.compareAndSet(state, copy$default)) {
                    if (state2.get() != state) {
                        break;
                    }
                }
                Iterator<CacheQuery> it2 = state.getInFlightCall().getQueries().iterator();
                while (it2.hasNext()) {
                    DnsQuery.Callback callback = it2.next().callback;
                    callback.getClass();
                    callback.onResponse(dnsMessage);
                }
                return;
            }
        }

        public final void setCallback(DnsQuery.Callback callback) {
            this.callback = callback;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Entry {
        private final AtomicReference<State> state = new AtomicReference<>(new State(null, null, null, 7, null));

        public final AtomicReference<State> getState() {
            return this.state;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class InFlightCall {
        private final List<CacheQuery> queries;
        private final DnsQuery query;
        private final kb0 sentAt;

        public InFlightCall(DnsQuery dnsQuery, kb0 kb0Var, List<CacheQuery> list) {
            dnsQuery.getClass();
            kb0Var.getClass();
            list.getClass();
            this.query = dnsQuery;
            this.sentAt = kb0Var;
            this.queries = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InFlightCall copy$default(InFlightCall inFlightCall, DnsQuery dnsQuery, kb0 kb0Var, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                dnsQuery = inFlightCall.query;
            }
            if ((i & 2) != 0) {
                kb0Var = inFlightCall.sentAt;
            }
            if ((i & 4) != 0) {
                list = inFlightCall.queries;
            }
            return inFlightCall.copy(dnsQuery, kb0Var, list);
        }

        public final DnsQuery component1() {
            return this.query;
        }

        public final kb0 component2() {
            return this.sentAt;
        }

        public final List<CacheQuery> component3() {
            return this.queries;
        }

        public final InFlightCall copy(DnsQuery dnsQuery, kb0 kb0Var, List<CacheQuery> list) {
            dnsQuery.getClass();
            kb0Var.getClass();
            list.getClass();
            return new InFlightCall(dnsQuery, kb0Var, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InFlightCall)) {
                return false;
            }
            InFlightCall inFlightCall = (InFlightCall) obj;
            return j42.c(this.query, inFlightCall.query) && j42.c(this.sentAt, inFlightCall.sentAt) && j42.c(this.queries, inFlightCall.queries);
        }

        public final List<CacheQuery> getQueries() {
            return this.queries;
        }

        public final DnsQuery getQuery() {
            return this.query;
        }

        public final kb0 getSentAt() {
            return this.sentAt;
        }

        public int hashCode() {
            return this.queries.hashCode() + ((i82.Q(((o75) this.sentAt).I) + (this.query.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "InFlightCall(query=" + this.query + ", sentAt=" + this.sentAt + ", queries=" + this.queries + ')';
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Result {

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Failure implements Result {
            private final IOException exception;
            private final kb0 expireAt;
            private final kb0 revalidateAt;

            public Failure(kb0 kb0Var, kb0 kb0Var2, IOException iOException) {
                kb0Var.getClass();
                kb0Var2.getClass();
                iOException.getClass();
                this.revalidateAt = kb0Var;
                this.expireAt = kb0Var2;
                this.exception = iOException;
            }

            public final IOException getException() {
                return this.exception;
            }

            @Override // okhttp3.internal.dns.RealDnsCache.Result
            public kb0 getExpireAt() {
                return this.expireAt;
            }

            @Override // okhttp3.internal.dns.RealDnsCache.Result
            public kb0 getRevalidateAt() {
                return this.revalidateAt;
            }
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Success implements Result {
            private final kb0 expireAt;
            private final DnsMessage message;
            private final kb0 revalidateAt;

            public Success(kb0 kb0Var, kb0 kb0Var2, DnsMessage dnsMessage) {
                kb0Var.getClass();
                kb0Var2.getClass();
                dnsMessage.getClass();
                this.revalidateAt = kb0Var;
                this.expireAt = kb0Var2;
                this.message = dnsMessage;
            }

            @Override // okhttp3.internal.dns.RealDnsCache.Result
            public kb0 getExpireAt() {
                return this.expireAt;
            }

            public final DnsMessage getMessage() {
                return this.message;
            }

            @Override // okhttp3.internal.dns.RealDnsCache.Result
            public kb0 getRevalidateAt() {
                return this.revalidateAt;
            }
        }

        kb0 getExpireAt();

        kb0 getRevalidateAt();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [okhttp3.internal.dns.RealDnsCache$cache$1] */
    private RealDnsCache(TaskRunner taskRunner, final p75 p75Var, long j, long j2, long j3, long j4, final int i) {
        taskRunner.getClass();
        p75Var.getClass();
        this.taskRunner = taskRunner;
        this.minimumTimeToLive = j;
        this.maximumTimeToLive = j2;
        this.failureTimeToLive = j3;
        this.revalidateBeforeExpire = j4;
        this.cache = new MemoryCache<Question, Entry>(p75Var, i) { // from class: okhttp3.internal.dns.RealDnsCache$cache$1
            @Override // okhttp3.internal.dns.MemoryCache
            public kb0 lastRequestedAt(kb0 kb0Var, RealDnsCache.Entry entry) {
                RealDnsCache.Result result;
                kb0 expireAt;
                kb0Var.getClass();
                entry.getClass();
                RealDnsCache.State state = entry.getState().get();
                if (state.getInFlightCall() == null && ((result = state.getResult()) == null || (expireAt = result.getExpireAt()) == null || d4.l((o75) expireAt, kb0Var) <= 0)) {
                    return null;
                }
                return state.getLastRequestedAt();
            }
        };
        this.atomicNetworkCount = new AtomicInteger();
        this.atomicHitCount = new AtomicInteger();
        this.atomicRequestCount = new AtomicInteger();
        jp jpVar = t41.J;
        x41 x41Var = x41.SECONDS;
        if (t41.c(j3, sp0.n0(0, x41Var)) < 0) {
            s83.t("Failed requirement.");
            throw null;
        }
        if (t41.c(j, sp0.n0(0, x41Var)) < 0) {
            s83.t("Failed requirement.");
            throw null;
        }
        if (t41.c(j2, j) < 0) {
            s83.t("Failed requirement.");
            throw null;
        }
        if (t41.c(j4, sp0.n0(0, x41Var)) >= 0) {
            return;
        }
        s83.t("Failed requirement.");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DnsQuery wrap$lambda$0(RealDnsCache realDnsCache, DnsQuery.Factory factory, Question question) {
        question.getClass();
        return new CacheQuery(realDnsCache, question, factory, realDnsCache.cache.computeIfAbsent(question, new wd3((byte) 13)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Entry wrap$lambda$0$0() {
        return new Entry();
    }

    public final void evictAll() {
        evictAll();
    }

    /* renamed from: getFailureTimeToLive-UwyO8pc$okhttp, reason: not valid java name */
    public final long m358getFailureTimeToLiveUwyO8pc$okhttp() {
        return this.failureTimeToLive;
    }

    public final int getHitCount$okhttp() {
        return this.atomicHitCount.get();
    }

    public final int getMaxSize$okhttp() {
        return getMaxSize();
    }

    /* renamed from: getMaximumTimeToLive-UwyO8pc$okhttp, reason: not valid java name */
    public final long m359getMaximumTimeToLiveUwyO8pc$okhttp() {
        return this.maximumTimeToLive;
    }

    /* renamed from: getMinimumTimeToLive-UwyO8pc$okhttp, reason: not valid java name */
    public final long m360getMinimumTimeToLiveUwyO8pc$okhttp() {
        return this.minimumTimeToLive;
    }

    public final int getNetworkCount$okhttp() {
        return this.atomicNetworkCount.get();
    }

    public final int getRequestCount$okhttp() {
        return this.atomicRequestCount.get();
    }

    /* renamed from: getRevalidateBeforeExpire-UwyO8pc$okhttp, reason: not valid java name */
    public final long m361getRevalidateBeforeExpireUwyO8pc$okhttp() {
        return this.revalidateBeforeExpire;
    }

    public final int getSize$okhttp() {
        return getSize();
    }

    public final DnsQuery.Factory wrap(DnsQuery.Factory factory) {
        factory.getClass();
        return new yp0(this, factory, (byte) 11);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class State {
        private final InFlightCall inFlightCall;
        private final kb0 lastRequestedAt;
        private final Result result;

        public /* synthetic */ State(kb0 kb0Var, InFlightCall inFlightCall, Result result, int i, er0 er0Var) {
            this((i & 1) != 0 ? null : kb0Var, (i & 2) != 0 ? null : inFlightCall, (i & 4) != 0 ? null : result);
        }

        public static /* synthetic */ State copy$default(State state, kb0 kb0Var, InFlightCall inFlightCall, Result result, int i, Object obj) {
            if ((i & 1) != 0) {
                kb0Var = state.lastRequestedAt;
            }
            if ((i & 2) != 0) {
                inFlightCall = state.inFlightCall;
            }
            if ((i & 4) != 0) {
                result = state.result;
            }
            return state.copy(kb0Var, inFlightCall, result);
        }

        public final kb0 component1() {
            return this.lastRequestedAt;
        }

        public final InFlightCall component2() {
            return this.inFlightCall;
        }

        public final Result component3() {
            return this.result;
        }

        public final State copy(kb0 kb0Var, InFlightCall inFlightCall, Result result) {
            return new State(kb0Var, inFlightCall, result);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return j42.c(this.lastRequestedAt, state.lastRequestedAt) && j42.c(this.inFlightCall, state.inFlightCall) && j42.c(this.result, state.result);
        }

        public final InFlightCall getInFlightCall() {
            return this.inFlightCall;
        }

        public final kb0 getLastRequestedAt() {
            return this.lastRequestedAt;
        }

        public final Result getResult() {
            return this.result;
        }

        public int hashCode() {
            kb0 kb0Var = this.lastRequestedAt;
            int Q = (kb0Var == null ? 0 : i82.Q(((o75) kb0Var).I)) * 31;
            InFlightCall inFlightCall = this.inFlightCall;
            int hashCode = (Q + (inFlightCall == null ? 0 : inFlightCall.hashCode())) * 31;
            Result result = this.result;
            return hashCode + (result != null ? result.hashCode() : 0);
        }

        public String toString() {
            return "State(lastRequestedAt=" + this.lastRequestedAt + ", inFlightCall=" + this.inFlightCall + ", result=" + this.result + ')';
        }

        public State(kb0 kb0Var, InFlightCall inFlightCall, Result result) {
            this.lastRequestedAt = kb0Var;
            this.inFlightCall = inFlightCall;
            this.result = result;
        }

        public State() {
            this(null, null, null, 7, null);
        }
    }

    public /* synthetic */ RealDnsCache(TaskRunner taskRunner, p75 p75Var, long j, long j2, long j3, long j4, int i, er0 er0Var) {
        this(taskRunner, p75Var, j, j2, j3, j4, i);
    }
}
