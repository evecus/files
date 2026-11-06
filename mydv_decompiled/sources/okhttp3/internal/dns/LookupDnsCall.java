package okhttp3.internal.dns;

import defpackage.j42;
import defpackage.p70;
import defpackage.s83;
import defpackage.zy;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Dns;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class LookupDnsCall extends Task implements Dns.Call {
    private final Dns delegate;
    private final Dns.Request request;
    private final AtomicReference<State> state;
    private final TaskRunner taskRunner;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface State {

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        /* loaded from: classes2.dex */
        public static final class Canceled implements State {
            public static final Canceled INSTANCE = new Canceled();

            private Canceled() {
            }
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        /* loaded from: classes2.dex */
        public static final class Complete implements State {
            public static final Complete INSTANCE = new Complete();

            private Complete() {
            }
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Idle implements State {
            public static final Idle INSTANCE = new Idle();

            private Idle() {
            }
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        /* loaded from: classes2.dex */
        public static final class Running implements State {
            private final Dns.Callback callback;

            public Running(Dns.Callback callback) {
                callback.getClass();
                this.callback = callback;
            }

            public final Dns.Callback getCallback() {
                return this.callback;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookupDnsCall(TaskRunner taskRunner, Dns dns, Dns.Request request) {
        super(request.hostname() + " dns", false);
        taskRunner.getClass();
        dns.getClass();
        request.getClass();
        this.taskRunner = taskRunner;
        this.delegate = dns;
        this.request = request;
        this.state = new AtomicReference<>(State.Idle.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cancel$lambda$0(State state) {
        state.getClass();
        return (state instanceof State.Running) || state.equals(State.Idle.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enqueue$lambda$0(State state) {
        state.getClass();
        return state instanceof State.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean runOnce$lambda$0(State state) {
        state.getClass();
        return state instanceof State.Running;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean runOnce$lambda$2(State state) {
        state.getClass();
        return state instanceof State.Running;
    }

    @Override // okhttp3.Dns.Call
    public void cancel() {
        Dns.Callback callback;
        State state = (State) _UtilJvmKt.testAndSet(this.state, State.Canceled.INSTANCE, new a((byte) 3));
        State.Running running = state instanceof State.Running ? (State.Running) state : null;
        if (running == null || (callback = running.getCallback()) == null) {
            return;
        }
        callback.onFailure(this, new IOException("canceled"));
    }

    @Override // okhttp3.Dns.Call
    public void enqueue(Dns.Callback callback) {
        callback.getClass();
        State state = (State) _UtilJvmKt.testAndSet(this.state, new State.Running(callback), new a((byte) 0));
        if (state instanceof State.Idle) {
            TaskQueue.schedule$default(this.taskRunner.newQueue(), this, 0L, 2, null);
            return;
        }
        if ((state instanceof State.Running) || j42.c(state, State.Complete.INSTANCE)) {
            zy.i("already enqueued");
        } else if (j42.c(state, State.Canceled.INSTANCE)) {
            callback.onFailure(this, new IOException("canceled"));
        } else {
            s83.v();
        }
    }

    @Override // okhttp3.Dns.Call
    public Dns.Request getRequest() {
        return this.request;
    }

    @Override // okhttp3.Dns.Call
    public boolean isCanceled() {
        return this.state.get() instanceof State.Canceled;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        Dns.Callback callback;
        Dns.Callback callback2;
        try {
            List<InetAddress> lookup = this.delegate.lookup(getRequest().hostname());
            State state = (State) _UtilJvmKt.testAndSet(this.state, State.Complete.INSTANCE, new a((byte) 1));
            State.Running running = state instanceof State.Running ? (State.Running) state : null;
            if (running == null || (callback2 = running.getCallback()) == null) {
                return -1L;
            }
            ArrayList arrayList = new ArrayList(p70.J(lookup, 10));
            Iterator<T> it = lookup.iterator();
            while (it.hasNext()) {
                arrayList.add(new Dns.Record.IpAddress(getRequest().hostname(), (InetAddress) it.next()));
            }
            callback2.onRecords(this, true, arrayList);
            return -1L;
        } catch (UnknownHostException e) {
            State state2 = (State) _UtilJvmKt.testAndSet(this.state, State.Complete.INSTANCE, new a((byte) 2));
            State.Running running2 = state2 instanceof State.Running ? (State.Running) state2 : null;
            if (running2 == null || (callback = running2.getCallback()) == null) {
                return -1L;
            }
            callback.onFailure(this, e);
            return -1L;
        }
    }
}
