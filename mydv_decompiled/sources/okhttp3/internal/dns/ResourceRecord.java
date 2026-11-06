package okhttp3.internal.dns;

import defpackage.er0;
import defpackage.h00;
import defpackage.hf1;
import defpackage.j42;
import defpackage.o91;
import java.net.InetAddress;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface ResourceRecord {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class IpAddress implements ResourceRecord {
        private final InetAddress address;
        private final String name;
        private final int timeToLive;

        public IpAddress(String str, int i, InetAddress inetAddress) {
            str.getClass();
            inetAddress.getClass();
            this.name = str;
            this.timeToLive = i;
            this.address = inetAddress;
        }

        public static /* synthetic */ IpAddress copy$default(IpAddress ipAddress, String str, int i, InetAddress inetAddress, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = ipAddress.name;
            }
            if ((i2 & 2) != 0) {
                i = ipAddress.timeToLive;
            }
            if ((i2 & 4) != 0) {
                inetAddress = ipAddress.address;
            }
            return ipAddress.copy(str, i, inetAddress);
        }

        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.timeToLive;
        }

        public final InetAddress component3() {
            return this.address;
        }

        public final IpAddress copy(String str, int i, InetAddress inetAddress) {
            str.getClass();
            inetAddress.getClass();
            return new IpAddress(str, i, inetAddress);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IpAddress)) {
                return false;
            }
            IpAddress ipAddress = (IpAddress) obj;
            return j42.c(this.name, ipAddress.name) && this.timeToLive == ipAddress.timeToLive && j42.c(this.address, ipAddress.address);
        }

        public final InetAddress getAddress() {
            return this.address;
        }

        @Override // okhttp3.internal.dns.ResourceRecord
        public String getName() {
            return this.name;
        }

        @Override // okhttp3.internal.dns.ResourceRecord
        public int getTimeToLive() {
            return this.timeToLive;
        }

        public int hashCode() {
            return this.address.hashCode() + (((this.name.hashCode() * 31) + this.timeToLive) * 31);
        }

        public String toString() {
            return "IpAddress(name=" + this.name + ", timeToLive=" + this.timeToLive + ", address=" + this.address + ')';
        }
    }

    String getName();

    int getTimeToLive();

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Https implements ResourceRecord {
        private final List<String> alpnIds;
        private final h00 echConfigList;
        private final List<InetAddress> ipAddressHints;
        private final String name;
        private int port;
        private final int priority;
        private final String targetName;
        private final int timeToLive;

        public /* synthetic */ Https(String str, int i, int i2, String str2, List list, int i3, List list2, h00 h00Var, int i4, er0 er0Var) {
            this(str, i, (i4 & 4) != 0 ? 1 : i2, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? null : list, (i4 & 32) != 0 ? 443 : i3, (i4 & 64) != 0 ? o91.I : list2, (i4 & 128) != 0 ? null : h00Var);
        }

        public static /* synthetic */ Https copy$default(Https https, String str, int i, int i2, String str2, List list, int i3, List list2, h00 h00Var, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = https.name;
            }
            if ((i4 & 2) != 0) {
                i = https.timeToLive;
            }
            if ((i4 & 4) != 0) {
                i2 = https.priority;
            }
            if ((i4 & 8) != 0) {
                str2 = https.targetName;
            }
            if ((i4 & 16) != 0) {
                list = https.alpnIds;
            }
            if ((i4 & 32) != 0) {
                i3 = https.port;
            }
            if ((i4 & 64) != 0) {
                list2 = https.ipAddressHints;
            }
            if ((i4 & 128) != 0) {
                h00Var = https.echConfigList;
            }
            List list3 = list2;
            h00 h00Var2 = h00Var;
            List list4 = list;
            int i5 = i3;
            return https.copy(str, i, i2, str2, list4, i5, list3, h00Var2);
        }

        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.timeToLive;
        }

        public final int component3() {
            return this.priority;
        }

        public final String component4() {
            return this.targetName;
        }

        public final List<String> component5() {
            return this.alpnIds;
        }

        public final int component6() {
            return this.port;
        }

        public final List<InetAddress> component7() {
            return this.ipAddressHints;
        }

        public final h00 component8() {
            return this.echConfigList;
        }

        public final Https copy(String str, int i, int i2, String str2, List<String> list, int i3, List<? extends InetAddress> list2, h00 h00Var) {
            str.getClass();
            str2.getClass();
            list2.getClass();
            return new Https(str, i, i2, str2, list, i3, list2, h00Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Https)) {
                return false;
            }
            Https https = (Https) obj;
            return j42.c(this.name, https.name) && this.timeToLive == https.timeToLive && this.priority == https.priority && j42.c(this.targetName, https.targetName) && j42.c(this.alpnIds, https.alpnIds) && this.port == https.port && j42.c(this.ipAddressHints, https.ipAddressHints) && j42.c(this.echConfigList, https.echConfigList);
        }

        public final List<String> getAlpnIds() {
            return this.alpnIds;
        }

        public final h00 getEchConfigList() {
            return this.echConfigList;
        }

        public final List<InetAddress> getIpAddressHints() {
            return this.ipAddressHints;
        }

        @Override // okhttp3.internal.dns.ResourceRecord
        public String getName() {
            return this.name;
        }

        public final int getPort() {
            return this.port;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final String getTargetName() {
            return this.targetName;
        }

        @Override // okhttp3.internal.dns.ResourceRecord
        public int getTimeToLive() {
            return this.timeToLive;
        }

        public int hashCode() {
            int n = hf1.n(((((this.name.hashCode() * 31) + this.timeToLive) * 31) + this.priority) * 31, 31, this.targetName);
            List<String> list = this.alpnIds;
            int hashCode = (this.ipAddressHints.hashCode() + ((((n + (list == null ? 0 : list.hashCode())) * 31) + this.port) * 31)) * 31;
            h00 h00Var = this.echConfigList;
            return hashCode + (h00Var != null ? h00Var.hashCode() : 0);
        }

        public final void setPort(int i) {
            this.port = i;
        }

        public String toString() {
            return "Https(name=" + this.name + ", timeToLive=" + this.timeToLive + ", priority=" + this.priority + ", targetName=" + this.targetName + ", alpnIds=" + this.alpnIds + ", port=" + this.port + ", ipAddressHints=" + this.ipAddressHints + ", echConfigList=" + this.echConfigList + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Https(String str, int i, int i2, String str2, List<String> list, int i3, List<? extends InetAddress> list2, h00 h00Var) {
            str.getClass();
            str2.getClass();
            list2.getClass();
            this.name = str;
            this.timeToLive = i;
            this.priority = i2;
            this.targetName = str2;
            this.alpnIds = list;
            this.port = i3;
            this.ipAddressHints = list2;
            this.echConfigList = h00Var;
        }
    }
}
