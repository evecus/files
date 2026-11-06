package okhttp3.internal.connection;

import defpackage.av5;
import defpackage.er0;
import defpackage.hf1;
import defpackage.r7;
import defpackage.s83;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealConnectionPool {
    public static final Companion Companion = new Companion(null);
    private final TaskQueue cleanupQueue;
    private final RealConnectionPool$cleanupTask$1 cleanupTask;
    private final ConnectionListener connectionListener;
    private final ConcurrentLinkedQueue<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* JADX WARN: Type inference failed for: r2v2, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, int i, long j, TimeUnit timeUnit, ConnectionListener connectionListener) {
        taskRunner.getClass();
        timeUnit.getClass();
        connectionListener.getClass();
        this.maxIdleConnections = i;
        this.connectionListener = connectionListener;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        this.cleanupQueue = taskRunner.newQueue();
        final String z = hf1.z(new StringBuilder(), _UtilJvmKt.okHttpName, " ConnectionPool connection closer");
        this.cleanupTask = new Task(z) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return RealConnectionPool.this.closeConnections(System.nanoTime());
            }
        };
        this.connections = new ConcurrentLinkedQueue<>();
        if (j > 0) {
            return;
        }
        s83.h(r7.A("keepAliveDuration <= 0: ", j));
        throw null;
    }

    private final int pruneAndGetAllocationCount(RealConnection realConnection, long j) {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            av5.b(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
            return 0;
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        int i = 0;
        while (i < calls.size()) {
            Reference<RealCall> reference = calls.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Platform.Companion.get().logCloseableLeak("A connection to " + realConnection.route().address().url() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).getCallStackTrace());
                calls.remove(i);
                if (calls.isEmpty()) {
                    realConnection.setIdleAtNs(j - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return calls.size();
    }

    public final RealConnection callAcquirePooledConnection$okhttp(boolean z, Address address, RealCall realCall, List<Route> list, boolean z2) {
        boolean z3;
        boolean noNewExchanges;
        Socket releaseConnectionNoEvents$okhttp;
        address.getClass();
        realCall.getClass();
        Iterator<RealConnection> it = this.connections.iterator();
        it.getClass();
        while (it.hasNext()) {
            RealConnection next = it.next();
            next.getClass();
            synchronized (next) {
                z3 = false;
                if (z2) {
                    try {
                        if (!next.isMultiplexed$okhttp()) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (next.isEligible$okhttp(address, list)) {
                    realCall.acquireConnectionNoEvents(next);
                    z3 = true;
                }
            }
            if (z3) {
                if (next.isHealthy(z)) {
                    return next;
                }
                synchronized (next) {
                    noNewExchanges = next.getNoNewExchanges();
                    next.setNoNewExchanges(true);
                    releaseConnectionNoEvents$okhttp = realCall.releaseConnectionNoEvents$okhttp();
                }
                if (releaseConnectionNoEvents$okhttp != null) {
                    _UtilJvmKt.closeQuietly(releaseConnectionNoEvents$okhttp);
                    this.connectionListener.connectionClosed(next);
                } else if (!noNewExchanges) {
                    this.connectionListener.noNewExchanges(next);
                }
            }
        }
        return null;
    }

    public final long closeConnections(long j) {
        long j2 = (j - this.keepAliveDurationNs) + 1;
        Iterator<RealConnection> it = this.connections.iterator();
        it.getClass();
        RealConnection realConnection = null;
        long j3 = Long.MAX_VALUE;
        int i = 0;
        RealConnection realConnection2 = null;
        RealConnection realConnection3 = null;
        int i2 = 0;
        while (it.hasNext()) {
            RealConnection next = it.next();
            next.getClass();
            synchronized (next) {
                if (pruneAndGetAllocationCount(next, j) > 0) {
                    i2++;
                } else {
                    long idleAtNs = next.getIdleAtNs();
                    if (idleAtNs < j2) {
                        realConnection2 = next;
                        j2 = idleAtNs;
                    }
                    i++;
                    if (idleAtNs < j3) {
                        realConnection3 = next;
                        j3 = idleAtNs;
                    }
                }
            }
        }
        if (realConnection2 != null) {
            realConnection = realConnection2;
        } else if (i > this.maxIdleConnections) {
            j2 = j3;
            realConnection = realConnection3;
        } else {
            j2 = -1;
        }
        if (realConnection == null) {
            if (realConnection3 != null) {
                return (j3 + this.keepAliveDurationNs) - j;
            }
            if (i2 > 0) {
                return this.keepAliveDurationNs;
            }
            return -1L;
        }
        synchronized (realConnection) {
            if (!realConnection.getCalls().isEmpty()) {
                return 0L;
            }
            if (realConnection.getIdleAtNs() != j2) {
                return 0L;
            }
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
            _UtilJvmKt.closeQuietly(realConnection.socket());
            this.connectionListener.connectionClosed(realConnection);
            if (this.connections.isEmpty()) {
                this.cleanupQueue.cancelAll();
            }
            return 0L;
        }
    }

    public final boolean connectionBecameIdle(RealConnection realConnection) {
        realConnection.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            av5.b(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
            return false;
        }
        if (!realConnection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            scheduleCloser();
            return false;
        }
        realConnection.setNoNewExchanges(true);
        this.connections.remove(realConnection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
        return true;
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    public final void evictAll() {
        Socket socket;
        Iterator<RealConnection> it = this.connections.iterator();
        it.getClass();
        while (it.hasNext()) {
            RealConnection next = it.next();
            next.getClass();
            synchronized (next) {
                if (next.getCalls().isEmpty()) {
                    it.remove();
                    next.setNoNewExchanges(true);
                    socket = next.socket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                _UtilJvmKt.closeQuietly(socket);
                this.connectionListener.connectionClosed(next);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }

    public final ConnectionListener getConnectionListener$okhttp() {
        return this.connectionListener;
    }

    public final long getKeepAliveDurationNs$okhttp() {
        return this.keepAliveDurationNs;
    }

    public final int idleConnectionCount() {
        boolean isEmpty;
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = this.connections;
        int i = 0;
        if (r7.O(concurrentLinkedQueue) && concurrentLinkedQueue.isEmpty()) {
            return 0;
        }
        for (RealConnection realConnection : concurrentLinkedQueue) {
            realConnection.getClass();
            synchronized (realConnection) {
                isEmpty = realConnection.getCalls().isEmpty();
            }
            if (isEmpty && (i = i + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    public final void put(RealConnection realConnection) {
        realConnection.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            av5.b(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
        } else {
            this.connections.add(realConnection);
            scheduleCloser();
        }
    }

    public final void scheduleCloser() {
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        public final RealConnectionPool get(ConnectionPool connectionPool) {
            connectionPool.getClass();
            return connectionPool.getDelegate$okhttp();
        }

        private Companion() {
        }
    }
}
