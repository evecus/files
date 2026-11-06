package okhttp3.android;

import android.net.DnsResolver;
import android.net.DnsResolver$Callback;
import android.net.Network;
import android.os.Build;
import android.os.CancellationSignal;
import android.security.NetworkSecurityPolicy;
import defpackage.cz;
import defpackage.mc;
import defpackage.p70;
import defpackage.rm1;
import defpackage.u05;
import defpackage.u7;
import defpackage.uc2;
import defpackage.w7;
import defpackage.wd5;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.Dns;
import okhttp3.DnsCache;
import okhttp3.android.AndroidDns;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.dns.DnsMessage;
import okhttp3.internal.dns.DnsMessageReader;
import okhttp3.internal.dns.DnsQuery;
import okhttp3.internal.dns.Question;
import okhttp3.internal.dns.ResourceRecord;
import okhttp3.internal.dns.StateMachineDnsCall;
import okhttp3.internal.dns._ExecuteDnsKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class AndroidDns implements Dns {
    private final DnsResolver dnsResolver;
    private final Executor executor;
    private final boolean includeServiceMetadata;
    private final Network network;
    private final uc2 networkSecurityPolicy$delegate;
    private final DnsQuery.Factory queryFactory;
    private final TaskRunner taskRunner;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class AndroidQuery implements DnsQuery {
        private final CancellationSignal cancellationSignal;
        private final Question question;
        final /* synthetic */ AndroidDns this$0;

        public AndroidQuery(AndroidDns androidDns, Question question) {
            question.getClass();
            this.this$0 = androidDns;
            this.question = question;
            this.cancellationSignal = question.getType() == 65 ? new CancellationSignal() : null;
        }

        private final void queryServiceMetadata(final DnsQuery.Callback callback) {
            try {
                this.this$0.getDnsResolver$okhttp().rawQuery(this.this$0.getNetwork$okhttp(), this.question.getName(), 1, 65, 0, this.this$0.getExecutor$okhttp(), this.cancellationSignal, new DnsResolver$Callback() { // from class: okhttp3.android.AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1
                    public void onAnswer(byte[] bArr, int i) {
                        bArr.getClass();
                        try {
                            cz czVar = new cz();
                            czVar.m196write(bArr, 0, bArr.length);
                            DnsQuery.Callback.this.onResponse(new DnsMessageReader(czVar).read());
                        } catch (IOException e) {
                            DnsQuery.Callback.this.onFailure(e);
                        }
                    }

                    public void onError(DnsResolver.DnsException dnsException) {
                        dnsException.getClass();
                        DnsQuery.Callback.this.onFailure(new IOException("HTTPS query failed with code " + dnsException.code, dnsException));
                    }
                });
            } catch (SecurityException e) {
                TaskQueue.execute$default(this.this$0.taskRunner.newQueue(), this.question.getName() + " dns", 0L, false, new rm1() { // from class: okhttp3.android.b
                    @Override // defpackage.rm1
                    public final Object invoke() {
                        wd5 queryServiceMetadata$lambda$0;
                        queryServiceMetadata$lambda$0 = AndroidDns.AndroidQuery.queryServiceMetadata$lambda$0(DnsQuery.Callback.this, e);
                        return queryServiceMetadata$lambda$0;
                    }
                }, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd5 queryServiceMetadata$lambda$0(DnsQuery.Callback callback, SecurityException securityException) {
            callback.onFailure(new IOException(securityException));
            return wd5.a;
        }

        private final void resolveAddresses(final DnsQuery.Callback callback) {
            TaskQueue newQueue = this.this$0.taskRunner.newQueue();
            String str = this.question.getName() + " dns";
            final AndroidDns androidDns = this.this$0;
            TaskQueue.execute$default(newQueue, str, 0L, false, new rm1() { // from class: okhttp3.android.a
                @Override // defpackage.rm1
                public final Object invoke() {
                    wd5 resolveAddresses$lambda$0;
                    resolveAddresses$lambda$0 = AndroidDns.AndroidQuery.resolveAddresses$lambda$0(AndroidDns.this, this, callback);
                    return resolveAddresses$lambda$0;
                }
            }, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wd5 resolveAddresses$lambda$0(AndroidDns androidDns, AndroidQuery androidQuery, DnsQuery.Callback callback) {
            Network network$okhttp;
            InetAddress[] allByName;
            try {
                network$okhttp = androidDns.getNetwork$okhttp();
            } catch (UnknownHostException e) {
                callback.onFailure(e);
            }
            if (network$okhttp != null) {
                allByName = network$okhttp.getAllByName(androidQuery.question.getName());
                if (allByName == null) {
                }
                allByName.getClass();
                callback.onResponse(androidQuery.response(allByName));
                return wd5.a;
            }
            allByName = InetAddress.getAllByName(androidQuery.question.getName());
            allByName.getClass();
            callback.onResponse(androidQuery.response(allByName));
            return wd5.a;
        }

        private final DnsMessage response(InetAddress[] inetAddressArr) {
            DnsMessage.Companion companion = DnsMessage.Companion;
            List j0 = p70.j0(this.question);
            ArrayList arrayList = new ArrayList(inetAddressArr.length);
            for (InetAddress inetAddress : inetAddressArr) {
                arrayList.add(new ResourceRecord.IpAddress(this.question.getName(), 0, inetAddress));
            }
            return DnsMessage.Companion.response$default(companion, (short) 0, j0, arrayList, 1, null);
        }

        @Override // okhttp3.internal.dns.DnsQuery
        public void cancel() {
            CancellationSignal cancellationSignal = this.cancellationSignal;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        }

        @Override // okhttp3.internal.dns.DnsQuery
        public void enqueue(DnsQuery.Callback callback) {
            callback.getClass();
            int type = this.question.getType();
            if (type == 1) {
                resolveAddresses(callback);
            } else {
                if (type == 65) {
                    queryServiceMetadata(callback);
                    return;
                }
                throw new IllegalStateException(("unexpected query type " + this.question.getType()).toString());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AndroidDns(android.net.DnsResolver r16, android.net.Network r17, okhttp3.DnsCache r18, boolean r19, int r20, defpackage.er0 r21) {
        /*
            r15 = this;
            r0 = r20 & 1
            if (r0 == 0) goto Lc
            android.net.DnsResolver r0 = android.net.DnsResolver.getInstance()
            r0.getClass()
            goto Le
        Lc:
            r0 = r16
        Le:
            r1 = r20 & 2
            if (r1 == 0) goto L14
            r1 = 0
            goto L16
        L14:
            r1 = r17
        L16:
            r2 = r20 & 4
            if (r2 == 0) goto L2c
            okhttp3.DnsCache r3 = new okhttp3.DnsCache
            r13 = 31
            r14 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r3.<init>(r4, r6, r8, r10, r12, r13, r14)
            goto L2e
        L2c:
            r3 = r18
        L2e:
            r2 = r20 & 8
            if (r2 == 0) goto L34
            r2 = 1
            goto L36
        L34:
            r2 = r19
        L36:
            r15.<init>(r0, r1, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.android.AndroidDns.<init>(android.net.DnsResolver, android.net.Network, okhttp3.DnsCache, boolean, int, er0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkSecurityPolicy _init_$lambda$1() {
        NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        networkSecurityPolicy.getClass();
        return networkSecurityPolicy;
    }

    private final StateMachineDnsCall call(Dns.Request request, boolean z) {
        return new StateMachineDnsCall(this.taskRunner, request, this.queryFactory, false, z && includeServiceMetadataForRequest(request));
    }

    private final NetworkSecurityPolicy getNetworkSecurityPolicy() {
        return (NetworkSecurityPolicy) this.networkSecurityPolicy$delegate.getValue();
    }

    private final boolean includeServiceMetadataForRequest(Dns.Request request) {
        if (Build.VERSION.SDK_INT < 37) {
            return false;
        }
        int domainEncryptionMode = getNetworkSecurityPolicy().getDomainEncryptionMode(request.hostname());
        return domainEncryptionMode == 2 || domainEncryptionMode == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DnsQuery queryFactory$lambda$0(AndroidDns androidDns, Question question) {
        question.getClass();
        return new AndroidQuery(androidDns, question);
    }

    public final DnsResolver getDnsResolver$okhttp() {
        return this.dnsResolver;
    }

    public final Executor getExecutor$okhttp() {
        return this.executor;
    }

    public final boolean getIncludeServiceMetadata$okhttp() {
        return this.includeServiceMetadata;
    }

    public final Network getNetwork$okhttp() {
        return this.network;
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String str) {
        str.getClass();
        int i = 0;
        List<Dns.Record> execute = _ExecuteDnsKt.execute(call(new Dns.Request(str, i, 2, null), false));
        ArrayList arrayList = new ArrayList();
        for (Object obj : execute) {
            if (obj instanceof Dns.Record.IpAddress) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p70.J(arrayList, 10));
        int size = arrayList.size();
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((Dns.Record.IpAddress) obj2).address());
        }
        return arrayList2;
    }

    @Override // okhttp3.Dns
    public Dns.Call newCall(Dns.Request request) {
        request.getClass();
        return call(request, this.includeServiceMetadata);
    }

    public AndroidDns(DnsResolver dnsResolver, Network network, DnsCache dnsCache, boolean z, Executor executor, TaskRunner taskRunner, uc2 uc2Var) {
        dnsResolver.getClass();
        dnsCache.getClass();
        executor.getClass();
        taskRunner.getClass();
        uc2Var.getClass();
        this.dnsResolver = dnsResolver;
        this.network = network;
        this.includeServiceMetadata = z;
        this.executor = executor;
        this.taskRunner = taskRunner;
        this.networkSecurityPolicy$delegate = uc2Var;
        this.queryFactory = dnsCache.f1delegate.wrap(new w7(this, (byte) 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidDns(DnsResolver dnsResolver, Network network, DnsCache dnsCache, boolean z) {
        this(dnsResolver, network, dnsCache, z, new mc((byte) 0), TaskRunner.INSTANCE, new u05(new u7((byte) 2)));
        dnsResolver.getClass();
        dnsCache.getClass();
    }
}
