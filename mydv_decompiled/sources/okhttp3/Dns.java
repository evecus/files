package okhttp3;

import defpackage.er0;
import defpackage.h00;
import defpackage.hf1;
import defpackage.j42;
import defpackage.m90;
import defpackage.o70;
import defpackage.o91;
import defpackage.s83;
import java.io.IOException;
import java.net.InetAddress;
import java.util.List;
import okhttp3.Dns;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface Dns {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Dns SYSTEM = new Dns() { // from class: okhttp3.Dns$Companion$SYSTEM$1
        @Override // okhttp3.Dns
        public List<InetAddress> lookup(String str) {
            str.getClass();
            return Platform.Companion.get().getSystemDns().lookup(str);
        }

        @Override // okhttp3.Dns
        public Dns.Call newCall(Dns.Request request) {
            request.getClass();
            return Platform.Companion.get().getSystemDns().newCall(request);
        }

        public String toString() {
            return "Dns.SYSTEM";
        }
    };

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Call {
        void cancel();

        void enqueue(Callback callback);

        Request getRequest();

        boolean isCanceled();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public interface Callback {
        void onFailure(Call call, IOException iOException);

        void onRecords(Call call, boolean z, List<? extends Record> list);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    List<InetAddress> lookup(String str);

    Call newCall(Request request);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static abstract class Record {

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class IpAddress extends Record {
            private final InetAddress address;
            private final String hostname;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IpAddress(String str, InetAddress inetAddress) {
                super(null);
                str.getClass();
                inetAddress.getClass();
                this.address = inetAddress;
                String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
                if (canonicalHost != null) {
                    this.hostname = canonicalHost;
                } else {
                    s83.t("unexpected hostname: ".concat(str));
                    throw null;
                }
            }

            public final InetAddress address() {
                return this.address;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof IpAddress)) {
                    return false;
                }
                IpAddress ipAddress = (IpAddress) obj;
                return j42.c(ipAddress.getHostname(), getHostname()) && j42.c(ipAddress.address, this.address);
            }

            public int hashCode() {
                return this.address.hashCode() + (getHostname().hashCode() * 31);
            }

            @Override // okhttp3.Dns.Record
            /* renamed from: hostname, reason: merged with bridge method [inline-methods] */
            public String getHostname() {
                return this.hostname;
            }

            public String toString() {
                return getHostname() + '/' + this.address.getHostAddress();
            }
        }

        public /* synthetic */ Record(er0 er0Var) {
            this();
        }

        public abstract String getHostname();

        private Record() {
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class ServiceMetadata extends Record {
            private final List<Protocol> alpnIds;
            private final h00 echConfigList;
            private final String hostname;
            private final List<InetAddress> ipAddressHints;
            private final int port;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ServiceMetadata(String str, List<? extends Protocol> list, int i, List<? extends InetAddress> list2, h00 h00Var) {
                super(0 == true ? 1 : 0);
                str.getClass();
                list2.getClass();
                this.echConfigList = h00Var;
                String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
                if (canonicalHost == null) {
                    s83.t("unexpected hostname: ".concat(str));
                    throw null;
                }
                this.hostname = canonicalHost;
                if (i == -1) {
                    i = 443;
                } else if (1 > i || i >= 65536) {
                    s83.t(hf1.u(i, "unexpected port: "));
                    throw null;
                }
                this.port = i;
                this.alpnIds = list != null ? o70.r1(list) : null;
                this.ipAddressHints = o70.r1(list2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CharSequence toString$lambda$0$0(InetAddress inetAddress) {
                inetAddress.getClass();
                String hostAddress = inetAddress.getHostAddress();
                hostAddress.getClass();
                return hostAddress;
            }

            public final List<Protocol> alpnIds() {
                return this.alpnIds;
            }

            public final h00 echConfigList() {
                return this.echConfigList;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof ServiceMetadata)) {
                    return false;
                }
                ServiceMetadata serviceMetadata = (ServiceMetadata) obj;
                return j42.c(serviceMetadata.getHostname(), getHostname()) && j42.c(serviceMetadata.alpnIds, this.alpnIds) && serviceMetadata.port == this.port && j42.c(serviceMetadata.ipAddressHints, this.ipAddressHints) && j42.c(serviceMetadata.echConfigList, this.echConfigList);
            }

            public int hashCode() {
                int hashCode = (getHostname().hashCode() + 527) * 31;
                List<Protocol> list = this.alpnIds;
                int hashCode2 = (this.ipAddressHints.hashCode() + ((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.port) * 31)) * 31;
                h00 h00Var = this.echConfigList;
                return hashCode2 + (h00Var != null ? h00Var.hashCode() : 0);
            }

            @Override // okhttp3.Dns.Record
            /* renamed from: hostname, reason: merged with bridge method [inline-methods] */
            public String getHostname() {
                return this.hostname;
            }

            public final List<InetAddress> ipAddressHints() {
                return this.ipAddressHints;
            }

            public final int port() {
                return this.port;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder(32);
                sb.append("ServiceMetadata{");
                sb.append(getHostname());
                if (this.alpnIds != null) {
                    sb.append(", alpnIds=");
                    sb.append(this.alpnIds);
                }
                if (this.port != 443) {
                    sb.append(", port=");
                    sb.append(this.port);
                }
                if (!this.ipAddressHints.isEmpty()) {
                    sb.append(", ipAddressHints=[");
                    sb.append(o70.Z0(this.ipAddressHints, null, null, null, 0, new m90((byte) 9), 31));
                    sb.append("]");
                }
                if (this.echConfigList != null) {
                    sb.append(", echConfigList=");
                    sb.append(this.echConfigList.e());
                }
                sb.append("}");
                return sb.toString();
            }

            public /* synthetic */ ServiceMetadata(String str, List list, int i, List list2, h00 h00Var, int i2, er0 er0Var) {
                this(str, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? o91.I : list2, (i2 & 16) != 0 ? null : h00Var);
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Request {
        private final String hostname;
        private final int port;

        public Request(String str, int i) {
            str.getClass();
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                s83.t("unexpected hostname: ".concat(str));
                throw null;
            }
            this.hostname = canonicalHost;
            if (i == -1) {
                i = 443;
            } else if (1 > i || i >= 65536) {
                s83.t(hf1.u(i, "unexpected port: "));
                throw null;
            }
            this.port = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return j42.c(request.hostname, this.hostname) && request.port == this.port;
        }

        public int hashCode() {
            return (this.hostname.hashCode() * 31) + this.port;
        }

        public final String hostname() {
            return this.hostname;
        }

        public final int port() {
            return this.port;
        }

        public String toString() {
            int i = this.port;
            String str = this.hostname;
            if (i == 443) {
                return str;
            }
            return str + ':' + this.port;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(String str) {
            this(str, 0, 2, null);
            str.getClass();
        }

        public /* synthetic */ Request(String str, int i, int i2, er0 er0Var) {
            this(str, (i2 & 2) != 0 ? -1 : i);
        }
    }
}
